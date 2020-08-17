package com.kh.mmp.model.dao;

import static com.kh.mmp.common.JDBCTemplate.*;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.mmp.model.vo.Member;

public class MemberDAO {
	
	// 1_10. MemberDAO 기본 생성자 작성
	/*
	 * DAO 클래스는 SQL문 작성, 실행하는 부분인데
	 * 이 SQL문이 수시로 유지보수가 일어남
	 * 	-> SQL 구문에 대한 수정이 필요한 경우 코드 수정하고,
	 *     다시 컴파일 하지 않도록 별도의 properties파일에 SQL구문을 모아둔다.
	 *     
	 * + 만일 프로그램 수행 중 SQL 구문 수정이 필요한 필요한 경우
	 *	 Service DAO 객체를 생성할 때마다 
	 *	 SQL이 작성된 properties 파일을 읽어오면
	 *	  프로그램 재시작, 코드 수정, 재 컴파일 필요업이 SQL을 실시간으로 수정할 수 있다.
	 */
	
	// 1_11. 기본생성자 작성 전 SQL구문을 읽어들일 Properties 변수 선언
	private Properties prop = null;
	
	// 1_12. 기본생성자 작성
	public MemberDAO() {
		try {
			
			prop = new Properties();
			prop.load(new FileReader("query.properties"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 1_13. 새로운 회원 추가용 DAO
	 * @param mem
	 * @param conn
	 * @return result(삽입결과 0 또는 1)
	 * @throws SQLException
	 */
	public int insertMemeber(Member mem, Connection conn) throws SQLException{

		// 1_14. SQL을 DB에 전달하고 결과를 반환받을 PreparedStatement 변수 선언
		//		 + DB 삽입 결과 저장용 변수 선언
		PreparedStatement pstmt = null;
		int result = 0;
		
		// 1_15. SQL구문을 query.properties에 작성 후 얻어오기
		String query = prop.getProperty("insertMember");
		
		try {
			
			// 1_16. 전달받은 Connection을 이용하여 SQL수행 준비
			pstmt = conn.prepareStatement(query);
			
			// 1_17. SQL구문 각 위치 홀더에 알맞은 값을 대입
			pstmt.setString(1, mem.getMemberId());
			pstmt.setString(2, mem.getMemberPwd());
			pstmt.setString(3, mem.getMemberName());
			
			// DB에는 문자만을 가리키는 데이터타입이 존재하지 않음
			// --> DB의 CHAR는 문자열을 나타냄
			pstmt.setString(4, mem.getGender() + "");
			// char 타입 데이터 뒤에 빈 문자열("")을 추가해 줌으로써 String으로 형 변환
			
			pstmt.setString(5, mem.getEmail());
			pstmt.setString(6, mem.getPhone());
			pstmt.setString(7, mem.getAddress());
			pstmt.setInt(8, mem.getAge());
			
			// 1_18. 쿼리 수행 후 결과를 반환받아옴.
			result = pstmt.executeUpdate();
		}finally {
			
			// 1_19. SQL 수행에 사용된 자원 반환
			//		 -> 반복되는 DB 자원 반환 코드를 JDBCTemplate에 작성
			close(pstmt);
		}
		
		// 1_20. DB 삽입 결과 반환
		return  result;
	}
	
	/**
	 * 2_5. 모든 회원 정보 조회영 DAO
	 * @param conn
	 * @return list(모든 회원 정보)
	 * @throws SQLException
	 */
	public List<Member> selectAll(Connection conn) throws SQLException{
		
		// 2_6. SQL문 DB에 전달, 수행 후 결과를 반환 받아 저장할 변수 선언
		Statement stmt = null;
		ResultSet rset = null;
		List<Member> list = null;
		
		// 2_7. query.properties에 SQL 구문 작성 후 얻어오기
		String query = prop.getProperty("selectAll");
		
		// 2_8. 전달받은 Connection을 이용하여 SQL구문 수행 및 결과 받기
		try {
			
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			// 2_9. 조회 결과를 저장할 ArrayList 객체 생성
			list = new ArrayList<Member>();
			
			// 2_10. 조회 결과 중 한 행의 정보를 임시로 저장할 참조변수 선언
			Member mem = null;
			
			// 2_11. ResultSet에 저장된 조회 결과를
			//		 커서를 이용해 한 행씩 접근하여 읽어온 후 list에 추가하기
			while(rset.next()) {
				String memberId = rset.getString("MEMBER_ID");
				String memberPwd = rset.getString("MEMBER_PWD");
				String memberName = rset.getString("MEMBER_NAME");
				
				char gender = rset.getString("GENDER").charAt(0);
				// 문자열 형태의 GENDER 컬럼값을 char 형태로 반환
				
				String email = rset.getString("EMAIL");
				String phone = rset.getString("PHONE");
				int age = rset.getInt("AGE");
				String address  = rset.getString("ADDRESS");
				Date enrollDate = rset.getDate("ENROLL_DATE");
				
				// 조회된 
				mem = new Member(memberId, memberPwd, memberName, gender, email, phone, age, address);
				
				list.add(mem);
			}
			
		}finally {
			
			// 2_12. 사용한 DB 자원 반환
			close(rset);
			close(stmt);
			
		}
		
		// 2_13. 조회 결과가 담긴 list 반환
		return list;
		
	}
	
	

	/**
	 * 3_11. 입력받은 키워드가 포함된 아이디를 가진 회원 정보 조회용 DAO
	 * @param keyword
	 * @param conn
	 * @return list
	 * @throws SQLException
	 */
	public List<Member> selectMemberId(String keyword, Connection conn) throws SQLException {
		
		// 3_12. SQL을 DB에 전달하고 결과를 반환 받아 저장할 변수 선언
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<Member> list = null;
		
		// SQL -> SELECT * FROM MEMBER WHERE MEMEBER_ID LIKE '%keyword%'
		// 3_13. query.properties에 SQL구문 작성 후 얻어오기
		String query = prop.getProperty("selectMemberId");
		
		try {
			
			// 3_14. 전달받은 Connection과 SQl을 DB로 전달한 분비
			pstmt = conn.prepareStatement(query);
			
			// 3_15 SQL구문 각 위치 홀더에 알맞은 값을 대입
			pstmt.setString(1, keyword);
			
			// 3_16. SQL 수행 수 결과를 반환 받아와 저장
			rset = pstmt.executeQuery();
			
			//3_17. rest의 값을 저장할 ArrayList 객체 생성
			list = new ArrayList<Member>();
			
			
			// 3_18. ResultSet에 저장된 조회 결과를
			//		 커서를 이용해 한 행씩 접근하여 읽어온 후
			//		list에 추가
			Member mem = null;
			while(rset.next()) {
				String memberId = rset.getString("MEMBER_ID");
				String memberPwd = rset.getString("MEMBER_PWD");
				String memberName = rset.getString("MEMBER_NAME");
				
				char gender = rset.getString("GENDER").charAt(0);
				// 문자열 형태의 GENDER 컬럼값을 char 형태로 반환
				
				String email = rset.getString("EMAIL");
				String phone = rset.getString("PHONE");
				int age = rset.getInt("AGE");
				String address  = rset.getString("ADDRESS");
				Date enrollDate = rset.getDate("ENROLL_DATE");
				
				// 조회된 
				mem = new Member(memberId, memberPwd, memberName, gender, email, phone, age, address);
				
				list.add(mem);
			}
			
		}finally {
			
			// 3_19. 사용한 DB 자원 반환
			close(rset);
			close(pstmt);
		}
		
		// 3_20. 조회 결과 반환
		return list;
	}
	

	/**
	 * 3_33. 성별 조회용 DAO
	 * @param gender
	 * @param conn
	 * @return list
	 * @throws SQLException
	 */
	public List<Member> selectGender(char gender, Connection conn) throws SQLException{
		
		// 3_34. SQL DB 전달 빛 수행, 결과 저장용 변수 선언
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<Member> list = null;
		
		// 3_35. query.properties에 SQL 구문 작성 후 얻어오기
		String query = prop.getProperty("selectGender");
		
		
		try {
			
			// 3_36. 커넥션과 SQL구문을 DB로 전달할 준비
			pstmt = conn.prepareStatement(query);
			
			// 3_37. 홀더에 값 대입 후 쿼리 실행 결과 저장
			pstmt.setString(1, gender + ""); // char + String == String
			rset = pstmt.executeQuery();
			
			
			// 3_38. 조회 결과 저장용 ArrayList 객체 생성
			//		 + 행 정보 임시 저장용 변수 선언
			list = new ArrayList<Member>();
			Member mem = null;
			
			// 3_39. ResultSet에 저장된 조회 결과를
			//		 커서를 이용해 한 행씩 접근하여 읽어온 후
			//		list에 추가
			while(rset.next()) {
				String memberId = rset.getString("MEMBER_ID");
				String memberPwd = rset.getString("MEMBER_PWD");
				String memberName = rset.getString("MEMBER_NAME");
				
				char gen = rset.getString("GENDER").charAt(0);
				// 문자열 형태의 GENDER 컬럼값을 char 형태로 반환
				
				String email = rset.getString("EMAIL");
				String phone = rset.getString("PHONE");
				int age = rset.getInt("AGE");
				String address  = rset.getString("ADDRESS");
				Date enrollDate = rset.getDate("ENROLL_DATE");
				
				// 조회된 
				mem = new Member(memberId, memberPwd, memberName, gen, email, phone, age, address);
				
				list.add(mem);
			}
		}finally {
			
			// 3_40. 사용한 DB 자원 반환
			close(rset);
			close(pstmt);
		}
		
		// 3_41. 조회 결과 반환
		return list;
	}
	
	/**
	 * 3_70. 나이대 조회용 DAO
	 * @param age
	 * @param conn
	 * @return list
	 * @throws SQLException
	 */
	public List<Member> selectAge(int age, Connection conn) throws SQLException{
		
		// 3_71. SQL DB 전달 빛 수행, 결과 저장용 변수 선언
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<Member> list = null;
		
		// 3_72. query.properties에 SQL 구문 작성 후 얻어오기
		String query = prop.getProperty("selectAge");
		
		try {
			
			// 3_73. 커넥션과 SQL구문을 DB로 전달할 준비
			pstmt = conn.prepareStatement(query);
			
			// 3_74. 홀더에 값 대입 후 쿼리 실행 결과 저장
			pstmt.setInt(1, age); 
			rset = pstmt.executeQuery();
			
			
			// 3_75. 조회 결과 저장용 ArrayList 객체 생성
			//		 + 행 정보 임시 저장용 변수 선언
			list = new ArrayList<Member>();
			Member mem = null;
			
			// 3_76. ResultSet에 저장된 조회 결과를
			//		 커서를 이용해 한 행씩 접근하여 읽어온 후
			//		list에 추가
			while(rset.next()) {
				String memberId = rset.getString("MEMBER_ID");
				String memberPwd = rset.getString("MEMBER_PWD");
				String memberName = rset.getString("MEMBER_NAME");
				
				char gen = rset.getString("GENDER").charAt(0);
				// 문자열 형태의 GENDER 컬럼값을 char 형태로 반환
				
				String email = rset.getString("EMAIL");
				String phone = rset.getString("PHONE");
				int agedb = rset.getInt("AGE");
				String address  = rset.getString("ADDRESS");
				Date enrollDate = rset.getDate("ENROLL_DATE");
				
				// 조회된 
				mem = new Member(memberId, memberPwd, memberName, gen, email, phone, agedb, address);
				
				list.add(mem);
			}
		}finally {
			
			// 3_77. 사용한 DB 자원 반환
			close(rset);
			close(pstmt);
		}
		
		// 3_78. 조회 결과 반환
		return list;
	}

	/** 3_51. 입력받은 키워드가 포함된 주소를 가진 회원 정보 조회용 DAO
	 * @param keywordAdd
	 * @param conn
	 * @return list
	 * @throws SQLException
	 */
	public List<Member> selectAddress(String keywordAdd, Connection conn) throws SQLException {
		
		// 3_52. SQL을 DB에 전달하고 결과를 반환 받아 저장할 변수 선언
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		List<Member> list = null;
		
		// 3_53. query.properties에 SQL구문 작성 후 얻어오기
		String query = prop.getProperty("selectAddress");
		
		try {
			
			// 3_54. 전달받은 Connection과 SQl을 DB로 전달한 분비
			pstmt = conn.prepareStatement(query);
			
			// 3_55. SQL구문 각 위치 홀더에 알맞은 값을 대입
			pstmt.setString(1, keywordAdd);
			
			// 3_56. SQL 수행 수 결과를 반환 받아와 저장
			rset = pstmt.executeQuery();
			
			//3_57. rest의 값을 저장할 ArrayList 객체 생성
			list = new ArrayList<Member>();
			
			
			// 3_58. ResultSet에 저장된 조회 결과를
			//		 커서를 이용해 한 행씩 접근하여 읽어온 후
			//		list에 추가
			Member mem = null;
			while(rset.next()) {
				String memberId = rset.getString("MEMBER_ID");
				String memberPwd = rset.getString("MEMBER_PWD");
				String memberName = rset.getString("MEMBER_NAME");
				
				char gender = rset.getString("GENDER").charAt(0);
				// 문자열 형태의 GENDER 컬럼값을 char 형태로 반환
				
				String email = rset.getString("EMAIL");
				String phone = rset.getString("PHONE");
				int age = rset.getInt("AGE");
				String address  = rset.getString("ADDRESS");
				Date enrollDate = rset.getDate("ENROLL_DATE");
				
				// 조회된 
				mem = new Member(memberId, memberPwd, memberName, gender, email, phone, age, address);
				
				list.add(mem);
			}
			
		}finally {
			
			// 3_59. 사용한 DB 자원 반환
			close(rset);
			close(pstmt);
		}
		
		// 3_60. 조회 결과 반환
		return list;
	}


	/**
	 * 4_6. 아이디를 이용한 회원 존재 여부 확인 DAO
	 * @param memberId
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	public int checkMember(String memberId, Connection conn) throws SQLException{
		
		// 4_7. SQL 전달 및 수행, 결과 반환용 변수 선언
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int check = 0;
		
		// 4_8. query.properties 파일 SQL 구문 작성 후 얻어오기
		String query = prop.getProperty("checkMember");
		
		try {
			
			// 4_9. 쿼리 DB 전달 준비
			pstmt = conn.prepareStatement(query);
			
			// 4_10. 위치 홀더(?) 알맞은 갑 대임
			pstmt.setString(1, memberId);
			
			// 4_11. 쿼리 실행 결과를 rset에 저장
			rset = pstmt.executeQuery();
			
			// 4_12. 쿼리문에 그룹함수(count())가 사용되었기 때문에
			//		 결과 행이 1개(단일행) --> while문 대신 if문 사용
			if(rset.next()) {
				check = rset.getInt(1);
				// 현재 행의 컬럼 순서 중 1번째 컬럼 값을 얻어옴
			}
			
		}finally {
			
			// 4_13. 사용한 DB 자원 반환
			close(rset);
			close(pstmt);
		}
		return check;
	}
	
	/**
	 * 4_27. 회원 정보 수정용 DAO
	 * @param memberId
	 * @param selStr
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	public int updateMember(String memberId, String selStr, String input, Connection conn) throws SQLException{
		
		// 4_28. SQL DB 전달 및 수행, 결과 반환 변수 선언
		PreparedStatement pstmt = null;
		int result = 0;
		
		// 4_29. query.properties에 SQL 구문 작성 후 얻어오기
		String query = prop.getProperty("update" + selStr);
		
		try {
			
			// 4_30. 쿼리 DB 전달 준비
			pstmt = conn.prepareStatement(query);
			
			// 4_31. 위치 홀더에 알맞은 값 대임
			pstmt.setString(1, input);
			pstmt.setString(2, memberId);
			
			// 4_32. 쿼리 실행 후 결과 반환 받기
			result = pstmt.executeUpdate();
			
		}finally {
			
			close(pstmt);
		}
		
		// 4_34. 수정 결과 반환
		return result;
		
	}
	
	
	public int deleteMember(String memberId, Connection conn) throws SQLException {
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = prop.getProperty("deleteMember");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, memberId);
			
			result = pstmt.executeUpdate();
			
		}finally{
			
			close(pstmt);
		}
		
		return result;
	}
	
	
}
