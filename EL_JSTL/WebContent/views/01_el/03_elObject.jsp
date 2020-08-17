<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.kh.el.model.vo.Person"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL - Object</title>
</head>
<body>
	<h2>그 밖의 EL 내장객체 : cookie, initParam, header, pageContext</h2>
	<h3>cookie</h3>

	쿠키에서 가져오 saveId 값 ${cookie.saveId.value}<br>
	쿠키에서 가져온 JSESSIONID 값 ${cookie.JSESSIONID.value}<br>
	
	<% Person p = null; %>
	<%-- <%=p.getName() %> --%>
	<!-- nullPointerException -->
	
	이름 : ${p.name}
	
	<pre>
	EL의 장점 중 하나는 NullPorinterException을 발생시키지 않는다는 것
	속성명/키값/프로퍼티의 값이 null일 경우 예외를 발생시키지 않고, 아무것도 출력하지 않음
		
	산술연산 시 null이 발생할 경우 0으로 처리됨
	논리연산 시 null이 발생할 경우 false으로 처리됨
	</pre>
	
	<hr>
	
	
	
	<h3>컨텍스트 초기화 파라미터 : initParam</h3>
	
	<pre>
	web.xml(배포 서술자)에 설정한 초기화 파라미터를 얻어오는 객체
	</pre>
	
	컨텍스트 파라미터 : ${initParam.email}<br>
	컨텍스트 파라미어(스크립팅) : <%=application.getInitParameter("email") %>
	
	
	<hr>
	
	<h3>기타 request객체의 메소드를 el로 호출하기</h3>
	
	<pre>
	request 객체를 이용한 메소드 
	
	getContextPath();
	getSession();
	getServletContext(); -> application 객체 얻어오기
	
	getRequest();
	getResponse();
	getErrorData();
	</pre>
	
	contextPath(표현식) : <%=request.getContextPath() %> <br>
	contextPath(EL) : ${request.contextPath}<br> 
	contextPath(EL) : ${pageContext.request.contextPath}<br> 
	<!-- 
		EL에는 request라는 내장 객체는 존재하지 않음
		-> pageContext.request를 이용해야만 request 메소드를 사용할 수 있음
	 -->
	
</body>
</html>