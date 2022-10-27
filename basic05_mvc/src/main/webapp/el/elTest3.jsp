<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elTest3.jsp</title>
</head>
<body>
	<h3>* EL 내장 객체(Collection) *</h3>	
<%
	// 1) JSP 내장객체
	// -> pageContext, request, session, application
	
	// 2) 내부 변수 선언
	pageContext.setAttribute("kor", 100);	// 현재 페이지에서만 유효
	request.setAttribute("eng", 200);		// 전역변수(부모와 자식 페이지에서만 유효)
	session.setAttribute("mat", 300);		// 전역변수(모든 페이지에서 유효, 개인 사용자, 시간)
	application.setAttribute("aver", 400);	// 전역변수(모든 페이지에서 유효, 모든 사용자)
%>

	1) JSP<br>
	kor : <%=pageContext.getAttribute("kor")%><br>
	eng : <%=request.getAttribute("eng")%><br>
	mat : <%=session.getAttribute("mat")%><br>
	aver : <%=application.getAttribute("aver")%><br>
	<hr>
	
<!-- 
	2) EL의 내장객체(Collection)
	-> param, pageScope, requestScope, sessionScope, applicationScope
 -->
	2) EL<br>
	kor : ${pageScope.kor}<br>
	eng : ${requestScope.eng}<br>
	mat : ${sessionScope.mat}<br>
	aver : ${applicationScope.aver}<br>
	<hr>
	
	<!-- EL에서는 내장객체명을 생략할 수 있다(pageScopr, requestScope, sessionScope, applicationScope -->
	<!-- EL에서는 page -> request -> session -> applicaion 순으로 자동 검색 -->
	kor : ${kor}<br>
	eng : ${eng}<br>
	mat : ${mat}<br>
	aver : ${aver}<br>
	<hr>
	<!-- 각 Scope에 내장변수명이 동일한 경우 -->
<%
	pageContext.setAttribute("num", 500);	// 현재 페이지에서만 유효
	request.setAttribute("num", 600);		// 전역변수(부모와 자식 페이지에서만 유효)
	session.setAttribute("num", 700);		// 전역변수(모든 페이지에서 유효, 개인 사용자, 시간)
	application.setAttribute("num", 800);
%>
	<!-- 내장객체명이 생략되면 자동으로 작은 영역순으로 찾게 된다 -->
	num : ${num}<br> <!-- 500 -->
	<hr>
	
	<!-- 각 Scope의 내장 변수가 없는 경우 -->
	JSP : <%=request.getAttribute("uname")%> <!-- null -->
	<br>
	EL : @${requestScope.uname}@ <!-- "" -->
	
</body>
</html>