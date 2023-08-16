package com.fin.proj.support.model.vo;

import java.sql.Date;

public class SupportHistory {
	private int supportHistoryNo;
	private Integer userNo;
	private int supportNo;
	private String supporterName;
	private int supportAmount;
	private Date payDate;
	private String payDateTime;
	private String payType;
	private String supporterType;
	private String supportTitle;
	private String category;
	
	public SupportHistory() {}

	public SupportHistory(int supportHistoryNo, Integer userNo, int supportNo, String supporterName, int supportAmount,
			Date payDate, String payDateTime, String payType, String supporterType, String supportTitle,
			String category) {
		super();
		this.supportHistoryNo = supportHistoryNo;
		this.userNo = userNo;
		this.supportNo = supportNo;
		this.supporterName = supporterName;
		this.supportAmount = supportAmount;
		this.payDate = payDate;
		this.payDateTime = payDateTime;
		this.payType = payType;
		this.supporterType = supporterType;
		this.supportTitle = supportTitle;
		this.category = category;
	}

	public int getSupportHistoryNo() {
		return supportHistoryNo;
	}

	public void setSupportHistoryNo(int supportHistoryNo) {
		this.supportHistoryNo = supportHistoryNo;
	}

	public Integer getUserNo() {
		return userNo;
	}

	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
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

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public String getPayDateTime() {
		return payDateTime;
	}

	public void setPayDateTime(String payDateTime) {
		this.payDateTime = payDateTime;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "SupportHistory [supportHistoryNo=" + supportHistoryNo + ", userNo=" + userNo + ", supportNo="
				+ supportNo + ", supporterName=" + supporterName + ", supportAmount=" + supportAmount + ", payDate="
				+ payDate + ", payDateTime=" + payDateTime + ", payType=" + payType + ", supporterType=" + supporterType
				+ ", supportTitle=" + supportTitle + ", category=" + category + "]";
	}
	
	

}