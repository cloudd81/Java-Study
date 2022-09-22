package jdbc0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test04_selectAvg {

	public static void main(String[] args) {
		// 문제) 주소가 서울인 행들의 국영수 평균값을 구하시오
		//		 단 소수점은 반올림해서 둘째자리값까지 표현

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
			sql.append(" SELECT round(avg(kor),2) AS kor_avg ");
			sql.append(" , round(avg(eng),2) AS eng_avg ");
			sql.append(" , round(avg(mat),2) AS mat_avg ");
			sql.append(" FROM sungjuk ");
			sql.append(" WHERE addr='Seoul' ");
			
			pstmt = con.prepareStatement(sql.toString());
			rs= pstmt.executeQuery();

			if(rs.next()) { 
				System.out.println("자료 있음");
				System.out.printf("국어평균:%.2f\n", rs.getDouble(1));
				System.out.printf("영어평균:%.2f\n", rs.getDouble(2));
				System.out.printf("수학평균:%.2f\n", rs.getDouble(3));
				
				System.out.printf("국어평균:%.2f\n", rs.getDouble("kor_avg"));
				System.out.printf("영어평균:%.2f\n", rs.getDouble("eng_avg"));
				System.out.printf("수학평균:%.2f\n", rs.getDouble("mat_avg"));
				
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
