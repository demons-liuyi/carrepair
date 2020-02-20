package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ClientAndCar {
	private String name;
	private String address;
	private String carer;
	private String carerphone;
	private String carBrandName;
	private String carTypeName;
	private String engineBrandName;
	private String enginenumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date jqinsurancedate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date maintaindate;
    private Integer integral;
    private Float onCredit;
    private Float deposit;
    private String clientType;
    private Float cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCarer() {
		return carer;
	}
	public void setCarer(String carer) {
		this.carer = carer;
	}

	public String getCarerphone() {
		return carerphone;
	}
	public void setCarerphone(String carerphone) {
		this.carerphone = carerphone;
	}
	public String getCarBrandName() {
		return carBrandName;
	}
	public void setCarBrandName(String carBrandName) {
		this.carBrandName = carBrandName;
	}
	public String getCarTypeName() {
		return carTypeName;
	}
	public void setCarTypeName(String carTypeName) {
		this.carTypeName = carTypeName;
	}
	public String getEngineBrandName() {
		return engineBrandName;
	}
	public void setEngineBrandName(String engineBrandName) {
		this.engineBrandName = engineBrandName;
	}

	public String getEnginenumber() {
		return enginenumber;
	}
	public void setEnginenumber(String enginenumber) {
		this.enginenumber = enginenumber;
	}
	public Date getJqinsurancedate() {
		return jqinsurancedate;
	}
	private String carnumber;
	
	public String getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}
	public void setJqinsurancedate(Date jqinsurancedate) {
		this.jqinsurancedate = jqinsurancedate;
	}
	public Date getMaintaindate() {
		return maintaindate;
	}
	public void setMaintaindate(Date maintaindate) {
		this.maintaindate = maintaindate;
	}
	public Integer getIntegral() {
		return integral;
	}
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
	public Float getOnCredit() {
		return onCredit;
	}
	public void setOnCredit(Float onCredit) {
		this.onCredit = onCredit;
	}
	public Float getDeposit() {
		return deposit;
	}
	public void setDeposit(Float deposit) {
		this.deposit = deposit;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public Float getCost() {
		return cost;
	}
	public void setCost(Float cost) {
		this.cost = cost;
	}
    

}
