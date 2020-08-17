<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.kh.el.model.vo.Person"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL - Operation</title>
</head>
<body>
	<h2>EL연산 </h2>
	<pre>
	EL은 본래 연산을 위한 언어가 아닌 JSP 출력 내용을 쉽게 표현하기 위한 언어
	
	하지만 간단한 산술연사, 논리연산은 진행 할 수 있음
	</pre>
	
	<h3>산술연산</h3>
	10 더하기 5 = ${10+5} <br>
	10 빼기 5 = ${10-5} <br>
	10 곱하기 5 = ${10*5} <br>
	10 나누기 5 = ${10/5} <!-- 또는 ${10 div 5} --> <br>
	10 나누기 7의 나머지 = ${10%7} <!-- 또는 ${10 mod 7} --> <br>
	
	<hr>
	
	<h3>여리 가지 추가 연산</h3>
	
	<h4>객체 비교 연산</h4>
		EL을 이용한 객체 비교 시 해당 객체의 클래스에 equals()가 오버라이딩 되어있어야 함 

	<%
		String sOne = "안녕";
		String sTwo = new String("안녕");
		
		Person pOne = new Person("홍길동", 20, '남');
		Person pTwo = new Person("홍길동", 20, '남');
	%>
	
	<table border="1">
		<tr>
			<th>비교식</th>
			<th>scriptlet</th>
			<th>el</th>
		</tr>
		<tr>
			<td>sOne == sTwo</td>
			<td><%=sOne == sTwo %></td>
			<td>${sOne == sTwo} 또는 ${sOne eq sTwo}</td>
			<!-- EL의  ==(비교연산) Java equals()와 같다 -->
		</tr>
		<tr>
			<td>sOne != sTwo</td>
			<td><%=sOne != sTwo %></td>
			<td>${sOne != sTwo} 또는 ${sOne ne sTwo}</td>
		</tr>
		<tr>
			<td>pOne == pTwo</td>
			<td><%= pOne == pTwo %></td>
			<td>${pOne eq pTwo}</td>
		</tr>
		<tr>
			<td>pOne != pTwo</td>
			<td><%= pOne != pTwo %></td>
			<td>${pOne ne pTwo}</td>
		</tr>
	</table>
	<br><br>
	
	<h4>숫자형 자동 형변환</h4>
	
	scriptlet : 
	
	<br>
	
	el : ${big + small }
	
	<br>
	
	<h4>숫자형 자동 형변환 + 비교 연산</h4>
	<%
		pageContext.setAttribute("big", 10);
		pageContext.setAttribute("small", 3);
	%>
	
	scriptlet : <br> 
	<%-- <%=pageContext.getAttribute("big") + pageContext.getAttribute("small")%> --%>
	<!-- Object 타입끼리는 더하기가 안됨 -->
	
	el : ${big+small} <br>
	
	EL은 scope 객체 속성에 담긴 타입이 Object여도 모두 숫자로 작성된 값일 경우 <br>
	자동으로 숫자로 변환하여 연산을 진행함
	
	<br>
	
	==, !=, >, &lt;, >=, =%gt; <br>
	
	big > small : ${big > small} 또는 ${big gt small} <br>
	big >= small : ${big >= small} 또는 ${big ge small} <br>
	big &lt; small : ${big < small} 또는 ${big lt small} <br>
	big &lt;= small : ${big <= small} 또는 ${big le small} <br>
	
	
	<h4>객체가 null 또는 비어있는지 체크</h4>	
	<%
		List<String> list = new ArrayList<>(); // 타입 추론
	%>
	
	list.isEmpty() : <%=list.isEmpty() %> <br>
	EL : ${empty list} <br>
    
    
  	<h4>논리연산자</h4>
  	&&, ||, ! <br>
  	
  	${true && true} 또는 ${true and true} <br>
  	${true || true} 또는 ${true or true} <br>
  	${!true} <br>
  
  
</body>
</html>