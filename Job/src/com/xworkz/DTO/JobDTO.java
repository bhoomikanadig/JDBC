package com.xworkz.DTO;

import com.xworkz.constant.Designation;
import com.xworkz.constant.Qualification;


public class JobDTO {
	
	private Integer jid;
	private Designation designation=Designation.DEFAULT;
	private Double annualPackage;
	private Qualification qualification=Qualification.DEFAULT;
	private Double percentage;
	private String fresher;
	
	public JobDTO(Integer jid, Designation designation, Double annualPackage, Qualification qualification,
			Double percentage, String fresher) {
		super();
		this.jid = jid;
		this.designation = designation;
		this.annualPackage = annualPackage;
		this.qualification = qualification;
		this.percentage = percentage;
		this.fresher = fresher;
	}
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public Double getAnnualPackage() {
		return annualPackage;
	}
	public void setAnnualPackage(Double annualPackage) {
		this.annualPackage = annualPackage;
	}
	public Qualification getQualification() {
		return qualification;
	}
	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public String getFresher() {
		return fresher;
	}
	public void setFresher(String fresher) {
		this.fresher = fresher;
	}
	@Override
	public String toString() {
		return "JobDTO [jid=" + jid + ", designation=" + designation + ", annualPackage=" + annualPackage
				+ ", qualification=" + qualification + ", percentage=" + percentage + ", fresher=" + fresher + "]";
	}
	
	

		
	
}
