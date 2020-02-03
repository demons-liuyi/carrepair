package com.accp.domain;

public class Artisanclass {
    private Integer id;

    private String artisanclassname;

    private Integer artisanclassweight;

    private Integer parentid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtisanclassname() {
        return artisanclassname;
    }

    public void setArtisanclassname(String artisanclassname) {
        this.artisanclassname = artisanclassname;
    }

    public Integer getArtisanclassweight() {
        return artisanclassweight;
    }

    public void setArtisanclassweight(Integer artisanclassweight) {
        this.artisanclassweight = artisanclassweight;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}