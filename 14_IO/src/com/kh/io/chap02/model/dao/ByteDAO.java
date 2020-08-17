package com.kh.io.chap02.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDAO {

	// DAO(Data Access Object)
	// - 데이터 저장소에 접속하여 실제 데이터를 전송하거나
	// 	결과를 전달 받는 역할을 하는 객체
	
	// 바이트 기반 스트림 : 1byte 단위로 데이터를 입력 또는 출력하는 스트림
	
	// 프로그램 --> 파일(출력)
	public int fileSave(String fileName, String content, String path) {
		
		// FileOutputStream
		// 파일을 바이트 단위로 저장(출력) 할 때 사용하는 스트림
		FileOutputStream fo = null;
		
		int result = 0;
		
		try {
			fo = new FileOutputStream(path + "/" + fileName + ".txt"/*, true*/);
			// OutPutStream 객체 생성 시
			// 자동으로 해당 파일과 스트림이 연결 된다.
			// 이 때, 해당 파일이 존재하지 않는 경우
			// 자동으로 파이를 생성하여 스트림을 연결함
			
			// OutputStream 생성 시 매개변수로  true를 작성하는 경우
			// 이전 파일 내용에 이어서 작성하게 됨 (이어쓰기)
			// - true가 없거나 false값이면 덮어쓰기
			
			// 파일에 데이터를 전송하고자 할 때는 write() 메소드 사용
			// write() 메소드는 IOExecption을 발생시킬 가능성이 있다.
			
			// 바이트 기반의 write() 메소드는 1byte씩만 출력 할 수 있다.
			// --> 반복문을 이용하여 원하는 데이터를 모두 철력
			for(int i=0; i<content.length(); i++) {
				fo.write(content.charAt(i)); // charAt : 문자로 보이지만 숫자형
			}
			
			result = 1;
			
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{
			try {
				if(fo != null) { // 스트림 객체가 생성되었을 때만
					fo.close(); // 스트림은 사용 후 반드시 반환해야함
				}
			}catch(IOException e) {
				e.printStackTrace(); // 에러가 나타난 모든 스택 경로를 출력
			}
		}
		
		return result;
	}

	// 파일 --> 프로그램(입력 : 파일로부터 데이터를 입력 받아옴)
	public String fileOpen(String fileName, String path) {
		
		// FileInputStream
		// 파일의 데이터를 바이트 단위로 읽어(입력)
		FileInputStream fi = null;
		
		StringBuffer content = null;
		
		try{
			fi = new FileInputStream(path + "/" + fileName + ".txt");
			
			//InPutStream의 read() 메소드
			// 바이트 기반 스트림의 read() 메소드는 1바이트씩 내용을 읽어오고
			// 더 이상 읽어올 내용이 없다면 -1 반환
			// --> while문을 이용해서 무한히 읽어 오다가 -1이 반환되면 반복문 종료
			
			// read() 해온 값을 임시로 저장할 변수 선언
			int value = 0;
			
			// ㅇ릭어온 문자를 저장할 StringBuffer 객체 생성
			content = new StringBuffer();
			
			while((value = fi.read()) != -1) {
				
				content.append((char)value);
				// 읽어온 값은 정수형이기 떄문에 문자로 강제 형변환한다.
				
				// 읽어온 데이터가 한근(2byte)인 경우
				// InputStream은 1byte로 읽어오기 때문에
				// 데이터가 손상된 형태로 반환됨
			}
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally {
			try {
				if(fi != null) { 
					fi.close(); // 사용할 스트림 반환
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return content.toString();
	}

}
