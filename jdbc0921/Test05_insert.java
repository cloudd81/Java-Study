package jdbc0921;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test05_insert {
	public static void main(String[] args) {
		// 변수를 이용해서 sungjuk 테이블 행 추가 연습
		
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
			// 변수 선언
			String name = "박지성";
			int kor=99, eng=98, mat=100;
			String addr = "Seoul";
			
			StringBuilder sql = new StringBuilder();
			sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, addr, wdate)");
			sql.append(" VALUES (sungjuk_seq.nextval, ?, ?, ?, ?, ?, sysdate)");
			
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			// -> ?의 갯수, 순서, 자료형이 일치해야한다
			
			pstmt.setString(1, name); // 1 -> 첫번째 물음표
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, mat);
			pstmt.setString(5, addr);
			
			int cnt = pstmt.executeUpdate();
			if(cnt==0) {
				System.out.println("행 추가 실패!");
			} else {
				System.out.println("행 추가 성공!");
			}
			
		} catch (Exception e) {
			System.out.println("오라클DB 연결 실패 : " + e);
		} // end
		
		System.out.println("END");
		
	} // main() end
} // class end
