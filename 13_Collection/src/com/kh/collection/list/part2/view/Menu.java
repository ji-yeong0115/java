package com.kh.collection.list.part2.view;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.collection.list.part2.model.service.PracticeService;
import com.kh.collection.list.part2.model.vo.Student;

public class Menu {
	private PracticeService service = new PracticeService();
	
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		int sel = 0;
		do{
			System.out.println("-----�л� ���� ���α׷�-----");
			System.out.println("1. �� �ڿ� �߰�");
			System.out.println("2. ��ü ��ȸ");
			System.out.println("3. ����");
			System.out.println("0. ����");
			System.out.print("�޴� ���� ==> ");
			
			try {
				sel = sc.nextInt();
				sc.nextLine();
			
				switch (sel) {
				case 1: 
					System.out.println(add()); break;
				case 2: 
					selectAll(); break;
				case 3:
					System.out.println(delete()); break;
				case 0:
					System.out.println("���α׷��� �����մϴ�."); break;
					
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				}
				
			}catch (InputMismatchException e) {
				System.out.println("������ �Է����ּ���.");
				sel = -1; // while ������ �������� ���ϰ� �ϱ� ���� -1 ����
				sc.nextLine(); // ���ۿ� �����ִ� �߸� �Է��� ���ڿ� + ���๮�ڸ� ����
			}
			
			System.out.println();
		}while(sel != 0);
	}
	
	
	public String add() throws InputMismatchException{
		System.out.println("[�л� �߰�]");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int score = sc.nextInt();
		sc.nextLine();
		
		System.out.println("addStudent() ȣ��");
		
		String str = null;
		if(service.addStudent(new Student(name,score))) {
			str = "�л� �߰� ����";
		}else {
			str = "�л� �߰� ����";
		}
		return str;
	}
	
	
	public void selectAll() {
		System.out.println("[�л� ���� ��ȸ]");
		System.out.println("selectAllStudent() ȣ��");
		
		List<Student> list  = service.selectAllStudent();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + "�� : " + list.get(i));
		}
		
	}
	
	
	public String delete()  throws InputMismatchException{
		System.out.print("�л� ��ȣ �Է� : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		System.out.println("removeStudent() ȣ��");
		Student std = service.removeStudent(index);
		
		if(std != null) {
			return std.getName() + " ������.";
		}else {
			return "�߸��� ��ȣ�� �Է��Ͽ����ϴ�.";
		}
	}
	
	
}
