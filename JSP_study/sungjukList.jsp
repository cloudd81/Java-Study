<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8"%>
    	
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukForm.jsp</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style type="text/css">
	@font-face {
	    font-family: 'RIDIBatang';
	    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_twelve@1.0/RIDIBatang.woff') format('woff');
	    font-weight: normal;
	    font-style: normal;
	}
     body {margin: auto; text-align: center; font-family: 'RIDIBatang', 'normal'; font-size:15px;}
     table {margin: auto;}
     th {text-align: center;}
     .noti1 {background-color: white; text-align: center;}
     .noti2 {color: black;}
     footer {height: 50px;}
    </style>
</head>
<body>
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
		  <div class="navbar-header">
		      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>                        
		      </button>
		      <a class="navbar-brand">SUNGJUK</a>
	      </div>
	      <div class="collapse navbar-collapse" id="myNavbar">
		    <ul class="nav navbar-nav navbar-right">
		      <li><a href="sungjukForm.jsp">성적입력</a></li>
		      <li class="active"><a href="sungjukList.jsp">성적목록</a></li>
		      <li><a class="dropdown-toggle" data-toggle="dropdown">성적상세보기<span class="caret"></span></a>
		        <ul class="dropdown-menu">
		          <li class="noti1"><span class="noti2">성적목록의<br>상세보기를 누르세요</span></li>
		        </ul>
	          </li>
	   	      <li><a class="dropdown-toggle" data-toggle="dropdown">성적수정하기<span class="caret"></span></a>
		        <ul class="dropdown-menu">
		          <li class="noti1"><span class="noti2">성적상세보기에서<br>수정을 누르세요</span></li>
		        </ul>
	          </li>
		    </ul>
		  </div>
	  </div>
	</nav>


	<h3>* 성적 목록 페이지 *</h3>
	<div class="container">
	<table class="table table-condensed">
	<tr>
		<th>이름</th>
		<th>국어</th>
		<th>영어</th>
		<th>수학</th>
		<th>등록일</th>
		<th>상세정보</th>
	</tr>
	
<%
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
		// out.println("오라클DB 서버 연결 성공!!");
		
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT sno, uname, kor, eng, mat, wdate ");
		sql.append(" FROM sungjuk ");
		sql.append(" ORDER BY wdate DESC ");
		
		pstmt = con.prepareStatement(sql.toString());
		rs= pstmt.executeQuery();		
		// SQL문 출력하기
		if(rs.next()){
			do {
%>
	<tr>
		<td><%=rs.getString("uname")%></td>
		<td><%=rs.getInt("kor")%></td>
		<td><%=rs.getInt("eng")%></td>
		<td><%=rs.getInt("mat")%></td>
		<td><%=rs.getString("wdate").substring(0, 10)%></td>
		<td><a class="detail" href="sungjukRead.jsp?sno=<%=rs.getInt("sno")%>">상세보기</a></td>
	</tr>
<%
			} while(rs.next()); // 다음 cursor가 있는지
		} else {
			out.print("<tr>");
			out.print("	<td colspan='5'>글없음!!</td>");
			out.print("</tr>");
		}
		
		
	}catch(Exception e){
		out.println("오라클DB연결실패 : " + e);
	}finally{ // 자원반납
		try {
			if(rs!=null) {rs.close();}
		} catch (Exception e) {}
		try{
			if(pstmt!=null){pstmt.close();}
		} catch(Exception e){}
		try{
			if(con!=null){con.close();}
		} catch(Exception e){}
	} // end
	
%>
			
	</table>
	</div>
	<footer>
		<div>열심히 해야 살아남는다</div>
	</footer>
</body>
</html>