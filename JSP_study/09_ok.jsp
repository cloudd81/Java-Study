<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>09_ok.jsp</title>
</head>
<body>
	<h3>* request 내부 객체의 다양한 메소드 결과 *</h3>
<%
	// 1) 한글 인코딩
	request.setCharacterEncoding("UTF-8");
	
	// 2) 사용자가 입력한 정보 가져오기
	out.print(request.getParameter("uid"));
	out.print("<hr>");
	
	// 3) 요청한 사용자의 다양한 정보
	out.print(request.getRemoteAddr()); // 사용자pc의 ip 주소값을 확인(기본은 ip6)
	out.print("<hr>");
	out.print(request.getRemoteHost());
	out.print("<hr>");
	out.print(request.getRemotePort());
	out.print("<hr>");
	
	// 4) 해당 프로젝트의 이름 가져오기 : /basic04_web
	out.print(request.getContextPath());
	out.print("<hr>");
	
	// 5) URL과 URI 주소 가져오기
	// 사용자가 요청한 전체 경로의 페이지명 또는 명령어
	// http://localhost:9090/basic04_web/form/09_ok.jsp
	out.print(request.getRequestURL());
	out.print("<hr>");
	
	// 사용자가 요청한 페이지명 또는 명령어
	// /basic04_web/form/09_ok.jsp
	out.print(request.getRequestURI());
	out.print("<hr>");
	
	// 6) 물리적인 경로 가져오기
	out.print(request.getRealPath("/images")); // 비추천
	out.print("<hr>");
	
	out.print(application.getRealPath("/images"));
	out.print("<hr>");
	/*
	아래 경로는 이클립스에서 톰캣서버를 실행한 경우 생성이 된다.
	C:\java202207\workspace
				 \.metadata
				 \.plugins
				 \org.eclipse.wst.server.core
				 \tmp0
				 \work
				 \wtpwebapps
				 \basic04_web
				 \images	
	*/
	
	// 내부변수
	// request.setAttribute("변수명", 값)
	// request.getAttribute("변수명")
	request.setAttribute("user", "KOREA");
	Object obj = request.getAttribute("user");
	String str = (String)obj; // 다형성
	out.print(str);


%>


</body>
</html>