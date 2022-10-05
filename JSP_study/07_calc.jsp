<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>07_calc.jsp</title>
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
    </style>
</head>
<body>
	<div class="frm">
		<h3>* 계산기 연습 *</h3>
		<br>
		<form name="calcfrm" id="calcfrm" method="get" action="07_ok.jsp">
			첫번째 수 : <input type="number" name="num1" min="0" max="100" required> 
			<hr>
			연산자 :    <input type="text" name="op" size="3" required>
		  	<hr>
			두번째 수 : <input type="number" name="num2" min="0" max="100" required>
			<hr>
			<button type="submit" class="btn btn-success">계산</button>                    
	  		<button type="reset" class="btn btn-danger">취소</button>
		</form>
	</div>

</body>
</html>