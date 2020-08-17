package com.kh.io.chap02.view;

import java.util.Scanner;

import com.kh.io.chap02.model.service.BufferedService;
import com.kh.io.chap02.model.service.ByteService;
import com.kh.io.chap02.model.service.CharService;

public class IOView {
	
	private Scanner sc = new Scanner(System.in);
	private ByteService bService = new ByteService();
	private CharService cService = new CharService();
	private BufferedService bfService = new BufferedService();
	
	public void mainMenu() {
		
	      int sel = 0;
	      
	      do {
	         System.out.println("입출력 메뉴");
	         System.out.println("1. 바이트 기반 파일 저장");
	         System.out.println("2. 바이트 기반 파일 열기");
	         System.out.println("3. 문자 기반 파일 저장");
	         System.out.println("4. 문자 기반 파일 열기");
	         System.out.println("5. 버퍼를 이용한 파일 복사");
	         System.out.println("0. 종료");
	         System.out.print("메뉴 선택 : ");
	         sel = sc.nextInt();
	         sc.nextLine();
	         
	         switch (sel) {
	         
	         case 1: case 3: System.out.println(fileSave(sel)); break;
	         case 2: case 4: System.out.println(fileOpen(sel)); break;
	         case 5: System.out.println(fileCopy()); break;
	         case 0: System.out.println("프로그램 종료"); break;
	         
	         default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
	         }
	         
	      }while(sel != 0);
		
	}
	
	// 파일을 저장하는 서브메뉴
	/**
	 * 파일 저장을 위한 서브메뉴
	 * - txt파일의 파일병과, 내부에 작성될 내용을 입력 받음
	 * @param sel
	 * @return str(파일 생성 및 입력 결과를 반환)
	 */
	public String fileSave(int sel) {
		
		System.out.println("--------------------------------------------");
		
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		
		// 내용 입력
		String input = null;
		StringBuffer content = new StringBuffer(); // 파일 내용 저장용 객체
		System.out.println("내용 입력(exit 입력 시 종료) : ");
		
		while(true){
			input = sc.nextLine();
			
			if(input.equals("exit")) { // exit가 입력된 경우
				break;
			}
			
			// content에 입력받은 값을 추가
			content.append(input + "\n");
		}
		
		// 입력 값 확인 테스트
		// System.out.println(content.toString());
		
		// sel값에 따라 호출할 service 제어
		String work = null; // byte / char 기반 중 어떤 작업인지 저장할 변수
		int result = 0; // 파일 생성 결과 저장할 변수
		
		switch(sel) {
		case 1: 
			work = "byte기반";
			result = bService.fileSave(fileName, content.toString());
												// StringBuffer -> String으로 변환
			break;
		case 3:
			work = "문자기반";
			result = cService.fileSave(fileName, content.toString());
			break;
		}
		
		String str = null;
		if(result == 1) {
			str = work + " 파일 저장 성공";
		}else {
			str = work + " 파일 저장 실패";
		}
		
		return str;
	}
	
	// 파일 열기
	public String fileOpen(int sel) {
		
		System.out.println("--------------------------------------------");
		
		System.out.print("오픈할 파일명 입력 : ");
		String fileName = sc.nextLine();
		
		String work = null; // byte / char 기반 작업 종류 저장
		String content = null; // 일겅온 파일 내용 저장
		
		switch(sel) {
		case 2:
			work = "byte기반";
			content = bService.fileOpen(fileName);
			break;
			
		case 4:
			work = "문자기반";
			content = cService.fileOpen(fileName);
			break;
		}
		
		String str = null;
		if(content != null) {
			// 읽어온 값이 있다면
			str = work + " 파일 열기 성공 \n" + content;
		}else {
			str = work + "파일 열기 실패";
		}
		
		return str;
	}
	
	public String fileCopy() {
		
		System.out.print("복사할 파일 경로 + 파일명 : ");
		String path = sc.nextLine();
		
		System.out.print("복사된 파일의 이름 : ");
		String copyName = sc.nextLine();
		
		int result = bfService.fileCopy(path, copyName);
		
		String str = null;
		if(result == 1) {
			str = "복사성공";
		}else {
			str = "복사실패";
		}
		
		return str;
	}

}
