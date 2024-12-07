package com.his.dto;

import java.time.LocalDate;

public class BenefitDTO {
	private Integer benefitId;
	private String planName;
	private String planStatus;
	private LocalDate startDate;
	private LocalDate endDate;
	private Integer benefitAmount;
	private Integer acc_number;
	private LocalDate transDate;
	private LocalDate transStatus;
	private Integer appNumber;
	public Integer getBenefitId() {
		return benefitId;
	}
	public void setBenefitId(Integer benefitId) {
		this.benefitId = benefitId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public Integer getBenefitAmount() {
		return benefitAmount;
	}
	public void setBenefitAmount(Integer benefitAmount) {
		this.benefitAmount = benefitAmount;
	}
	public Integer getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(Integer acc_number) {
		this.acc_number = acc_number;
	}
	public LocalDate getTransDate() {
		return transDate;
	}
	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}
	public LocalDate getTransStatus() {
		return transStatus;
	}
	public void setTransStatus(LocalDate transStatus) {
		this.transStatus = transStatus;
	}
	public Integer getAppNumber() {
		return appNumber;
	}
	public void setAppNumber(Integer appNumber) {
		this.appNumber = appNumber;
	}
	
}
