<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>06_ok.jsp</title>
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

	out.print(request.getParameter("uname"));
	out.print("<hr>");
	out.print(request.getParameter("kor"));
	out.print("<hr>");
	out.print(request.getParameter("eng"));
	out.print("<hr>");
	out.print(request.getParameter("mat"));
	out.print("<hr>");
	

%>

</body>
</html>