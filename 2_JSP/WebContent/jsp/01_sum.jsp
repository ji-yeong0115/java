<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP로 1부터 100가지 합 구하기</title>
</head>
<body>
	<!-- HTML 주석 -->
	<!-- HTML 주석은 HTML 태그만 주석처리가 가능하고
		 주석의 내용이 클라이언트에게 전달된다.
	 -->
	<%-- JSP 주석 --%>
	<%-- JSP + HTML 모든 내용을 주석처리 할 수 있고,
		 주석의 내용이 클라이언트에게 전달되지 않는다.
	 --%>
	 
	 <h1>1부터 100까지의 합</h1>
	 <%
	 	// 스크립틀릿 : JSP에서 자바 코드를 작성할 수 있는 영역
	 	// 선언, 로직, 표현(출력) 모두 가능함
	 	
	 	int sum = 0;
	 	
	 	for(int i=1; i<101; i++){
	 		sum += i;
	 	}
	 	System.out.println("sum : " + sum);
	 %>
	 
	 <%-- 표현식 : 자바 변수의 값 또는 메소드 결과를 화면에 출력해줌 --%>
	 expression을 이용한 화면 출력 : <%= sum %> <br>
	 
	 scriptlet으로도 화면 출력이 가능함 : <% out.println(sum); %>

</body>
</html>