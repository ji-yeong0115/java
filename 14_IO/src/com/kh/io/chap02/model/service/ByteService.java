package com.kh.io.chap02.model.service;

import java.io.File;

import com.kh.io.chap02.model.dao.ByteDAO;

public class ByteService {
	// Model 패키지 : 비즈니스 로직과 관련된 클래스들의 집합
	// service : 비즈니스 로직 중 데이터 가공처리
	// 			-> 데이터 형태를 바꾸거나, 다른 동작에 필요한 객체, 파일 생성, 수행내용 저장	

	private String path = "byte";
	private ByteDAO dao = new ByteDAO();

	public int fileSave(String fileName, String content) {
		
		// byte 폴더를 생성
		File folder = new File(path);
		
		if(!folder.exists()) { // byte 폴더가 존재하지 않으면
			folder.mkdir(); // 폴더 생성
		}
		
		return dao.fileSave(fileName, content, path);
	}

	public String fileOpen(String fileName) {
		
		return dao.fileOpen(fileName, path);
	}
	
}
