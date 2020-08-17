package com.kh.collection.list.part3.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.collection.list.part3.model.service.MusicService;
import com.kh.collection.list.part3.model.vo.Music;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicService service = new MusicService();
	
	/**
	 * ���� ���� ���α׷� ���� �޴�
	 */
	public void mainMenu() {
		int sel = 0;
		
		do {
			System.out.println("\n====== ���� ���� ���α׷� ======\n");
			System.out.println("1. ���ο� ���� �߰��ϱ�");
			System.out.println("2. ��ϵ� ���� ��� ��ȸ�ϱ�");
			System.out.println("3. ���� Ư�� �ܾ ���Ե� ���� �˻��ϱ�");
			System.out.println("4. ������ ��ġ�ϴ� ���� �����ϱ�");
			System.out.println("5. ������ ��ġ�ϴ� ���� �����ϱ�");
			System.out.println("6. ���� ��� �����ϱ�");
			System.out.println("0. ���α׷� ����");
			
			System.out.print("�޴� ���� : ");
			
			try {
				sel = sc.nextInt();
				sc.nextLine();
				
				switch(sel) {
				case 1: System.out.println(addMusic());break;
				case 2: selectAllMusic(); break;
				case 3: serachMusic(); break;
				case 4: System.out.println(removeMusic()); break;
				case 5: System.out.println(updateMusic()); break;
				case 6: sortMusic(); break;
				case 0: System.out.println("���α׷��� �����մϴ�."); break;
				default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				}
				
			}catch(InputMismatchException e) {
				// InputMismatchException
				// : Scanner�� �̿��� �Է� �� Ÿ���� �߸� �Է��ϸ� �߻��ϴ�
				// Runtime Exception
				System.out.println("������ �Է����ּ���.");
				sel = -1; // while ���� ������ �������� �� �ϰ� ������ �� ����
				sc.nextLine(); // ���ۿ� �����ִ� �߸� �Է��� ���ڿ� + ���๮�� ����
				
			}
			
			
		}while(sel != 0);
		
	}
	
	/**
	 * 1. ���� �߰��� view �޼ҵ�
	 * - ������ ����, ������ �Է¹���.
	 * @return str (�� �߰� ���� / ����)
	 */
	private String addMusic() {
		
		System.out.println("\n------ ���ο� ���� �߰� ------\n");
		
		System.out.print("���� �Է� : ");
		String title = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		String artist = sc.nextLine();
		
		String str = null;
		
		if(service.addMusic(new Music(title, artist))) {
			// �Է� ���� ����, �������� �̿��Ͽ� Music ��ü�� �����ϰ�
			// ������ ��ü�� �ּҸ� service.addMusic�� �Ű������� �����Ͽ� ���� ��
			// �� ��ȯ ���� true �� �� if���� �����ض�
			
			str = "** ���� �߰� ���� **";
		}else {
			str = "** ���� �߰� ���� **";
		}
		
		return str;
	}
	
	/**
	 * 2. ��Ͽ� �ִ� ��� ���� ��ȸ�� view �޼ҵ�
	 */
	private void selectAllMusic() {
		
		System.out.println("\n------ ���� ��� ------\n");
		
		List<Music > list = service.selectAllMusic();
		// sevice.selectAllMusic()�� ȣ���Ͽ� ��ȯ���� ���� ������
		// list ���� ����
		
		if(list.isEmpty()) { // ���� ����� ����ִٸ�
			System.out.println("�����ϴ� ������ �����ϴ�.");
		}else {
			// ���׵� for��(for each��)
			for(Music m : list) {
				System.out.println(m);
			}
		}
		
	}
	
	/**
	 * 3. ���� ���� �˻��� view �޼ҵ�
	 * - �˻��� ������ ����� ���õ� Ű���带 �Է¸���
	 */
	private void serachMusic() {
		
		System.out.println("\n------ ���� ���� �˻� ------\n");
		
		System.out.print("���� ���� Ű���� �Է� : ");
		String keyword = sc.nextLine();
		
		List<Music> searchList = service.searchMusic(keyword);
		// �Է¹��� Ű���带 service.searchMusic�� �Ű������� �����Ͽ�
		// �˻��� ����� ���� list�� searchList�� ����
		
		for(Music m : searchList) {
			System.out.println(m);
		}
		
	}
	
	/**
	 * 4. ���� ���ſ� view �޼ҵ�
	 * - ������ ����� �Է¹���
	 * @return str(������ �� ���� / �������� ����)
	 */
	private String removeMusic() {
		
		System.out.println("\n------ ���� ���� ------\n");
		
		
		System.out.print("������ ���� ���� �Է� : ");
		String title = sc.nextLine();
		
		Music result = service.removeMusic(title);
		// �Է¹��� ������ service.removeMusic�� �Ű������� �����Ͽ�
		// ������ ����� result ������ ����
		
		String str = null;
		
		if(result == null) {
			str = "�Է��Ͻ� ������ �������� �ʽ��ϴ�.";
		}else {
			str = result + "�� �����Ǿ����ϴ�.";
		}
		
		return str;
	}
	
	/**
	 * 5. ���� ������ view �޼ҵ�
	 * - ������ ���Ǹ�, ���ο� ���� ����, �������� �Է¹���
	 * @return str(���� ���� / ������ ������ ����)
	 */
	private String updateMusic() {
		
		System.out.println("\n------ ���� ���� ------\n");
		
		System.out.print("������ ���� ���� : ");
		String title = sc.nextLine();
		
		System.out.print("���� ����(����) : ");
		String upTitle = sc.nextLine();
		
		System.out.print("���� ����(����) : ");
		String upArtist = sc.nextLine();
		
		String str = null;
		
		if(service.updateMusic(title, new Music(upTitle, upArtist)) == 1) {
			str = "���������� �����Ǿ����ϴ�.";
		}else {
			str = "������ ���� �����ϴ�.";
		}
		
		return str;
	}
	
	/**
	 * 6. ���� ��� ���Ŀ� view �޼ҵ�
	 * - ������ ����/ ��������, ���� ���� ���� / ����
	 */
	private void sortMusic() {
		
		/*
		 * Collections.sort() : List �� Collectionc ��ü ���� �� ���
		 * --> ���� ��ü�� ���ĵ� ( == ������ ������ �ٲ��.)
		 * 
		 * Comparable : ��ü�� �⺻ ���� ������ �����ϴµ� ���
		 * 1) �⺻ ���� ������ �ο��Ϸ��� Ŭ������ Comparable �������̽��� ��� �ް� ��
		 * 2) public int compareTo(Object o) �޼ҵ� �������̵�
		 * 		--> ���� ������ �ۼ�
		 * 		--> ex) ���� list �������� -> �ڵ����� ���� �������� ������ ��
		 * 
		 * 
		 * ���� ����
		 * 1) � �ʵ带 �������� �����
		 * 2) �������� / ��������
		 * 3) ����� �� �ڸ��� �ٲ��.
		 * 
		 */
		
		System.out.println("\n------ ���� ���� ------\n");
		System.out.println("1. ������ ��������");
		System.out.println("2. ������ �����ڼ�");
		System.out.println("3. ���� �����ڼ�");
		System.out.println("4. ���� �����ڼ�");
		System.out.println("0. ���θ޴��� �̵�");
		
		System.out.print("�޴� ���� : ");
		int sel = sc.nextInt();
		sc.nextLine();
		
		if(sel == 0) {
			return; // �� �������� �ٷ� ȣ��η� ���ư� --> ���θ޴�
		}else {
			List<Music> sortList = service.sortMusic(sel);
			
			for(Music m : sortList) {
				System.out.println(m);
			}
		}
	}

}
