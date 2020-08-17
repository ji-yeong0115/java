package com.kh.poly.chap01.model.service;
import com.kh.poly.chap01.model.vo.Car;
import com.kh.poly.chap01.model.vo.Sonata;
import com.kh.poly.chap01.model.vo.Bentley;

public class PolyService {
	
	public void example1() {
		// ������(Polymorphism)
		// �θ� Ÿ�� ���� ������ �ڽ� Ÿ�� ��ü�� �����ϴ� ��.(��ĳ����)
		//--> �θ� Ÿ�� ������ ���� �ϳ��� �پ��� �ڽ� ��ü�� ������ �� �ִ�.
		
		// �� ĳ����
		Car[] cars = new Car[2];
		cars[0] = new Sonata();
		cars[1] = new Bentley();
		
		// *******************************************************
		// �θ�Ƽ�� ���� ���� �ڽ� ��ü ���� �� �ڽ� ���ο� �ִ� �ڽ�(�θ�)�κи� ������ �� �ִ�.
		// *******************************************************
		// System.out.println(cars[0].hybrid()));
		
		System.out.println(cars[0].toString());
		
		// �ٿ� ĳ����
		// �θ� Ÿ�� ���� ������ �ڽ� ��ü ��ü�� �����ؾߵ� ��� �θ� Ÿ�� ���� ���� 
		// -> �ڽ� Ÿ�� ���� ������ ����(�����)�� ����ȯ
		
		// int num = int(10.123) ���� '==' ��� �ʼ�
		
		// cars[0]�� �����ϰ� �ִ� �ڽ� ��ü��  Sonata Ÿ��
		// Sonata���� ����� ���� �ϰ��� �� �� cars[0]�� �θ� Ÿ�� ���� �������� �ڽ� Ÿ���� ���� ����ȯ(�ٿ� ĳ����)�Ѵ�.
		
		// ����ȯ �����ں��� ��(.) �������� �켱������ �� ����
		System.out.println( ((Sonata)cars[0]).hybridMode() );
		System.out.println( ((Bentley)cars[1]).takeOutUmbrella() );
		
		// �ٿ� ĳ���� �� ���ǻ���
		//System.out.println( ((Bentley)cars[0]).takeOutUmbrella() );
		
		// instanceof ������
		// - ���� ������ �����ϰ� �ִ� ��ü�� Ÿ���� Ȯ���ϴ� ������, Ÿ�� ��ġ -> true �ƴϸ� false ��ȯ
		// + intanseof�� ����� true�� ��� == ���ߴ� Ÿ������ �ٿ�ĳ������ �����ϴ�. 
		
		// cars[0] ���� ������ �����ϴ� ��ü�� Ÿ���� Sonata�ΰ�?
		System.out.println(cars[0] instanceof Sonata);
		System.out.println(cars[0] instanceof Bentley);
		
		// cars[0] ���� ������ �����ϴ� ��ü�� Ÿ���� Car�ΰ�?
		System.out.println(cars[0] instanceof Car);
		
		// �ٿ� ĳ���� ���ɿ��� �˻�
		for(int i=0; i<cars.length; i++) {
			if(cars[i] instanceof Sonata) {
				System.out.println( ((Sonata)cars[i]).hybridMode() );
			}else if(cars[i] instanceof Bentley) {
				System.out.println( ((Bentley)cars[i]).takeOutUmbrella() );
			}
		}
		
		// ���ε� Ȯ��
		System.out.println(cars[1].dirve());
		
	}

}
