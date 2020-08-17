package com.kh.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PizzaServlet")
public class PizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PizzaServlet() {
        super();
        
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8"); 
		
		String pizza = request.getParameter("pizza");
		String[] toppingArr = request.getParameterValues("topping");
		String[] sideArr = request.getParameterValues("side");
		
		int total = 0; //총 합 금액
		
		
		String toppingJoin = null;
		if(toppingArr != null) {
			toppingJoin = String.join(", ", toppingArr);
			
			for(String topping : toppingArr) {
				switch(topping) {
				case "고구마무스" : total += 1000; break;
				case "콘크림무스" : total += 1500; break;
				case "파인애플토핑" : total += 2000; break;
				case "치즈토핑" : total += 2000; break;
				case "치즈크러스트" : total += 2000; break;
				case "치즈바이트" : total += 3000; break;			
				}
			}
		}else {
			toppingJoin = "없음";
		}
		
		String sideJoin = null;
		if(sideArr != null) {
			sideJoin = String.join(", ", sideArr);
			
			for(String side : sideArr) {
				switch(side) {
				case "오븐구이통닭" : total += 9000; break;
				case "치킨스틱&윙" : total += 4900; break;
				case "새우링&웨지감자" : total += 3500; break;
				case "갈릭포테이토" : total += 3000; break;
				case "콜라" : total += 1500; break;
				case "사이다" : total += 1500; break;
				case "갈릭소스" : total += 500; break;
				case "피클" : total += 300; break;
				case "핫소스" : total += 100; break;
				case "파마산 치즈가루" : total += 100; break;
				}
			}
		}else {
			sideJoin = "없음";
		}
		
		switch(pizza) {
		case "치즈피자" : total += 5000; break;
		case "콤비네이션피자" : total += 6000; break;
		case "포테이토피자" : total += 7000; break;
		case "고구마피자" : total += 7000; break;
		case "불고기피자" : total += 8000; break;
		}
		
		RequestDispatcher view = request.getRequestDispatcher(
				"jsp/04_pizzaEnd.jsp");
		
		request.setAttribute("toppingJoin", toppingJoin);
		request.setAttribute("sideJoin", sideJoin);
		request.setAttribute("total", total);
		
		view.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
