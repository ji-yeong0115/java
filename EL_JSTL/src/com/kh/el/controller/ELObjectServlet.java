package com.kh.el.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/01_el/elObject.do")
public class ELObjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 쿠키 생성
		Cookie cookie = new Cookie("saveId", "user01");
		cookie.setMaxAge(60 * 60 * 24 * 7);
		cookie.setPath("/");
		
		response.addCookie(cookie);
		
		RequestDispatcher view = request.getRequestDispatcher("/views/01_el/03_elObject.jsp");
		view.forward(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
