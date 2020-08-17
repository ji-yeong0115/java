<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL - core tag(if)</title>
</head>
<body>
	<h3>&lt;c:if> 태그 </h3>
	- Java의 if 문과 비슷한 역할을 하는 태그.<br>
	- &lt;c:if> 태그에서 조건식은 test라는 속성의 값으로 지정해야 함<br>
		이 때 조건식은 반드시 EL 형식으로 기술
		
	<pre>
	* EL은 JSP 내장객체에 setAttribute()된 값을 검색하여 자동 형변환을 진행하지만
	getParameter()로 얻어온 값은 무조건 String의 형태를 띄고 있음
	 -> ${param.value}로 얻어온 value 값은 String 자료형	
	
	 -> 숫자로된 파라미터를 사용해야될 경우 Integer.parseInt()를 이용하여 형변환이 필요
	</pre>
	 
	 
	<hr> 
	
	<c:set var="num1" value="${Integer.parseInt(param.num1) }"/>
	<c:set var="num2" value="${Integer.parseInt(param.num2) }"/>
	
	<c:if test="${num1 > num2}">
		<h3>${num1}은 ${num2}보다 큽니다.</h3>
	</c:if>
	
	<c:if test="${num1 < num2}">
		<h3>${num1}은 ${num2}보다 작습니다.</h3>
	</c:if>
	
		<c:if test="${num1 eq num2}">
		<h3>${num1}은 ${num2}와 같습니다.</h3>
	</c:if>
	  
</body>
</html>