package com.kh.poly.chap01.ex.model.service;

import com.kh.poly.chap01.ex.model.vo.Electronics;
import com.kh.poly.chap01.ex.model.vo.Tablet;

public class ElectronicsService {
	// �θ�Ÿ�� ��ü�迭�� ���� �� �Ҵ��Ͽ� �ڽ� ��ü���� �� ���� ����
	
	private Electronics[] el = new Electronics[3]; 

	private int index=0;
	
	// �ܺο��� ������ ��ü�� �ּҸ� ���޹޾� el �迭�� �߰�
	// �����ε��� ����ص� ������ �ڵ���̰� �þ�� ��ȿ����
	// --> �������� �����Ͽ� �Ű������� Ÿ���� �θ� Ÿ������ �Ͽ� �ڽ� ��ü �ּҸ� ���޹޵��� ��
/*	
  	public void insert(Desktop desk) {}
	public void insert(Laptop lap) {}
	public void insert(Tablet tap) {}
*/
	
	public void insert(Electronics e) { // �Ű� ���� ������ ����

		// Electronics e = new Desktop();
		// Electronics e = new Laptop();
		// Electronics e = new Tablet();
		// �θ� ��ü�� ���� ������ �ڽ� ��ü�� ���� �ּҸ� ����Ų��.
		
		// ��ü �迭�� ������ ����
		// index��° el��ҿ� ���޹��� �ڽ� ��ü �ּҸ� �߰��ϰ�, index�� 1 ������Ų��.
		el[index++] = e;
		
		// el[0] = new Desktop(~);
		// el[1] = new Laptop(~);
		// el[2] = new Tablet(~);
	}
	
	// ��ü ���� ��ȸ 
	public String selectAll() {
		String str = "\n@@@@@ ��ü ��ǰ ��ȸ @@@@@\n";
		
		for(int i=0; i<el.length; i++) {
			
			// el[i].toString()
			// �θ��� toString()�� ȣǮ�ϰ� ������(���� ���ε�)
			// ���� ���� �� �ڽ��� �������̵��� toString()�� ȣǮ��(���� ���ε�)
			str += el[i].toString() + "\n";
		}
		
		return str;
	}
	
//	public Desktop selectDesktop(int i) {}
//	public Desktop selectLaptop(int i) {}
	// ���� ��� �ϳ����� ������ ��ȯ�ؾ� �ϴ� ��� ��⺰�� Ÿ���� ��� �ٸ��Ƿ� ��ȯ���� �ٸ��� �ؼ� �޼ҵ带 �ۼ��ؾ� �Ѵ�.
	// ������, �����ε��� �������� ����(�Ű������� ��� �����ϱ� ����)
	// �׷��� �޼ҵ带 ���ε��� ������ ������ ���ŷӰ� ȿ�������� ����  -> ��ȯ���� �������� ����
	
	// �� ��� ���� ��ȸ
	public Electronics selectOne(int i) {
		return el[i-1];
	}
	
	// ��� �Ǹ� ���� ����(ǰ��)
	public String selectSoldOut(Electronics e) {
		if(e instanceof Tablet) {
			// e�� �����ϰ� �ִ� ��ü�� Tablet Ÿ���̸�
			return "�Ǹ� �Ұ�[ǰ��]";
		}else {
			return "�Ǹ� ����";
		}
	}
	
}
