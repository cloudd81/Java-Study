<%@page import="java.lang.reflect.Parameter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>errorTest.jsp</title>
</head>
<body>
	<h3>에러 메세지 확인</h3>
<%
	// 1) HTTP 상태 404 - 찾을 수 없음
	// -> http://localhost:9090/basic05_mvc/error/errorList.jsp 가 없는 페이지면 404 발생
	
	// 2) HTTP 상태 500
	// -> http://localhost:9090/basic05_mvc/error/errorTest.jsp
	// -> ? 뒤에 Query String 값으로 kor 값을 넘겨야 에러가 발생하지 않음
	// -> http://localhost:9090/basic05_mvc/error/errorTest.jsp?kor=30
	int num = Integer.parseInt(request.getParameter("kor"));
	out.print("num : " + num);
%>
	<!-- 국어성적 = ${param.kor} 에러 안남 -->

</body>
</html>