package com.fin.proj.volunteer.model.vo;

import java.sql.Date;

public class Volunteer {
	private int vNo;
	private int uNo;
	private int vMainCategoryNo;
	private int vSubCategoryNo;
	private int vTargetCategoryNo;
	private String vArea;
	private String vName;
	private String vContent;
	private Date vStartDate;
	private Date vEndDate;
	private String vStartTime;
	private String vEndTime;
	private Date vRecruitmentStartDate;
	private Date vRecruitmentEndDate;
	private String vDay;
	private int vCountAll;
	private int vCount;
	private String vLocation;
	private String vActivityType;
	private Date vCreateDate;
	private char vStatus;
	
	// ▼ 카테고리
	private String vMainCategoryName;
	private String vSubCategoryName;
	private String vTargetCategoryName;
	// ▼ 담당자
	private String chargeName;
	private String chargePhone;
	private String chargeAddress;
	// ▼ 봉사 내역
	private Date vHisDate;
	private String vHisStatus;
	
	public Volunteer() {
		super();
	}
	
	public Volunteer(int vNo, int uNo, int vMainCategoryNo, int vSubCategoryNo, int vTargetCategoryNo, String vArea,
			String vName, String vContent, Date vStartDate, Date vEndDate, String vStartTime, String vEndTime,
			Date vRecruitmentStartDate, Date vRecruitmentEndDate, String vDay, int vCountAll, int vCount,
			String vLocation, String vActivityType, Date vCreateDate, char vStatus, String vMainCategoryName,
			String vSubCategoryName, String vTargetCategoryName, String chargeName, String chargePhone,
			String chargeAddress, Date vHisDate, String vHisStatus) {
		super();
		this.vNo = vNo;
		this.uNo = uNo;
		this.vMainCategoryNo = vMainCategoryNo;
		this.vSubCategoryNo = vSubCategoryNo;
		this.vTargetCategoryNo = vTargetCategoryNo;
		this.vArea = vArea;
		this.vName = vName;
		this.vContent = vContent;
		this.vStartDate = vStartDate;
		this.vEndDate = vEndDate;
		this.vStartTime = vStartTime;
		this.vEndTime = vEndTime;
		this.vRecruitmentStartDate = vRecruitmentStartDate;
		this.vRecruitmentEndDate = vRecruitmentEndDate;
		this.vDay = vDay;
		this.vCountAll = vCountAll;
		this.vCount = vCount;
		this.vLocation = vLocation;
		this.vActivityType = vActivityType;
		this.vCreateDate = vCreateDate;
		this.vStatus = vStatus;
		this.vMainCategoryName = vMainCategoryName;
		this.vSubCategoryName = vSubCategoryName;
		this.vTargetCategoryName = vTargetCategoryName;
		this.chargeName = chargeName;
		this.chargePhone = chargePhone;
		this.chargeAddress = chargeAddress;
		this.vHisDate = vHisDate;
		this.vHisStatus = vHisStatus;
	}

	public int getvNo() {
		return vNo;
	}
	public void setvNo(int vNo) {
		this.vNo = vNo;
	}
	public int getuNo() {
		return uNo;
	}
	public void setuNo(int uNo) {
		this.uNo = uNo;
	}
	public int getvMainCategoryNo() {
		return vMainCategoryNo;
	}
	public void setvMainCategoryNo(int vMainCategoryNo) {
		this.vMainCategoryNo = vMainCategoryNo;
	}
	public int getvSubCategoryNo() {
		return vSubCategoryNo;
	}
	public void setvSubCategoryNo(int vSubCategoryNo) {
		this.vSubCategoryNo = vSubCategoryNo;
	}
	public int getvTargetCategoryNo() {
		return vTargetCategoryNo;
	}
	public void setvTargetCategoryNo(int vTargetCategoryNo) {
		this.vTargetCategoryNo = vTargetCategoryNo;
	}
	public String getvArea() {
		return vArea;
	}
	public void setvArea(String vArea) {
		this.vArea = vArea;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getvContent() {
		return vContent;
	}
	public void setvContent(String vContent) {
		this.vContent = vContent;
	}
	public Date getvStartDate() {
		return vStartDate;
	}
	public void setvStartDate(Date vStartDate) {
		this.vStartDate = vStartDate;
	}
	public Date getvEndDate() {
		return vEndDate;
	}
	public void setvEndDate(Date vEndDate) {
		this.vEndDate = vEndDate;
	}
	public String getvStartTime() {
		return vStartTime;
	}
	public void setvStartTime(String vStartTime) {
		this.vStartTime = vStartTime;
	}
	public String getvEndTime() {
		return vEndTime;
	}
	public void setvEndTime(String vEndTime) {
		this.vEndTime = vEndTime;
	}
	public Date getvRecruitmentStartDate() {
		return vRecruitmentStartDate;
	}
	public void setvRecruitmentStartDate(Date vRecruitmentStartDate) {
		this.vRecruitmentStartDate = vRecruitmentStartDate;
	}
	public Date getvRecruitmentEndDate() {
		return vRecruitmentEndDate;
	}
	public void setvRecruitmentEndDate(Date vRecruitmentEndDate) {
		this.vRecruitmentEndDate = vRecruitmentEndDate;
	}
	public String getvDay() {
		return vDay;
	}
	public void setvDay(String vDay) {
		this.vDay = vDay;
	}
	public int getvCountAll() {
		return vCountAll;
	}
	public void setvCountAll(int vCountAll) {
		this.vCountAll = vCountAll;
	}
	public int getvCount() {
		return vCount;
	}
	public void setvCount(int vCount) {
		this.vCount = vCount;
	}
	public String getvLocation() {
		return vLocation;
	}
	public void setvLocation(String vLocation) {
		this.vLocation = vLocation;
	}
	public String getvActivityType() {
		return vActivityType;
	}
	public void setvActivityType(String vActivityType) {
		this.vActivityType = vActivityType;
	}
	public Date getvCreateDate() {
		return vCreateDate;
	}
	public void setvCreateDate(Date vCreateDate) {
		this.vCreateDate = vCreateDate;
	}
	public char getvStatus() {
		return vStatus;
	}
	public void setvStatus(char vStatus) {
		this.vStatus = vStatus;
	}
	public String getvMainCategoryName() {
		return vMainCategoryName;
	}
	public void setvMainCategoryName(String vMainCategoryName) {
		this.vMainCategoryName = vMainCategoryName;
	}
	public String getvSubCategoryName() {
		return vSubCategoryName;
	}
	public void setvSubCategoryName(String vSubCategoryName) {
		this.vSubCategoryName = vSubCategoryName;
	}
	public String getvTargetCategoryName() {
		return vTargetCategoryName;
	}
	public void setvTargetCategoryName(String vTargetCategoryName) {
		this.vTargetCategoryName = vTargetCategoryName;
	}
	public String getChargeName() {
		return chargeName;
	}
	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}
	public String getChargePhone() {
		return chargePhone;
	}
	public void setChargePhone(String chargePhone) {
		this.chargePhone = chargePhone;
	}
	public String getChargeAddress() {
		return chargeAddress;
	}
	public void setChargeAddress(String chargeAddress) {
		this.chargeAddress = chargeAddress;
	}
	public Date getvHisDate() {
		return vHisDate;
	}
	public void setvHisDate(Date vHisDate) {
		this.vHisDate = vHisDate;
	}
	public String getvHisStatus() {
		return vHisStatus;
	}
	public void setvHisStatus(String vHisStatus) {
		this.vHisStatus = vHisStatus;
	}

	@Override
	public String toString() {
		return "Volunteer [vNo=" + vNo + ", uNo=" + uNo + ", vMainCategoryNo=" + vMainCategoryNo + ", vSubCategoryNo="
				+ vSubCategoryNo + ", vTargetCategoryNo=" + vTargetCategoryNo + ", vArea=" + vArea + ", vName=" + vName
				+ ", vContent=" + vContent + ", vStartDate=" + vStartDate + ", vEndDate=" + vEndDate + ", vStartTime="
				+ vStartTime + ", vEndTime=" + vEndTime + ", vRecruitmentStartDate=" + vRecruitmentStartDate
				+ ", vRecruitmentEndDate=" + vRecruitmentEndDate + ", vDay=" + vDay + ", vCountAll=" + vCountAll
				+ ", vCount=" + vCount + ", vLocation=" + vLocation + ", vActivityType=" + vActivityType
				+ ", vCreateDate=" + vCreateDate + ", vStatus=" + vStatus + ", vMainCategoryName=" + vMainCategoryName
				+ ", vSubCategoryName=" + vSubCategoryName + ", vTargetCategoryName=" + vTargetCategoryName
				+ ", chargeName=" + chargeName + ", chargePhone=" + chargePhone + ", chargeAddress=" + chargeAddress
				+ ", vHisDate=" + vHisDate + ", vHisStatus=" + vHisStatus + "]";
	} 
}
