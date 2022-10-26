<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jstlTest2ok1.jsp</title>
</head>
<body>
	<h3>* 결과 페이지(JSTL) *</h3>
	<c:set var="name" value="${param.name}"/>
	<c:set var="age" value="${param.age}"/>
	
	이름 : ${name} / <c:out value="${name}"/><br>
	나이 : ${age} / <c:out value="${age}"/><br>
	
	<!-- 조건문 -->
	<c:if test="${name=='itwill'}">대한민국</c:if>
	
	<!-- 다중 조건문 -->
	<c:choose>
		<c:when test="${age<10}">어린이</c:when>
		<c:when test="${age<20}">청소년</c:when>
		<c:otherwise>성인</c:otherwise>
	</c:choose>
	<br>
	
	<!-- 반복문 -->
	<c:forEach var="a" begin="1" end="${age}" step="1">
		<c:out value="#"></c:out>
	</c:forEach>
	<br>
	
	<c:forEach var="a" begin="1" end="${age}" step="1">
		<c:choose>
			<c:when test="${a%2==0}">
				<span style="color: blue;">${a}</span>
			</c:when>
			<c:otherwise>
				<span style="color: red;">${a}</span>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	
</body>
</html>