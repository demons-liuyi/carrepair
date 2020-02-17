package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Repair {
	
	private String carnumber;
	
	private Boolean check;
	
	private Float totalnum;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date cashiertime;
	
	private String staffname;
	
	private String paymenttype;
	
	private String wtype;
	
	private String carbrandname;
	
	private String clientname;
	
	private String cartypename;
	
	private String carnumber1;
	
	private String carerphone;
	
	private String jqinsurance;
	
	private String staffpeople;
			
    public String getStaffpeople() {
		return staffpeople;
	}

	public void setStaffpeople(String staffpeople) {
		this.staffpeople = staffpeople;
	}

	public String getWtype() {
		return wtype;
	}

	public void setWtype(String wtype) {
		this.wtype = wtype;
	}

	public String getCarbrandname() {
		return carbrandname;
	}

	public void setCarbrandname(String carbrandname) {
		this.carbrandname = carbrandname;
	}

	public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public String getCartypename() {
		return cartypename;
	}

	public void setCartypename(String cartypename) {
		this.cartypename = cartypename;
	}

	public String getCarnumber1() {
		return carnumber1;
	}

	public void setCarnumber1(String carnumber1) {
		this.carnumber1 = carnumber1;
	}

	public String getCarerphone() {
		return carerphone;
	}

	public void setCarerphone(String carerphone) {
		this.carerphone = carerphone;
	}

	public String getJqinsurance() {
		return jqinsurance;
	}

	public void setJqinsurance(String jqinsurance) {
		this.jqinsurance = jqinsurance;
	}

	public Float getTotalnum() {
		return totalnum;
	}

	public void setTotalnum(Float totalnum) {
		this.totalnum = totalnum;
	}

	public Date getCashiertime() {
		return cashiertime;
	}

	public void setCashiertime(Date cashiertime) {
		this.cashiertime = cashiertime;
	}

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public String getPaymenttype() {
		return paymenttype;
	}

	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}

	public String getCarnumber() {
		return carnumber;
	}

	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}

	public Boolean getCheck() {
		return check;
	}

	public void setCheck(Boolean check) {
		this.check = check;
	}

	private String number;

    private Integer carinfoid;

    private String staffno;

    private String oil;

    private String type;

    private String worktime;

    private String getman;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date overworkdate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date nowworkdate;

    private String setter;

    private String company;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date befor;

    private Float price;

    private String remark;

    private String state;

    private String fault;

    private String faultreasult;

    private String status;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date ordertime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date stockdater;

    private String otherone;

    private String othertwo;

    private String otherthree;

    private String otherfour;

    private String otherfive;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getCarinfoid() {
        return carinfoid;
    }

    public void setCarinfoid(Integer carinfoid) {
        this.carinfoid = carinfoid;
    }

    public String getStaffno() {
        return staffno;
    }

    public void setStaffno(String staffno) {
        this.staffno = staffno;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public String getGetman() {
        return getman;
    }

    public void setGetman(String getman) {
        this.getman = getman;
    }

    public Date getOverworkdate() {
        return overworkdate;
    }

    public void setOverworkdate(Date overworkdate) {
        this.overworkdate = overworkdate;
    }

    public Date getNowworkdate() {
        return nowworkdate;
    }

    public void setNowworkdate(Date nowworkdate) {
        this.nowworkdate = nowworkdate;
    }

    public String getSetter() {
        return setter;
    }

    public void setSetter(String setter) {
        this.setter = setter;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getBefor() {
        return befor;
    }

    public void setBefor(Date befor) {
        this.befor = befor;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault;
    }

    public String getFaultreasult() {
        return faultreasult;
    }

    public void setFaultreasult(String faultreasult) {
        this.faultreasult = faultreasult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getStockdater() {
        return stockdater;
    }

    public void setStockdater(Date stockdater) {
        this.stockdater = stockdater;
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