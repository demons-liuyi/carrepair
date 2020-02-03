package com.accp.domain;

import java.util.Date;

public class Completed {
    private Integer id;

    private Integer yesorno;

    private Date predicttime;

    private Date nowtime;

    private String reason;

    private Integer workid;

    private Integer dutyid;

    private Float price;

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

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public Integer getDutyid() {
        return dutyid;
    }

    public void setDutyid(Integer dutyid) {
        this.dutyid = dutyid;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}