package com.cg.pms.in.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pension_details")
public class PensionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pensionId;
	
	@Column
	private Double amount;
	
	@Column
	private Double charges;
	
	@Column
	private String bankType;
	
	@Column
	private int statusCode;

	public PensionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PensionDetails(Integer pensionId, Double amount, Double charges, String bankType, int statusCode) {
		super();
		this.pensionId = pensionId;
		this.amount = amount;
		this.charges = charges;
		this.bankType = bankType;
		this.statusCode = statusCode;
	}

	public Integer getPensionId() {
		return pensionId;
	}

	public void setPensionId(Integer pensionId) {
		this.pensionId = pensionId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getCharges() {
		return charges;
	}

	public void setCharges(Double charges) {
		this.charges = charges;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "PensionDetails [pensionId=" + pensionId + ", amount=" + amount + ", charges=" + charges + ", bankType="
				+ bankType + ", statusCode=" + statusCode + "]";
	}
	
	
	
}
