package com.kh.io.chap02.model.dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
		// 문자 기반 스트림 : 2byte 문자(유니코드)단위로 데이터를 입력 또는 출력하는 스트림
	
	// --> 프로그램 --> 파일(출력)
	public int fileSave(String fileName, String content, String path) {
		
		// FileWriter : 문자 기반 파일 출력 스트림
		
		FileWriter fw = null;
		
		int result = 0; //파일 출력 결과 0또는 1을 저장 할 변수 선언
		
		try {
			
			fw = new FileWriter(path + "/" + fileName + ".txt", true);
			// Writer의 매개변수에 true 작성 시 --> 이어쓰기
			// 없으폄 덮어쓰기
			
			fw.write(content);
			// 문자기반 출력 스트림에서 write() 메소드는 String을 매개변수로 할 경우 한번에 출력 가능
			
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
	
	// 파일 --> 프로그램(입력)
	public String fileOpen(String fileName, String path) {
		
		// FileReader : 문자 기반 파일 입력 스트림
		
		FileReader fr = null;
		
		StringBuffer content = null; // 읽어온 내용을 저장할 변수
		
		try {
			
			fr = new FileReader(path + "/" + fileName + ".txt");
			
			// 문자 기반 스트림의 read()는 2byte씩 읽어옴
			
			// read()로 읽어온 값을 임시 저장할 변수
			int value = 0;
			
			content = new StringBuffer();
			
			while((value = fr.read()) != -1) {
				content.append((char)value);
			}
			
			// 문자 기반 스트림은 2바이트씩 읽어오기 떄문에
			// 한글과 같은 유니코드 데이터가 손상되지 않음
			
			
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
