package com.accp.domain;

import java.util.Date;

public class Dimission {
    private Integer id;

    private String staffid;

    private Date dimissiondate;

    private byte[] dimissioncause;
    
    private String departmentname;//部门名称
   
    private String name;//员工姓名
    
    private String sex;//性别
    
    private String postname;//岗位名称	
    
    private Boolean check;//是否被选中

	public Boolean getCheck() {
		return check;
	}

	public void setCheck(Boolean check) {
		this.check = check;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPostname() {
		return postname;
	}

	public void setPostname(String postname) {
		this.postname = postname;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public Date getDimissiondate() {
        return dimissiondate;
    }

    public void setDimissiondate(Date dimissiondate) {
        this.dimissiondate = dimissiondate;
    }

    public byte[] getDimissioncause() {
        return dimissioncause;
    }

    public void setDimissioncause(byte[] dimissioncause) {
        this.dimissioncause = dimissioncause;
    }
}