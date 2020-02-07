package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Artisan {
    private String artisanno;

    private String artisanname;

    private String sex;

    private Integer artisanclassid;

    private String phone;

    private String account;

    private String address;
  
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String wechat;

    private String idcardno;

    private String residence;

    private String bank;

    private String bankaccount;

    private Integer artisanlevelid;

    private Integer groupleader;

    private String maintaintype;

    private String maintainbrand;

    private String otherone;

    private String othertwo;

    private String otherthree;

    private String otherfour;

    private String otherfive;

    public String getArtisanno() {
        return artisanno;
    }

    public void setArtisanno(String artisanno) {
        this.artisanno = artisanno;
    }

    public String getArtisanname() {
        return artisanname;
    }

    public void setArtisanname(String artisanname) {
        this.artisanname = artisanname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getArtisanclassid() {
        return artisanclassid;
    }

    public void setArtisanclassid(Integer artisanclassid) {
        this.artisanclassid = artisanclassid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public Integer getArtisanlevelid() {
        return artisanlevelid;
    }

    public void setArtisanlevelid(Integer artisanlevelid) {
        this.artisanlevelid = artisanlevelid;
    }

    public Integer getGroupleader() {
        return groupleader;
    }

    public void setGroupleader(Integer groupleader) {
        this.groupleader = groupleader;
    }

    public String getMaintaintype() {
        return maintaintype;
    }

    public void setMaintaintype(String maintaintype) {
        this.maintaintype = maintaintype;
    }

    public String getMaintainbrand() {
        return maintainbrand;
    }

    public void setMaintainbrand(String maintainbrand) {
        this.maintainbrand = maintainbrand;
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