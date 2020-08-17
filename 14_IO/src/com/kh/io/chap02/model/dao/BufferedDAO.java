package com.kh.io.chap02.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDAO {
	
	/*
	 * BufferedStrea
	 * - 보조스트림의 하나로 일반 기반 스트림의 부족했던 성능을 향상 시켜주는 스트림
	 * 
	 * - 보조스트림은 단독으로 스트림을 생성할 수 없다.
	 * 
	 * - Bufferd 관련 스트림 사용 시 마지막에 꼭 flush() 또는 close()를 수행해야함
	 * 	--> 버퍼에 남아있는 데이터를 정상적으로 출력하기 위해서 반드시 필요함
	 * 
	 */

	// 바이트 기반 스트림을 이용한 파일 복사
	// --> 모든 형태의 파일을 복사할 수 있다.
	// --> 문자 파일 복사 시 바이트 기반이므로 데이터가 손상될 수 있다.
	public int fileCopy(String path, String copyName, String copyPath) {
		
		BufferedInputStream bi = null;
		BufferedOutputStream bo = null;
		
		int result = 0; // 복사 결과를 저장할 변수
		
		try {
			
			// 1) 원본파일을 읽어옴
			bi = new BufferedInputStream(new FileInputStream(path));
			
			// 2) 원본파일에서 확장자를 추출
			String ext = path.substring(path.lastIndexOf("."));
			
			// 3) 복사본을 스트림과 연결
			bo = new BufferedOutputStream
					(new FileOutputStream(copyPath + "/" + copyName + ext));
										// 복사 경로 / 복사파일명 . 확장자
			
			// 4) 원본을 바이트 단위로 읽어 오자 마자
			//		복사본과 연결된 스트림으로 출력하기
			int value = 0;
			
			while((value = bi.read()) != -1) {
				// 읽어온 값이 있다면
				
				bo.write((char)value); // 연결된 파일로 바로 출력
			}
			
			result = 1;
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(bo != null) {
					bo.close();
				}
				
				if(bi != null) {
					bi.close();
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
