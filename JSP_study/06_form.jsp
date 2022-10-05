<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>06_form.jsp</title>
</head>
<body>
	<h3>* 성적 입력 *</h3>
	<form name="sungjukfrm" id="sungjukfrm" method="get" action="06_ok.jsp">
		이름 : <input type="text" name="uname" id="uname" size="10" maxlength="20" placeholder="이름" required> 
		<hr>
		국어 : <input type="number" name="kor" id="kor" size="5" min="0" max="100">
		<hr>
		영어 : <input type="number" name="eng" id="eng" size="5" min="0" max="100">
		<hr>
		수학 : <input type="number" name="mat" id="mat" size="5" min="0" max="100">
	  	<hr>
	  	<input type="submit" value="전송">
	  	<input type="reset"  value="취소">
	</form>
	
	<!--
		● [<form> 관련 다양한 속성들]
		 - 사용자가 입력한 정보를 서버로 전송하기 위한 양식
		 - 종류
		  name 		: 폼의 이름, 서버에서 식별하기 위한 이름	
		  id 		: 폼의 아이디, Frontend단에서 식별자로 주로 사용 
		  method 	: 폼의 전송방식, Get과 Post 방식으로 나뉜다. 생략시 Get 방식이 default 값이다
		  action 	: 사용자가 요청한 정보를 서버가 받아서 처리할 결과 페이지
		  enctype 	: 폼에서 파일을 첨부해서 서버로 전송하고자 할 때 "multipart/form-data" 추가
	
		● [폼 전송방식]
		 1) method = get 방식
		  - 생략 시 기본값
		  - 사용자가 입력 요청한 정보가 URL 그대로 노출
		  
		 2) method = post 방식
		  - 사용자가 요청한 정보가 URL에 노출되지 않고 패키지화하여 전송
	-->
</body>
</html>