package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class JunGong {
	private String status;
	private String type;
	private String clientname;
	private String carnumber;
	private String number;
	private String tname;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date ordertime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date overworkdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date nowworkdate;	
	private String worktime;
	private String cartypename;
	public String getStatus() {
		return status;
	}
	private String clientType;
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
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
	public String getWorktime() {
		return worktime;
	}
	public void setWorktime(String worktime) {
		this.worktime = worktime;
	}
	public String getCartypename() {
		return cartypename;
	}
	public void setCartypename(String cartypename) {
		this.cartypename = cartypename;
	}
	public String getCarnumber1() {
		return carnumber1;
	}
	public void setCarnumber1(String carnumber1) {
		this.carnumber1 = carnumber1;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getFgreason() {
		return fgreason;
	}
	public void setFgreason(String fgreason) {
		this.fgreason = fgreason;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	private String carnumber1;
	private String reason;
	private Integer count;
	private String fgreason;
	private String name;
	private Float price;
	

}
