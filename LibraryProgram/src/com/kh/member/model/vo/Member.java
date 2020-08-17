package com.kh.member.model.vo;

import java.sql.Date;

/**
 * @author 지영
 *
 */
public class Member {
	
	private String memId;
	private String memPwd;
	private String memName;
	private String email;
	private String phone;
	private String add;
	private int age;
	private Date enroll;
	private char sec;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String memId, String memPwd, String memName, String email, String phone, String add, int age,
			Date enroll, char sec) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
		this.email = email;
		this.phone = phone;
		this.add = add;
		this.age = age;
		this.enroll = enroll;
		this.sec = sec;
	}

	public Member(String memId, String memPwd) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
	}
	

	public Member(String memId, String memPwd, String memName, String email, String phone, int age, String add) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.add = add;
	}
	
	public Member(String memId, String memPwd, String memName, String email, String phone, String add, int age) {
		super();
		this.memId = memId;
		this.memPwd = memPwd;
		this.memName = memName;
		this.email = email;
		this.phone = phone;
		this.add = add;
		this.age = age;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPwd() {
		return memPwd;
	}

	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getEnroll() {
		return enroll;
	}

	public void setEnroll(Date enroll) {
		this.enroll = enroll;
	}

	public char getSec() {
		return sec;
	}

	public void setSec(char sec) {
		this.sec = sec;
	}

	@Override
	public String toString() {
		return "Member [memId=" + memId + ", memPwd=" + memPwd + ", memName=" + memName + ", email=" + email
				+ ", phone=" + phone + ", add=" + add + ", age=" + age + ", enroll=" + enroll + ", sec=" + sec + "]";
	}
	
	
	
	
	

}
