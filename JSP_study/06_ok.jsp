<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>06_ok.jsp</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h3>* 성적 결과 *</h3>
<%
	// request 내부객체
	// -> 사용자가 요청한 모든 정보를 관리하는 객체
	
	// request.getParameter("") 메소드
	// -> 사용자가 입력한 정보를 개별적으로 가져올 때
	// -> 예) <input type="text" name="uname">
	// 		  request.getParameter("uname")
	/*
	out.print(request.getParameter("uname"));
	out.print("<hr>");
	out.print(request.getParameter("kor"));
	out.print("<hr>");
	out.print(request.getParameter("eng"));
	out.print("<hr>");
	out.print(request.getParameter("mat"));
	out.print("<hr>");
	*/
	
	// method = post 방식이면 한글이 깨지기 때문에 한글을 인코딩하는 작업을 해야한다.
	// 한글 인코딩
	request.setCharacterEncoding("UTF-8");
	// request.setCharacterEncoding("EUC-KR");
	
	// 사용자가 입력 요청한 정보를 개별적으로 가져오기
	String uname = request.getParameter("uname").trim();
	int kor = Integer.parseInt(request.getParameter("kor").trim());
	int eng = Integer.parseInt(request.getParameter("eng").trim());
	int mat = Integer.parseInt(request.getParameter("mat").trim());
	int aver = (kor+eng+mat)/3;
%>

	<!-- 성적 결과 테이블에 출력 -->
	<div class="container">
		<table class="table table-striped">
		<tr>
			<th>이름</th>
			<td><%=uname%></td>
		</tr>
		<tr>
			<th>국어</th>
			<td><%=kor%></td>
		</tr>
		<tr>
			<th>영어</th>
			<td><%=eng%></td>
		</tr>
		<tr>
			<th>수학</th>
			<td><%=mat%></td>
		</tr>
		<tr>
			<th>평균</th>
			<td><%=aver%></td>
		</tr>
		</table>
	</div>


</body>
</html>