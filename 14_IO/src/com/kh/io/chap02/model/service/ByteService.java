package com.kh.io.chap02.model.service;

import java.io.File;

import com.kh.io.chap02.model.dao.ByteDAO;

public class ByteService {
	// Model ��Ű�� : ����Ͻ� ������ ���õ� Ŭ�������� ����
	// service : ����Ͻ� ���� �� ������ ����ó��
	// 			-> ������ ���¸� �ٲٰų�, �ٸ� ���ۿ� �ʿ��� ��ü, ���� ����, ���೻�� ����	

	private String path = "byte";
	private ByteDAO dao = new ByteDAO();

	public int fileSave(String fileName, String content) {
		
		// byte ������ ����
		File folder = new File(path);
		
		if(!folder.exists()) { // byte ������ �������� ������
			folder.mkdir(); // ���� ����
		}
		
		return dao.fileSave(fileName, content, path);
	}

	public String fileOpen(String fileName) {
		
		return dao.fileOpen(fileName, path);
	}
	
}
