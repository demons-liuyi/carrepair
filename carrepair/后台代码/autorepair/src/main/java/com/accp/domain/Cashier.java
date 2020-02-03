package com.accp.domain;

import java.util.Date;

public class Cashier {
    private Integer id;

    private Float totalnum;

    private String cashierstatic;

    private String paymenttype;

    private String invoiceno;

    private Date cashiertime;

    private String staffid;

    private Float oncredit;

    private Float interior;

    private String clientid;

    private Float change;

    private String number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTotalnum() {
        return totalnum;
    }

    public void setTotalnum(Float totalnum) {
        this.totalnum = totalnum;
    }

    public String getCashierstatic() {
        return cashierstatic;
    }

    public void setCashierstatic(String cashierstatic) {
        this.cashierstatic = cashierstatic;
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    public Date getCashiertime() {
        return cashiertime;
    }

    public void setCashiertime(Date cashiertime) {
        this.cashiertime = cashiertime;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public Float getOncredit() {
        return oncredit;
    }

    public void setOncredit(Float oncredit) {
        this.oncredit = oncredit;
    }

    public Float getInterior() {
        return interior;
    }

    public void setInterior(Float interior) {
        this.interior = interior;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public Float getChange() {
        return change;
    }

    public void setChange(Float change) {
        this.change = change;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}