package com.kh.ajax.jq.model.service;

import static com.kh.ajax.common.DBCP.getConnection;

import java.sql.Connection;
import java.util.List;

import com.kh.ajax.jq.model.dao.MemberDAO;
import com.kh.ajax.jq.model.vo.Member;

public class MemberService {
	
	private MemberDAO dao = new MemberDAO();
	
	/** 아이디 중복 체크 Service
	 * @param id
	 * @return result
	 * @throws Exception
	 */
	public int idDupCheck(String id) throws Exception{
		
		Connection conn = getConnection();
		
		int result = dao.idDupCheck(conn, id);
		
		conn.close();
		
		return result;
	
	}

	/** 멤버 정보 조회 Service
	 * @param input
	 * @return member
	 * @throws Exception
	 */
	public Member selectMember(String input)  throws Exception{
		
		Connection conn = getConnection();
		
		Member member = dao.selectMember(conn, input);
		
		conn.close();
		
		return member;
	}

	public Member ex(String input) throws Exception{
		// TODO Auto-generated method stub
		
		Connection conn = getConnection();
		
		Member member = dao.ex(conn, input);
		
		conn.close();
		
		return member;
	}

}
