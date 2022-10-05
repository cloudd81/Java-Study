<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>05_내부객체.jsp</title>
</head>
<body>
<%
	/*
		● [JSP페이지 실행 과정]
		 - Tomcat WAS에 의해서 .java와 .class가 자동으로 생성된다.

		   예) hello.jsp -> hello_jsp.java -> hello_jsp.class

		   예) hello_jsp.java 소스 저장 경로
			C:\java202207\workspace
						 \.metadata
						 \.plugins
						 \org.eclipse.wst.server.core
						 \tmp0
						 \work
						 \Catalina
						 \localhost
						 \basic04_web
						 \org
						 \apache
						 \jsp
						 \basic

		● [JSP 내부 객체]
		 - 톰캣 서버에 의해 자동으로 생성된 객체
		 - 개발자는 별도의 객체 선언 없이 사용할 수 있다.
		 
		 1) out : 출력객체
				  JspWriter out
				  
		 2) request : 사용자가 요청한 정보를 관리하는 객체
					  HttpServletRequest request

		 3) response : 요청한 사용자에게 응답을 관리하는 객체 
			 		   HttpServletResponse response
			 		   
		 4) session : 요청한 사용자를 개별적으로 구분하기 위해 사용하는 객체
					  HttpSession session
					  
		 5) application : 모든 사용자가 공유하는 값 또는 서버에 대한 정보를 관리하는 객체
						  ServletContext application

		 6) pageContext : JSP, JSTL, EL 등 현재 페이지 내에서 서로 다른 문법과의 값을 교류할 수 있게 해주는 객체
						  PageContext pageContext

	*/
%>
</body>
</html>