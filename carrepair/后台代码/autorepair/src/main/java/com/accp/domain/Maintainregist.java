package com.accp.domain;

import java.util.Date;

public class Maintainregist {
    private Integer id;

    private String maintainname;

    private Float mileage;

    private Date mileagedate;

    private String remark;

    private Float sjmileage;

    private Date sjmileagedate;

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
}