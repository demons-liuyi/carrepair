package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Staff {
	
	private Boolean check;
	
	public Boolean getCheck() {
		return check;
	}

	public void setCheck(Boolean check) {
		this.check = check;
	}

	private String departmentname;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateofentryone;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateofentrytwo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date thetrialdateone;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date thetrialdatetwo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date contractstartdateone;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date contractstartdatetwo;
	
    public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public Date getDateofentryone() {
		return dateofentryone;
	}

	public void setDateofentryone(Date dateofentryone) {
		this.dateofentryone = dateofentryone;
	}

	public Date getDateofentrytwo() {
		return dateofentrytwo;
	}

	public void setDateofentrytwo(Date dateofentrytwo) {
		this.dateofentrytwo = dateofentrytwo;
	}

	public Date getThetrialdateone() {
		return thetrialdateone;
	}

	public void setThetrialdateone(Date thetrialdateone) {
		this.thetrialdateone = thetrialdateone;
	}

	public Date getThetrialdatetwo() {
		return thetrialdatetwo;
	}

	public void setThetrialdatetwo(Date thetrialdatetwo) {
		this.thetrialdatetwo = thetrialdatetwo;
	}

	public Date getContractstartdateone() {
		return contractstartdateone;
	}

	public void setContractstartdateone(Date contractstartdateone) {
		this.contractstartdateone = contractstartdateone;
	}

	public Date getContractstartdatetwo() {
		return contractstartdatetwo;
	}

	public void setContractstartdatetwo(Date contractstartdatetwo) {
		this.contractstartdatetwo = contractstartdatetwo;
	}

	private String staffno;

    private String name;

    private String sex;

    private Integer departmentid;

    private String account;

    private String password;

    private Integer postid;

    private String physicalcondition;

    private String height;

    private String nativeplace;

    private String nation;

    private String maritalstatus;

    private String educationbackground;

    private String school;

    private String major;

    private String professionalqualification;

    private String property;

    private String degree;

    private String authorizedstrength;

    private String idcardno;

    private String residence;

    private String presentaddress;

    private String contactnumber;

    private String phone;

    private String email;

    private String depositbank;

    private String bankaccount;

    private String emergencycontact;

    private String emergencyphone;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateonboard;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date thetrialdue;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthdaydate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date contractstart;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date agreementends;

    private String cardnumber;

    private String internalcardno;

    private String referrer;

    private String wholeorderdiscountright;

    private String timediscountright;

    private String righttodiscount;

    private String rightofrelief;

    private String jobresume;

    private String educationexperience;

    private String memberoffamily;

    private String disciplinaryrecords;

    private String employmentadvice;

    private String picture;

    private Integer roleid;

    private Integer isdimission;

    private String otherone;

    private String othertwo;

    private String otherthree;

    private String otherfour;

    private String otherfive;
    
    
    //新增的属性  岗位名称用于多表联查时的数据展示  YLL
    private String postName;
    public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}
	//postName 结尾
	
	

	public String getStaffno() {
        return staffno;
    }

    public void setStaffno(String staffno) {
        this.staffno = staffno;
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

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPhysicalcondition() {
        return physicalcondition;
    }

    public void setPhysicalcondition(String physicalcondition) {
        this.physicalcondition = physicalcondition;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getEducationbackground() {
        return educationbackground;
    }

    public void setEducationbackground(String educationbackground) {
        this.educationbackground = educationbackground;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getProfessionalqualification() {
        return professionalqualification;
    }

    public void setProfessionalqualification(String professionalqualification) {
        this.professionalqualification = professionalqualification;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getAuthorizedstrength() {
        return authorizedstrength;
    }

    public void setAuthorizedstrength(String authorizedstrength) {
        this.authorizedstrength = authorizedstrength;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getPresentaddress() {
        return presentaddress;
    }

    public void setPresentaddress(String presentaddress) {
        this.presentaddress = presentaddress;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepositbank() {
        return depositbank;
    }

    public void setDepositbank(String depositbank) {
        this.depositbank = depositbank;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getEmergencycontact() {
        return emergencycontact;
    }

    public void setEmergencycontact(String emergencycontact) {
        this.emergencycontact = emergencycontact;
    }

    public String getEmergencyphone() {
        return emergencyphone;
    }

    public void setEmergencyphone(String emergencyphone) {
        this.emergencyphone = emergencyphone;
    }

    public Date getDateonboard() {
        return dateonboard;
    }

    public void setDateonboard(Date dateonboard) {
        this.dateonboard = dateonboard;
    }

    public Date getThetrialdue() {
        return thetrialdue;
    }

    public void setThetrialdue(Date thetrialdue) {
        this.thetrialdue = thetrialdue;
    }

    public Date getBirthdaydate() {
        return birthdaydate;
    }

    public void setBirthdaydate(Date birthdaydate) {
        this.birthdaydate = birthdaydate;
    }

    public Date getContractstart() {
        return contractstart;
    }

    public void setContractstart(Date contractstart) {
        this.contractstart = contractstart;
    }

    public Date getAgreementends() {
        return agreementends;
    }

    public void setAgreementends(Date agreementends) {
        this.agreementends = agreementends;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getInternalcardno() {
        return internalcardno;
    }

    public void setInternalcardno(String internalcardno) {
        this.internalcardno = internalcardno;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getWholeorderdiscountright() {
        return wholeorderdiscountright;
    }

    public void setWholeorderdiscountright(String wholeorderdiscountright) {
        this.wholeorderdiscountright = wholeorderdiscountright;
    }

    public String getTimediscountright() {
        return timediscountright;
    }

    public void setTimediscountright(String timediscountright) {
        this.timediscountright = timediscountright;
    }

    public String getRighttodiscount() {
        return righttodiscount;
    }

    public void setRighttodiscount(String righttodiscount) {
        this.righttodiscount = righttodiscount;
    }

    public String getRightofrelief() {
        return rightofrelief;
    }

    public void setRightofrelief(String rightofrelief) {
        this.rightofrelief = rightofrelief;
    }

    public String getJobresume() {
        return jobresume;
    }

    public void setJobresume(String jobresume) {
        this.jobresume = jobresume;
    }

    public String getEducationexperience() {
        return educationexperience;
    }

    public void setEducationexperience(String educationexperience) {
        this.educationexperience = educationexperience;
    }

    public String getMemberoffamily() {
        return memberoffamily;
    }

    public void setMemberoffamily(String memberoffamily) {
        this.memberoffamily = memberoffamily;
    }

    public String getDisciplinaryrecords() {
        return disciplinaryrecords;
    }

    public void setDisciplinaryrecords(String disciplinaryrecords) {
        this.disciplinaryrecords = disciplinaryrecords;
    }

    public String getEmploymentadvice() {
        return employmentadvice;
    }

    public void setEmploymentadvice(String employmentadvice) {
        this.employmentadvice = employmentadvice;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getIsdimission() {
        return isdimission;
    }

    public void setIsdimission(Integer isdimission) {
        this.isdimission = isdimission;
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

	public Staff() {
		super();
	}

	public Staff(String staffno, String name, String sex, Integer departmentid, String account, String password,
			Integer postid, String physicalcondition, String height, String nativeplace, String nation,
			String maritalstatus, String educationbackground, String school, String major,
			String professionalqualification, String property, String degree, String authorizedstrength,
			String idcardno, String residence, String presentaddress, String contactnumber, String phone, String email,
			String depositbank, String bankaccount, String emergencycontact, String emergencyphone, Date dateonboard,
			Date thetrialdue, Date birthdaydate, Date contractstart, Date agreementends, String cardnumber,
			String internalcardno, String referrer, String wholeorderdiscountright, String timediscountright,
			String righttodiscount, String rightofrelief, String jobresume, String educationexperience,
			String memberoffamily, String disciplinaryrecords, String employmentadvice, String picture, Integer roleid,
			Integer isdimission, String otherone, String othertwo, String otherthree, String otherfour,
			String otherfive) {
		super();
		this.staffno = staffno;
		this.name = name;
		this.sex = sex;
		this.departmentid = departmentid;
		this.account = account;
		this.password = password;
		this.postid = postid;
		this.physicalcondition = physicalcondition;
		this.height = height;
		this.nativeplace = nativeplace;
		this.nation = nation;
		this.maritalstatus = maritalstatus;
		this.educationbackground = educationbackground;
		this.school = school;
		this.major = major;
		this.professionalqualification = professionalqualification;
		this.property = property;
		this.degree = degree;
		this.authorizedstrength = authorizedstrength;
		this.idcardno = idcardno;
		this.residence = residence;
		this.presentaddress = presentaddress;
		this.contactnumber = contactnumber;
		this.phone = phone;
		this.email = email;
		this.depositbank = depositbank;
		this.bankaccount = bankaccount;
		this.emergencycontact = emergencycontact;
		this.emergencyphone = emergencyphone;
		this.dateonboard = dateonboard;
		this.thetrialdue = thetrialdue;
		this.birthdaydate = birthdaydate;
		this.contractstart = contractstart;
		this.agreementends = agreementends;
		this.cardnumber = cardnumber;
		this.internalcardno = internalcardno;
		this.referrer = referrer;
		this.wholeorderdiscountright = wholeorderdiscountright;
		this.timediscountright = timediscountright;
		this.righttodiscount = righttodiscount;
		this.rightofrelief = rightofrelief;
		this.jobresume = jobresume;
		this.educationexperience = educationexperience;
		this.memberoffamily = memberoffamily;
		this.disciplinaryrecords = disciplinaryrecords;
		this.employmentadvice = employmentadvice;
		this.picture = picture;
		this.roleid = roleid;
		this.isdimission = isdimission;
		this.otherone = otherone;
		this.othertwo = othertwo;
		this.otherthree = otherthree;
		this.otherfour = otherfour;
		this.otherfive = otherfive;
	}
    
}