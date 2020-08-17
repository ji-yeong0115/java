package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length-i;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		
		String[] sArr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(sArr[1]);
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] cArr = new char [str.length()];
		
		for(int i=0; i<cArr.length; i++) {
			cArr[i] = str.charAt(i);
		}
		
		int count=0;
		
		System.out.printf("%s에 %c가 존재하는 위치 (인덱스) : ",str,ch);
		
		for(int i=0; i<cArr.length; i++) {
			if(cArr[i]==ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.printf("%c의 개수 : %d", ch, count);
	}
	
	public void practice6() {
		
		String[] sArr = {"월", "화", "수", "목", "금", "토", "일"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0~6 사이 숫자 입력 : ");
		int input = sc.nextInt();
		
		if(input>=0 && input<=6) {
				System.out.println(sArr[input] + "요일");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			int input = sc.nextInt();
			sum+=input;
			arr[i]=input;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
		
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수 : ");
			int size = sc.nextInt();
			
			if(size>=3 && size%2==1) {
				int[] arr = new int[size];
				int count=0;
				
				for(int i=0; i<arr.length; i++) {
					if(i<=arr.length/2) {
						count++;
					}else {
						count--;
					}
					arr[i]=count;
					System.out.print(arr[i] + " ");
				}break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
		
	}

	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] chicken = {"양념", "후라이드", "간장"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.nextLine();
		
		boolean flag = false;
		
		for(int i=0; i<chicken.length; i++) {
			if(chicken[i].equals(menu)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println(menu + "치킨 배달 가능");
		}else {
			System.out.println(menu + "치킨은 없는 메뉴입니다.");
		}
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		char[] origin = new char[str.length()];
		
		for(int i=0; i<origin.length; i++) {
			origin[i] = str.charAt(i);
		}
		
		char[] copy = new char[origin.length];
		
		for(int i=0; i<copy.length; i++) {
			if(i<8) {
				copy[i] = origin[i];
			}else {
				copy[i]='*';
			}
		}
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]);
		}	
	}
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		
		int[] arr = new int[10];
		
		int max=0;
		int min=10;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	public void practice13() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
				
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice14() {
		
		int[] lotto = new int[6];
		
		for(int i =0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			for(int j=0; i<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int tmp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=tmp;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice15() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print("문자열에 있는 문자 : ");
		boolean flag = true;
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				if(i==0) {
					System.out.print(arr[i]);
				}else {
					System.out.print(", " + arr[i]);
				}
				count++;
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
	}
	
	public void practice16() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print( (i+1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("값을 더 입력하시겠습니까?(y/n) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch=='y' || ch== 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine();
				
				String[] newArr = new String[arr.length+addSize];
				
				for(int i=0; i<newArr.length; i++) {
					if(i<arr.length) {
						newArr[i] = arr[i];
					}else {
						System.out.print( (i+1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				arr = newArr;
			}else if(ch == 'n' || ch == 'N') {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
