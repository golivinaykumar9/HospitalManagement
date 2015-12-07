package com.hospitalManagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="HMS_DOCT_MASTER")
public class HmsDoctMaster {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer DOC_CODE;
	
	
	@Column(name="DOC_NAME", nullable=true)
	@Size(max = 100)
	private String docName;
	
	
	@Column(name="DOC_QUAL", nullable=true)
	@Size(max = 500)
	private String docQual;
	
	
	@Column(name="DOC_DESIG", nullable=true)
	@Size(max = 60)
	private String docDesig;
	
	
	@Column(name="DOC_TYPE", nullable=true)
	@Size(max = 20)
	private String docType;
	
	
	@Column(name="DOC_SPEC", nullable=true)
	@Size(max = 50)
	private String docSpec;
	
	
	@Column(name="DEPT_CODE", nullable=true, length=11)
	private int deptCode;
	
	
	@Column(name="DOC_ADDR", nullable=true)
	@Size(max = 200)
	private String docAddr;
	
	
	@Column(name="PHONE_OFF", nullable=true)
	@Size(max = 15)
	private String phoneOff;
	
	
	@Column(name="PHONE_RES", nullable=true)
	@Size(max = 15)
	private String phoneRes;
	
	
	@Column(name="DOC_IP_FEES", nullable=true, columnDefinition="Decimal(7,2) default '100.00'")
	private float docIpFees;
	
	
	@Column(name="DOC_OP_FEES", nullable=true, columnDefinition="Decimal(7,2) default '100.00'")
	private float docOpFees;
	
	
	@Column(name="CURRENTDATE", nullable=true)
	private Date currentDate;
	
	@Column(name="AUTH_BY", nullable=true)
	@Size( max = 50)
	private String authBy;

	public Integer getDOC_CODE() {
		return DOC_CODE;
	}

	public void setDOC_CODE(Integer dOC_CODE) {
		DOC_CODE = dOC_CODE;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocQual() {
		return docQual;
	}

	public void setDocQual(String docQual) {
		this.docQual = docQual;
	}

	public String getDocDesig() {
		return docDesig;
	}

	public void setDocDesig(String docDesig) {
		this.docDesig = docDesig;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getDocSpec() {
		return docSpec;
	}

	public void setDocSpec(String docSpec) {
		this.docSpec = docSpec;
	}

	public int getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(int deptCode) {
		this.deptCode = deptCode;
	}

	public String getDocAddr() {
		return docAddr;
	}

	public void setDocAddr(String docAddr) {
		this.docAddr = docAddr;
	}

	public String getPhoneOff() {
		return phoneOff;
	}

	public void setPhoneOff(String phoneOff) {
		this.phoneOff = phoneOff;
	}

	public String getPhoneRes() {
		return phoneRes;
	}

	public void setPhoneRes(String phoneRes) {
		this.phoneRes = phoneRes;
	}

	public float getDocIpFees() {
		return docIpFees;
	}

	public void setDocIpFees(float docIpFees) {
		this.docIpFees = docIpFees;
	}

	public float getDocOpFees() {
		return docOpFees;
	}

	public void setDocOpFees(float docOpFees) {
		this.docOpFees = docOpFees;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public String getAuthBy() {
		return authBy;
	}

	public void setAuthBy(String authBy) {
		this.authBy = authBy;
	}
	
	
	
	
	

}
