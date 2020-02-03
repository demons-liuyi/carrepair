package com.accp.domain;

import java.util.Date;

public class Work {
    private Integer id;

    private Integer instationwhite;

    private Integer instationblack;

    private Integer outsidewhite;

    private Integer outsideblack;

    private Date worktime;

    private Integer artisanclassid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstationwhite() {
        return instationwhite;
    }

    public void setInstationwhite(Integer instationwhite) {
        this.instationwhite = instationwhite;
    }

    public Integer getInstationblack() {
        return instationblack;
    }

    public void setInstationblack(Integer instationblack) {
        this.instationblack = instationblack;
    }

    public Integer getOutsidewhite() {
        return outsidewhite;
    }

    public void setOutsidewhite(Integer outsidewhite) {
        this.outsidewhite = outsidewhite;
    }

    public Integer getOutsideblack() {
        return outsideblack;
    }

    public void setOutsideblack(Integer outsideblack) {
        this.outsideblack = outsideblack;
    }

    public Date getWorktime() {
        return worktime;
    }

    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }

    public Integer getArtisanclassid() {
        return artisanclassid;
    }

    public void setArtisanclassid(Integer artisanclassid) {
        this.artisanclassid = artisanclassid;
    }
}