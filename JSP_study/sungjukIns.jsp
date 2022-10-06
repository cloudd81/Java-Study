<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukIns.jsp</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style type="text/css">
	 @font-face {
	    font-family: 'ChosunCentennial';
	    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2206-02@1.0/ChosunCentennial.woff2') format('woff2');
	    font-weight: normal;
	    font-style: normal;
	 }
     body {margin: auto; text-align: center; font-family: ChosunCentennial, normal;}
     table {margin: auto;}
    </style>
</head>
<body>
	<h3>* 성적 결과 페이지 *</h3>
<%
	// 한글 인코딩
	request.setCharacterEncoding("UTF-8");

	// 사용자가 입력한 정보를 가져와서 변수에 담기
	String uname = request.getParameter("uname").trim();
	int kor 	 = Integer.parseInt(request.getParameter("kor").trim());
	int eng 	 = Integer.parseInt(request.getParameter("eng").trim());
	int mat 	 = Integer.parseInt(request.getParameter("mat").trim());
	String addr  = request.getParameter("addr");
	
	// 평균 구하기
	int aver 	 = (kor+eng+mat)/3;
	
	// out.println("요청IP : " + request.getRemoteAddr());
	
	// Oracle DB 연결 및 행추가 -----------------------------
	Connection con = null;
	PreparedStatement pstmt = null;
	
	try {
		// 1) 오라클DB 서버 연결 관련 정보
		String url		= "jdbc:oracle:thin:@localhost:1521:xe"; // == "127.0.0.1"
		String user		= "system";
		String password	= "1234";
		String driver	= "oracle.jdbc.driver.OracleDriver"; // ojdbc6.jar
		
		
		// 2) 드라이버 로딩
		Class.forName(driver);
								
		// 3) 오라클 DB 서버 연결
		con = DriverManager.getConnection(url, user, password);
		
		// out.println("오라클DB 서버 연결 성공!!");
		
 		// 4) SQL 작성
		// -> 주의사항) SQL 종결문자 ; 를 쓰면 오류남
		StringBuilder sql = new StringBuilder();
		sql.append(" INSERT INTO sungjuk(sno, uname, kor, eng, mat, aver, addr, wdate)");
		sql.append(" VALUES (sungjuk_seq.nextval, ?, ?, ?, ?, ?, ?, sysdate)");
		
		// 5) 작성된 문자열을 SQL 형식으로 변환하기
		pstmt = con.prepareStatement(sql.toString());
		pstmt.setString(1, uname);
		pstmt.setInt(2, kor);
		pstmt.setInt(3, eng);
		pstmt.setInt(4, mat);
		pstmt.setInt(5, aver);
		pstmt.setString(6, addr);
		
		// 6) SQL문 실행하기
		int cnt = pstmt.executeUpdate(); // INSERT, UPDATE, DELETE문 실행할 때 사용 -> int
										 // 실행했을 때 행의 갯수가 반환
		if(cnt==0){
			out.println("<p>성적 입력에 실패했습니다</p>");
			out.println("<p><a href='javascript:history.back()'>[다시시도]</a></p>");
		} else{
			out.print("<script>");
			out.print("		alert('성적이 입력되었습니다');");
			out.print(" 	location.href='sungjukList.jsp';");
			out.print("</script>");
		} // if end		
		
	}catch(Exception e){
		out.println("오라클DB연결실패 : " + e);
	}finally{ // 자원반납
		try{
			if(pstmt!=null){pstmt.close();}
		} catch(Exception e){}
		try{
			if(con!=null){con.close();}
		} catch(Exception e){}
	} // end
	
%>

</body>
</html>