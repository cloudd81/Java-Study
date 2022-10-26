<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	● Directive(지시자)의 종류
	 <%@ page %>
	 <%@ include %> 공통 코드를 삽입할 때
	 <%@ taglib %> 	Custom tag(사용자 정의 태그)를 사용할 때
--%>

<%-- JSTL을 사용하려면 Directive를 지정한다 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jstlTest1.jsp</title>
</head>
<body>
	<h3>* JSTL (JSP Standard Tag Library, JSP전용태그) *</h3>
	
	1) JSP 변수 선언<br>
	<% int a = 3; %>
	a : <%=a%>
	<hr>
	
	2) JSTL 변수 선언<br>
	<c:set var="b" value="5"></c:set>
	<c:set var="c" value="7"/>
	b : ${b}<br>
	c : ${c}<br>
	b+c : ${b+c}
	<hr>
	
	3) 출력<br>
	<c:out value="2"></c:out><br>
	<c:out value="${b}"/><br>
	<c:out value="${c}"/><br>
	<c:out value="${b+c}"/><br>
	<hr>
	
	4) b, c 변수 제거<br>
	<c:remove var="b"/>
	<c:remove var="c"/>
	<c:out value="${b}"/><br>
	<c:out value="${c}"/><br>
	<c:out value="${b+c}"/><br>
	<hr>
	
	5) 자바 객체 선언도 가능<br>
	<c:set var="dt" value="<%=new Date()%>"/>
	오늘 날짜 : ${dt}<br>
	오늘 날짜 : <c:out value="${dt}"></c:out><br>	
	
</body>
</html>