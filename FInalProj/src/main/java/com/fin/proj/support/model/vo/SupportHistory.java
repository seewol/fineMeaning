package com.fin.proj.support.model.vo;

import java.sql.Date;

public class SupportHistory {
	private int supportHistoryNo;
	private int UserNo;
	private int supportNo;
	private String supporterName;
	private int supportAmount;
	private Date payDate;
	private String payType;
	private String supporterType;
	private String supportTitle;
	
	public SupportHistory() {}

	public SupportHistory(int supportHistoryNo, int userNo, int supportNo, String supporterName, int supportAmount,
			Date payDate, String payType, String supporterType, String supportTitle) {
		super();
		this.supportHistoryNo = supportHistoryNo;
		UserNo = userNo;
		this.supportNo = supportNo;
		this.supporterName = supporterName;
		this.supportAmount = supportAmount;
		this.payDate = payDate;
		this.payType = payType;
		this.supporterType = supporterType;
		this.supportTitle = supportTitle;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public int getSupportHistoryNo() {
		return supportHistoryNo;
	}

	public void setSupportHistoryNo(int supportHistoryNo) {
		this.supportHistoryNo = supportHistoryNo;
	}

	public int getUserNo() {
		return UserNo;
	}

	public void setUserNo(int userNo) {
		UserNo = userNo;
	}

	public int getSupportNo() {
		return supportNo;
	}

	public void setSupportNo(int supportNo) {
		this.supportNo = supportNo;
	}

	public String getSupporterName() {
		return supporterName;
	}

	public void setSupporterName(String supporterName) {
		this.supporterName = supporterName;
	}

	public int getSupportAmount() {
		return supportAmount;
	}

	public void setSupportAmount(int supportAmount) {
		this.supportAmount = supportAmount;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getSupporterType() {
		return supporterType;
	}

	public void setSupporterType(String supporterType) {
		this.supporterType = supporterType;
	}

	public String getSupportTitle() {
		return supportTitle;
	}

	public void setSupportTitle(String supportTitle) {
		this.supportTitle = supportTitle;
	}

	@Override
	public String toString() {
		return "SupportHistory [supportHistoryNo=" + supportHistoryNo + ", UserNo=" + UserNo + ", supportNo="
				+ supportNo + ", supporterName=" + supporterName + ", supportAmount=" + supportAmount + ", payDate="
				+ payDate + ", payType=" + payType + ", supporterType=" + supporterType + ", supportTitle="
				+ supportTitle + "]";
	}
	 
	 
	

	
	
	
}