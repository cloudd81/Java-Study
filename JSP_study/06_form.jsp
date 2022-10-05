<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>06_form.jsp</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h3 style="text-align: center;">* 성적 입력 *</h3><br>
	<form class="form-horizontal" name="sungjukfrm" id="sungjukfrm" method="post" action="06_ok.jsp">
	<div class="form-group">
		<label class="control-label col-sm-2">이름 :</label>
		<div class="col-sm-10">
			<input class="form-control" type="text" name="uname" id="uname" size="10" maxlength="20" placeholder="이름" required>
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2">국어 :</label>
		<div class="col-sm-10">
			<input class="form-control" type="number" name="kor" id="kor" size="5" min="0" max="100">
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2">영어 :</label>
		<div class="col-sm-10">
			<input class="form-control" type="number" name="eng" id="eng" size="5" min="0" max="100">
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2">수학 :</label>
		<div class="col-sm-10">
			<input class="form-control" type="number" name="mat" id="mat" size="5" min="0" max="100">
		</div>
	</div>
	
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
  			<button type="submit" class="btn btn-default">전송</button>
  			<button type="reset"  class="btn btn-default">취소</button>
  		</div>
  	</div>
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
		  - 한글 안깨짐
		  - ok.jsp?서버로전송되는값들(공백금지)
		  	형식) 요청페이지명(또는명령어)?변수=값&변수=값&변수=값&...
		  	 예) 06_ok.jsp?uname=대한민국&kor=40&eng=50&mat=60
		  - 검색어
		  
		 2) method = post 방식
		  - 사용자가 요청한 정보가 URL에 노출되지 않고 패키지화하여 전송
		  - 한글 꺠진다
		  - 비번, 주민번호, 카드 번호 등
	-->
</body>
</html>