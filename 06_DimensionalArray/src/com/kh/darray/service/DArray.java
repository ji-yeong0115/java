package com.kh.darray.service;
import java.util.Arrays;
import java.util.Scanner;

public class DArray {
	// 2차원 배열 : 일차원 배열 여러개를 하나로 묶은 것
	
	public void example1() {
		
		// 2차원 배열 선언
		int[][] arr1;
		int arr2[][];
		int[] arr3[];
		
		// [] --> 배열 1차원을 의미
		
		// 2차원 배열 할당
		// 배열명 = new 자료형[행크기][열크기];
		arr1 = new int[3][5]; // 3행 5열의 2차원 배열
		
		// 1차원 배열의 길이 == 배열명.length
		// arr1.length는 가리키고 있는 것의 개수
		System.out.println("행의 개수 :" + arr1.length);
		System.out.println("열의 개수 :" + arr1[0].length);
	
		// 3행 5열을 모두 5로 초기화
		// 행 반복 지정
		for(int i=0; i<arr1.length; i++) {
			
			// 열 반복 지정
			for(int j=0; j<arr1[i].length; j++) {
				
				// 2차원 배열 arr1의 i행 j열의 값을 5로 초기화
				arr1[i][j] = 5;
			}
		}
		
		// 2차원 배열 출력
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			
			// 행 출력이 끝날 때마다 줄 바꿈
			System.out.println();
		}
	}

	public void example2() {
		// 4행 4열 int형 2차원 배열을 선언 및 할당하고
		// 각 인덱스에 순서대로 1~16까지를 저장하고 출력
		
		int arr[][] = new int[4][4];
		int value = 1; // 1에서 16까지 증하가는 변수
		
		// 행 지정
		for(int i=0; i<arr.length; i++) {
			
			// 열 지정
			for(int j=0; j<arr[i].length; j++) {
				
				// 인데스에 현재 value 대입 후 value 1 증가
				arr[i][j] = value++;
				
				// 대입과 동시에 출력
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println(); // 출력 시 생 구분을 위한 줄 바꿈
		}
	}

	public void example3() {
		// 2차원 배열 선언, 할당, 초기화 동시 진행
		// 1 2 3 
		// 4 5 6
		// 7 8 9
		
		int[][] arr =	{
							{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}
						};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	public void example4() {
		// 가변 배열 : 행의 개수는 정해져 있으나 열의 개수가 정해지지 않은 2차원 배열
		
		// 사변 배열 행만 할당
		int[][] arr = new int[3][];
		
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];
		
		// 각 칸에 1~9까지 수 대입
		int value = 1; // 대입용 변수
		
		// 행의 크기를 지정되어 있으므로 일반적으로 접근 가능
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				
				// 대입과 동시에 출력
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void example5() {
		// 가변 배열 선언, 할당과 동시에 초기화
		
		int[][] arr = 	{
							{1, 2},
							{3},
							{4, 5, 6, 7}
						};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void example6() {
	
	// 다음과 같은 배열 형태로 값을 입력받고 저장하기.
/*
 * 
 * 학생  - 행, 국엉, 영어, 수학 점수 - 열
	1번 학생의 점수
	국어 점수 입력 : 50  
	영어 점수 입력 : 60
	수학 점수 입력 : 70
	합계 : 180
	평균 : 60
	
	2번 학생의 점수
	국어 점수 입력 : 70
	영어 점수 입력 : 80
	수학 점수 입력 : 90
	합계 : 240
	평균 : 80
	
	국어 평균 점수 : 60
	영어 평균 점수 : 70
	수학 평균 점수 : 80
*/

		Scanner sc = new Scanner(System.in);
	
		int[][] arr = new int [2][3];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1 + "번 학생의 점수");
			
			int sum = 0;
			
			for(int j=0; j<arr[i].length; j++) {
				
				String subject = null; // 과목 지정용 변수
				
				switch(j) {
				case 0 : subject = "국어"; break;
				case 1 : subject = "영어"; break;
				case 2 : subject = "수학"; break;
				}
				
				System.out.print(subject + " 점수 입력 : ");
				arr[i][j] = sc.nextInt();
				sc.nextLine();
				sum += arr[i][j]; // 합계 누적
			}
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + sum / arr[i].length);
			System.out.println();
		}
		
		// 과목별 평균점수
		
		// 과목(열) 지정 for문
		for(int j=0; j<arr[0].length; j++) {
			String subject = null;
			
			switch(j){
			case 0: subject = "국어"; break;
			case 1: subject = "영어"; break;
			case 2: subject = "수학"; break;
			}
			
			// 각 과목별 점수 합계 저장을 위한 변수 선언
			int sum=0;
			
			// 학생(행) 지정 for문
			for(int i=0; i<arr.length; i++) {
				sum += arr[i][j];
			}
			System.out.println(subject + "평균 점수 : " + sum / arr.length);	
		}	
	}

	public void example7() {
		// 3행 3열 정수형 2차원 배열에 1~9까지 난수를 중복없이 저장하기
		
		//1) 차원 배열에 1~9까지 난수 중복 없이 저장
		int arr[] = new int[9];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 9 + 1);
			
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// 값저장용 2차원 선언, 할당
		int[][] newArr = new int[3][3];
		
		int index = 0; // 1차원 배열 인덱스 증가용 변수
		
		// 2차원 배열에 값 대입용 for문
		for(int i=0; i<newArr.length; i++) {
			for(int j=0; j<newArr.length; j++) {
				newArr[i][j] = arr[index++];
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}