package jdbc0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test06_quiz {

	public static void main(String[] args) {
		// 문제) 학번 g1001이 수강신청한 과목을 과목코드별로 조회하시오
		/*
				g1001 d001 HTML 
				g1001 p001 JAVA 
				g1001 p002 Oracle 
				g1001 p003 JSP 
				g1001 p004 Python 
				g1001 p005 AJAX		 
		 */
		
		String hakno = "g1001";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;		
		
		try {
			
			String url		= "jdbc:oracle:thin:@localhost:1521:xe"; // == "127.0.0.1"
			String user		= "system";
			String password	= "1234";
			String driver	= "oracle.jdbc.driver.OracleDriver"; // ojdbc6.jar
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
						
			System.out.println("오라클DB 서버 연결 성공!!");		
			
			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT SU.hakno AS hakno, SU.gcode AS gcode, GW.gname AS gname ");
			sql.append(" FROM tb_sugang SU JOIN tb_gwamok GW ");
			sql.append(" ON SU.gcode = GW.gcode ");
			sql.append(" where SU.hakno = ? ");
			sql.append(" order by gcode ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, hakno);
			rs= pstmt.executeQuery();
			
			if(rs.next()) { 
				System.out.println("자료 있음");
				do {
					System.out.print(rs.getString("hakno") + " ");
					System.out.print(rs.getString("gcode") + " ");
					System.out.print(rs.getString("gname") + " ");
					System.out.println();
				} while(rs.next()); // 다음 cursor가 있는지
			} else {
				System.out.println("자료 없음");				
			} // if end
						
			
		} catch (Exception e) {
			System.out.println("오라클DB 연결 실패 : " + e);
			
		} finally {
			// 자원 반납
			try {
				if(rs!=null) {rs.close();}
			} catch (Exception e) {}
			
			try {
				if(pstmt!=null) {rs.close();}
			} catch (Exception e) {}
			
			try {
				if(con!=null) {rs.close();}
			} catch (Exception e) {}
		}// end	
		
		System.out.println("뚱");
		
	} // main() end
} // class end
