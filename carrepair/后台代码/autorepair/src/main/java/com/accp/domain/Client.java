package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Client {
	
	private String clienttype;
	
	private String staffname;
	
	private Boolean check;
	
    public String getClienttype() {
		return clienttype;
	}

	public void setClienttype(String clienttype) {
		this.clienttype = clienttype;
	}

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public Boolean getCheck() {
		return check;
	}

	public void setCheck(Boolean check) {
		this.check = check;
	}

	private String number;

    private String name;

    private String linkman;

    private String phone;

    private String address;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date borndate;

    private Integer paymentdays;

    private Integer paymentsize;

    private String staffno;

    private String counselorname;

    private String sheng;

    private String shi;

    private String qv;

    private String remark;

    private String taxpayernumber;

    private String registerphone;

    private String bank;

    private String banknumber;

    private String registeraddress;

    private String other;

    private Integer typeid;

    private String carno;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private Integer integral;

    private Float oncredit;

    private Float deposit;

    private Float petcard;

    private String otherone;

    private String othertwo;

    private String otherthree;

    private String otherfour;

    private String otherfive;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBorndate() {
        return borndate;
    }

    public void setBorndate(Date borndate) {
        this.borndate = borndate;
    }

    public Integer getPaymentdays() {
        return paymentdays;
    }

    public void setPaymentdays(Integer paymentdays) {
        this.paymentdays = paymentdays;
    }

    public Integer getPaymentsize() {
        return paymentsize;
    }

    public void setPaymentsize(Integer paymentsize) {
        this.paymentsize = paymentsize;
    }

    public String getStaffno() {
        return staffno;
    }

    public void setStaffno(String staffno) {
        this.staffno = staffno;
    }

    public String getCounselorname() {
        return counselorname;
    }

    public void setCounselorname(String counselorname) {
        this.counselorname = counselorname;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getQv() {
        return qv;
    }

    public void setQv(String qv) {
        this.qv = qv;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTaxpayernumber() {
        return taxpayernumber;
    }

    public void setTaxpayernumber(String taxpayernumber) {
        this.taxpayernumber = taxpayernumber;
    }

    public String getRegisterphone() {
        return registerphone;
    }

    public void setRegisterphone(String registerphone) {
        this.registerphone = registerphone;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBanknumber() {
        return banknumber;
    }

    public void setBanknumber(String banknumber) {
        this.banknumber = banknumber;
    }

    public String getRegisteraddress() {
        return registeraddress;
    }

    public void setRegisteraddress(String registeraddress) {
        this.registeraddress = registeraddress;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Float getOncredit() {
        return oncredit;
    }

    public void setOncredit(Float oncredit) {
        this.oncredit = oncredit;
    }

    public Float getDeposit() {
        return deposit;
    }

    public void setDeposit(Float deposit) {
        this.deposit = deposit;
    }

    public Float getPetcard() {
        return petcard;
    }

    public void setPetcard(Float petcard) {
        this.petcard = petcard;
    }

    public String getOtherone() {
        return otherone;
    }

    public void setOtherone(String otherone) {
        this.otherone = otherone;
    }

    public String getOthertwo() {
        return othertwo;
    }

    public void setOthertwo(String othertwo) {
        this.othertwo = othertwo;
    }

    public String getOtherthree() {
        return otherthree;
    }

    public void setOtherthree(String otherthree) {
        this.otherthree = otherthree;
    }

    public String getOtherfour() {
        return otherfour;
    }

    public void setOtherfour(String otherfour) {
        this.otherfour = otherfour;
    }

    public String getOtherfive() {
        return otherfive;
    }

    public void setOtherfive(String otherfive) {
        this.otherfive = otherfive;
    }
}