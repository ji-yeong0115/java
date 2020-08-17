<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String pizza = request.getParameter("pizza");
	String toppingJoin = (String)request.getAttribute("toppingJoin");
	String sideJoin = (String)request.getAttribute("sideJoin");
	int total = (int)request.getAttribute("total");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>피자 주문 출력 화면</title>
	<style>
		span.pizza{color: red;}
		span.topping{color: green;}
		span.side{color: blue;}
	</style>
</head>
<body>
	<h1>주문 내역</h1>
	<h3>
	피자는 <span class="pizza"><%=pizza %></span>, 토핑은
	<span class="topping"><%=toppingJoin %></span>, <br>
	사이드는<span class="side"><%=sideJoin %></span> 주문하셨습니다.
	<br><br><br>
	총 합 : <u><%=total %></u>
	</h3>
	 


</body>
</html>