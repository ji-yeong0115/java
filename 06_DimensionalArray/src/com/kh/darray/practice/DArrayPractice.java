package com.kh.darray.practice;

import java.util.Scanner;

public class DArrayPractice {
	
	public void practice1() {
		
		int[][] arr = new int[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}System.out.println();
		}
		
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		
		int index=1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = index++;
				System.out.printf("%3d", arr[i][j]);
			}System.out.println();
		}
	}
	
	public void practice3() {
		int[][] arr = new int[4][4];
		
		int index=16;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = index--;
				System.out.printf("%3d", arr[i][j]);
			}System.out.println();
		}
	}
	
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		int rowLastIndex = arr.length-1;
		int colLastIndex = arr[0].length-1;
		
		for(int i=0; i<rowLastIndex; i++) {
			for(int j=0; j<colLastIndex; j++) {
				arr[i][j] = (int)(Math.random() * 10 + 1);
				
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
				
				if(i==rowLastIndex || j==colLastIndex) {
					arr[rowLastIndex][colLastIndex] += arr[i][j];
				}
			}System.out.println();
		}
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("행 크기 : ");
			int row = sc.nextInt();
			
			System.out.print("열 크기 : ");
			int col = sc.nextInt();
			
			if(row>=1 && row<=10 && col>=1 && col<=10) {
				
				char[][] arr = new char[row][col];
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length; j++) {
						arr[i][j] = (char)(Math.random() * 26 + 65);
						System.out.printf("%2c", arr[i][j]);
					}System.out.println();
				}break;
			}else {
				System.out.println("1~10까지의 정수를 입력해 주세요.");
			}
		}
		
	}
	
	public void practice6() {
		String[][] strArr = new String[][]
				{
			{"이", "까", "왔", "앞", "힘"},
			{"차", "지", "습", "으", "냅"},
			{"원", "열", "니", "로", "시"},
			{"배", "심", "다", "좀", "다"},
			{"열", "히", " !", "더", " !!"}
				};
				
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				System.out.printf("%2s", strArr[j][i]);
			}System.out.println();
		}
				
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		char[][] arr = new char[row][];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "열의 크기 : ");
			int col = sc.nextInt();
			
			arr[i] = new char[col];
			
		}
		
		char ch ='a';
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ch++;
				System.out.printf("%2c", arr[i][j]);
			}System.out.println();
		}
		
		
	}

}
