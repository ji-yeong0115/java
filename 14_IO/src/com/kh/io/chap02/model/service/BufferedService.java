package com.kh.io.chap02.model.service;

import java.io.File;

import com.kh.io.chap02.model.dao.BufferedDAO;

public class BufferedService {
	
	private BufferedDAO dao = new BufferedDAO();
	private String copyPath = "copy";

	public int fileCopy(String path, String copyName) {
		
		File folder = new File(copyPath);
		
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		return dao.fileCopy(path, copyName, copyPath);
	}

}
