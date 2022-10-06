<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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

	<div class="container">
		<h3>* 성적 수정 *</h3>

<%
	// 1) 수정하고자 하는 글번호 불러오기 sungjukUpdate.jsp?sno=3
	int sno = Integer.parseInt(request.getParameter("sno"));
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		String url		= "jdbc:oracle:thin:@localhost:1521:xe"; // == "127.0.0.1"
		String user		= "system";
		String password	= "1234";
		String driver	= "oracle.jdbc.driver.OracleDriver"; // ojdbc6.jar
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);		
		// out.println("오라클DB 서버 연결 성공!!");
		
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT sno, uname, kor, eng, mat, aver, addr, wdate ");
		sql.append(" FROM sungjuk ");
		sql.append(" where sno=? ");
		
		pstmt = con.prepareStatement(sql.toString());
		pstmt.setInt(1, sno);
		
		rs= pstmt.executeQuery();
		if(rs.next()){
		// 2) 1)의 내용을 폼에 출력, sungjukForm.jsp 참조
%>
		<form name="sungjukfrm" id="sungjukfrm" method="post" action="sungjukUpdateProc.jsp">
			<input type="hidden" name="sno" value="<%=rs.getInt("sno")%>">
			<table class="table table-responsive">
			<tr>
			  <th>이름 : </th>
			  <td><input type="text" name="uname" value="<%=rs.getString("uname")%>" maxlength="20" required autofocus></td>
			</tr> 
			<tr>
			  <th>국어 : </th>
			  <td><input type="number" name="kor" value="<%=rs.getInt("kor")%>" size="5" min="0" max="100" placeholder="숫자입력"></td>
			</tr>
			<tr>
			  <th>영어 : </th>
			  <td><input type="number" name="eng" value="<%=rs.getInt("eng")%>" size="5" min="0" max="100" placeholder="숫자입력"></td>
			</tr> 
			<tr>
			  <th>수학 : </th>
			  <td><input type="number" name="mat" value="<%=rs.getInt("mat")%>" size="5" min="0" max="100" placeholder="숫자입력"></td>
			</tr>
			<tr>
			  <th>주소 : </th>
			  <td>
			 	  <% String addr=rs.getString("addr");%>
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
		} else{
			out.println("해당 글 없음!!");
		} // if end
			
	}catch(Exception e){
		out.println("오라클DB연결실패 : " + e);
	}finally{ // 자원반납
		try {
			if(rs!=null) {rs.close();}
		} catch (Exception e) {}
		try{
			if(pstmt!=null){pstmt.close();}
		} catch(Exception e){}
		try{
			if(con!=null){con.close();}
		} catch(Exception e){}
	} // end
	
%>
	</div>
</body>
</html>