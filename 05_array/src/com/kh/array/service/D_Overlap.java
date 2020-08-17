package com.kh.array.service;
import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap { // 중복 제거
	
	public void example1() {
		
		// int형 배열 arr을 선언하여 5칸 할당 후 각 인덱스에 값을 입력받아 저장.
		// 단 증복되는 값은 저장하지 않음 (중복 값 입력시 "중복 값 존재" 출력)
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "번째 인덱스 값 : ");
			arr[i] = sc.nextInt();
			sc.nextLine();
			
			// 증복 검사
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("중복 값 존재");
					i--; // 바깥쪽 for문 현재 바퀴 유지
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public void example2() {
		// 로또 번호 생성기
		// - 1 ~45까지의 번호가 존재  --> 난수(Math.random())
		// - 6개 랜덤 추출  --> int형 배열 6칸 할당
		// - 중복 허용하지 않는다. --> 중복제거
		// - 오름차순 정렬
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			
			// 1 ~ 45 난수를 발생시켜 대입
			// 0 <= ran < 1  -->  0 <= ran < 45  -->  1 <= ran < 46 
			double ran = Math.random() * 45 + 1;
			lotto[i] = (int)ran;
			
			// 중복 검사
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					// 같은 값이 배열에 존재하는 경우
					i--; // 현재 바퀴 반복
					break;
				}
			}
		}
	/*	// 오름차순 정렬
		for(int k=1; k<lotto.length; k++) {
			for(int l=0; l<k; l++) {
				if(lotto[k] < lotto[l]) {
					int tmp = lotto[k];
					lotto[k] = lotto[l];
					lotto[l] = tmp;
				}
			}
		}
	*/
		
		Arrays.sort(lotto);
		
		
		System.out.println("이게 1등 번호 : " +Arrays.toString(lotto));
	}
}
