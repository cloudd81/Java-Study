<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>환영합니다</title>
</head>
<body>
	<h3><strong>로그인 결과</strong></h3>
	
	1) JSP<br>
	아이디 : <%=request.getAttribute("r_uid")%><br>
	비밀번호 : <%=request.getAttribute("r_upw")%><br>
	
	2) EL<br>
	아이디 : ${requestScope.r_uid}<br>
	비밀번호 : ${requestScope.r_upw}<br>
	
	3) EL(스코프 생략)<br>
	아이디 : ${r_uid}<br>
	비밀번호 : ${r_upw}<br>
	
</body>
</html>