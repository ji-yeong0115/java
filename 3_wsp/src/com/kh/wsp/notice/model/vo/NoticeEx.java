package com.kh.wsp.notice.model.vo;

import java.sql.Date;

/**
 * @author user1
 *
 */
public class NoticeEx {
	
	 private int noticeNo;
	 private String noticeTitle;
	 private String noticeContent;
	 private String memberId;
	 private int readCount;
	 private Date noticeCreateDate;
	 private Date noticeModifyDate;
	 private String noticeStatus;
	 
	 public NoticeEx() {
		// TODO Auto-generated constructor stub
	}

	public NoticeEx(int noticeNo, String noticeTitle, String memberId, int readCount,
			Date noticeCreateDate, Date noticeModifyDate, String noticeStatus) {
		super();
		this.noticeNo = noticeNo;
		this.noticeTitle = noticeTitle;
		this.memberId = memberId;
		this.readCount = readCount;
		this.noticeCreateDate = noticeCreateDate;
		this.noticeModifyDate = noticeModifyDate;
		this.noticeStatus = noticeStatus;
	}
	
	public NoticeEx(int noticeNo, String noticeTitle, String memberId, int readCount, Date noticeModifyDate) {
		super();
		this.noticeNo = noticeNo;
		this.noticeTitle = noticeTitle;
		this.memberId = memberId;
		this.readCount = readCount;
		this.noticeModifyDate = noticeModifyDate;
	}
	
	public NoticeEx(String noticeTitle, String noticeContent, String memberId) {
		super();
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
		this.memberId = memberId;
	}
	
	public NoticeEx(int noticeNo, String noticeTitle, String noticeContent, String memberId, int readCount,
			Date noticeModifyDate) {
		super();
		this.noticeNo = noticeNo;
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
		this.memberId = memberId;
		this.readCount = readCount;
		this.noticeModifyDate = noticeModifyDate;
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public Date getNoticeCreateDate() {
		return noticeCreateDate;
	}

	public void setNoticeCreateDate(Date noticeCreateDate) {
		this.noticeCreateDate = noticeCreateDate;
	}

	public Date getNoticeModifyDate() {
		return noticeModifyDate;
	}

	public void setNoticeModifyDate(Date noticeModifyDate) {
		this.noticeModifyDate = noticeModifyDate;
	}

	public String getNoticeStatus() {
		return noticeStatus;
	}

	public void setNoticeStatus(String noticeStatus) {
		this.noticeStatus = noticeStatus;
	}

	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", noticeTitle=" + noticeTitle + ", noticeContent=" + noticeContent
				+ ", memberId=" + memberId + ", readCount=" + readCount + ", noticeCreateDate=" + noticeCreateDate
				+ ", noticeModifyDate=" + noticeModifyDate + ", noticeStatus=" + noticeStatus + "]";
	}
	 
	 
	

}
