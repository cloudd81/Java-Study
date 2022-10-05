<%@page import="org.jsoup.nodes.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>07_ok.jsp</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Gugi&display=swap" rel="stylesheet">
    <style type="text/css">
     .frm {margin: auto; text-align: center; font-family: 'Gugi', cursive;}
     .table {font-size: 45px;}
    </style>
</head>
<body>
	<div class="frm">
		<br><h3>* 계산 결과 *</h3><br>
<%
		request.setCharacterEncoding("UTF-8");
	
		int num1 = Integer.parseInt(request.getParameter("num1").trim());
		int num2 = Integer.parseInt(request.getParameter("num2").trim());
		String op = request.getParameter("op").trim();
		int sum1=0;
		double sum2=0.0;
		String error="";
		
		if(op.equals("+")){
			sum1=num1+num2;
		} else if(op.equals("-")){
			sum1=num1-num2;
		} else if(op.equals("*")){
			sum1=num1*num2;
		} else if(op.equals("/")){
			sum2=(double)num1/num2;
		} else if(op.equals("%")){
			sum1=num1%num2;
		} else{
			error = "연산자를 확인하세요";
		}
		
%>

		<div class="container">
			<table class="table">
			<tr>
				<td><%=num1%></td>
				<td><%=op%></td>
				<td><%=num2%></td>
				<td>=</td>
				<td>
<%
					if(op.equals("/")){
						out.print(String.format("%.1f", sum2));
					} else {
						out.print(sum1);
					} // if end
%>
				</td>
			</tr>
			<tr>
				<td colspan="5"><%=error%></td>
			</tr>
			</table>
		</div>	
		<button type="reset" class="btn btn-danger btn-lg" onClick="history.back()">돌아가기</button>
	</div>
</body>
</html>