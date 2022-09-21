package jdbc0921;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test04_delete {
	public static void main(String[] args) {
		// sungjuk 테이블 행 삭제하기
		
		try {
			
			// 1) 오라클DB 서버 연결 관련 정보
			String url		= "jdbc:oracle:thin:@localhost:1521:xe"; // == "127.0.0.1"
			String user		= "system";
			String password	= "1234";
			String driver	= "oracle.jdbc.driver.OracleDriver"; // ojdbc6.jar
			
			// 2) 드라이버 로딩
			Class.forName(driver);
									
			// 3) 오라클 DB 서버 연결
			Connection con = DriverManager.getConnection(url, user, password);
			
			System.out.println("오라클DB 서버 연결 성공!!");
			
			// 4) SQL 작성
			// -> 주의사항) SQL 종결문자 ; 를 쓰면 오류남
			StringBuilder sql = new StringBuilder();
			sql.append(" DELETE FROM sungjuk WHERE sno=41 ");
			
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt==0) {
				System.out.println("행 삭제 실패!");
			} else {
				System.out.println("행 삭제 성공!");
			} // if end
			
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("오라클DB 연결 실패 : " + e);
		} // end
		
		System.out.println("END");
		
	} // main() end
} // class end
