package com.kh.member.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.vo.Member;

public class MemberService{
	
	/** 회원 로그인 Service
	 * @param inputLogin
	 * @return loginMember
	 * @throws Exception
	 */
	public Member loginMember(Member inputLogin) throws Exception{
		
		Connection conn = getConnection();
		
		Member loginMember = new MemberDAO().loginMember(inputLogin, conn);
		
		close(conn);
		
		return loginMember;
	}

	/** 회원 유무 확인 Service
	 * @param userId
	 * @return check
	 * @throws Exception
	 */
	public int checkMember(String userId) throws Exception{
		
		Connection conn = getConnection();
		
		int check = new MemberDAO().checkMember(userId, conn);
		
		close(conn);
		
		return check;
	}

	/** 멤버 삭제 Service
	 * @param userId
	 * @return result
	 * @throws Exception
	 */
	public int deleteMember(String userId) throws Exception{
		
		Connection conn = getConnection();
		
		int result = new MemberDAO().deleteMember(userId, conn);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		return result;
	}
	
	/** 자기자신 정보 상세 조회 Service
	 * @param pwd
	 * @return member
	 * @throws Exception
	 */
	public Member selectMy(String pwd) throws Exception {
		
		Connection conn = getConnection();
		
		Member member = new MemberDAO().selectMy(pwd, conn);
		
		close(conn);
		
		return member;
	}

	/** 회원 정보 수정 Service
	 * @param userId
	 * @param sel
	 * @param upStr
	 * @return result
	 * @throws Exception
	 */
	public int updateMember(String userId, int sel, String upStr)
					throws Exception {
		
		String selStr = null;
		
		Connection conn = getConnection();
		if(sel == 1) selStr = "Name";
		else if(sel == 2) selStr = "Pwd";
		else if(sel == 3) selStr = "Email";
		else if(sel == 4) selStr = "Phone";
		else selStr = "Address";
		
		int result = new MemberDAO().updateMember(userId, selStr,
				upStr, conn);
	
		if(result > 0) commit(conn);
		else rollback(conn);
		
		return result;
	}

	/** 비밀번호 조회 Service
	 * @param userId
	 * @return pwd
	 * @throws Exception
	 */
	public String selectPwd(String userId) throws Exception {
		
		Connection conn = getConnection();
		
		String pwd = new MemberDAO().selectPwd(userId, conn);
		
		close(conn);
		
		return pwd;
	}

	/** 회원 탈퇴 Service
	 * @param userId
	 * @return result
	 * @throws Exception
	 */
	public int secMember(String userId) throws Exception {
		
		Connection conn = getConnection();
		
		int result = new MemberDAO().secMember(userId, conn);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		return result;
	}

	/** 회원 가입 Service
	 * @param member
	 * @return result
	 * @throws Exception
	 */
	public int newMember(Member member) throws Exception{
		
		Connection conn = getConnection();
		
		int result = new MemberDAO().newMember(member, conn);
		
		if(result > 0) commit(conn);
		else rollback(conn);

		return result;
	}

	/** 전체 회원 정보 조회 Service
	 * @return list
	 * @throws Exception
	 */
	public List<Member> selectMember() throws Exception {
		
		Connection conn = getConnection();
		
		List<Member> list = new MemberDAO().selectMember(conn);
		
		return list;
	}

}