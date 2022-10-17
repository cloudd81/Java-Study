<%@page import="java.time.Clock"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <title>index.jsp</title>
  <meta charset="utf-8">
  <link rel="stylesheet" href="./css/reset.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/quiple/hbios-sys@latest/hbios-sys.css">
  <script src="./js/myscript.js"></script>
  
  <!-- 사용자 정의 스타일과 자바스크립트 -->
  <!-- 주의사항 : CSS와 JS는 각 웹브라우저에서 쿠키삭제하고 확인할 것 -->
  <!-- layout.css import -->
  <link rel="stylesheet" href="./css/layout.css">
  <script src="./js/clock.js"></script>
  <script src="./js/scroll.js"></script>
</head>
<body>
 
<!-- 메인 카테고리 시작 -->
<nav id="indexbg" class="navbar navbar-default">
<div id="topbg" class="container-fluid text-center" style="background-image: url('./images/miniproj/topbg.png');">
  	<a href="<%=request.getContextPath()%>/index.jsp">
  		<img class="img-responsive" alt="ozlogo" src="./images/miniproj/logo.png" width="200px;" style="display:inline;">
  	</a>
</div>
<div class="container">
    <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
    </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
    <ul class="nav navbar-nav">
        <li><a class="font2" href="./bbs/bbsList.jsp">게시판</a></li>
        <li><a class="font2" href="./notice/noticeList.jsp">공지사항</a></li>
        <li><a class="font2" href="./pds/pdsList.jsp">포토갤러리</a></li>
        <li><a class="font2" href="./mail/mailForm.jsp">메일보내기</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
        <li><a class="font2" href="./member/loginForm.jsp"><span class="glyphicon glyphicon-log-in"></span> 로그인</a></li>
    </ul>
    </div>
</div>
</nav> <!-- 메인 카테고리 끝 -->

<!-- First Container Start -->
<div class="col-lg-1 hidden-ms"></div>
<div class="col-lg-10">
<div class="Container bgbox">
	<div class="row">
	<div class="col-sm-9 col-lg-8">
		<div id="myCarousel" class="carousel slide" data-ride="carousel" style="margin: 50px;">
		    <!-- Indicators -->
		    <ol class="carousel-indicators">
		      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		      <li data-target="#myCarousel" data-slide-to="1"></li>
		      <li data-target="#myCarousel" data-slide-to="2"></li>
		    </ol>
		
		    <!-- Wrapper for slides -->
		    <div class="carousel-inner" role="listbox">
		      <div class="item active text-center">
		        <img src="./images/miniproj/bn1.png" alt="banner1" width="600" height="350">
		        <div class="carousel-caption">
		          <h3 class="font1 textbox">마녀를 잡으러 가자고?</h3>
		          <h4 class="font1 textbox">우리 넷이서 괜찮을까?</h4>
		        </div>      
		      </div>
		
		      <div class="item">
		        <img src="./images/miniproj/bn3.png" alt="banner2" width="600" height="350">
		        <div class="carousel-caption">
		          <h3 class="font1 textbox">넷이서 간다고?</h3>
		          <h4 class="font1 textbox">에메랄드성을 넷이서? 미치지 않고서야?</h4>
		        </div>      
		      </div>
		      
		      <div class="item">
		        <img src="./images/miniproj/bn2.png" alt="banner3" width="600" height="350">
		        <div class="carousel-caption">
		          <h3 class="font1 textbox">새로운 친구가 필요해!</h3>
		          <h4 class="font1 textbox">누가 우리와 함께 해줄까?</h4>
		        </div>      
		      </div>
		    </div>
		
		    <!-- Left and right controls -->
		    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
		      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		      <span class="sr-only">Previous</span>
		    </a>
		    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
		      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		      <span class="sr-only">Next</span>
		    </a>
		</div><!-- myCarousel End -->
	</div>
	<div class="container-fluid col-sm-3 col-lg-4 hidden-xs">
		<table class="table table-striped">
			<tr>
				<td class="font2" style="text-align: center;">
	    			회원정보
	    		</td>
	    	</tr>
	    	<tr class="text-center font2" id="clock">
	    		<td>
		        	<script type="text/javascript">showtime()</script>
		        </td>
	    	</tr>
        </table>
	</div>
	</div><!-- row end -->
</div>
<div class="col-lg-1 hidden-ms"></div>
</div><!-- First Container End -->

<!-- Content 시작 -->
<div class="container-fluid text-center">
    <div class="row">
        <!-- 본문 시작 -->
        <div class="col-sm-12">
			<span class="col-xs-6 col-sm-3">
				<img alt="dorosi" src="./images/miniproj/dorosi.png">
				<br>
				<button class="btn btn-default margin2 font1" data-toggle="tooltip" data-placement="top" title="hey!">도로시</button>
			</span>
			<span class="col-xs-6 col-sm-3">
				<img alt="tinman" src="./images/miniproj/tinman.png">
				<br>
				<button class="btn btn-default margin2 font1" data-toggle="tooltip" data-placement="top" title="hey!">양철 나무꾼</button>
			</span>
			<span class="col-xs-6 col-sm-3">
				<img alt="scarecrow" src="./images/miniproj/scarecrow.png">
				<br>
				<button class="btn btn-default margin2 font1" data-toggle="tooltip" data-placement="top" title="hey!">허수아비</button>
			</span>
			<span class="col-xs-6 col-sm-3">
				<img alt="rian" src="./images/miniproj/rian.png">
				<br>
				<button class="btn btn-default margin2 font1" data-toggle="tooltip" data-placement="top" title="hey!">겁쟁이 사자</button>
			</span>
        </div>
        <!-- 본문 끝 -->
    </div> <!-- row 끝 -->
</div> <!-- Second Container 끝 -->
<!-- Content 끝 -->

<!-- Footer 시작 -->
<footer id="indexbg" class="container-fluid text-center" style="background-image: url('./images/miniproj/paperbg2.jpg')">
	<p style="color: #222222; text-shadow: 2px 2px 3px gray; opacity: 0.8;">Copyright &copy; 김경환 cloudd81</p> 
</footer>
<!-- Footer 끝 -->    

</body>
</html>
