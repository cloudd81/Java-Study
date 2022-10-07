<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp" %>
<%--
<jsp:include page="ssi.jsp"/>
도 같은 기능을 하지만 공통 페이지에 jsp코드가 많이 쓰여있다면 지시자를 활용한 include를 활용해야한다.
--%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukRead.jsp</title>
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
		      <li><a href="sungjukList.jsp">성적목록</a></li>
		      <li class="active"><a class="dropdown-toggle" data-toggle="dropdown">성적상세보기<span class="caret"></span></a>
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

	<h3>* 성적 상세보기 *</h3>
	<div class="container">
		<div class="table-responsive">
		<table class="table">
<%
	int sno = Integer.parseInt(request.getParameter("sno"));
	dto = dao.read(sno);
	if(dto==null){
		out.print("자료 없음!!");
	} else{
%>
		<tr>
			<th>이름</th>			
			<td><%=dto.getUname()%></td>
		</tr>
		<tr>
			<th>국어</th>			
			<td><%=dto.getKor()%></td>
		</tr>
		<tr>
			<th>영어</th>			
			<td><%=dto.getEng()%></td>
		</tr>
		<tr>
			<th>수학</th>			
			<td><%=dto.getMat()%></td>
		</tr>
		<tr>
			<th>평균</th>			
			<td><%=dto.getAver()%></td>
		</tr>
		<tr>
			<th>주소</th>	
			<td><%=dto.getAddr()%>
<%
			// 주소 한글로 출력
			String addr = dto.getAddr();
			if(addr.equals("Seoul")){
				out.print("서울");
			} else if(addr.equals("Jeju")){
				out.print("제주");
			} else if(addr.equals("Suwon")){
				out.print("수원");
			} else if(addr.equals("Busan")){
				out.print("부산");
			} // if end
%>
			</td>
		</tr>
		<tr>
			<th>작성일</th>			
			<td><%=dto.getWdate()%></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<a class="btn btn-default" href="sungjukUpdate.jsp?sno=<%=dto.getSno()%>">수정</a>
				&nbsp;&nbsp;
				<a class="btn btn-default" href="sungjukDel.jsp?sno=<%=dto.getSno()%>">삭제</a>
			</td>
		</tr>
<%		
	} // if end
%>		
		</table>
		</div>
	</div>
</body>
</html>