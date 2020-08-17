package com.kh.io.chap02.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDAO {
	
	/*
	 * BufferedStrea
	 * - ������Ʈ���� �ϳ��� �Ϲ� ��� ��Ʈ���� �����ߴ� ������ ��� �����ִ� ��Ʈ��
	 * 
	 * - ������Ʈ���� �ܵ����� ��Ʈ���� ������ �� ����.
	 * 
	 * - Bufferd ���� ��Ʈ�� ��� �� �������� �� flush() �Ǵ� close()�� �����ؾ���
	 * 	--> ���ۿ� �����ִ� �����͸� ���������� ����ϱ� ���ؼ� �ݵ�� �ʿ���
	 * 
	 */

	// ����Ʈ ��� ��Ʈ���� �̿��� ���� ����
	// --> ��� ������ ������ ������ �� �ִ�.
	// --> ���� ���� ���� �� ����Ʈ ����̹Ƿ� �����Ͱ� �ջ�� �� �ִ�.
	public int fileCopy(String path, String copyName, String copyPath) {
		
		BufferedInputStream bi = null;
		BufferedOutputStream bo = null;
		
		int result = 0; // ���� ����� ������ ����
		
		try {
			
			// 1) ���������� �о��
			bi = new BufferedInputStream(new FileInputStream(path));
			
			// 2) �������Ͽ��� Ȯ���ڸ� ����
			String ext = path.substring(path.lastIndexOf("."));
			
			// 3) ���纻�� ��Ʈ���� ����
			bo = new BufferedOutputStream
					(new FileOutputStream(copyPath + "/" + copyName + ext));
										// ���� ��� / �������ϸ� . Ȯ����
			
			// 4) ������ ����Ʈ ������ �о� ���� ����
			//		���纻�� ����� ��Ʈ������ ����ϱ�
			int value = 0;
			
			while((value = bi.read()) != -1) {
				// �о�� ���� �ִٸ�
				
				bo.write((char)value); // ����� ���Ϸ� �ٷ� ���
			}
			
			result = 1;
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(bo != null) {
					bo.close();
				}
				
				if(bi != null) {
					bi.close();
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
