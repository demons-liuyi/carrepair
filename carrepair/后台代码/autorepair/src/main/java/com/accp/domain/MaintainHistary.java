package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class MaintainHistary {
	    private String number;
	    private String itemTypeName;
	    private String name;
	    private String carNumber;
	    private String phone;
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	   	@JsonFormat(pattern = "yyyy-MM-dd")
	    private Date nowworkdate;
	    private Float price;	
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	   	@JsonFormat(pattern = "yyyy-MM-dd")
	    private Date ordertime;
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	   	@JsonFormat(pattern = "yyyy-MM-dd")
	    private Date stockdater;
	    private Integer id;
	    private String itemsName;
	    private String priceType;
	    private Integer workhour;
	    private Float fprice;
	    private String artisanClassName;
	    private String faultreasult;
	    private String type;
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    private Date lldate;
	    private String llpeople;
	    private String llnumber;
	    private String llname;
	    private String dw;
	    private Integer count;
	    private Float qprice;
	    private Float hprice;
	    public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getItemTypeName() {
			return itemTypeName;
		}
		public void setItemTypeName(String itemTypeName) {
			this.itemTypeName = itemTypeName;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCarNumber() {
			return carNumber;
		}
		public void setCarNumber(String carNumber) {
			this.carNumber = carNumber;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public Date getNowworkdate() {
			return nowworkdate;
		}
		public void setNowworkdate(Date nowworkdate) {
			this.nowworkdate = nowworkdate;
		}
		public Float getPrice() {
			return price;
		}
		public void setPrice(Float price) {
			this.price = price;
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
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getItemsName() {
			return itemsName;
		}
		public void setItemsName(String itemsName) {
			this.itemsName = itemsName;
		}
		public String getPriceType() {
			return priceType;
		}
		public void setPriceType(String priceType) {
			this.priceType = priceType;
		}
		public Integer getWorkhour() {
			return workhour;
		}
		public void setWorkhour(Integer workhour) {
			this.workhour = workhour;
		}
		public Float getFprice() {
			return fprice;
		}
		public void setFprice(Float fprice) {
			this.fprice = fprice;
		}
		public String getArtisanClassName() {
			return artisanClassName;
		}
		public void setArtisanClassName(String artisanClassName) {
			this.artisanClassName = artisanClassName;
		}
		public String getFaultreasult() {
			return faultreasult;
		}
		public void setFaultreasult(String faultreasult) {
			this.faultreasult = faultreasult;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Date getLldate() {
			return lldate;
		}
		public void setLldate(Date lldate) {
			this.lldate = lldate;
		}
		public String getLlpeople() {
			return llpeople;
		}
		public void setLlpeople(String llpeople) {
			this.llpeople = llpeople;
		}
		public String getLlnumber() {
			return llnumber;
		}
		public void setLlnumber(String llnumber) {
			this.llnumber = llnumber;
		}
		public String getLlname() {
			return llname;
		}
		public void setLlname(String llname) {
			this.llname = llname;
		}
		public String getDw() {
			return dw;
		}
		public void setDw(String dw) {
			this.dw = dw;
		}
		public Integer getCount() {
			return count;
		}
		public void setCount(Integer count) {
			this.count = count;
		}
		public Float getQprice() {
			return qprice;
		}
		public void setQprice(Float qprice) {
			this.qprice = qprice;
		}
		public Float getHprice() {
			return hprice;
		}
		public void setHprice(Float hprice) {
			this.hprice = hprice;
		}
		public Float getAllprice() {
			return allprice;
		}
		public void setAllprice(Float allprice) {
			this.allprice = allprice;
		}
		public String getGw() {
			return gw;
		}
		public void setGw(String gw) {
			this.gw = gw;
		}
		public String getItemname() {
			return itemname;
		}
		public void setItemname(String itemname) {
			this.itemname = itemname;
		}
		private Float allprice;
	    private String gw;
	    private String itemname;
	    
	    

}
