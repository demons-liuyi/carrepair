package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Carinfo {
	
	private String carbrandname;
	
	private String cartypename;
	
	private String enginebrandname;
	
	private String loadnumber;
	
	private Boolean check;
	
	private String clientname;
	
    public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public String getCarbrandname() {
		return carbrandname;
	}

	public void setCarbrandname(String carbrandname) {
		this.carbrandname = carbrandname;
	}

	public String getCartypename() {
		return cartypename;
	}

	public void setCartypename(String cartypename) {
		this.cartypename = cartypename;
	}

	public String getEnginebrandname() {
		return enginebrandname;
	}

	public void setEnginebrandname(String enginebrandname) {
		this.enginebrandname = enginebrandname;
	}

	public String getLoadnumber() {
		return loadnumber;
	}

	public void setLoadnumber(String loadnumber) {
		this.loadnumber = loadnumber;
	}

	public Boolean getCheck() {
		return check;
	}

	public void setCheck(Boolean check) {
		this.check = check;
	}

	private Integer id;

    private String carnumber;

    private Integer carbrandid;

    private Integer carid;

    private String carer;

    private String carerphone;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date borndate;

    private String affiliation;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date drivinglicence;

    private String carnumber1;

    private String enginenumber;

    private Float yearprice;

    private Float mileage;

    private Integer engineid;

    private String deadweight;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date buydate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date dutydate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date carcheckdate;

    private String fueloiltype;

    private String carseries;

    private String jqinsurance;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date jqinsurancedate;

    private String syinsurance;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date syinsurancedate;

    private Float maintain;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
   	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date maintaindate;

    private String clientid;

    private String insuredcar;

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

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public Integer getCarbrandid() {
        return carbrandid;
    }

    public void setCarbrandid(Integer carbrandid) {
        this.carbrandid = carbrandid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getCarer() {
        return carer;
    }

    public void setCarer(String carer) {
        this.carer = carer;
    }

    public String getCarerphone() {
        return carerphone;
    }

    public void setCarerphone(String carerphone) {
        this.carerphone = carerphone;
    }

    public Date getBorndate() {
        return borndate;
    }

    public void setBorndate(Date borndate) {
        this.borndate = borndate;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public Date getDrivinglicence() {
        return drivinglicence;
    }

    public void setDrivinglicence(Date drivinglicence) {
        this.drivinglicence = drivinglicence;
    }

    public String getCarnumber1() {
        return carnumber1;
    }

    public void setCarnumber1(String carnumber1) {
        this.carnumber1 = carnumber1;
    }

    public String getEnginenumber() {
        return enginenumber;
    }

    public void setEnginenumber(String enginenumber) {
        this.enginenumber = enginenumber;
    }

    public Float getYearprice() {
        return yearprice;
    }

    public void setYearprice(Float yearprice) {
        this.yearprice = yearprice;
    }

    public Float getMileage() {
        return mileage;
    }

    public void setMileage(Float mileage) {
        this.mileage = mileage;
    }

    public Integer getEngineid() {
        return engineid;
    }

    public void setEngineid(Integer engineid) {
        this.engineid = engineid;
    }

    public String getDeadweight() {
        return deadweight;
    }

    public void setDeadweight(String deadweight) {
        this.deadweight = deadweight;
    }

    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
        this.buydate = buydate;
    }

    public Date getDutydate() {
        return dutydate;
    }

    public void setDutydate(Date dutydate) {
        this.dutydate = dutydate;
    }

    public Date getCarcheckdate() {
        return carcheckdate;
    }

    public void setCarcheckdate(Date carcheckdate) {
        this.carcheckdate = carcheckdate;
    }

    public String getFueloiltype() {
        return fueloiltype;
    }

    public void setFueloiltype(String fueloiltype) {
        this.fueloiltype = fueloiltype;
    }

    public String getCarseries() {
        return carseries;
    }

    public void setCarseries(String carseries) {
        this.carseries = carseries;
    }

    public String getJqinsurance() {
        return jqinsurance;
    }

    public void setJqinsurance(String jqinsurance) {
        this.jqinsurance = jqinsurance;
    }

    public Date getJqinsurancedate() {
        return jqinsurancedate;
    }

    public void setJqinsurancedate(Date jqinsurancedate) {
        this.jqinsurancedate = jqinsurancedate;
    }

    public String getSyinsurance() {
        return syinsurance;
    }

    public void setSyinsurance(String syinsurance) {
        this.syinsurance = syinsurance;
    }

    public Date getSyinsurancedate() {
        return syinsurancedate;
    }

    public void setSyinsurancedate(Date syinsurancedate) {
        this.syinsurancedate = syinsurancedate;
    }

    public Float getMaintain() {
        return maintain;
    }

    public void setMaintain(Float maintain) {
        this.maintain = maintain;
    }

    public Date getMaintaindate() {
        return maintaindate;
    }

    public void setMaintaindate(Date maintaindate) {
        this.maintaindate = maintaindate;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getInsuredcar() {
        return insuredcar;
    }

    public void setInsuredcar(String insuredcar) {
        this.insuredcar = insuredcar;
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