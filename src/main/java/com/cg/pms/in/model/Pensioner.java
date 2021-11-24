package com.cg.pms.in.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pensioner_details")
public class Pensioner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pensionerId;
	
	@Column
	private int age;
	
	@Column(unique=true,nullable=false)
	private int aadhar;
	
	@Column(unique=true,nullable=false)
	private int pan;
	
	@Column
	private String pensionType;
	
	public Pensioner() {
		super();
	}

	

	public Pensioner(int pensionerId, int age, int aadhar, int pan, String pensionType) {
		super();
		this.pensionerId = pensionerId;
		this.age = age;
		this.aadhar = aadhar;
		this.pan = pan;
		this.pensionType = pensionType;
	}



	public int getPensionerId() {
		return pensionerId;
	}

	public void setPensionerId(int pensionerId) {
		this.pensionerId = pensionerId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAadhar() {
		return aadhar;
	}

	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}

	public int getPan() {
		return pan;
	}

	public void setPan(int pan) {
		this.pan = pan;
	}

	public String getPensionType() {
		return pensionType;
	}

	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}



	@Override
	public String toString() {
		return "Pensioner [pensionerId=" + pensionerId + ", age=" + age + ", aadhar=" + aadhar + ", pan=" + pan
				+ ", pensionType=" + pensionType + "]";
	}
	
}
