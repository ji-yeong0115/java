<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>El - Param</title>
</head>
<body>

	<pre>
		param : 전달된 파라미터를 얻어올 때 사용
		paramValues : 전달된 파라미터를 배열로 얻어올 때 사용
	</pre>
	
	<h2>주문 내역</h2>
	상품명 : ${param.pname}<br>
	수량 : ${param.pcount}<br>
	
	옵션 1 : ${paramValues.option[0]}<br>
	옵션 2 : ${paramValues.option[1]}<br>

</body>
</html>