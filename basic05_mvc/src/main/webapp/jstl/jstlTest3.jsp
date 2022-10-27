<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>jstlTest3.jsp</title>
</head>
<body>
	<h3>* JSTL 함수 *</h3>
	
	<c:set var="txt" value="     White     Space    "></c:set>
	글자개수 : ${fn:length(txt)}
	<hr>
	
	공백제거 : @<c:out value="${fn:trim(txt)}"></c:out>@
	<hr>
	
	<c:set var="str" value="Hi My name is waldo"/>
	문자열 자르기 : ${fn:substring(str, 3, 9)}<!-- My nam -->
	<hr>
	소문자로 바꾸기 : ${fn:toLowerCase(str)}<br>
	대문자로 바꾸기 : ${fn:toUpperCase(str)}
	<hr>

<%
	// 엔터를 <br>로 바꾸기
	// 1) JSP
	String content = "";
	content = content.replace("\n", "<br>");
	
	// 2) EL+JSP
	pageContext.setAttribute("cn", "\n");
%>
	<c:set var="content" value="Hi
								My name is
								Waldo"/>
	${content}
	<hr>				
	${fn:replace(content,cn,"<br>")}
	<hr>
	
	<!-- ', ", /, <, >, & 등을 XML 엔티티 코드로 변환해주기 -->
	<c:set var="text" value="Hi
							 My <name> is
							 'W   a   l   d     o'"/>
	${fn:escapeXml(text)}
	<hr>
	${fn:replace(fn:escapeXml(text),cn,"<br>")}
	<hr>
	${fn:replace(fn:replace(fn:escapeXml(text), cn, "<br>"), ' ' , '&nbsp;')}
</body>
</html>