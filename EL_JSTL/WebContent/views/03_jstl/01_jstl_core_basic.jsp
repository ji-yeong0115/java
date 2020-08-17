<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL - core tag</title>
</head>
<body>
	<h3>라이브러리 등록 방법</h3>
	1) https://tomcat.apache.org/download-taglibs.cgi 접속<br>
	2) Standard-1.2.5 -> jar files -> 4개 다 다운로드<br>
	3) WebContent/WEB-INF/lib 에 추가<br>
	
	<hr>
	
	<h3>JSTL 선언 방법</h3>
	<pre>
	JSTL을 사용하고자 하는 JSP 페이지 상단에 
	page 지시자 밑에 taglib 지시자를 선언함
	
	&lt;%@ taglib prefix="사용하고자 하는 접두사" uri="tld 파일상의 uri" @>
	
	prefix : 접두사, 다른 태그와 구별할 수 있는 namespace 제공
	uri(Uniform Resource Identifier) : 자원을 나타내는 유일한 주소
		- 실제 웹 상의 주소가 아닌, 태그 라이브러리를 나타내는 식별자
		- 라이브러리 내부 tld 파일에 작성되어 있음
	</pre>
	
	
	<hr>
	
	<h3>JSTL core Library</h3>
	변수와 url, 조건문, 박복문 등의 로직과 관련된 JSTL 문법을 제공해줌
	
	
	<p>
		<h4>1. 변수의 선언 - &lt;c:set> </h4>
	
		<pre>
		- 변수를 선언하고 초기값을 대입하는 기능을 가진 태그
		- 변수 선언시 scope를 지정할 수 있음 (기본값 page)
		
		- 사용방법
		1) 변수 타입은 별도로 선언하지 않는다
		2) 변수 선언 시 반드시 초기값 지정
		3) c:set으로 선언한 변수는 EL 식을 통해서 사용할 수 있다.
			단, scriptlet에서는 사용 불가능
		</pre>
		
		<c:set var="no1" value = "${param.num1}"/>
		<c:set var="no2" value = "${param.num2}" scope="request"/>
		<c:set var="result" value="${no1 * no2}" scope="session"/>
		
		${no1} * ${no2} = ${result} <br>
		${pageScope.no1} * ${requestScope.no2} = ${sessionScope.result}
		
		
	</p>
	
	
	<hr>
	
	<p>
		<h4> 2. 변수의 삭제 - &lt;c:remove> </h4>
		지정한 변수를 모든 scope에서 삭제하는 태그 <br>
		-> scope를 지정해서 삭제하는 것도 가능 <br>
		
		<c:set var="result" value="9999" scope="request"/>
		requestScope.result : ${requestScope.result}<br>
		sessionScope.result : ${sessionScope.result} <br> <br>
		
		1)모든 스코프에서 삭제<br>
<%-- 		<c:remove var="result"/>
		
		requestScope.result : ${requestScope.result}<br>
		sessionScope.result : ${sessionScope.result} <br> <br> --%>
		
		2) 특정 스코프에서 삭제 <br>
		<c:remove var="result" scope="session"/>
		
		requestScope.result : ${requestScope.result}<br>
		sessionScope.result : ${sessionScope.result} <br> <br>
		
	</p>	   
	
	<hr>
	<p>
		<h4> 3. 변수의 출력 - &lt;c:out> </h4>
		c:out은 데이터를 출력할 때 사용하는 태그 <br>
		
		<c:out value="<h1>c:out 테스트</h1>"/>
		
		<c:out value="<h1>c:out 테스트</h1>" escapeXml="false" />
		
		
		<pre>
		* 특수 문자 이스케이프 시퀀스(escape sequance)
		< &lt;
		> &gt;
		& &amp;
		</pre>
			
			
	</p>
</body>
</html>