<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>피자 주문 화면</title>
<style>
	table{
		border: 1px solid black;
		border-collapse:collapse;
	}
	th, td{
		border: 1px solid black;
		padding: 10px;
	}
</style>
</head>
<body>
	<!-- 오늘 날짜를 외부 jsp파일 include해서 표현 -->
		<h1>오늘은 
		<span style="color:lightpink">
			<!-- 현재 시간을 나타내는 jsp를 include 할 것 -->
			<%@ include file="currentTime.jsp" %>
		</span> 입니다.
	</h1>
	
	<h1>피자 아카데미</h1>

	<!-- 메뉴판 -->

	<!-- 메뉴를 주문하기 위한 form 태그 -->
	<form action="/2_JSP/confirmPizza.do" method = "post">
		<table id="menu">
                        <tr>
                            <th>종류</th>
                            <th>이름</th>
                            <th>가격</th>
                            <td rowspan="13"></td>
                            <th>종류</th>
                            <th>이름</th>
                            <th>가격</th>
                        </tr>
                
                        <tr>
                            <td rowspan="6">피자</td>
                            <td>치즈피자</td>
                            <td>5000</td>
                            <td rowspan="13">사이드</td>
                            <td>오븐구이통닭</td>
                            <td>9000</td>
                        </tr>
            
                        </tr>
                            <td>콤비네이션피자</td>
                            <td>6000</td>
                            <td>치킨스틱&윙</td>
                            <td>4900</td>
                        <tr>
                
                        <tr>
                            <td>포테이토피자</td>
                            <td>7000</td>
                            <td>치즈오븐스파게티</td>
                            <td>4000</td>
                        </tr>
    
                        <tr>
                            <td>고구마피자</td>
                            <td>7000</td>
                            <td>새우링&웨지감자</td>
                            <td>3500</td>
                        </tr>
    
                        <tr>
                            <td>불고기피자</td>
                            <td>8000</td>
                            <td>갈릭포테이토</td>
                            <td>3000</td>
                        </tr>
    
                        <tr>
                            <td rowspan="7">토핑</td>
                            <td>고구마무스</td>
                            <td>1000</td>
                            <td>콜라</td>
                            <td>1500</td>
                        </tr>
            
                        <tr>
                            <td>콘크림무스</td>
                            <td>1500</td>
                            <td>사이다</td>
                            <td>1500</td>
                        </tr>
    
                        <tr>
                            <td>파인애플토핑</td>
                            <td>2000</td>
                            <td>갈릭소스</td>
                            <td>500</td>
                        </tr>
    
                        <tr>
                            <td>치즈토핑</td>
                            <td>2000</td>
                            <td>피클</td>
                            <td>300</td>
                        </tr>
    
                        <tr>
                            <td>치즈크러스트</td>
                            <td>2000</td>
                            <td>핫소스</td>
                            <td>100</td>
                        </tr>
    
                        <tr>
                            <td>치즈바이트</td>
                            <td>3000</td>
                            <td>파마산 치즈가루</td>
                            <td>100</td>
                        </tr>
                    </table>


                <br><br>
                <label>피자 : </label>
                <select name="pizza">
                    <option value="치즈피자">치즈피자</option>
                    <option value="콤비네이션피자">콤비네이션피자</option>
                    <option value="포테이토피자">포테이토피자</option>
                    <option value="고구마피자">고구마피자</option>
                    <option value="불고기피자">불고기피자</option>
                </select> <br>

                <label>토핑 : </label>
                <input type="checkbox" name="topping" id="sp" value="고구마무스"><label for="sp">고구마무스</label>
                <input type="checkbox" name="topping" id="corn" value="콘크림무스"><label for="corn">콘크림무스</label>
                <input type="checkbox" name="topping" id="pineapple" value="파인애플토핑"><label for="pineapple">파인애플토핑</label>
                <input type="checkbox" name="topping" id="cheese" value="치즈토핑"><label for="cheese">치즈토핑</label>
                <input type="checkbox" name="topping" id="cheeseC" value="치즈크러스트"><label for="cheeseC">치즈크러스트</label>
                <input type="checkbox" name="topping" id="cheeseB" value="치즈바이트"><label for="cheeseB">치즈바이트</label>
                <br>

                <label>사이드 : </label>
                <input type="checkbox" name="side" id="side1" value="오븐구이통닭"><label for="side1">오븐구이통닭</label>
                <input type="checkbox" name="side" id="side2" value="치킨스틱&윙"><label for="side2">치킨스틱&윙</label>
                <input type="checkbox" name="side" id="side3" value="치즈오븐스파게티"><label for="side3">치즈오븐스파게티</label>
                <input type="checkbox" name="side" id="side4" value="새우링&웨지감자"><label for="side4">새우링&웨지감자</label>
                <input type="checkbox" name="side" id="side5" value="갈릭포테이토"><label for="side5">갈릭포테이토</label>
                <input type="checkbox" name="side" id="side6" value="콜라"><label for="side6">콜라</label>
                <input type="checkbox" name="side" id="side7" value="사이다"><label for="side7">사이다</label>
                <input type="checkbox" name="side" id="side8" value="갈릭소스"><label for="side8">갈릭소스</label>
                <input type="checkbox" name="side" id="side9" value="피클"><label for="side9">피클</label>
                <input type="checkbox" name="side" id="side10" value="핫소스"><label for="side10">핫소스</label>
                <input type="checkbox" name="side" id="side11" value="파마산 치즈가루"><label for="side11">파마산 치즈가루</label>
		
	
		<button>주문하기</button>
	</form>


</body>
</html>