package com.kh.array.service;
import java.util.Arrays;

public class C_ArraySort {
	
	public void example1() {
		
		int a=10;
		int b=20;
		
		// �� ���� ���� �ٲٱ� ���� �ӽ� ���� ����
		int tmp;
		
		tmp = a; // a=10, b=20, tmp=10;
		a = b; // a=20, b=20, tmp=10;
		b = tmp; // a=20, b=10, tmp=10
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}

	public void example2() {
		// �迭 ������ �ε��� �� �ٲٱ�
		
		int[] arr = {2, 1, 3};
		int tmp;
		
		tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		
		System.out.println(Arrays.toString(arr));
		
	}

	public void example3() {
		// ���� ���� (insertion sort)
		// ���� �˰��� �� ���� �����ϰ� �⺻�� �Ǵ� �˰���
		
		int[] arr = {2, 5, 4, 1, 3}; // ������������ ����
		
		// ���� ������ �� ��° ��(1�� �ε���)���� ����
		for(int i=1; i<arr.length; i++) {
			// i�� ���ؼ� ���õ� �ε��� : �� ��ü
			
			for(int j=0; j<i; j++) {
				// i�� �񱳵Ǳ� ���� j �ε��� : �� ���
				
				// ���� ���� ������ ���� �� ����
				
				if(arr[i] > arr[j]) {
					// ��ü�� ��󺸴� ������
					// �������� '<', �������� '>'
					
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					
				} // if end
			} // ���� for end
		} // �ٱ��� for end
		System.out.println(Arrays.toString(arr));
	}

	public void example4() {
		// ��������(Selection Sort)
		// �񱳵��� ���� �迭 ��ü�� Ž���Ͽ� �ּҰ��� ã�� �迭�� ���ʺ��� ä�������� ���� ���
		// �������� ���� ���� ��� ���� ������ ���̴� ���� ��� 100�� �̻� ���� ���ϰ� �ް��ϰ� �Ͼ
		
		int[] arr = {2, 1, 4, 5, 3};
		System.out.println("���� �迭 : " + Arrays.toString(arr));
		
		int min = 0; // �� �� �迭 �� ���� ���� ���� �����ϰ� �ִ� �ε����� ����
		
		// arr.length-1 : ���������� �迭�� ���� -1 ���� ������ ������ �Ϸ�ȴ�.
		for(int i=0; i<arr.length-1; i++) {
			
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				// �� ���� �����ϰ�, �� �ʿ��� ���� ���� ���� ã�´�.
				
				if(arr[j] < arr[min]) {
					min = j;
				} // if end
			} // ���� for en
			
			int tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
			
			System.out.println(i+1 + "����" + Arrays.toString(arr));
		}
	}
}
