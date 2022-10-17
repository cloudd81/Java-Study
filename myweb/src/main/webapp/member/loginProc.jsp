<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp" %>
<%@ include file="../header_mem.jsp" %>
 <!-- 본문 시작 loginProc.jsp -->
	<h3>로그인 결과</h3>
<%
	String id = request.getParameter("id").trim();
	String passwd = request.getParameter("passwd").trim();
	dto.setId(id);
	dto.setPasswd(passwd);
	
	String mlevel = dao.loginProc(dto);
	if(mlevel==null){
		out.print("<p>아이디와 비밀번호를 다시 한번 확인해주세요</p>");
		out.print("<p><a href='javascript:history.back()'>[다시시도]</a></p>");
	} else {
		// 로그인 성공
		out.print("로그인 성공");
		out.print("회원 등급 : " + mlevel);
	} // if end

%>
 <!-- 본문 끝 -->
<%@ include file="../footer.jsp" %>