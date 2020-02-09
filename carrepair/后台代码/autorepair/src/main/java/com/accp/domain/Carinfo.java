package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Carinfo {
	private String carbrandname;//车辆品牌名称
	
	private String cartypename;//车型名称
	
	private String enginebrandname;//发动机名称
	
	private String loadnumber;//载重
	
	private Boolean check;//是否被选中
	
	
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

    public String getdeadweight() {
        return deadweight;
    }

    public void setdeadweight(String deadweight) {
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
    private String carTypeName;
    private String carBrandName;
    private String engineBrandName;
 

	public String getCarTypeName() {
		return carTypeName;
	}

	public void setCarTypeName(String carTypeName) {
		this.carTypeName = carTypeName;
	}

	public String getCarBrandName() {
		return carBrandName;
	}

	public void setCarBrandName(String carBrandName) {
		this.carBrandName = carBrandName;
	}

	public String getEngineBrandName() {
		return engineBrandName;
	}

	public void setEngineBrandName(String engineBrandName) {
		this.engineBrandName = engineBrandName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ordertime;
}