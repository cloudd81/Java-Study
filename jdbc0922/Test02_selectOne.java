package jdbc0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test02_selectOne {

	public static void main(String[] args) {
		// sungjuk 테이블의 행 한줄 출력하기
		
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
			
			int sno = 61;
			
			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT sno, "
					+ "kor, eng, mat, tot, aver, addr, wdate ");
			sql.append(" FROM sungjuk ");
			sql.append(" WHERE sno = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, sno);
			
			rs= pstmt.executeQuery();
			if(rs.next()) { 
				System.out.println("자료 있음");
				// 1) 칼럼 순서 접근
				System.out.print(rs.getInt(1));
				System.out.print(rs.getString(2));
				System.out.print(rs.getInt(3));
				System.out.print(rs.getInt(4));
				System.out.print(rs.getInt(5));
				System.out.print(rs.getInt(6));
				System.out.print(rs.getInt(7));
				System.out.print(rs.getString(8));
				System.out.print(rs.getString(9));
				System.out.println();
				
				// 2) 칼럼 명으로 접근
				System.out.print(rs.getInt("sno"));
				System.out.print(rs.getString("uname"));
				System.out.print(rs.getInt("kor"));
				System.out.print(rs.getInt("eng"));
				System.out.print(rs.getInt("mat"));
				System.out.print(rs.getInt("tot"));
				System.out.print(rs.getInt("aver"));
				System.out.print(rs.getString("addr"));
				System.out.print(rs.getString("wdate"));
				System.out.println();
				
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
