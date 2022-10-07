<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="net.sungjuk.*" %>
<%@ page import="java.util.ArrayList"%>
<jsp:useBean id="dao" class="net.sungjuk.SungjukDAO" scope="page"/>
<jsp:useBean id="dto" class="net.sungjuk.SungjukDTO" scope="page"/>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukList.jsp</title>
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
	<div class="container">
	<h3>* 성적 목록 *</h3>
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
	ArrayList<SungjukDTO> list=dao.list();
	if(list==null){
		out.print("<tr>");
		out.print("	<td colspan='5'>글없음!!</td>");
		out.print("</tr>");
	} else {
		for(int idx=0; idx<list.size(); idx++){
			dto=list.get(idx);
%>
			<tr>
				<td><%=dto.getUname()%></td>
				<td><%=dto.getKor()%></td>
				<td><%=dto.getEng()%></td>
				<td><%=dto.getMat()%></td>
				<td><%=dto.getWdate().substring(0,10)%></td>
				<td><a class="detail" href="sungjukRead.jsp?sno=<%=dto.getSno()%>">상세보기</a></td>
			</tr>
<%
		}
	}

%>
			
	</table>
	</div>
	<footer>
		<div>열심히 해야 살아남는다</div>
	</footer>	
	
	

</body>
</html>