<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukUpdateProc.jsp</title>
</head>
<body>
	<h3>* 성적 수정 *</h3>
<%
	
	request.setCharacterEncoding("UTF-8");
	String uname = request.getParameter("uname").trim();
	int kor 	 = Integer.parseInt(request.getParameter("kor").trim());
	int eng 	 = Integer.parseInt(request.getParameter("eng").trim());
	int mat 	 = Integer.parseInt(request.getParameter("mat").trim());
	String addr  = request.getParameter("addr");
	int aver 	 = (kor+eng+mat)/3;
	int sno 	 = Integer.parseInt(request.getParameter("sno").trim());
	
	dto.setUname(uname);
	dto.setKor(kor);
	dto.setEng(eng);
	dto.setMat(mat);
	dto.setAver(aver);
	dto.setAddr(addr);
	dto.setSno(sno);
	
	int cnt = dao.update(dto);
	
	if(cnt==0){
		out.println("<p>성적 입력에 실패했습니다</p>");
		out.println("<p><a href='javascript:history.back()'>[다시시도]</a></p>");
	} else{
		out.print("<script>");
		out.print("		alert('성적이 입력되었습니다');");
		out.print(" 	location.href='sungjukList.jsp';");
		out.print("</script>");
	} // if end	
	
%>

</body>
</html>