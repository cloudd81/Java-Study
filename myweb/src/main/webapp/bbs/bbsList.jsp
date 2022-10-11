<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../ssi.jsp" %>
<%@ include file="../header.jsp" %>
 <!-- 본문 시작 -->
	<div class="container">
	<h3 class="hg"> 게시판 </h3>

	<table class="table table-condensed context">
	<tr>
		<th style="text-align: center;">이름</th>
		<th style="text-align: center;">제목</th>
		<th style="text-align: center;">내용</th>
		<th style="text-align: center;">등록일</th>
		<th style="text-align: center;">상세보기</th>
	</tr>
	
<%
	ArrayList<BbsDTO> list=dao.list();
	if(list==null){
		out.print("<tr>");
		out.print("	<td class='hg' colspan='5'>글없음!!</td>");
		out.print("</tr>");
	} else {
		for(int idx=0; idx<list.size(); idx++){
			dto=list.get(idx);
%>
			<tr>
				<td><%=dto.getWname()%></td>
				<td><%=dto.getSubject()%></td>
				<td><%=dto.getContent()%></td>
				<td><%=dto.getRegdt().substring(0,10)%></td>
				<td><a class="detail" href="BbsRead.jsp?sno=<%=dto.getBbsno()%>">상세보기</a></td>
			</tr>
<%
		}
	}

%>
			
	</table>
	<p style="text-align: right;"><a class="btn btn-default hg" href="bbsForm.jsp">글쓰기</a></p>
	</div>
 <!-- 본문 끝 -->
<%@ include file="../footer.jsp" %>