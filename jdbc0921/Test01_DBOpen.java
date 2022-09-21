package jdbc0921;

import java.sql.*;

public class Test01_DBOpen {

	public static void main(String[] args) {
		// Oracle DB 11g XE 연결
		
		try {
			
			// 1) 오라클DB 서버 연결 관련 정보
			String url		= "jdbc:oracle:thin:@localhost:1521:xe"; // == "127.0.0.1"
			String user		= "system";
			String password	= "1234";
			String driver	= "oracle.jdbc.driver.OracleDriver"; // ojdbc6.jar
			
			// 2) 드라이버 로딩
			Class.forName(driver);
									
			// 3) 오라클 DB 서버 연결
			DriverManager.getConnection(url, user, password);
			
			System.out.println("오라클DB 서버 연결 성공!!");			
			
		} catch (Exception e) {
			System.out.println("오라클DB 연결 실패 : " + e);
		} // end				
		
	} // main() end
} // class end
