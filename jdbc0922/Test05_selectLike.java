package jdbc0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test05_selectLike {

	public static void main(String[] args) {
		// 문제) 이름에 '나' 문자 있는 행을 조회하시오
		String col = "uname";	// 검색 칼럼 keyfield
		String word = "나";		// 검색어	 keyword		
		
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
			
			// 검색어 존재하는지?
			if(word.length()>0) {
				// where uname like '%나%'
				String where = " WHERE " + col + " LIKE '%" + word + "%'";
				sql.append(where);
			}	// if end
			sql.append(" ORDER BY sno DESC ");
			// System.out.println(sql.toString());
			
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
