package com.kh.io.chap01.model.service;

import java.io.File;
import java.io.IOException;

public class FileService {
	
	public void example1() {
		
		// File Ŭ���� : ���� �ý����� ������ ǥ��(����)�ϴ� Ŭ����
		// java.io ��Ű���� ���ԵǾ� ����
		
		File f1 = new File("testFile1.txt"); // testFile1.txt ������ ǥ���ϴ� ��ü ����
		
		// 1. createNewFile() : File��ü�� ǥ���Ǿ� �ִ� File�� ������ �����ϴ� �޼ҵ�
		try {
			
			f1.createNewFile();
			
			// �����ϴ� ������ ���� ���� --> ������ ��θ� �ۼ��ϸ� �ȴ�.
			// ���� ��� : root(�ֻ��� ���� �Ǵ� ����̹�)�� �������� �Ͽ� ���ϴ� ���ϱ����� ��θ� ��� ��Ÿ����
			// ���� : ���ϴ� ��ġ�� Ȯ���� ������ �� �ִ�.
			// ���� : ��� ����� �ۼ��ؾ� �Ǳ� ������ ���͸� ������ ������ �ۼ��ϱ� �����
			// 			+ ���� ��ǻ���� ���� ��ΰ� �巯���Ƿ� ���Ȼ� ������ �߻��� ���ɼ��� ���� 
			File f2 = new File("C:\\workspace\\1_java\\14_IO\\temp\\testFile2.txt");
			f2.createNewFile();
			
			
			// ��� ��� : ���� �������� ���α׷� �Ǵ� ������ �������� ��θ� ����
			// ���� : ���� ��θ� �������� �Ⱦ� ���Ȼ� ������ �ְ�,
			// 		��θ� ���� �̵����� �ʴ� ��� ������ ǥ�� �� �� ����
			// ���� : ���α׷�, ���Ϻ��� ��θ� �°� ������ �ۼ��ؾ��ϴ� ���ŷο��� �ִ�.
			File f3 = new File("temp/testFile3.txt");
			f3.createNewFile();
			
			// 1. �������� �ʴ� ������ ���� �����ϱ�
			//File f4 = new File("temp2/testFile4.txt");
			//f4.createNewFile();
			
			// 2. mkdir() : ������ �����ϴ� �޼ҵ�(make directory)
			// 	  exists() : �ش��ϴ� ���� �Ǵ� ������ �����ϸ� true, ������ false ��ȯ
			File f4 = new File("temp2/testFile4.txt");
			File folder = new File("temp2");
			
			if(!folder.exists()) { // temp2 ������ �������� �ʴ´ٸ�
				System.out.println("temp2 ���� ����");
				folder.mkdir();
			}
			
			// createNewFile() : ���� ���� �� true ��ȯ
			if(f4.createNewFile()) {
				System.out.println(f4.getName() + "���� ����");
			}
			
			System.out.println("���� �� : " + f4.getName());
			System.out.println("���� ������ : " + f4.getAbsolutePath());
			System.out.println("���� ����� : " + f4.getPath());
			
			System.out.println("���� ũ�� : " + f4.length());
			
			
		} catch (IOException e) {
			
			// IOException : ����°� ���õ� ������ �ֻ��� �θ�
			// ����°����� �پ��� ����, ������ �߻��� ���ɼ��� �ٺ��Ͽ�
			// IO ���� Ŭ�������� �⺻������ IOException�� ���� ���� ó���� ����ȭ �Ǿ��ִ�.
			e.printStackTrace();
		}
	}

}
