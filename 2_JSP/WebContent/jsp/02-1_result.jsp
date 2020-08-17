<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>두 수 사이 정수 총합 결과</title>
<style>
	span{color: red; }
</style>
</head>
<body>
	<h2>
		<%
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));	
					
			// 두 수 중 작은 값이 기준
			int min;
			int max;
			int sum=0;
			
			if(num1 > num2){
				min=num2;
				max=num1;
			}else{
				min=num1;
				max=num2;
			}
			
			for(int i=min; i<=max; i++){
				sum+=i;
			}
		%>
	</h2>
	
	<h2>
		<%=num1 %> 부터 <%=num2 %>까지의 모든 정수의 합은 <span><%=sum %></span>입니다.
		
	</h2>
</body>
</html>