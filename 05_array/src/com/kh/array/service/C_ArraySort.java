package com.kh.array.service;
import java.util.Arrays;

public class C_ArraySort {
	
	public void example1() {
		
		int a=10;
		int b=20;
		
		// 두 변의 값을 바꾸기 위한 임시 변수 선언
		int tmp;
		
		tmp = a; // a=10, b=20, tmp=10;
		a = b; // a=20, b=20, tmp=10;
		b = tmp; // a=20, b=10, tmp=10
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}

	public void example2() {
		// 배열 내에서 인덱스 값 바꾸기
		
		int[] arr = {2, 1, 3};
		int tmp;
		
		tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		
		System.out.println(Arrays.toString(arr));
		
	}

	public void example3() {
		// 삽입 정렬 (insertion sort)
		// 정렬 알고리즘 중 가장 간단하고 기본이 되는 알고리즘
		
		int[] arr = {2, 5, 4, 1, 3}; // 오름차순으로 정렬
		
		// 선택 정렬은 두 번째 값(1번 인덱스)부터 시작
		for(int i=1; i<arr.length; i++) {
			// i에 의해서 선택된 인덱스 : 비교 주체
			
			for(int j=0; j<i; j++) {
				// i와 비교되기 위한 j 인덱스 : 비교 대상
				
				// 오름 차순 정렬을 위한 비교 수행
				
				if(arr[i] > arr[j]) {
					// 주체가 대상보다 작으면
					// 오름차순 '<', 내림차순 '>'
					
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					
				} // if end
			} // 안쪽 for end
		} // 바깥쪽 for end
		System.out.println(Arrays.toString(arr));
	}

	public void example4() {
		// 선택정렬(Selection Sort)
		// 비교되지 않은 배열 전체를 탐색하여 최소값을 찾아 배열의 앞쪽부터 채워나가는 정렬 방식
		// 데이터의 양이 적을 경우 좋은 성능을 보이는 정렬 방식 100개 이상 성능 저하가 급격하게 일어남
		
		int[] arr = {2, 1, 4, 5, 3};
		System.out.println("최초 배열 : " + Arrays.toString(arr));
		
		int min = 0; // 뒤 쪽 배열 중 제일 작은 값을 저장하고 있는 인덱스를 저장
		
		// arr.length-1 : 선택정렬은 배열의 길이 -1 바퀴 쨰에서 정렬이 완료된다.
		for(int i=0; i<arr.length-1; i++) {
			
			min = i;
			for(int j=i+1; j<arr.length; j++) {
				// 앞 쪽을 제외하고, 뒤 쪽에서 가장 작은 수를 찾는다.
				
				if(arr[j] < arr[min]) {
					min = j;
				} // if end
			} // 안쪽 for en
			
			int tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
			
			System.out.println(i+1 + "바퀴" + Arrays.toString(arr));
		}
	}
}
