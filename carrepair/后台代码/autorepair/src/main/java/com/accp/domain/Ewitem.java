package com.accp.domain;

public class Ewitem {
    private Integer id;

    private String name;

    private String pricetype;

    private Float price;

    private String remark;

    private Integer rescueid;

    private Integer repairid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPricetype() {
        return pricetype;
    }

    public void setPricetype(String pricetype) {
        this.pricetype = pricetype;
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

    public Integer getRescueid() {
        return rescueid;
    }

    public void setRescueid(Integer rescueid) {
        this.rescueid = rescueid;
    }

    public Integer getRepairid() {
        return repairid;
    }

    public void setRepairid(Integer repairid) {
        this.repairid = repairid;
    }
}