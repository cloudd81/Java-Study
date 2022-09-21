package jdbc0921;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test02_insert {
	public static void main(String[] args) {
		// sungjuk 테이블 행 추가 연습
		
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
			sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, addr, wdate)");
			sql.append(" VALUES (sungjuk_seq.nextval, '손흥민', 99, 98, 97, 'Seoul', sysdate)");
			// System.out.println(sql.toString());
			
			// 5) 작성된 문자열을 SQL 형식으로 변환하기
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			
			// 6) SQL문 실행하기
			int cnt = pstmt.executeUpdate(); // INSERT, UPDATE, DELETE문 실행할 때 사용 -> int
											 // 실행했을 때 행의 갯수가 반환
			
			System.out.println("실행결과 : " + cnt);
			
		} catch (Exception e) {
			System.out.println("오라클DB 연결 실패 : " + e);
		} // end
		
		System.out.println("END");
		
	} // main() end
} // class end
