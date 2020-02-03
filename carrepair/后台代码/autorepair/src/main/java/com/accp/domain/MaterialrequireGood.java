package com.accp.domain;

public class MaterialrequireGood {
    private Integer id;

    private Integer requireid;

    private Integer goodid;

    private Integer count;

    private String item;

    private String warehouse;

    private Integer isget;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRequireid() {
        return requireid;
    }

    public void setRequireid(Integer requireid) {
        this.requireid = requireid;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getIsget() {
        return isget;
    }

    public void setIsget(Integer isget) {
        this.isget = isget;
    }
}