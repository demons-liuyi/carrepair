package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Maintainregist {
    private Integer id;

    private String maintainname;

    private Float mileage;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date mileagedate;

    private String remark;

    private Float sjmileage;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date sjmileagedate;

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

    public String getMaintainname() {
        return maintainname;
    }

    public void setMaintainname(String maintainname) {
        this.maintainname = maintainname;
    }

    public Float getMileage() {
        return mileage;
    }

    public void setMileage(Float mileage) {
        this.mileage = mileage;
    }

    public Date getMileagedate() {
        return mileagedate;
    }

    public void setMileagedate(Date mileagedate) {
        this.mileagedate = mileagedate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Float getSjmileage() {
        return sjmileage;
    }

    public void setSjmileage(Float sjmileage) {
        this.sjmileage = sjmileage;
    }

    public Date getSjmileagedate() {
        return sjmileagedate;
    }

    public void setSjmileagedate(Date sjmileagedate) {
        this.sjmileagedate = sjmileagedate;
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