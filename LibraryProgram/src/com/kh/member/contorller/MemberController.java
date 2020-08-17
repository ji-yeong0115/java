package com.kh.member.contorller;

import java.util.List;

import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;
import com.kh.member.view.MemSubView;

public class MemberController{
	
	public static Member loginMember = null;
	
	private MemSubView mSub = new MemSubView();
	private MemberService mService = new MemberService();
	
	/**
	 * 회원으로 로그인 
	 */
	public void loginMember() {
		
		Member inputLogin = mSub.inputLogin();
		
		try {
			MemberController.loginMember
				= mService.loginMember(inputLogin);
			
			if(MemberController.loginMember != null) {
				mSub.displaySuccess("로그인 성공");
			}else {
				mSub.displayFail("아이디 또는 비밀번호를 확인하세요.");
			}
		}catch(Exception e) {
			e.printStackTrace();
			mSub.displayError("로그인 과정에서 오류 발생");
		}
	}

	/**
	 * 회원 삭제
	 */
	public void deleteMem() {
		
		String userId = mSub.inputUserId();
		
		try {
			int check = mService.checkMember(userId);
			
			if(check > 0) {
				
				char del = mSub.deleteMember();
				
				if(del == 'N') {
					return;
				}else if(del == 'Y') {
					
					int result = mService.deleteMember(userId);
					
					if(result > 0) mSub.displaySuccess("회원 삭제 성공");
					else mSub.displayFail("회원 삭제 실패");
				}else {
					mSub.displayFail("Y 또는 N만 입력해주세요.");
				}
			}else {
				mSub.displayFail("회원 탈퇴를 신청하지 않은 회원입니다.");
			}
				
		}catch(Exception e) {
			e.printStackTrace();
			mSub.displayError("회원 삭제 과정에서 오류 발생");
		}
	
	
	}
	
	/**
	 * 자기자신 정보 조회  
	 */
	public void selectMy() {
	
		String userId = mSub.inputUserId();
		String userPwd = mSub.inputUserPwd();
		
		try {
			
			String pwd = mService.selectPwd(userId);
			
			
			if(pwd.equals(MemberController.
					loginMember.getMemPwd())) {
				
				Member member = mService.selectMy(pwd);
				
				mSub.selectMy(member);
			}else {
				mSub.displayFail("비밀번호가 일치하지 않습니다.");
			}

		}catch(Exception e) {
			e.printStackTrace();
			mSub.displayError("정보 상세 조회 과정 중 오류 발생");
		}
	}

	/**
	 * 회원 정보 수정
	 */
	public void updateMember() {
		
		String userId = mSub.inputUserId();
		String userPwd = mSub.inputUserPwd();
		
		try {
			
			String pwd = mService.selectPwd(userId);
			
			if(pwd.equals(MemberController.
					loginMember.getMemPwd())) {
				
				
				int sel = mSub.updateMember();
				
				String upStr = null;
				
				switch(sel) {
				case 1:
					upStr = mSub.updateName();
					break;
				case 2:
					upStr = mSub.updatePwd();
					break;
				case 3:
					upStr = mSub.updateEmail();
					break;
				case 4:
					upStr = mSub.updatePhone();
					break;
				case 5:
					upStr = mSub.updateAddress();
					break;
				}
				
				int result = mService.updateMember(userId, sel, upStr);
				
				if(result > 0) {
					mSub.displaySuccess("회원 정보 수정 성공");
				}else {
					mSub.displayFail("회원 정보 수정 실패");
				}
			}else {
				mSub.displayFail("비밀번호가 일치하지 않습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			mSub.displayError("회원 정보 수정 과정에서 오류 발생");
			
		}
		
	}

	/**
	 * 회원 탈퇴
	 */
	public void secMember() {
		
		String userId = mSub.inputUserId();
		String userPwd = mSub.inputUserPwd();
		
		try {
			
			String pwd = mService.selectPwd(userId);
			
			if(pwd.equals(MemberController.
					loginMember.getMemPwd())) {
				
				char sec = mSub.secMember();
				
				if(sec == 'N') {
					return;
				}else if(sec == 'Y') {
					int result = mService.secMember(userId);
					
					if(result > 0) mSub.displaySuccess("회원 탈퇴 성공");
					else mSub.displayFail("회원 탈퇴 실패");
				}else {
					mSub.displayFail("Y 또는 N만 입력해주세요");
				}
			}else {
				mSub.displayFail("비밀번호가 일치하지 않습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			mSub.displayError("회원 탈퇴 과정 중 오류 발생");
		}
		
	}

	/**
	 * 회원 가입
	 */
	public void newMember() {
		
		Member member = mSub.newMember();
		
		try {
		
			int result = mService.newMember(member);
			
			if(result > 0) mSub.displaySuccess("회원 가입 성공");
			else mSub.displayFail("회원 가입 실패");
			
		}catch(Exception e) {
			e.printStackTrace();
			mSub.displayError("회원 가입 과정에서 오류 발생");
		}
		
	}

	/**
	 * 전체 회원 정보 조회
	 */
	public void selectMember() {
		
		try {
			List<Member> list = mService.selectMember();
			
			if(!list.isEmpty()) {
				mSub.selectMember(list);
			}else {
				mSub.displayFail("조회 결과 없음");
			}
		}catch(Exception e) {
			e.printStackTrace();
			mSub.displayError("회원 정보 조회 과정 중 오류 발생");
		}
		
	}

}
