package com.kh.poly.chap02.ex1.model.service;

import com.kh.poly.chap02.ex1.model.vo.Bird;
import com.kh.poly.chap02.ex1.model.vo.Chicken;

public class Chap01Service {
	
	public void example1() {
		
		//�ڽ� ���� ���� = �ڽ� ��ü
		Chicken c =  new Chicken();
		
		// �θ� ���� ���� = �θ� ��ü
		// --> �߻� Ŭ������ ��üȭ(��ü ����)�� �Ұ���
		// �̿ϼ��� Ŭ�����δ� ������ ��ü�� ���� �� ����
		//Bird b = new Bird();
		
		// �θ� ���� ���� = �ڽ� ��ü(������)
		Bird b2 = new Chicken();
		
	}

}
