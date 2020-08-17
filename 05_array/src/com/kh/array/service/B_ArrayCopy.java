package com.kh.array.service;
import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {
	// �迭 ����
	
	// ���� ���� : �����ϴ� �迭�� ���� �ּҸ��� ����
	// ���� ���� : �����ϰ��� �ϴ� �迭�� ������ �ڷ���, ũ�⸦ ������ �迭�� �����
	//          ���� �����͸� �Ȱ��� �ۼ��ϴ� ��
	
	public void example1() {
		// ���� ���� �� ���� ������ ���� ���� Ȯ��
		
		int origin[] = {10, 20, 30, 40, 50};
		
		// ���� ���� ����
		// �迭 ������ ������ ����� �ּҰ��� �����ؿ�
		int copyArr[] = origin;
		
		// ������ ���� �� ����
		// Arrays Ŭ���� : �迭�� ���ϰ� ����ϰų� �߰����� ����� �����ϴ� Ŭ����
		// Arrays.toString(�迭��) : �迭 ���� �����͸� �ѹ��� ���
		System.out.println(Arrays.toString(origin));
		
		//������ ���� �� ���纻
		System.out.println(Arrays.toString(copyArr));
		
		// ���纻�� ������ ����
		copyArr[2] = 10000;
		
		System.out.println("���纻 �� ���� �� ");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// �迭�� �ؽ��ڵ� ���
		// �ؽ��ڵ� : �ּҰ��� �ؽ��Լ��� �̿��Ͽ� ���ߵ� ����
		// �ؽ��Լ� : Ư�� ���ڿ��� ������ ������ ���·� ����
		
		// ���� �ּҰ��� ���� ��� �ؽ��ڵ嵵 ���� ��
		System.out.println("origin�� hashcode() : " + origin.hashCode());
		System.out.println("copyArr�� hashcode() : " + copyArr.hashCode());
		
	}

	public void example2() {
		// for���� �̿��� ���� ���� + ���� ������ ����
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���� ���縦 �Ϸ��� ���� �ڷ���, ���� ũ�� �̻��� �迭�� ���� �� �Ҵ��ؾ� �Ѵ�.
		int[] copyArr = new int[origin.length];
		
		for(int i=0; i<copyArr.length; i++) {
			copyArr[i] = origin[i];
		}
		
		System.out.println("���� ��");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// ���纻 ������ ����
		copyArr[2] = 9999;
		
		System.out.println("���� ��");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// �� ������ �ؽ��ڵ� ���(�ٸ��� Ȯ��)
		System.out.println("origin�� hashcode() : " + origin.hashCode());
		System.out.println("copyArr�� hashcode() : " + copyArr.hashCode());
		
		
	}

	public void example3() {
		// System.arrycopy()�� �̿��� ���� ���� + ���� ������ ����
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���� ���縦 �Ϸ��� ���� �ڷ���, ���� ũ�� �̻��� �迭�� ���� �� �Ҵ��ؾ� �Ѵ�.
		int[] copyArr = new int[origin.length];
		
		// System.arraycopy(�����迭��, ������� �ε��� ����, ���纻 �迭��, ���纻���� ����� �ε��� ����, ���� ����)
		System.arraycopy(origin, 0, copyArr, 0, origin.length);
		
		System.out.println("���� ��");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// ���纻 ������ ����
		copyArr[2] = 9999;
		
		System.out.println("���� ��");
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(copyArr));
		
		// �� ������ �ؽ��ڵ� ���(�ٸ��� Ȯ��)
		System.out.println("origin�� hashcode() : " + origin.hashCode());
		System.out.println("copyArr�� hashcode() : " + copyArr.hashCode());
	}

	public void example4() {
		// ó���� �迭 ũ�⸦ �Է��ϰ�, �ش� ũ�⸸ŭ�� �Է��� �����Ͽ� �� �ε����� ���� �ʱ�ȭ
		
		// �Է� �Ϸ� �� �߰������� �� �Է��� ������ �ִ��� �����.
		// ���� ���, �߰��� �ʿ��� �迭 ũ�⸦ �Է� �޾� �ٽ� �þ �迭ũ�� ��ŭ �Է��� �޴´�.
		
		// �߰������� �Է��� ������ ���ٸ� �迭�� ����� ��� ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		// �迭 ũ�� �Է� �ޱ�
		System.out.print("�迭 ũ�� �Է� : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[size];
		
		int i=0; // �ʱ��
		
		// ���� ������ �𸣱� ������ for���� ������� �� �Ѵ�.
		while(true) {
			System.out.print(i + "��° �ε��� �Է� : ");
			arr[i] = sc.nextInt();
			sc.nextLine();
		
			i++;
			
			// ������ i���� ���� �迭 ���̿� ���Ƹ�
			if(i==arr.length) {
				System.out.print("�߰��� �Է� �Ͻðڽ��ϱ�?(�ƹ��ų�/n) : ");
				char ch = sc.nextLine().charAt(0);
				
				if(ch=='n') {
					break; // 'n' �Է� �� �ݺ��� ���� (���� ������ �ִ� �ݺ��� ���� - while)
				}else {
					System.out.print("�߰��� �迭 ���� : ");
					size += sc.nextInt(); // ������ �迭 ���̿� �߰�
					sc.nextLine();
					
					// ���� ����� �迭 ���� �� �Ҵ�
					int[] copyArr = new int[size];
					
					// ���� ���� ����
					System.arraycopy(arr, 0, copyArr,0, arr.length);
					
					// arr ������ ���� ����� �迭 �ּҸ� ���� (��������)
					arr = copyArr;
				}
			}
		}
		// arr�� ����� ���� ��� ���
		for(int j=0; j<arr.length; j++) {
			System.out.println("arr[" + j + "] = " + arr[j]);
		}
	}

	
}