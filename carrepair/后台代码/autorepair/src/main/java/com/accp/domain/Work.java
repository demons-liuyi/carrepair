package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Work {
    private Integer id;

    private Integer instationwhite;

    private Integer instationblack;

    private Integer outsidewhite;

    private Integer outsideblack;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date worktime;

    private Integer artisanclassid;

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