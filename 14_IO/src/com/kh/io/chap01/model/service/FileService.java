package com.kh.io.chap01.model.service;

import java.io.File;
import java.io.IOException;

public class FileService {
	
	public void example1() {
		
		// File 클래스 : 파일 시스템의 파일을 표현(참조)하는 클래스
		// java.io 패키지에 포함되어 있음
		
		File f1 = new File("testFile1.txt"); // testFile1.txt 파일을 표현하는 객체 생성
		
		// 1. createNewFile() : File객체로 표현되어 있는 File을 실제로 생성하는 메소드
		try {
			
			f1.createNewFile();
			
			// 존재하는 폴더에 파일 생성 --> 파일의 경로를 작성하면 된다.
			// 절대 경로 : root(최상위 폴더 또는 드라이버)를 기준으로 하여 원하는 파일까지의 경로를 모두 나타낸다
			// 장점 : 원하는 위치를 확실히 지정할 수 있다.
			// 단점 : 모든 경오를 작성해야 되기 때문에 디렉터리 레벨이 깊으면 작성하기 어려움
			// 			+ 실제 컴퓨터의 저장 경로가 드러나므로 보안상 문제가 발생할 가능성이 있음 
			File f2 = new File("C:\\workspace\\1_java\\14_IO\\temp\\testFile2.txt");
			f2.createNewFile();
			
			
			// 상대 경로 : 현재 동작중인 프로그램 또는 파일을 기준으로 경로를 지정
			// 장점 : 실제 경로를 노출하지 안아 보안상 이점이 있고,
			// 		경로를 많이 이동하지 않는 경우 간단히 표현 할 수 있음
			// 단점 : 프로그램, 파일별로 경로를 맞게 일일히 작성해야하는 번거로움이 있다.
			File f3 = new File("temp/testFile3.txt");
			f3.createNewFile();
			
			// 1. 존재하지 않는 폴더에 파일 생성하기
			//File f4 = new File("temp2/testFile4.txt");
			//f4.createNewFile();
			
			// 2. mkdir() : 폴더를 생성하는 메소드(make directory)
			// 	  exists() : 해당하는 폴더 또는 파일이 존재하면 true, 없으면 false 반환
			File f4 = new File("temp2/testFile4.txt");
			File folder = new File("temp2");
			
			if(!folder.exists()) { // temp2 폴더가 존재하지 않는다면
				System.out.println("temp2 폴더 생성");
				folder.mkdir();
			}
			
			// createNewFile() : 생성 성공 시 true 반환
			if(f4.createNewFile()) {
				System.out.println(f4.getName() + "생성 성공");
			}
			
			System.out.println("파일 명 : " + f4.getName());
			System.out.println("파일 절대경로 : " + f4.getAbsolutePath());
			System.out.println("파일 상대경로 : " + f4.getPath());
			
			System.out.println("파일 크기 : " + f4.length());
			
			
		} catch (IOException e) {
			
			// IOException : 입출력과 관련된 예외의 최상위 부모
			// 입출력간에는 다양한 예외, 에러가 발생될 가능성이 다분하여
			// IO 관련 클래스들은 기본적으로 IOException에 대한 예외 처리가 강제화 되어있다.
			e.printStackTrace();
		}
	}

}
