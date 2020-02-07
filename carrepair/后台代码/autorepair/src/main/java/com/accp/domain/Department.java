package com.accp.domain;

public class Department {
	
	private Boolean check; 

	public Boolean getCheck() {
		return check;
	}

	public void setCheck(Boolean check) {
		this.check = check;
	}
	
    private Integer id;

    private String departmentname;

    private String departmenttypename;

    private Integer parentid;

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

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDepartmenttypename() {
        return departmenttypename;
    }

    public void setDepartmenttypename(String departmenttypename) {
        this.departmenttypename = departmenttypename;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
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