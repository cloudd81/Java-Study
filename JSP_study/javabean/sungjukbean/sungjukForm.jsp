<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukForm.jsp</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<style type="text/css">
	@font-face {
	    font-family: 'RIDIBatang';
	    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_twelve@1.0/RIDIBatang.woff') format('woff');
	    font-weight: normal;
	    font-style: normal;
	}
     body {margin: auto; text-align: center; font-family: 'RIDIBatang', 'normal'; font-size:15px;}
     table {margin: auto;}
     th {text-align: center;}
     .noti1 {background-color: white; text-align: center;}
     .noti2 {color: black;}
    </style>
</head>
<body>
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
		  <div class="navbar-header">
		      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>
		        <span class="icon-bar"></span>                        
		      </button>
		      <a class="navbar-brand">SUNGJUK</a>
	      </div>
	      <div class="collapse navbar-collapse" id="myNavbar">
		    <ul class="nav navbar-nav navbar-right">
		      <li class="active"><a href="sungjukForm.jsp">성적입력</a></li>
		      <li><a href="sungjukList.jsp">성적목록</a></li>
		      <li><a class="dropdown-toggle" data-toggle="dropdown">성적상세보기<span class="caret"></span></a>
		        <ul class="dropdown-menu">
		          <li class="noti1"><span class="noti2">성적목록의<br>상세보기를 누르세요</span></li>
		        </ul>
	          </li>
	   	      <li><a class="dropdown-toggle" data-toggle="dropdown">성적수정하기<span class="caret"></span></a>
		        <ul class="dropdown-menu">
		          <li class="noti1"><span class="noti2">성적상세보기에서<br>수정을 누르세요</span></li>
		        </ul>
	          </li>
		    </ul>
		  </div>
	  </div>
	</nav>


	<div class="container">
		<h3>* 성적을 입력하세요 *</h3>
		<form name="sungjukfrm" id="sungjukfrm" method="post" action="sungjukIns.jsp">
			<table class="table table-hover">
			<tr>
			  <th>이름 : </th>
			  <td><input type="text" style="width: 120px;" name="uname" maxlength="20" required autofocus></td>
			</tr> 
			<tr>
			  <th>국어 : </th>
			  <td><input type="number" style="width: 120px;" name="kor" size="5" min="0" max="100" required autofocus placeholder="숫자입력"></td>
			</tr>
			<tr>
			  <th>영어 : </th>
			  <td><input type="number" style="width: 120px;" name="eng" size="5" min="0" max="100" required autofocus placeholder="숫자입력"></td>
			</tr> 
			<tr>
			  <th>수학 : </th>
			  <td><input type="number" style="width: 120px;" name="mat" size="5" min="0" max="100" required autofocus placeholder="숫자입력"></td>
			</tr>
			<tr>
			  <th>주소 : </th>
			  <td>
			      <select name="addr" style="width: 120px;">
		              <option value="Seoul">서울</option>
		              <option value="Jeju">제주</option>
		              <option value="Suwon">수원</option>
		              <option value="Busan">부산</option>
			      </select> 
			  </td>
			</tr>
			<tr>
			  <td colspan="2" align="center">
			     <input type="submit" class="btn btn-success" value=" 전송 ">
			     <input type="reset" class="btn btn-danger" value=" 취소 ">
			  </td>
			</tr>
			</table>
		</form>		
	</div>

</body>
</html>