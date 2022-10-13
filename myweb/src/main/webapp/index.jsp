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
<div class="container-fluid text-center">
  	<a href="<%=request.getContextPath()%>/index.jsp">
  		<img class="img-responsive" alt="ozlogo" src="./images/miniproj/logo.png" width="180px;" style="display:inline;">
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
    <ul class="nav navbar-nav navbar-right">
        <li><a class="font2" href="./bbs/bbsList.jsp">게시판</a></li>
        <li><a class="font2" href="./notice/noticeList.jsp">공지사항</a></li>
        <li><a class="font2" href="./pds/pdsList.jsp">포토갤러리</a></li>
        <li><a class="font2" href="./mail/mailForm.jsp">메일보내기</a></li>
        <li><a class="font2" href="./member/loginForm.jsp"><span class="glyphicon glyphicon-log-in"></span> 로그인</a></li>
    </ul>
    </div>
</div>
</nav> <!-- 메인 카테고리 끝 -->

<!-- First Container Start -->
<div class="Container">
	<div class="row">
	<div class="col-md-8">
		<div id="myCarousel" class="carousel slide margin" data-ride="carousel">
		    <!-- Indicators -->
		    <ol class="carousel-indicators">
		      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		      <li data-target="#myCarousel" data-slide-to="1"></li>
		    </ol>
		
		    <!-- Wrapper for slides -->
		    <div class="carousel-inner" role="listbox">
		      <div class="item active text-center">
		        <img src="./images/miniproj/banner1.png" alt="banner1" width="1200" height="700">
		        <div class="carousel-caption">
		          <h3 class="font1 shadow">도로시와 친구들!</h3>
		          <p class="font1 shadow">우리 제법 잘 어울려요</p>
		        </div>      
		      </div>
		
		      <div class="item">
		        <img src="./images/miniproj/banner2.png" alt="banner2" width="1200" height="700">
		        <div class="carousel-caption">
		          <h3 class="font1 shadow">마녀를 향해!</h3>
		          <p class="font1 shadow">마녀를 물리치면 소원을 이루어준다고 했어요</p>
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
	<div class="col-md-4 text-center">
		<br>
	    <p class="font2" style="color: black;">회원정보</p>
        <br>
        <div id="clock">
        	<script> showtime();</script>
        </div>
        <button type="button" id="title" class="btn btn-default" onclick="showtime()">clock start</button>
        <button type="button" id="title" class="btn btn-default" onclick="killtime()">clock stop</button>
	</div>
	</div><!-- row end -->
</div><!-- First Container End -->

<!-- Content 시작 -->
<div class="container-fluid text-center">
    <div class="row">
        <!-- 본문 시작 -->
            <br>
            <div id="game">
                <script> start(); </script>
            </div>
        <!-- 본문 끝 -->
    </div> <!-- row 끝 -->
</div> <!-- Second Container 끝 -->
<!-- Content 끝 -->

<!-- Footer 시작 -->
<footer id="indexbg" class="container-fluid text-center">
	<p>Copyright &copy; 김경환 cloudd81</p> 
</footer>
<!-- Footer 끝 -->    

</body>
</html>
