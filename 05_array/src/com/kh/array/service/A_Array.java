package com.kh.array.service;
import java.util.Scanner;

public class A_Array {
	// 배열 
	// - 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	// - 저장된 값마다 인텍스가 지정됨 (인덱스 시작은 0)
	
	public void example1() {
		// 배열의 필요성 파악
		
		// 같은 자료형인 변수가 여러개 필요한 경우 변수 선언 방법으로는 한계가 있음
	/*	int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
	 	...
		int num1000 = 0;
	*/
		// 배열을 이용하여 선언, 할당, 초기화
		
		// 1. 배열 선언 ([ ] == 배열을 나타내는 기호)
		// 자료형 [ ] 변수명; ( == 변수명)
		// 자료형 배열명[ ];
		
		// int형 배열 참조 변수 선언
		// * 배열을 선언한 변수는 참조형!! *
		int[] arr;
		
		// 2. 배열할당 (할당 : 메모리상에 데이터 저장 공간을 확보하는 것)
		// 배열명 = new 자료형 [배열크기 == 배열의 칸 수];
		
		// ** new 연산자 **
		// - "Heap 영억에 새로운 공간을 할당한다." 라는 의미
		arr = new int[4]; // 메모리 구조 그림 참고
		
		
		// 3. 배열 초기화
		// 배열명[인덱스] = 값;
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		// arr[4] = 50; -> 에러 발생 : 할당된 배열의 크기를 벗어남
		
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		
		// int형 배열 선언 및 4칸 할당
		int arr2[] = new int [4];
		
		// i = index
		// 배열명.length : 배열의 길이 반환
		for(int i=0; i<arr2.length; i++) {
			// 0애서 4미만까지 1씩 증가
			
			arr2[i] = (i+1) * 5;
		}
		
		// for문으로 배열 값 모두 출력
		for(int i=0; i<arr2.length; i++) {
			
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}	
	}

	public void example2() {
		// double형 배열 dArr 선언 및 5칸을 할당하고, 각 index에 1.0 부터 1씩 증가하는 값을 대입하고 출력
		
		double dArr[] = new double [5];
		
		for(int i=0; i<dArr.length; i++) {
			
			dArr[i] = i + 1.0;
		}
		
		for(int i=0; i<dArr.length; i++) {
			
			System.out.println("dArr[" + i + "] = " + dArr[i]);
		}
	}

	public void example3() {
		// int형 배열 iArr 선언 및 배열의 칸수를 사용자로 부터 입력받아 배열 할당
		// 각 인덱스에 저장될 값을 각각 입력 받아 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		int iArr[];
		System.out.print("배열 칸 수: ");
		int size = sc.nextInt();
		sc.nextLine();
		
		// 입력된 크기만큼의 배열 할당
		iArr = new int[size];
		
		for(int i=0; i<iArr.length; i++) {
			
			// 각각의 인덱스에 입력한 값을 저장
			System.out.print("iArr[" + i + "] = ");
			iArr[i] = sc.nextInt();
			sc.nextLine();
		}
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println("iArr[" + i + "]에 저장된 값 : " + iArr[i]);
		}
	}

	public void example4() {
		// 배열 선언, 할당, 초기화 한 번에 하기
		
		// int형 배열 arr 선언 및 5칸 할당 후 1, 2, 3, 4, 5를 각각의 인덱스에 저장하기
		// 배열 선언 = 배열 할당 및 초기화
		int arr[] = {1, 2, 3, 4, 5};
		
		// 배열 할당 확인
		System.out.println("arr 배열의 길이 : " + arr.length);
		
		// 배열 초기화 확인
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}

	public void example5() {
		// 5명의 키 정보를 입력받아 배열에 저장하고, 키 평균값을 출력
		
		Scanner sc = new Scanner(System.in);
		double heights[] = new double[5]; // double형 배열 heights 선언 및 할당
		
		// 5명 입력 -> 반복문(for문)
		// 평균 == 합계/인원 수
		// 합계 --> sum을 이용해 누적
		
		for(int i=0; i<heights.length; i++) {
			System.out.print(i+1 + "번째 입력 : ");
			heights[i] = sc.nextDouble();
			sc.hasNextLine();
		}
		
		// 합계 구하기
		double sum=0;
		for(int i=0; i<heights.length; i++) {
			sum+=heights[i];
		}
		
		System.out.println("평균 : " + sum / heights.length);
		
	}
	
	public void example6() {
		// 배열의 단점
		// 1) 한 가지 자료형만 저장할 수 있다.
		// 2) 한 번 만들어진 배열을 크기 변경이 불가능하다.
		
		// 입력 받은 크기 만큼의 배열 할당하기
		Scanner sc = new Scanner(System.in);
		System.out.print("크기 입력 : ");
		int size = sc.nextInt();
		
		// 입력받은 값 만큼의 크기를 가지는 배열 선언 및 할당
		int arr[] = new int[size];
		
		// 배열 할당 시 int형 기본 값으로 초기화 되어있는지 확인
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		// 지정된 크기를 넘어선 위치(인덱스)에 접근 시 어떻게 되는지 확인
		//arr[size] = 3; 에러 발생
		// ArrayIndexOutOfBoundsException : 배열의 인덱스 범위를 넘어섰기 때문에 에러 발생
				
		// 기존 배열보다 2배 큰 배열을 새롭게 할당하여 
		// arr 변수가 참조할 수 있게 코드 작성
			
		arr = new int[size*2];
		System.out.println("늘어난 배열 길이 : " + arr.length);
		System.out.println("arr[size] : " + arr[size]);
			
		}
	}

	public void example7() {
		// 입력받은 문자열을 char형 배열에 한 글자씩 저장하기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		
		// String(문자열)의 길이 만큼의 char 배열 선언 및 할당
		// 배열의 길이 : 배열명.length (변수)
		// 문자열의 길이 : 변수명.length() (메소드)
		char cArr[] = new char[input.length()];
		
		for(int i=0; i<cArr.length; i++) {
			
			// 순차적으로 접근한다.
			cArr[i] = input.charAt(i);
			
			System.out.println("cArr " + i + " 인덱스 값 : " + cArr[i]);
		}
		
		// 배열 내에서 원하는 문자가 존재하는 인덱스 모두 출력하기
		System.out.print("찾으려는 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		for(int i=0; i<cArr.length; i++) {
			if(cArr[i] == ch) {
				System.out.println(i);
			}
		}
	}

	public void example8() {
		//String 배열의 메모리 구조
		
		// String 배열 선언, 할당, 초기화
		
		String sArr[] = {"백반", "짜장면", "서브웨이", "도시락"};
		
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
	}

	public void example9() {
		// 메뉴가 입력되어 String 배열 선언 및 초기화 후
		// 난수(임의의 수)를 발생시켜 메뉴를 하나 선정하기
		
		String menu[] = {"백반", "롯데리아", "버블티", "칼국수", "돈까스"};
		
		// 난수를 발생 시키는 방법 : Math.random()
		// Math 클래스 : 자바에서 제공하는 수학관련 기능이 담겨있는 클래스
		// Math.random()이 발생시키는 난수의 범위 : 0 <= x < 1 (double형)
		
		double ran = Math.random();
		
		// 0 <= x < 1의 범위를 0 <= x <5로 범위를 변경할 수 있게 수식 추가
		// + int형으로 형변환(index로 사용하기 위해서)
		int r = (int)(ran * menu.length);
		
		System.out.println("오늘의 점심 메뉴 : " + menu[r]);

	}

	
}
