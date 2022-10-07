<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>sungjukDel.jsp</title>
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
     .noti1 {bac kground-color: white; text-align: center;}
     .noti2 {color: black;}
    </style>
</head>
<body>
	<h3>* 성적 삭제 *</h3>
	<div class="container">
		<div class="table-responsive">
		<table class="table">
<%
	int sno = Integer.parseInt(request.getParameter("sno"));
	int cnt = dao.delete(sno);
	if(cnt==0){
		out.print("성적 삭제에 실패했습니다");
		out.println("<p><a href='javascript:history.back()'>[다시시도]</a></p>");
	} else{
		out.print("<script>");
		out.print("		alert('삭제 되었습니다');");
		out.print(" 	location.href='sungjukList.jsp';");
		out.print("</script>");
	} // if end	
%>
		</table>
		</div>
	</div>
</body>
</html>