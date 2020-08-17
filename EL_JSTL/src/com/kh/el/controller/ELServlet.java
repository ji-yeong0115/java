package com.kh.el.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.el.model.vo.Person;


@WebServlet("/01_el/el.do")
public class ELServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// request scope : 요청 페이지 + 요청 응답 페이지
		request.setAttribute("classRoom", "A강의장");
		request.setAttribute("person", new Person("홍길동", 20, '남'));
		
		// session scope : 브라우저 종료 또는 Session 만료 전까지 모든 페이지에 유효
		HttpSession session = request.getSession();
		session.setAttribute("academy", "KH정보교육원");
		
		// 같은 속성명을 가지는 여러 scope
		request.setAttribute("scope", "request scope");
		session.setAttribute("scope", "session scope");
		
		ServletContext application = request.getServletContext();
		application.setAttribute("scope", "application scope");
		
		RequestDispatcher view = request.getRequestDispatcher("/views/01_el/01_el.jsp");
	
		// jsp 파일로 요청 위임
		view.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
