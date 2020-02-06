package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Completed {
    private Integer id;

    private Integer yesorno;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date predicttime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date nowtime;

    private String reason;

    private String workid;

    private String dutyid;

    private Float price;

    private String otherone;

    private String othertwo;

    private String otherthree;

    private String otherfour;

    private String otherfive;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYesorno() {
        return yesorno;
    }

    public void setYesorno(Integer yesorno) {
        this.yesorno = yesorno;
    }

    public Date getPredicttime() {
        return predicttime;
    }

    public void setPredicttime(Date predicttime) {
        this.predicttime = predicttime;
    }

    public Date getNowtime() {
        return nowtime;
    }

    public void setNowtime(Date nowtime) {
        this.nowtime = nowtime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid;
    }

    public String getDutyid() {
        return dutyid;
    }

    public void setDutyid(String dutyid) {
        this.dutyid = dutyid;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
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