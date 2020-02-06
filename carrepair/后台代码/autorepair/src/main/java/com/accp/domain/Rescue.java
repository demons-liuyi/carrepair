package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Rescue {
    private String number;

    private Integer carinfoid;

    private String staffno;

    private Integer rescueteamid;

    private String type;

    private String worktimes;

    private String getman;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date workdate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date nowdate;

    private String address;

    private String car;

    private Float liche;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date worktime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date overtime;

    private String rescueaddress;

    private String setter;

    private String company;

    private Float price;

    private String remark;

    private String state;

    private String fault;

    private String faultreasult;

    private String status;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date ordertime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date stockdater;

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

    public Integer getRescueteamid() {
        return rescueteamid;
    }

    public void setRescueteamid(Integer rescueteamid) {
        this.rescueteamid = rescueteamid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWorktimes() {
        return worktimes;
    }

    public void setWorktimes(String worktimes) {
        this.worktimes = worktimes;
    }

    public String getGetman() {
        return getman;
    }

    public void setGetman(String getman) {
        this.getman = getman;
    }

    public Date getWorkdate() {
        return workdate;
    }

    public void setWorkdate(Date workdate) {
        this.workdate = workdate;
    }

    public Date getNowdate() {
        return nowdate;
    }

    public void setNowdate(Date nowdate) {
        this.nowdate = nowdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public Float getLiche() {
        return liche;
    }

    public void setLiche(Float liche) {
        this.liche = liche;
    }

    public Date getWorktime() {
        return worktime;
    }

    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }

    public Date getOvertime() {
        return overtime;
    }

    public void setOvertime(Date overtime) {
        this.overtime = overtime;
    }

    public String getRescueaddress() {
        return rescueaddress;
    }

    public void setRescueaddress(String rescueaddress) {
        this.rescueaddress = rescueaddress;
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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