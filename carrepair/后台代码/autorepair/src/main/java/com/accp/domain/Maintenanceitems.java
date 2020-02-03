package com.accp.domain;

public class Maintenanceitems {
    private Integer id;

    private String itemsname;

    private Integer typeid;

    private String remark;

    private Float normalprice;

    private Float memberprice;

    private Float vipprice;

    private Float negotiatedprice;

    private Float claimprice;

    private Float insuranceprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemsname() {
        return itemsname;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Float getNormalprice() {
        return normalprice;
    }

    public void setNormalprice(Float normalprice) {
        this.normalprice = normalprice;
    }

    public Float getMemberprice() {
        return memberprice;
    }

    public void setMemberprice(Float memberprice) {
        this.memberprice = memberprice;
    }

    public Float getVipprice() {
        return vipprice;
    }

    public void setVipprice(Float vipprice) {
        this.vipprice = vipprice;
    }

    public Float getNegotiatedprice() {
        return negotiatedprice;
    }

    public void setNegotiatedprice(Float negotiatedprice) {
        this.negotiatedprice = negotiatedprice;
    }

    public Float getClaimprice() {
        return claimprice;
    }

    public void setClaimprice(Float claimprice) {
        this.claimprice = claimprice;
    }

    public Float getInsuranceprice() {
        return insuranceprice;
    }

    public void setInsuranceprice(Float insuranceprice) {
        this.insuranceprice = insuranceprice;
    }
}