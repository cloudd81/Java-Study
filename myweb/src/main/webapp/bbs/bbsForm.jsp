<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
 <!-- 본문 시작 -->
	<div class="container">
	<h3 class="hg"> * 글쓰기 * </h3>
	
		<form name="bbsfrm" id="bbsfrm" method="post" action="bbsIns.jsp" onsubmit="return bbsCheck()"> <!-- myscript.js 파일을 통해 서버로 넘어가기 전에 유효한 접근인지 검사 -->
		<table class="table table-striped">
		<tr>
		   <th class="hg">작성자</th>
		   <td><input type="text" name="wname" id="wname" class="form-control hg" maxlength="20" required></td>
		</tr>
		<tr>
		   <th class="hg">제목</th>
		   <td><input type="text" name="subject" id="subject" class="form-control hg" maxlength="100" required></td>
		</tr>
		<tr>
		   <th class="hg">내용</th>
		   <td><textarea rows="5"  class="form-control hg" name="content" id="content" required></textarea></td>
		</tr>
		<tr>
		   <th class="hg">비밀번호</th>
		   <td><input type="password" name="passwd" id="passwd" class="form-control hg" maxlength="10" required></td>
		</tr>
		<tr>
		    <td colspan="2" align="center">
		       <input type="submit" value="쓰기" class="btn btn-success btn-block hg">
		       <input type="reset"  value="취소" class="btn btn-danger btn-block hg">
		    </td>
		</table>	
		</form>
		
	<p style="text-align: right;"><a class="btn btn-default hg" href="bbsList.jsp">목록</a></p>
	</div>
 <!-- 본문 끝 -->
<%@ include file="../footer.jsp" %>