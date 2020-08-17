package com.kh.ajax.jq.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kh.ajax.jq.model.vo.Member;

public class MemberDAO {

	/** 아이디 중복 체크 DAO
	 * @param conn
	 * @param id
	 * @return result
	 * @throws Exception
	 */
	public int idDupCheck(Connection conn, String id) throws Exception{
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;
		
		String query =
				"SELECT COUNT(*) FROM MEMBER WHERE MEMBER_ID = ? AND MEMBER_STATUS = 'Y'";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				result = rset.getInt(1);
			}
			
		}finally {
			rset.close();
			pstmt.close();
		}
		
		return result;
	}

	/** 회원 정보 조회 DAO
	 * @param conn
	 * @param input
	 * @return member
	 * @throws Exception
	 */
	public Member selectMember(Connection conn, String input) throws Exception{
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = 
		"SELECT MEMBER_ID, MEMBER_NM, MEMBER_EMAIL, MEMBER_INTEREST, MEMBER_ENROLL_DATE "
		+ "FROM MEMBER "
		+ "WHERE MEMBER_ID=? AND MEMBER_STATUS = 'Y'";
		
		Member member = null;
		try {
		
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, input);
		
		rset = pstmt.executeQuery();
		
		
		if(rset.next()) {
			member = new Member();
			member.setMemberId(rset.getString("MEMBER_ID"));
			member.setMemberName(rset.getString("MEMBER_NM"));
			member.setMemberInterest(rset.getString("MEMBER_EMAIL"));
			member.setMemberInterest(rset.getString("MEMBER_INTEREST"));
			member.setMemberEnrollDate(rset.getTimestamp("MEMBER_ENROLL_DATE"));
		}
		
		
		}finally {
			rset.close();
			pstmt.close();
		}

		return member;
	}

	public Member ex(Connection conn, String input) {
		// TODO Auto-generated method stub
		return null;
	}
}
