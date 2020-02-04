package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Invoice {
    private String invoiceno;

    private Float money;

    private String invoicetype;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date invoicedate;

    private String otherone;

    private String othertwo;

    private String otherthree;

    private String otherfour;

    private String otherfive;

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
    }

    public Date getInvoicedate() {
        return invoicedate;
    }

    public void setInvoicedate(Date invoicedate) {
        this.invoicedate = invoicedate;
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