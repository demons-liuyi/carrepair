package com.accp.domain;

import java.util.Date;

public class Repair {
    private String number;

    private Integer carinfoid;

    private Integer counselorid;

    private String oil;

    private String type;

    private String worktime;

    private String getman;

    private Date overworkdate;

    private Date nowworkdate;

    private String setter;

    private String company;

    private Date befor;

    private Float price;

    private String remark;

    private String state;

    private String fault;

    private String faultreasult;

    private String status;

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

    public Integer getCounselorid() {
        return counselorid;
    }

    public void setCounselorid(Integer counselorid) {
        this.counselorid = counselorid;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public String getGetman() {
        return getman;
    }

    public void setGetman(String getman) {
        this.getman = getman;
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
}