package com.kh.book.model.vo;

public class ApplyBook {
	
	private String applyBName;
	private String applyWriter;
	
	public ApplyBook() {
		// TODO Auto-generated constructor stub
	}

	public ApplyBook(String applyBName, String applyWriter) {
		super();
		this.applyBName = applyBName;
		this.applyWriter = applyWriter;
	}

	public String getApplyBName() {
		return applyBName;
	}

	public void setApplyBName(String applyBName) {
		this.applyBName = applyBName;
	}

	public String getApplyWriter() {
		return applyWriter;
	}

	public void setApplyWriter(String applyWriter) {
		this.applyWriter = applyWriter;
	}

	@Override
	public String toString() {
		return "ApplyBook [applyBName=" + applyBName + ", applyWriter=" + applyWriter + "]";
	}
	
	
}
