<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukDel.jsp</title>
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
	<h3>* 성적 삭제 *</h3>
	<p>
		<a class="btn btn-primary" href="sungjukForm.jsp">성적쓰기</a>
		<a class="btn btn-warning" href="sungjukList.jsp">목록</a>
	</p>
<%
	Connection con = null;
	PreparedStatement pstmt = null;
	int sno = Integer.parseInt(request.getParameter("sno"));
	
	try {
		String url		= "jdbc:oracle:thin:@localhost:1521:xe"; // == "127.0.0.1"
		String user		= "system";
		String password	= "1234";
		String driver	= "oracle.jdbc.driver.OracleDriver"; // ojdbc6.jar
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		
		// out.println("오라클DB 서버 연결 성공!!");
		
 		// 4) SQL 작성
		// -> 주의사항) SQL 종결문자 ; 를 쓰면 오류남
		StringBuilder sql = new StringBuilder();
		sql.append(" DELETE FROM sungjuk ");
		sql.append(" WHERE sno=? ");
		
		// 5) 작성된 문자열을 SQL 형식으로 변환하기
		pstmt = con.prepareStatement(sql.toString());
		pstmt.setInt(1, sno);
		int cnt = pstmt.executeUpdate();
		
		if(cnt==0){
			out.print("성적 삭제에 실패했습니다");
			out.println("<p><a href='javascript:history.back()'>[다시시도]</a></p>");
		} else{
			out.print("<script>");
			out.print("		alert('삭제 되었습니다');");
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