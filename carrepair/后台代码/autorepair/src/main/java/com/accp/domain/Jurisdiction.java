package com.accp.domain;

import java.security.Permissions;
import java.util.ArrayList;
import java.util.List;

public class Jurisdiction {
	private Integer postid;
	
	private String judge;
	
	public Integer getPostid() {
		return postid;
	}

	public void setPostid(Integer postid) {
		this.postid = postid;
	}

	public String getJudge() {
		return judge;
	}

	public void setJudge(String judge) {
		this.judge = judge;
	}

	private List<Jurisdiction> childrens = new ArrayList<Jurisdiction>();
	
    public List<Jurisdiction> getChildrens() {
		return childrens;
	}

	public void setChildrens(List<Jurisdiction> childrens) {
		this.childrens = childrens;
	}

	private Integer id;

    private String jurisdictionname;

    private String ename;

    private Integer catalog;

    private Integer parentid;

    private String path;

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