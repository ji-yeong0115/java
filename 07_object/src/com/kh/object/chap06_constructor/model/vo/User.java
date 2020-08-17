package com.kh.object.chap06_constructor.model.vo;

public class User {
	
	/* Ŭ������ �⺻ ����
	 * 
	 * public class Ŭ������{
	 * 		�ʵ� 
	 * 		������
	 * 		�޼ҵ� (get/setter, �ʵ� ���� ��� �޼ҵ�, �ش� ��ü���� �߰� ���)
	 * }
	 */
	
	// �ʵ�
	private String userId;
	private String userPwd;
	private String userName;
	private char gender;
	private int age;

	//������
	/*
	 * * �����ڸ� ����ϴ� ����
	 * 	- new �����ڸ� ���� ��ü�� Heap������ ������ �� ��ü�� ������ ���ÿ� �ʵ带 �ʱ�ȭ
	 *  
	 *  - ȣ���ϴ� �����ڿ� ���� ��ü�� �ʵ尡 �ʱ�ȭ �Ǵ� ����� �ٸ���.
	 *  
	 *  - ������ �ۼ��� ���ǻ���
	 *  1. �����ڸ��� �ݵ�� Ŭ������� ����
	 *  2. ��ȯ���� �������� �ʴ´�.
	 *  3. �Ű����� �ִ� �����ڸ� �ۼ��� ��� JVM�� ���Ͽ� �⺻ �����ڰ� �ڵ� �������� �ʴ´�.
	 *   --> �ʿ��� ��� �⺻ �����ڸ� �ݵ�� �ۼ��ؾ���
	 * 
	 */
	
	// �⺻ ������
	// [����������] Ŭ������ () { ������;}
	public User() {// ��ü ������ ����
		System.out.println("User() �⺻ �����ڿ� ���ؼ� ��ü�� ������.");
	}
	
	// ** ���� Ŭ���� ���ο� �����ڰ� �ۼ����� ���� ��� 
	// 	JVM�� ���ؼ� ������ �ܰ迡�� �⺻ �����ڰ� �ڵ����� �߰��ȴ�. **
	// public User() { }

	// �Ű� ���� �ִ� ������
	// ��ü ������ ���ÿ� �Ű������� ���޹��� ������ �ʵ带 �ʱ�ȭ �ϴ� ����
	public User(String userId, String userPwd, String userName
			, int age, char gender) {
		
		// this() ������
		// ���� Ŭ���� ���� �ٸ� �����ڸ� ȣ���� �� ���
		// ** this() �����ڴ� �ݵ�� ȣ���Ϸ��� �������� ���� ù ��° �ٿ� �۵� �Ǿ�� �Ѵ�. **
		
		// this() ������ ��� �� ����
		// 1. �ߺ� �ڵ� ����
		// 2. �ڵ� ���� ����
		
		// this �����ڴ� ù �ٸ� �ν��Ѵ�. �� �� �̻� �ۼ� �Ұ�
		
		//this(userId, userPwd);
		this(userName, age, gender);
		
		this.userId = userId;
		this.userPwd = userPwd;
//		this.userName = userName;
//		this.age = age;
//		this.gender = gender;

	}
	
	/* �����ε�(Over Loading, ����)
	 * - �� Ŭ���� ������ ������ �̸��� �޼ҵ带 ���� �� �ۼ��ϴ� ���
	 *   
	 * �����ε��� ����
	 * 1. �Ű������� ����
	 * 2. �Ű������� Ÿ��
	 * 3. �Ű������� ����
	 * + �޼ҵ� ���� �����ؾ� �Ѵ�.
	 * 
	 * �� �� ���� �� �ϳ��� ���� �� �����ε� ����
	 */
	
	public User(String userId, String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
	}
	
	// �Ű������� ������ �ٸ��Ƿ� �����ε� ����
	public User(String userNama, int age, char gender) {
		this.userName = userNama;
		this.age = age;
		this.gender = gender;
	}
	
	// �Ű������� ������ �ٸ��Ƿ� �����ε� ����
	public User(char gender, String userNama, int age) {
		this.userName = userNama;
		this.age = age;
		this.gender = gender;
	}
	
	// �Ű������� Ÿ���� �ٸ��Ƿ� �����ε� ����
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	// �Ű������� ����, Ÿ��, ������ ��� ��ġ�ϹǷ� �����ε��� �������� 
/*	public User(String userName, String userId, String userPwd) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
*/
	
// UserId ------------------------------------------
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
// UserPwd -----------------------------------------
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
// UserName ----------------------------------------
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
// Gender ------------------------------------------
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
// Age --------------------------------------------
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String selectUser() {
		return userId + " / " + userPwd + " / " +  userName  + 
						" / " + age  + " / " + gender;
	}
}
