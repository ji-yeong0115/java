<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL - core tag(choose)</title>
</head>
<body>
		<h3>&lt;c:choose> 태그 </h3>
		
		<pre>
		- java의 if-else if-else / switch 문과 비슷한 역할을 하는 태그
		
		- &lt;c:choose> 태그는 여러 조건을 작성하는 영역을 나타내는 태그
		
		- &lt;c:when> , &lt;c:otherwise> 태그가 내부에 작성된
		
		  &lt;c:when> : if, else if, case를 나타내는 태그
		  					(태그마다 필요한 조건을 작성함)
		  &lt;c:otherwise> : else, default를 나타내는 태그
		</pre>
		
	
		<c:choose>
			<c:when test="${Integer.parseInt(param.num1)%5 == 1}">
				<h2>인형 당첨!</h2>
			</c:when>
			
			<c:when test="${Integer.parseInt(param.num1)%5 == 2}">
				<h2>에어팟 당첨!</h2>
			</c:when>
			
			<c:otherwise>
				<h1>꽝 !</h1>
			</c:otherwise>
			
		</c:choose>
		
</body>
</html>