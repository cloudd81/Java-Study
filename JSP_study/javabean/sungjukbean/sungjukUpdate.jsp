<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukUpdate.jsp</title>
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
		      <li><a href="sungjukForm.jsp">성적입력</a></li>
		      <li><a href="sungjukList.jsp">성적목록</a></li>
		      <li><a class="dropdown-toggle" data-toggle="dropdown">성적상세보기<span class="caret"></span></a>
		        <ul class="dropdown-menu">
		          <li class="noti1"><span class="noti2">성적목록의<br>상세보기를 누르세요</span></li>
		        </ul>
	          </li>
	   	      <li class="active"><a class="dropdown-toggle" data-toggle="dropdown">성적수정하기<span class="caret"></span></a>
		        <ul class="dropdown-menu">
		          <li class="noti1"><span class="noti2">성적상세보기에서<br>수정을 누르세요</span></li>
		        </ul>
	          </li>
		    </ul>
		  </div>
	  </div>
	</nav>

	<h3>* 성적 입력 결과 페이지 *</h3>
	<div class="container">
<%
	int sno = Integer.parseInt(request.getParameter("sno"));
	dto = dao.read(sno);
	if(dto==null){
		out.print("자료 없음!!");
	} else{
		String addr = dto.getAddr();
%>	
		<form name="sungjukfrm" id="sungjukfrm" method="post" action="sungjukUpdateProc.jsp">
			<input type="hidden" name="sno" value="<%=dto.getSno()%>">
			<table class="table table-responsive">
			<tr>
			  <th>이름 : </th>
			  <td><input type="text" name="uname" value="<%=dto.getUname()%>" maxlength="20" required autofocus></td>
			</tr> 
			<tr>
			  <th>국어 : </th>
			  <td><input type="number" name="kor" value="<%=dto.getKor()%>" size="5" min="0" max="100" placeholder="숫자입력"></td>
			</tr>
			<tr>
			  <th>영어 : </th>
			  <td><input type="number" name="eng" value="<%=dto.getEng()%>" size="5" min="0" max="100" placeholder="숫자입력"></td>
			</tr> 
			<tr>
			  <th>수학 : </th>
			  <td><input type="number" name="mat" value="<%=dto.getMat()%>" size="5" min="0" max="100" placeholder="숫자입력"></td>
			</tr>
			<tr>
			  <th>주소 : </th>
			  <td>
			      <select name="addr">
		              <option value="Seoul" <%if(addr.equals("Seoul")) {out.print("selected");}%>>서울</option>
		              <option value="Jeju" <%if(addr.equals("Jeju")) {out.print("selected");}%>>제주</option>
		              <option value="Suwon" <%if(addr.equals("Suwon")) {out.print("selected");}%>>수원</option>
		              <option value="Busan" <%if(addr.equals("Busan")) {out.print("selected");}%>>부산</option>
			      </select> 
			  </td>
			</tr>
			<tr>
			  <td colspan="2" align="center">
			     <input type="submit" class="btn btn-default" value="수정">
			     <input type="reset" class="btn btn-default" onClick="history.back()" value="취소">
			  </td>
			</tr>
			</table>
		</form>	
<%
		} // if end		
%>
	</div>
</body>
</html>