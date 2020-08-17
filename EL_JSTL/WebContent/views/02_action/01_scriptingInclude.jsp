<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Action Tag</title>
</head>
<body>
	<h3>Scripting include(정적 include 방식)</h3>
	
	<pre>
	정적 include 방식이란 include된 파일(includePage.jsp)이
	서버 구동 전 컴파일 단계에서 부터 현재 페이지에 포함되는 방식이다.
	
	정적 : 서버가 구동되지 않을 때 이루어지는 것들 (이미 완성되어 있는 것들)
	동적 : 서버 구동 후에 이루어지는 것들 
	
	</pre>
		
	<p>
	
	<%@ include file = "includePage.jsp" %>
	include 된 페이지의 year : <%=year %>
	
<%-- 	<%
		String year = String .format("%tY", new Date());
		// Duplicate local variable year
	%> --%>
	
	문제점 : 현재 페이지와 include한 페이지의 변수명 중복이 발생함. (유지보수 불편)
	
	</p>
		
</body>
</html>