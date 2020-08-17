package com.kh.wsp.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.wsp.member.model.service.MemberService;
import com.kh.wsp.member.model.vo.Member;


@WebServlet("/member/updateStatus.do")
public class UpdateStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String currentPwd = request.getParameter("currentPwd");
		
		HttpSession session = request.getSession();
		String memberId = ((Member)session.getAttribute("loginMember")).getMemberId();
		
		Member member = new Member(memberId, currentPwd);
		
		try {
			
			int result = new MemberService().updateStatus(member);
			
			String status = null;
			String msg = null;
//			System.out.println(result);
			
			if(result>0) {
				status = "success";
				msg = "회원탈퇴 성공.";
				
				session.removeAttribute("loginMember");
				response.sendRedirect(request.getContextPath());

			}else if(result==0) {
				status = "error";
				msg = "회원탈퇴 실패";
				
				response.sendRedirect(request.getContextPath());

			}else {
				status = "error";
				msg = "현재 비밀번호가 일치하지 않습니다.";
				
				response.sendRedirect(request.getContextPath());
			}
			
			session.setAttribute("status", status);
			session.setAttribute("msg", msg);
			

		}catch(Exception e) {
			e.printStackTrace();
			
			String path ="/WEB-INF/views/common/errorPage.jsp";
			request.setAttribute("erroMsg", "회원탈퇴 과정에서 오류 발생");
			RequestDispatcher view = request.getRequestDispatcher(path);
			view.forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
