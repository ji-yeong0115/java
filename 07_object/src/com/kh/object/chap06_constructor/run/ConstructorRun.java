package com.kh.object.chap06_constructor.run;
import com.kh.object.chap06_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// User ��ü�� �⺻�����ڸ� �̿��Ͽ� ����
		User u1 = new User(); // JVM�� ���ؼ� �ʵ尡 �⺻������ �ʱ�ȭ
		
		u1.setUserId("user1");
		u1.setUserPwd("1234");
		u1.setUserName("��ö��");
		u1.setAge(20);
		u1.setGender('��');
		
		System.out.println(u1.selectUser());
		
		//�Ű����� �ִ� �����ڷ� ��ü ����
		User u2 = new User("user2", "qwer", "�ڿ���", 25, '��');	
		System.out.println(u2.selectUser());
		
		User u3 = new User("user3", "asdzxc", "�̼���", 40, '��');
		System.out.println(u3.selectUser());
		
		// �����ε� Ȯ��
		User u4 = new User("user4", "1q2w3e4r");
		System.out.println(u4.selectUser());
				
		User u5 = new User("������", 23, '��');
		System.out.println(u5.selectUser());
	}
}
