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
	<h3>JSP Action Tag란?</h3>
	<pre>
	JSP Action 태그는 XML 기술을 이용하여
	기존의 JSP 문법을 확장하는 메커니즘을 제공하는 태그
	
	* JSP Action 태그는 웹 브라우저에서 실행되는 것이 아닌
	웹 컨테이너에서 실행되고 결과만 브라우저로 내보내짐
	
	* JSP Action 태그는 jsp 파일에서만 작성 가능하고
	사용시 태그명 앞에 jsp: 라는 접두어가 붙은
	
	&lt;jsp : 태그명 속성명=""/>
	</pre>
	
	<hr>

	<h3>JSP Action Tag include (동적 include 방식)</h3>
	
	<p>
		동적 include는 부모페이지가 요청 되는 시점에 삽입이 이루어짐 <br>
		특징 : 각 페이지가 벼래로 취급되어 변수명 중복이 일어나지 않음 <br>
		-> 변수 공유가 안 된다는 단점이 될 수도 있음 <br>
		
		+ 포함하려는 페이지에 파라미터를 전달할 수 있다. <br>
		
		<jsp:include page = "includePage.jsp">
			<jsp:param name = "pName" value = "Galaxy Note20 Ultra"/>
		</jsp:include>
	</p>
</body>
</html>