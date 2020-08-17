package com.kh.array.service;
import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap { // �ߺ� ����
	
	public void example1() {
		
		// int�� �迭 arr�� �����Ͽ� 5ĭ �Ҵ� �� �� �ε����� ���� �Է¹޾� ����.
		// �� �����Ǵ� ���� �������� ���� (�ߺ� �� �Է½� "�ߺ� �� ����" ���)
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "��° �ε��� �� : ");
			arr[i] = sc.nextInt();
			sc.nextLine();
			
			// ���� �˻�
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("�ߺ� �� ����");
					i--; // �ٱ��� for�� ���� ���� ����
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public void example2() {
		// �ζ� ��ȣ ������
		// - 1 ~45������ ��ȣ�� ����  --> ����(Math.random())
		// - 6�� ���� ����  --> int�� �迭 6ĭ �Ҵ�
		// - �ߺ� ������� �ʴ´�. --> �ߺ�����
		// - �������� ����
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			
			// 1 ~ 45 ������ �߻����� ����
			// 0 <= ran < 1  -->  0 <= ran < 45  -->  1 <= ran < 46 
			double ran = Math.random() * 45 + 1;
			lotto[i] = (int)ran;
			
			// �ߺ� �˻�
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					// ���� ���� �迭�� �����ϴ� ���
					i--; // ���� ���� �ݺ�
					break;
				}
			}
		}
	/*	// �������� ����
		for(int k=1; k<lotto.length; k++) {
			for(int l=0; l<k; l++) {
				if(lotto[k] < lotto[l]) {
					int tmp = lotto[k];
					lotto[k] = lotto[l];
					lotto[l] = tmp;
				}
			}
		}
	*/
		
		Arrays.sort(lotto);
		
		
		System.out.println("�̰� 1�� ��ȣ : " +Arrays.toString(lotto));
	}
}
