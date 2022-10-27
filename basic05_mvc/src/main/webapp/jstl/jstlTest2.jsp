<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jstlTest2.jsp</title>
</head>
<body>
	<h3>* JSTL 제어문 연습 *</h3>
	<!-- <form action="jstlTest2ok1.jsp"> 결과 페이지(jsp)-->
	<form action="jstlTest2ok2.jsp"> <!-- 결과 페이지(JSTL) -->
		이름 : <input type="text" name="name"> <br>
   		나이 : <input type="text" name="age">  <br>
              <input type="submit" value="확인">
    </form>
</body>
</html>