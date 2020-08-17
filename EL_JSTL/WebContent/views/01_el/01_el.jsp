<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.kh.el.model.vo.Person"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>EL 이란?</h3>
	<pre>
	Expression Language(표현 언어)의 약자로
	&lt;%= %&gt; (jsp 표현식), response.getWriter().print(); 와 같이
	JSP 출력에 사용되는 Java 코드를 좀 더 간결하게 표현할 수 있게 하는 언어
	
	화면에 표현하고자 하는 Java 코드를 \$ { value }의 형식으로 작성함
	
	EL은 request, session등에 세팅된 값을 별도로 JSP 페이지에 꺼내놓지 않아도
	자동으로 입력된 속성명을 알아서 검색하여 존재하는 경우 해당 값을 얻어옴
	
	
	</pre>

	<h3>1. scriptlet을 이용하여 request,session 객체에 저장된 속성  화면 출력하기</h3>
	
	<%
		// 1. request, session 객체에 저장된 속성 scriptlet을 이용하여 화면 출력하기
	%>
	
<%-- 	<%

	// 1. requset.session 객체에 저장된 속성 scriptlet을 이용하여 화면 출력하기
	String classRoom = (String)request.getAttribute("classRoom");
	Person person = (Person)request.getAttribute("person");
	String academy = (String)request.getSession().getAttribute("academy");


	%>
	
	학원명 : <%=academy %><br>
	강의장 : <%=classRoom %><br>
	<br>
	수강생 정보
	<ul> 
		<li>이름 : <%=person.getName() %></li>
		<li>나이 : <%=person.getAge() %></li>
		<li>성별 : <%=person.getGender() %></li>
	</ul>  --%>
	
	
	<hr>
	
	
	<h3>2. el을 이용하여 request, session 객체에 저장된 속성 화면 출력하기</h3>
	학원명 : ${academy}<br>
	강의장 : ${classRoom}<br>
	<br>
	수강생 정보
	<ul> 
		<!-- el에서 객체 내의 필드에 접근하기 위해서는
			해당 객체에 getter가 반드시 작성되어 있어야 함
		 -->
		<li>이름 : ${person.name}</li>
		<li>나이 : ${person.age}</li>
		<li>성별 : ${person.gender}</li>
	</ul>
	
	
	<hr>
	
	
	<h3>3. el 사용 시 내장객체에 저장된 속성명이 같은 경우</h3>
	
	<pre>
	JSP에는 내장객체는 4가지 영역(범위)을 가지고 있음
	page, request, session, application
	
	1. page scope
		- 하나의 JSP 페이지 내에서만 공유 가능한 객체
			-> forward(요청 위임) 되더라고 해당 JSP 페이지의 page 객체는 공유되지 않음
	    - pageCOntext라는 JSP 내장 객체를 이용해서 사용할 수 있음
	    
	2. request scope
		- 요청을 하는 페이지(servlet, jsp) + 요청을 위임받은(응답용) 페이지에서 객체 공유
	    - request.setAttribute("속성명", 객체)로 요청을 위임한 페이지로 전달함
	    - 전달받은 페이지에서 request.getAttribute("속성명") 사용 가능
	    
	3. session scope
		- 하나의 브라우저당 1개의 session 객체가 생성되며,
		   같은 브라우저 내에서 객체를 공유함
		- 브라우저가 종료되거나 session이 만료될 때가지 공유됨
		- request.getSession()을 통해 session 객체를 얻어옴
		
	4. application scope
		- 하나의 웹 애플리케이션당 하나의 application 객체가 생성되고
		    해당 웹 앱에서 모두 공유되는 객체
		- 애플리케이션이 종료되기 전까지 모든 페이지에서 공유됨
		- request.getServletContext() 메소드를 호출하면 application 객체를 얻어옴
		
		
	* 4가지 영역 모두
	xxx.setAttribute("속성명", 객체)로 값을 세팅하고
	xxx.getAttribute("속성명")로 값을 얻어올 수 있음
		
	</pre>
	
	<%
		// page scope
		pageContext.setAttribute("scope", "page scope");
	
	%>

	scope : ${scope} <br>
	EL은 page -> request -> session -> application scope 순서로 속성명을 검색함
	

	<br><br>
	<hr>
	<h3>4. 특정 내장 객체에 저장된 속성 다루기</h3>
	
	page : ${scope} 또는 ${pageScope.scope} <br>
	request : ${requestScope.scope} <br>
	session : ${sessionScope.scope} <br>
	application : ${applicationScope.scope} <br>
	
	

	
</body>
</html>