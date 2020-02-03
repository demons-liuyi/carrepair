package com.accp.domain;

public class Jurisdiction {
    private Integer id;

    private String jurisdictionname;

    private String ename;

    private Integer catalog;

    private Integer parentid;

    private String path;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJurisdictionname() {
        return jurisdictionname;
    }

    public void setJurisdictionname(String jurisdictionname) {
        this.jurisdictionname = jurisdictionname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getCatalog() {
        return catalog;
    }

    public void setCatalog(Integer catalog) {
        this.catalog = catalog;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}