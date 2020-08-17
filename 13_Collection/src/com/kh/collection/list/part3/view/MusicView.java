package com.kh.collection.list.part3.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.collection.list.part3.model.service.MusicService;
import com.kh.collection.list.part3.model.vo.Music;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicService service = new MusicService();
	
	/**
	 * 음악 관리 프로그램 메인 메뉴
	 */
	public void mainMenu() {
		int sel = 0;
		
		do {
			System.out.println("\n====== 음악 관리 프로그램 ======\n");
			System.out.println("1. 새로운 음악 추가하기");
			System.out.println("2. 등록된 음악 모두 조회하기");
			System.out.println("3. 제목에 특정 단어가 포함된 음악 검색하기");
			System.out.println("4. 제목이 일치하는 음악 삭제하기");
			System.out.println("5. 제목이 일치하는 음악 수정하기");
			System.out.println("6. 음악 목록 정렬하기");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			
			try {
				sel = sc.nextInt();
				sc.nextLine();
				
				switch(sel) {
				case 1: System.out.println(addMusic());break;
				case 2: selectAllMusic(); break;
				case 3: serachMusic(); break;
				case 4: System.out.println(removeMusic()); break;
				case 5: System.out.println(updateMusic()); break;
				case 6: sortMusic(); break;
				case 0: System.out.println("프로그램을 종료합니다."); break;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				
			}catch(InputMismatchException e) {
				// InputMismatchException
				// : Scanner를 이용한 입력 시 타입을 잘못 입력하면 발생하는
				// Runtime Exception
				System.out.println("정수만 입력해주세요.");
				sel = -1; // while 종료 조건을 만족하지 못 하게 읨의의 값 대입
				sc.nextLine(); // 버퍼에 남아있는 잘못 입력한 문자열 + 개행문자 제거
				
			}
			
			
		}while(sel != 0);
		
	}
	
	/**
	 * 1. 음악 추가용 view 메소드
	 * - 음악의 제목, 가수를 입력받음.
	 * @return str (곡 추가 성공 / 실패)
	 */
	private String addMusic() {
		
		System.out.println("\n------ 새로운 음악 추가 ------\n");
		
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 입력 : ");
		String artist = sc.nextLine();
		
		String str = null;
		
		if(service.addMusic(new Music(title, artist))) {
			// 입력 받은 제목, 가스명을 이용하여 Music 객체를 생성하고
			// 생성된 객체의 주소를 service.addMusic의 매개변수로 전달하여 수행 수
			// 그 반환 값이 true 일 때 if문을 수행해라
			
			str = "** 음악 추가 성공 **";
		}else {
			str = "** 음악 추가 실패 **";
		}
		
		return str;
	}
	
	/**
	 * 2. 목록에 있는 모든 음악 조회용 view 메소드
	 */
	private void selectAllMusic() {
		
		System.out.println("\n------ 음악 목록 ------\n");
		
		List<Music > list = service.selectAllMusic();
		// sevice.selectAllMusic()을 호출하여 반환받은 값을 저장할
		// list 변수 선언
		
		if(list.isEmpty()) { // 음악 목록이 비어있다면
			System.out.println("존재하는 음악이 없습니다.");
		}else {
			// 향항된 for문(for each문)
			for(Music m : list) {
				System.out.println(m);
			}
		}
		
	}
	
	/**
	 * 3. 음악 제목 검색용 view 메소드
	 * - 검색할 음악의 제목과 관련된 키워드를 입력맏음
	 */
	private void serachMusic() {
		
		System.out.println("\n------ 음악 제목 검색 ------\n");
		
		System.out.print("음악 제목 키워드 입력 : ");
		String keyword = sc.nextLine();
		
		List<Music> searchList = service.searchMusic(keyword);
		// 입력받은 키워드를 service.searchMusic의 매개변수로 전달하여
		// 검색한 결과를 담은 list를 searchList에 저장
		
		for(Music m : searchList) {
			System.out.println(m);
		}
		
	}
	
	/**
	 * 4. 음악 제거용 view 메소드
	 * - 삭제할 곡명을 입력받음
	 * @return str(삭제된 곡 정보 / 존재하지 않음)
	 */
	private String removeMusic() {
		
		System.out.println("\n------ 음악 삭제 ------\n");
		
		
		System.out.print("삭제할 음악 제목 입력 : ");
		String title = sc.nextLine();
		
		Music result = service.removeMusic(title);
		// 입력받은 제목을 service.removeMusic의 매개변수로 전달하여
		// 수행한 결과를 result 변수에 저장
		
		String str = null;
		
		if(result == null) {
			str = "입력하신 음악이 존재하지 않습니다.";
		}else {
			str = result + "가 삭제되었습니다.";
		}
		
		return str;
	}
	
	/**
	 * 5. 음악 수정용 view 메소드
	 * - 수정할 음악명, 새로운 음악 제목, 가수명을 입력받음
	 * @return str(수정 성공 / 수정할 음악이 없다)
	 */
	private String updateMusic() {
		
		System.out.println("\n------ 음악 수정 ------\n");
		
		System.out.print("수정할 음악 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("수정 내용(제목) : ");
		String upTitle = sc.nextLine();
		
		System.out.print("수정 내용(가수) : ");
		String upArtist = sc.nextLine();
		
		String str = null;
		
		if(service.updateMusic(title, new Music(upTitle, upArtist)) == 1) {
			str = "성공적으로 수정되었습니다.";
		}else {
			str = "수정할 곡이 없습니다.";
		}
		
		return str;
	}
	
	/**
	 * 6. 음악 목록 정렬용 view 메소드
	 * - 가수명 오름/ 내림차순, 음악 제목 오름 / 내림
	 */
	private void sortMusic() {
		
		/*
		 * Collections.sort() : List 등 Collectionc 객체 정렬 시 사용
		 * --> 원본 자체가 정렬됨 ( == 원본의 순서가 바뀐다.)
		 * 
		 * Comparable : 객체의 기본 정렬 기준을 구현하는데 사용
		 * 1) 기본 정렬 기준을 부여하려는 클래스에 Comparable 인터페이스를 상속 받게 함
		 * 2) public int compareTo(Object o) 메소드 오버라이딩
		 * 		--> 정렬 기준을 작성
		 * 		--> ex) 음악 list 정렬해줘 -> 자동으로 제목 오름차순 정렬을 함
		 * 
		 * 
		 * 정렬 기준
		 * 1) 어떤 필드를 기준으로 삼느냐
		 * 2) 오름차순 / 내림차순
		 * 3) 양수일 떄 자리가 바뀐다.
		 * 
		 */
		
		System.out.println("\n------ 정렬 선택 ------\n");
		System.out.println("1. 가수명 오름차순");
		System.out.println("2. 가수명 내림자순");
		System.out.println("3. 제목 오름자순");
		System.out.println("4. 제목 내림자순");
		System.out.println("0. 메인메뉴로 이동");
		
		System.out.print("메뉴 선택 : ");
		int sel = sc.nextInt();
		sc.nextLine();
		
		if(sel == 0) {
			return; // 현 시점에서 바로 호출부로 돌아감 --> 메인메뉴
		}else {
			List<Music> sortList = service.sortMusic(sel);
			
			for(Music m : sortList) {
				System.out.println(m);
			}
		}
	}

}
