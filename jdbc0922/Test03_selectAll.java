package jdbc0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test03_selectAll {

	public static void main(String[] args) {
		// sungjuk 테이블의 전체 행 출력하기
		
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
			sql.append(" SELECT sno, uname, kor, eng, mat, tot, aver, addr, wdate ");
			sql.append(" FROM sungjuk ");
			sql.append(" ORDER BY sno DESC ");
			
			pstmt = con.prepareStatement(sql.toString());
			rs= pstmt.executeQuery();
			
			if(rs.next()) { 
				System.out.println("자료 있음");
				do {
					System.out.print(rs.getInt("sno") + " ");
					System.out.print(rs.getString("uname") + " ");
					System.out.print(rs.getInt("kor") + " ");
					System.out.print(rs.getInt("eng") + " ");
					System.out.print(rs.getInt("mat") + " ");
					System.out.print(rs.getInt("tot") + " ");
					System.out.print(rs.getInt("aver") + " ");
					System.out.print(rs.getString("addr") + " ");
					System.out.print(rs.getString("wdate") + " ");
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
