package com.kh.wsp.member.model.vo;

import java.sql.Date;

public class Member {

	private int memberNo; // 회원번호
	private String memberId; // 회원아이디
	private String memberPwd; // 회원비밀번호
	private String memberName; // 회원이름
	private String memberPhone; // 회원전화번호("-" 포함)
	private String memberEmail; // 회원이메일
	private String memberAddress; // 주소
	private String memberInterest; // 관심사
	private Date memberEnrollDate; // 가입일
	private String memberSatus; // 회원 상태(정상 : 'Y', 탈퇴 : 'N')
	private String memverGrade; // 회원 등급(관리자 : 'A', 일반 : 'G')
	
	public Member() {}
	
	public Member(String memberId, String memberPwd) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
	}
	
	public Member(String memberId, String memberName, String memberPhone, String memberEmail, String memberAddress,
			String memberInterest, String memverGrade) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
		this.memberInterest = memberInterest;
		this.memverGrade = memverGrade;
	}
	
	
	public Member(String memberId, String memberName, String memberPhone, String memberEmail, String memberAddress,
			String memberInterest) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
		this.memberInterest = memberInterest;
	}

	public Member(int memberNo, String memberId, String memberPwd, String memberName, String memberPhone,
			String memberEmail, String memberAddress, String memberInterest, Date memberEnrollDate, String memberSatus,
			String memverGrade) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
		this.memberInterest = memberInterest;
		this.memberEnrollDate = memberEnrollDate;
		this.memberSatus = memberSatus;
		this.memverGrade = memverGrade;
	}
	
	public Member(String memberId, String memberPhone, String memberEmail, String memberAddress,
			String memberInterest) {
		super();
		this.memberId = memberId;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
		this.memberInterest = memberInterest;
	}
	

	public Member(String memberId, String memberName, String memberEmail, String memberInterest,
			Date memberEnrollDate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberInterest = memberInterest;
		this.memberEnrollDate = memberEnrollDate;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberInterest() {
		return memberInterest;
	}

	public void setMemberInterest(String memberInterest) {
		this.memberInterest = memberInterest;
	}

	public Date getMemberEnrollDate() {
		return memberEnrollDate;
	}

	public void setMemberEnrollDate(Date memberEnrollDate) {
		this.memberEnrollDate = memberEnrollDate;
	}

	public String getMemberSatus() {
		return memberSatus;
	}

	public void setMemberSatus(String memberSatus) {
		this.memberSatus = memberSatus;
	}

	public String getMemverGrade() {
		return memverGrade;
	}

	public void setMemverGrade(String memverGrade) {
		this.memverGrade = memverGrade;
	}

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName="
				+ memberName + ", memberPhone=" + memberPhone + ", memberEmail=" + memberEmail + ", memberAddress="
				+ memberAddress + ", memberInterest=" + memberInterest + ", memberEnrollDate=" + memberEnrollDate
				+ ", memberSatus=" + memberSatus + ", memverGrade=" + memverGrade + "]";
	}
	
	

}
