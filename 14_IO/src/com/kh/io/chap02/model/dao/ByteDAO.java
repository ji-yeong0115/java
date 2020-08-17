package com.kh.io.chap02.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {

	// DAO(Data Access Object)
	// - ������ ����ҿ� �����Ͽ� ���� �����͸� �����ϰų�
	// 	����� ���� �޴� ������ �ϴ� ��ü
	
	// ����Ʈ ��� ��Ʈ�� : 1byte ������ �����͸� �Է� �Ǵ� ����ϴ� ��Ʈ��
	
	// ���α׷� --> ����(���)
	public int fileSave(String fileName, String content, String path) {
		
		// FileOutputStream
		// ������ ����Ʈ ������ ����(���) �� �� ����ϴ� ��Ʈ��
		FileOutputStream fo = null;
		
		int result = 0;
		
		try {
			fo = new FileOutputStream(path + "/" + fileName + ".txt"/*, true*/);
			// OutPutStream ��ü ���� ��
			// �ڵ����� �ش� ���ϰ� ��Ʈ���� ���� �ȴ�.
			// �� ��, �ش� ������ �������� �ʴ� ���
			// �ڵ����� ���̸� �����Ͽ� ��Ʈ���� ������
			
			// OutputStream ���� �� �Ű�������  true�� �ۼ��ϴ� ���
			// ���� ���� ���뿡 �̾ �ۼ��ϰ� �� (�̾��)
			// - true�� ���ų� false���̸� �����
			
			// ���Ͽ� �����͸� �����ϰ��� �� ���� write() �޼ҵ� ���
			// write() �޼ҵ�� IOExecption�� �߻���ų ���ɼ��� �ִ�.
			
			// ����Ʈ ����� write() �޼ҵ�� 1byte���� ��� �� �� �ִ�.
			// --> �ݺ����� �̿��Ͽ� ���ϴ� �����͸� ��� ö��
			for(int i=0; i<content.length(); i++) {
				fo.write(content.charAt(i)); // charAt : ���ڷ� �������� ������
			}
			
			result = 1;
			
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{
			try {
				if(fo != null) { // ��Ʈ�� ��ü�� �����Ǿ��� ����
					fo.close(); // ��Ʈ���� ��� �� �ݵ�� ��ȯ�ؾ���
				}
			}catch(IOException e) {
				e.printStackTrace(); // ������ ��Ÿ�� ��� ���� ��θ� ���
			}
		}
		
		return result;
	}

	// ���� --> ���α׷�(�Է� : ���Ϸκ��� �����͸� �Է� �޾ƿ�)
	public String fileOpen(String fileName, String path) {
		
		// FileInputStream
		// ������ �����͸� ����Ʈ ������ �о�(�Է�)
		FileInputStream fi = null;
		
		StringBuffer content = null;
		
		try{
			fi = new FileInputStream(path + "/" + fileName + ".txt");
			
			//InPutStream�� read() �޼ҵ�
			// ����Ʈ ��� ��Ʈ���� read() �޼ҵ�� 1����Ʈ�� ������ �о����
			// �� �̻� �о�� ������ ���ٸ� -1 ��ȯ
			// --> while���� �̿��ؼ� ������ �о� ���ٰ� -1�� ��ȯ�Ǹ� �ݺ��� ����
			
			// read() �ؿ� ���� �ӽ÷� ������ ���� ����
			int value = 0;
			
			// ������� ���ڸ� ������ StringBuffer ��ü ����
			content = new StringBuffer();
			
			while((value = fi.read()) != -1) {
				
				content.append((char)value);
				// �о�� ���� �������̱� ������ ���ڷ� ���� ����ȯ�Ѵ�.
				
				// �о�� �����Ͱ� �ѱ�(2byte)�� ���
				// InputStream�� 1byte�� �о���� ������
				// �����Ͱ� �ջ�� ���·� ��ȯ��
			}
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally {
			try {
				if(fi != null) { 
					fi.close(); // ����� ��Ʈ�� ��ȯ
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return content.toString();
	}

}
