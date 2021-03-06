package com.kh.wsp.reply.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kh.wsp.reply.model.service.ReplyService;
import com.kh.wsp.reply.model.vo.Reply;


@WebServlet("/reply/*")
public class ReplyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = uri.substring((contextPath+"/reply").length());
		
		String errorMsg = " 과정에서 오류가 발생했습니다.";
		
		try {
			ReplyService service = new ReplyService();
			
			// ===== 댓글 목록 조회 =====
			if(command.equals("/selectList.do")) {
				errorMsg = "댓글 목록 조회 " + errorMsg;
			
				int boardNo = Integer.parseInt
						(request.getParameter("boardNo"));
				
				List<Reply> rList = service.selectList(boardNo);
				
				Gson gson = new GsonBuilder().
						setDateFormat("yyyy년 MM월 dd일 HH:mm:ss").create();
				gson.toJson(rList, response.getWriter());
			}
			
			// ===== 댓글 등록 =====
			else if(command.equals("/insertReply.do")) {
				errorMsg = "댓글 등록 " + errorMsg;
				
				int parentBoardNo = Integer.parseInt(request.getParameter("parentBoardNo"));
				String memberId = request.getParameter("memberId");
				String replyContent = request.getParameter("replyContent");
				
				Reply reply = new Reply(replyContent, parentBoardNo, memberId);
				System.out.println(reply);
				
				int result = service.insertReply(reply);
				
				if(result>0) {
					response.getWriter().print("댓글 삽입 성공");
				}else {
					response.getWriter().print("댓글 삽입 실패");
				}
			}
			
			// ===== 댓글 삭제 =====
			else if(command.equals("/deleteReply.do")) {
				errorMsg = "댓글 삭제" + errorMsg;
				
				int replyNo = Integer.parseInt
						(request.getParameter("replyNo"));
				
				int result = service.deleteReply(replyNo);
				
				if(result>0) {
					response.getWriter().print("댓글 삭제 성공");
				}else {
					response.getWriter().print("댓글 삭제 실패");
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			response.getWriter().print(errorMsg);
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
