package com.kh.member.model.dao;

import static com.kh.common.JDBCTemplate.*;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.member.model.vo.Member;

public class MemberDAO {
	
	private Properties prop = null;
	
	public MemberDAO() {
		
		try {
			prop = new Properties();
			prop.load(new FileReader("member.properties"));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/** 회원 로그인 DAO
	 * @param inputLogin
	 * @param conn
	 * @return loginMember
	 * @throws Exception
	 */
	public Member loginMember(Member inputLogin, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member loginMember = null;
		
		String query = prop.getProperty("loginMember");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, inputLogin.getMemId());
			pstmt.setString(2, inputLogin.getMemPwd());
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				String memId = rset.getString("MEMBER_ID");
				String memPwd = rset.getString("MEMBER_PWD");
				String memName = rset.getString("MEMBER_NAME");
				String email = rset.getString("EMAIL");
				String phone = rset.getString("PHONE");
				String add = rset.getString("ADDRESS");
				int age = rset.getInt("AGE");
				Date enroll = rset.getDate("ENROLL_DATE");
				char sec = rset.getString("SEC_YN").charAt(0);
				
				loginMember = new Member
						(memId, memPwd, memName, email, phone, add, age, enroll, sec);
			}
			
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return loginMember;
	}

	/** 회원 유무 확인 DAO 
	 * @param userId
	 * @param conn
	 * @return check
	 * @throws Exception
	 */
	public int checkMember(String userId, Connection conn) throws Exception {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		int check = 0;
		
		String query = prop.getProperty("checkMember");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				check = rset.getInt(1);
			}
			
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return check;
	}

	/** 회원 삭제 DAO
	 * @param userId
	 * @param conn
	 * @return result 
	 * @throws Exception
	 */
	public int deleteMember(String userId, Connection conn)
						throws Exception {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("deleteMember");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	/** 자기자신 정보 상세 조회 DAO
	 * @param pwd
	 * @param conn
	 * @return member
	 * @throws Exception
	 */
	public Member selectMy(String pwd, Connection conn) throws Exception{
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		Member member = null;
		
		String query = prop.getProperty("selectMy");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pwd);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				
				String memId = rset.getString("MEMBER_ID");
				String memPwd = rset.getString("MEMBER_PWD");
				String memName = rset.getString("MEMBER_NAME");
				String email = rset.getString("EMAIL");
				String phone = rset.getString("PHONE");
				int age = rset.getInt("AGE");
				String add = rset.getString("ADDRESS");
				
				
				member = new Member(memId, memPwd, 
						memName, email, phone, age ,add);
			}
			
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return member;
	}
	
	/** 회원 정보 수정 DAO
	 * @param userId
	 * @param selStr
	 * @param upStr
	 * @param conn
	 * @return result 
	 * @throws Exception
	 */
	public int updateMember(String userId, String selStr, String upStr, Connection conn)
					throws Exception  {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("update" + selStr);
		
		try {
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, upStr);
			pstmt.setString(2, userId);
			
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	/** 비밀번호 조회용 DAO
	 * @param userId
	 * @param conn
	 * @return pwd
	 * @throws Exception
	 */
	public String selectPwd(String userId, Connection conn) 
					throws Exception {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String pwd = null;
		
		String query = prop.getProperty("selectPwd");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) pwd = rset.getString("MEMBER_PWD");
			
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return pwd;
	}

	/** 회원 탈퇴 DAO
	 * @param userId
	 * @param conn
	 * @return result
	 * @throws Exception
	 */
	public int secMember(String userId, Connection conn) throws Exception {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("secMember");
		
		try{
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	/** 회원 가입 DAO
	 * @param member
	 * @param conn
	 * @return result
	 * @throws Exception
	 */
	public int newMember(Member member, Connection conn) 
						throws Exception {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("newMember");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, member.getMemId());
			pstmt.setString(2, member.getMemPwd());
			pstmt.setString(3, member.getMemName());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getPhone());
			pstmt.setString(6, member.getAdd());
			pstmt.setInt(7, member.getAge());
			
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	/** 전체 회원 정보 조회 DAO
	 * @param conn
	 * @return list
	 * @throws Exception
	 */
	public List<Member> selectMember(Connection conn) throws Exception {
		
		Statement stmt = null;
		ResultSet rset = null;
		
		List<Member> list = null;
		
		String query = prop.getProperty("selectMember");
		
		try {
			
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			list = new ArrayList<Member>();
			Member member = null;
			
			while(rset.next()) {
				
				String memId = rset.getString(1);
				String memPwd = rset.getString(2);
				String memName = rset.getString(3);
				String email = rset.getString(4);
				String phone = rset.getString(5);
				String add = rset.getString(6);
				int age = rset.getInt(7);
				Date enroll = rset.getDate("ENROLL_DATE");
				char sec = rset.getString("SEC_YN").charAt(0);
				
				member = new Member(memId, memPwd, memName, 
						email, phone, add, age, enroll, sec);
				
				list.add(member);
			}
			
			
			
		}finally{
			close(rset);
			close(stmt);
		}
		
		return list;
	}

}
