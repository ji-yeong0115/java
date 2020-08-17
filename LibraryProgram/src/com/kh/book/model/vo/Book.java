package com.kh.book.model.vo;

public class Book {
	
	private String bCode;
	private String bName;
	private String writer;
	private char loan;
	
	public Book() {
		
	}

	public Book(String bCode, String bName, String writer, char loan) {
		super();
		this.bCode = bCode;
		this.bName = bName;
		this.writer = writer;
		this.loan = loan;
	}

	
	
	public Book(String bName, String writer) {
		super();
		this.bName = bName;
		this.writer = writer;
	}

	public String getbCode() {
		return bCode;
	}

	public void setbCode(String bCode) {
		this.bCode = bCode;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public char getLoan() {
		return loan;
	}

	public void setLoan(char loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Book [bCode=" + bCode + ", bName=" + bName + ", writer=" + writer + ", loan=" + loan + "]";
	}
	
	

}
