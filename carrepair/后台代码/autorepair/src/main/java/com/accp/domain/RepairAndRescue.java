package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RepairAndRescue {
	private String clientname;
	private String carNumber;
	private String phone;
	private String tname;
	private String number;
	private String type;
	private String status;
	private Float price;
	private String getman;
	private String name;
    private Integer carinfoid;

    private String staffno;
    private String clienttype;

    public String getClienttype() {
		return clienttype;
	}
	public void setClienttype(String clienttype) {
		this.clienttype = clienttype;
	}
	private String oil;

  

    public Integer getCarinfoid() {
		return carinfoid;
	}
	public void setCarinfoid(Integer carinfoid) {
		this.carinfoid = carinfoid;
	}
	public String getStaffno() {
		return staffno;
	}
	public void setStaffno(String staffno) {
		this.staffno = staffno;
	}
	public String getOil() {
		return oil;
	}
	public void setOil(String oil) {
		this.oil = oil;
	}
	public String getWorktime() {
		return worktime;
	}
	public void setWorktime(String worktime) {
		this.worktime = worktime;
	}
	public Date getOverworkdate() {
		return overworkdate;
	}
	public void setOverworkdate(Date overworkdate) {
		this.overworkdate = overworkdate;
	}
	public Date getNowworkdate() {
		return nowworkdate;
	}
	public void setNowworkdate(Date nowworkdate) {
		this.nowworkdate = nowworkdate;
	}
	public String getSetter() {
		return setter;
	}
	public void setSetter(String setter) {
		this.setter = setter;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Date getBefor() {
		return befor;
	}
	public void setBefor(Date befor) {
		this.befor = befor;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getFault() {
		return fault;
	}
	public void setFault(String fault) {
		this.fault = fault;
	}
	public String getFaultreasult() {
		return faultreasult;
	}
	public void setFaultreasult(String faultreasult) {
		this.faultreasult = faultreasult;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public Date getStockdater() {
		return stockdater;
	}
	public void setStockdater(Date stockdater) {
		this.stockdater = stockdater;
	}
	private String worktime;

  

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date overworkdate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date nowworkdate;

    private String setter;

    private String company;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date befor;

 

    private String remark;

    private String state;

    private String fault;

    private String faultreasult;



    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date ordertime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date stockdater;
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getGetman() {
		return getman;
	}
	public void setGetman(String getman) {
		this.getman = getman;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	

}
