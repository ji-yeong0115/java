package com.kh.io.chap02.model.service;

import java.io.File;

import com.kh.io.chap02.model.dao.CharDAO;

public class CharService {

	private CharDAO dao = new CharDAO();
	private String path = "char";
	
	public int fileSave(String fileName, String content) {
		
		File folder = new File(path);
		
		if(!folder.exists()) { // char ������ �������� ������
			folder.mkdir(); // char ���� ����
		}
		
		
		return dao.fileSave(fileName, content, path);
	}

	public String fileOpen(String fileName) {
		
		return dao.fileOpen(fileName, path);
	}

}
