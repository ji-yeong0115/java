package com.kh.mmp.controller;

import java.sql.SQLException;
import java.util.List;

import com.kh.mmp.model.service.MemberService;
import com.kh.mmp.model.vo.Member;
import com.kh.mmp.view.SubView;

public class MemberController {

	private SubView sub = new SubView(); // 요철에 대한 입력, 출력을 담당하는 서브메뉴 객체
	private MemberService service = new MemberService();
	
	
	/**
	 * 1. 새로운 회원 추가
	 */
	public void insertMember() {
		
		// 1_1. 새로운 회원 정보를 입력받기 위한 서브메뉴
		// 		SubView.insertMember() 작성
		
		// 1_4. 새로운 회원 정보를 입력받아 반환된 값을 변수에 저장
		Member mem = sub.insertMember();
		
		// 1_5. 입력받은 회원 정보를 DB에 전달하고 비즈니스 로직 처리를 하는
		//		MemberService.insertMember(mem)작성
		
		// 1_24. MemberService.insertMember()를 호출하여
		//		 결과를 반환 받아온다.
		try {
			
			int result = service.insertMember(mem);
			
			// 1_25. DB 삽입 결과에 따른 View 연결 처리
			if(result > 0) {
				
				// 1_26. 서비스 요청 성공 내용을 출력할 View 메소드인
				//		 displaySuccess
				//		 실패 내용 출력용 View -> displayFail(msg)
				//		 ㅇㄹㅇ 		 
				
				// 1_28. DB 처리 결과에 따라 알맞은 msg를 View 로 전달
				sub.displaySucces(result + "명의 회원의 추가되었습니다.");
				
			}else{
				sub.displayFail("회원 추가에 실패하였습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			sub.displayError("회원 추가 과정에서 오류 발생");
		}
		
	}


	/**
	 * 2. 모든 회원 정보 조회
	 */
	public void selectAll() {

		// 2_1. MemberService.selectAll() 작성
		
		// 2_16. MemeberService.selectAll() 호출하여 반환 값 저장
		try {
			
			List<Member> list = service.selectAll();
			
			// 2_17. 조회 결과가 있을  경우 출력할 view
			//		displayeMember(list) 작성
			if(!list.isEmpty()) {
				sub.displayMember(list);
				
			}else {
				// 2_18. 조회 결과가 없을 경우 displayFail(msg) 호출
				sub.displayFail("조회 결과가 없습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			// 2_19. 조회 과정에서 에러 발생 시 displayError(msg)호출
			sub.displayError("조회 과정에서 오류 발생");
		}
		
		
	}


	/**
	 * 3. 특정 조건 회원 조회
	 */
	public void selectMember() {

		// 3_1. 검색 조건을 입력받기 위한 View
		// SubView.selectMember() 작성
		
		// 3_3. SubView.selectMember() 호출해서 반환값 저장
		int sel = sub.selectMember();
		
		//3_4. 검색 조건에 따라서 안맞은 Service를 호출하도록 switch문 작성
		
		// 3_22. 조회 결과를 참조할 List 변수 선언
		List<Member> list = null;
		
		try {
		switch(sel) {
			case 1:  
				// 3_5. 검색할 키워드를 입력받은 SubView.inputkeyword() 작성
				String keyword = sub.inputkeyword();
				
				// 3_7. 조건에 맞는 검색을 수행할
				//		MemberService.selectMemberId(keyword) 작성 및 호출
				
				// 3_23. DB에서 조회 결과를 반환 받아와 list에 저장
				list = service.selectMemberId(keyword);
				break;
				
			case 2:  
				
				// 3_26. 성별 입력용 SubView.inputGender() 작성
				
				// 3_28. 성별을 입력받아와 저장
				char gender = sub.inputGender();
				
				// 3_29. 입력된 성별을 가진 회원을 조회하기 위한 
				//		 MemberService.selectGender(gender) 작성
				
				// 3_45. DB에서 성별 조회 결과를 반환 받아와 list에 저장
				list = service.selectGender(gender);
				break;
				
			case 3:
				
				// 3_47. 검색할 키워드를 입력받은 SubView.inputAddress();
				String keywordAdd = sub.inputAddress();
				
				// 3_63. DB에서 조회 결과를 반환 받아와 list에 저장
				list = service.selectAddress(keywordAdd);
				break;
			case 4:
				
				// 3_65. 나이를 입력받아와 저장
				int age = sub.inputAge();
				
				// 3_66. 입력된 나이대를 가진 회원을 조회하기 위한
				//		 MemberService.selectAge(age) 작성
				
				// 3_82 DB에서 성별 조회 결과를 반환 받아와 list에 저장
				list = service.selectAge(age);
				break;

			case 0:  return; // 0번 입력 시 호출부(메인메뉴)로 돌아감
			}
		
		}catch(Exception e) {
			
			// 3_24. 조회 과정에서 발생하는 예외를 출력할 View 처리
			sub.displayError("조회 과정에서 오류 발생.");
			e.printStackTrace();
			
			return; // 오류가 발생한 경우 이후 코드 처리가 필요 없으므로 리턴
		}
		
		// 3_25. 조회 결과에 따라 View 연결 처리
		if(!list.isEmpty()) {
			sub.displayMember(list);
		}else {
			sub.displayFail("조회 결과가 없습니다.");
		}
		
	}

	/**
	 * 4. 회원 정보 수정 
	 */
	public void updateMember() {
	
		// 4_1. 수정을 위한 회원의 ID를 입력 받아옴
		String memberId = sub.inputMemberId();
		
		// 4_2. 입력받은 ID와 일치하는 회원이 존재하는지 확인할
		//		MemberService.checkMember(memberId) 작성
		
		try {
			
			// 4_17. 회원 존재 여부에 따라 처리방법 제어
			if(service.checkMember(memberId) < 1) {
				// --> 회원이 존재하지 않으면
				sub.displayFail("해당 ID를 가진 회원이 없습니다.");
				return;
			}else { // 해당 회원이 존재하는 경우
				
				// 4_18. 수정할 내용을 선택할 메뉴
				//		 subView.updateMember() 작성
				
				// 4_20. SubView.updateMember() 호출 후 반환 값 저장
				int sel = sub.updateMember();
				
				
				// 4_21. 입력받은 서브메뉴가 번호가 0(돌아가기)인 경우
				if(sel == 0) return;
				// if문, for에서 {}(중괄호)가 생략된 경우
				// 해당 구문 바로 다음 한 줄(세미콜론 전)에 대해서 동작을 함
				
				// 수정할 값 입력을 받은 SubView.inputUpdate() 작성 및 호출
				String input = sub.inputUpdate();
				
				// 4_22. 별도의 switch문을 작성하여 service를 호출하지 않고
				//		 입력된 id와 선택된 변호 sel을 매개변수로 한 service 메소드 호출
				//		 --> MemberService.updateMember(memberId, sel, input) 작성
				
				// 4_38. MemberService.updateMember(memberId, sel, input)
				//		 호출 후 반환 값 저장
				int result = service.updateMember(memberId, sel, input);
				
				// 4_39. 수정 결과에 따른 View 연결 처리
				if(result > 0) {
					sub.displaySucces(result + "명의 정보가 수정 되었습니다.");
				}else {
					sub.displayFail("회원 정보 수정 실패");
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
			sub.displayError("데이터 수정 과정에서 오류 발생");
		}
		
	}
	
	/**
	 * 5. 회원 탈퇴 
	 */
	public void deleteMember() {
		
		
		
		// 1) 회원 아이디 입력 받아오기
		
		// 5_1. 회원 아이디를 입력받기 위한 View
		// 		SubView.inputEmployeeNo() 작성
		String memberId = sub.inputMemberId();
		
		// 3) service 호출하여 반환 값에 따라 View 연결 처리
		if(sub.checkDelete() == 'Y') {
			
			try {
				int result = service.deleteMember(memberId);
				
				if(result>0) {
					sub.displaySucces(result + "명의 회원이 탈퇴 되었습니다.");
				}else {
					sub.displayError("회원 탈퇴 실패");
				}
			}catch(Exception e) {
				e.printStackTrace();
				sub.displayError("회원 탈퇴 중 오류 발생");
			}
		}

	}


	
}
