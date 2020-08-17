package com.kh.io.chap02.model.dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
		// ���� ��� ��Ʈ�� : 2byte ����(�����ڵ�)������ �����͸� �Է� �Ǵ� ����ϴ� ��Ʈ��
	
	// --> ���α׷� --> ����(���)
	public int fileSave(String fileName, String content, String path) {
		
		// FileWriter : ���� ��� ���� ��� ��Ʈ��
		
		FileWriter fw = null;
		
		int result = 0; //���� ��� ��� 0�Ǵ� 1�� ���� �� ���� ����
		
		try {
			
			fw = new FileWriter(path + "/" + fileName + ".txt", true);
			// Writer�� �Ű������� true �ۼ� �� --> �̾��
			// ������ �����
			
			fw.write(content);
			// ���ڱ�� ��� ��Ʈ������ write() �޼ҵ�� String�� �Ű������� �� ��� �ѹ��� ��� ����
			
			result = 1;
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			try {
				
				if(fw != null) {
					fw.close();
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	
		return result;
	}
	
	// ���� --> ���α׷�(�Է�)
	public String fileOpen(String fileName, String path) {
		
		// FileReader : ���� ��� ���� �Է� ��Ʈ��
		
		FileReader fr = null;
		
		StringBuffer content = null; // �о�� ������ ������ ����
		
		try {
			
			fr = new FileReader(path + "/" + fileName + ".txt");
			
			// ���� ��� ��Ʈ���� read()�� 2byte�� �о��
			
			// read()�� �о�� ���� �ӽ� ������ ����
			int value = 0;
			
			content = new StringBuffer();
			
			while((value = fr.read()) != -1) {
				content.append((char)value);
			}
			
			// ���� ��� ��Ʈ���� 2����Ʈ�� �о���� ������
			// �ѱ۰� ���� �����ڵ� �����Ͱ� �ջ���� ����
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) {
					fr.close();
				}
				
			}catch(IOException e){
				e.printStackTrace();
				
			}
		}
		
		return content.toString();
	}

}
