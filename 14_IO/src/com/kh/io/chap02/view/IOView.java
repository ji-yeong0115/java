package com.kh.io.chap02.view;

import java.util.Scanner;

import com.kh.io.chap02.model.service.BufferedService;
import com.kh.io.chap02.model.service.ByteService;
import com.kh.io.chap02.model.service.CharService;

public class IOView {
	
	private Scanner sc = new Scanner(System.in);
	private ByteService bService = new ByteService();
	private CharService cService = new CharService();
	private BufferedService bfService = new BufferedService();
	
	public void mainMenu() {
		
	      int sel = 0;
	      
	      do {
	         System.out.println("����� �޴�");
	         System.out.println("1. ����Ʈ ��� ���� ����");
	         System.out.println("2. ����Ʈ ��� ���� ����");
	         System.out.println("3. ���� ��� ���� ����");
	         System.out.println("4. ���� ��� ���� ����");
	         System.out.println("5. ���۸� �̿��� ���� ����");
	         System.out.println("0. ����");
	         System.out.print("�޴� ���� : ");
	         sel = sc.nextInt();
	         sc.nextLine();
	         
	         switch (sel) {
	         
	         case 1: case 3: System.out.println(fileSave(sel)); break;
	         case 2: case 4: System.out.println(fileOpen(sel)); break;
	         case 5: System.out.println(fileCopy()); break;
	         case 0: System.out.println("���α׷� ����"); break;
	         
	         default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���."); break;
	         }
	         
	      }while(sel != 0);
		
	}
	
	// ������ �����ϴ� ����޴�
	/**
	 * ���� ������ ���� ����޴�
	 * - txt������ ���Ϻ���, ���ο� �ۼ��� ������ �Է� ����
	 * @param sel
	 * @return str(���� ���� �� �Է� ����� ��ȯ)
	 */
	public String fileSave(int sel) {
		
		System.out.println("--------------------------------------------");
		
		System.out.print("���ϸ� �Է� : ");
		String fileName = sc.nextLine();
		
		// ���� �Է�
		String input = null;
		StringBuffer content = new StringBuffer(); // ���� ���� ����� ��ü
		System.out.println("���� �Է�(exit �Է� �� ����) : ");
		
		while(true){
			input = sc.nextLine();
			
			if(input.equals("exit")) { // exit�� �Էµ� ���
				break;
			}
			
			// content�� �Է¹��� ���� �߰�
			content.append(input + "\n");
		}
		
		// �Է� �� Ȯ�� �׽�Ʈ
		// System.out.println(content.toString());
		
		// sel���� ���� ȣ���� service ����
		String work = null; // byte / char ��� �� � �۾����� ������ ����
		int result = 0; // ���� ���� ��� ������ ����
		
		switch(sel) {
		case 1: 
			work = "byte���";
			result = bService.fileSave(fileName, content.toString());
												// StringBuffer -> String���� ��ȯ
			break;
		case 3:
			work = "���ڱ��";
			result = cService.fileSave(fileName, content.toString());
			break;
		}
		
		String str = null;
		if(result == 1) {
			str = work + " ���� ���� ����";
		}else {
			str = work + " ���� ���� ����";
		}
		
		return str;
	}
	
	// ���� ����
	public String fileOpen(int sel) {
		
		System.out.println("--------------------------------------------");
		
		System.out.print("������ ���ϸ� �Է� : ");
		String fileName = sc.nextLine();
		
		String work = null; // byte / char ��� �۾� ���� ����
		String content = null; // �ϰϿ� ���� ���� ����
		
		switch(sel) {
		case 2:
			work = "byte���";
			content = bService.fileOpen(fileName);
			break;
			
		case 4:
			work = "���ڱ��";
			content = cService.fileOpen(fileName);
			break;
		}
		
		String str = null;
		if(content != null) {
			// �о�� ���� �ִٸ�
			str = work + " ���� ���� ���� \n" + content;
		}else {
			str = work + "���� ���� ����";
		}
		
		return str;
	}
	
	public String fileCopy() {
		
		System.out.print("������ ���� ��� + ���ϸ� : ");
		String path = sc.nextLine();
		
		System.out.print("����� ������ �̸� : ");
		String copyName = sc.nextLine();
		
		int result = bfService.fileCopy(path, copyName);
		
		String str = null;
		if(result == 1) {
			str = "���缺��";
		}else {
			str = "�������";
		}
		
		return str;
	}

}
