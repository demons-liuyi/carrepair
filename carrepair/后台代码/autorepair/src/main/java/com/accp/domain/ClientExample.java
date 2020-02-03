package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBorndateIsNull() {
            addCriterion("borndate is null");
            return (Criteria) this;
        }

        public Criteria andBorndateIsNotNull() {
            addCriterion("borndate is not null");
            return (Criteria) this;
        }

        public Criteria andBorndateEqualTo(Date value) {
            addCriterionForJDBCDate("borndate =", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateNotEqualTo(Date value) {
            addCriterionForJDBCDate("borndate <>", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateGreaterThan(Date value) {
            addCriterionForJDBCDate("borndate >", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borndate >=", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateLessThan(Date value) {
            addCriterionForJDBCDate("borndate <", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borndate <=", value, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateIn(List<Date> values) {
            addCriterionForJDBCDate("borndate in", values, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateNotIn(List<Date> values) {
            addCriterionForJDBCDate("borndate not in", values, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borndate between", value1, value2, "borndate");
            return (Criteria) this;
        }

        public Criteria andBorndateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borndate not between", value1, value2, "borndate");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysIsNull() {
            addCriterion("paymentDays is null");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysIsNotNull() {
            addCriterion("paymentDays is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysEqualTo(Integer value) {
            addCriterion("paymentDays =", value, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysNotEqualTo(Integer value) {
            addCriterion("paymentDays <>", value, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysGreaterThan(Integer value) {
            addCriterion("paymentDays >", value, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentDays >=", value, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysLessThan(Integer value) {
            addCriterion("paymentDays <", value, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysLessThanOrEqualTo(Integer value) {
            addCriterion("paymentDays <=", value, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysIn(List<Integer> values) {
            addCriterion("paymentDays in", values, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysNotIn(List<Integer> values) {
            addCriterion("paymentDays not in", values, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysBetween(Integer value1, Integer value2) {
            addCriterion("paymentDays between", value1, value2, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentDays not between", value1, value2, "paymentdays");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeIsNull() {
            addCriterion("paymentSize is null");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeIsNotNull() {
            addCriterion("paymentSize is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeEqualTo(Integer value) {
            addCriterion("paymentSize =", value, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeNotEqualTo(Integer value) {
            addCriterion("paymentSize <>", value, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeGreaterThan(Integer value) {
            addCriterion("paymentSize >", value, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentSize >=", value, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeLessThan(Integer value) {
            addCriterion("paymentSize <", value, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeLessThanOrEqualTo(Integer value) {
            addCriterion("paymentSize <=", value, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeIn(List<Integer> values) {
            addCriterion("paymentSize in", values, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeNotIn(List<Integer> values) {
            addCriterion("paymentSize not in", values, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeBetween(Integer value1, Integer value2) {
            addCriterion("paymentSize between", value1, value2, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andPaymentsizeNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentSize not between", value1, value2, "paymentsize");
            return (Criteria) this;
        }

        public Criteria andStaffnoIsNull() {
            addCriterion("staffNo is null");
            return (Criteria) this;
        }

        public Criteria andStaffnoIsNotNull() {
            addCriterion("staffNo is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnoEqualTo(String value) {
            addCriterion("staffNo =", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoNotEqualTo(String value) {
            addCriterion("staffNo <>", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoGreaterThan(String value) {
            addCriterion("staffNo >", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoGreaterThanOrEqualTo(String value) {
            addCriterion("staffNo >=", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoLessThan(String value) {
            addCriterion("staffNo <", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoLessThanOrEqualTo(String value) {
            addCriterion("staffNo <=", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoLike(String value) {
            addCriterion("staffNo like", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoNotLike(String value) {
            addCriterion("staffNo not like", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoIn(List<String> values) {
            addCriterion("staffNo in", values, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoNotIn(List<String> values) {
            addCriterion("staffNo not in", values, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoBetween(String value1, String value2) {
            addCriterion("staffNo between", value1, value2, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoNotBetween(String value1, String value2) {
            addCriterion("staffNo not between", value1, value2, "staffno");
            return (Criteria) this;
        }

        public Criteria andCounselornameIsNull() {
            addCriterion("counselorName is null");
            return (Criteria) this;
        }

        public Criteria andCounselornameIsNotNull() {
            addCriterion("counselorName is not null");
            return (Criteria) this;
        }

        public Criteria andCounselornameEqualTo(String value) {
            addCriterion("counselorName =", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameNotEqualTo(String value) {
            addCriterion("counselorName <>", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameGreaterThan(String value) {
            addCriterion("counselorName >", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameGreaterThanOrEqualTo(String value) {
            addCriterion("counselorName >=", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameLessThan(String value) {
            addCriterion("counselorName <", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameLessThanOrEqualTo(String value) {
            addCriterion("counselorName <=", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameLike(String value) {
            addCriterion("counselorName like", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameNotLike(String value) {
            addCriterion("counselorName not like", value, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameIn(List<String> values) {
            addCriterion("counselorName in", values, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameNotIn(List<String> values) {
            addCriterion("counselorName not in", values, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameBetween(String value1, String value2) {
            addCriterion("counselorName between", value1, value2, "counselorname");
            return (Criteria) this;
        }

        public Criteria andCounselornameNotBetween(String value1, String value2) {
            addCriterion("counselorName not between", value1, value2, "counselorname");
            return (Criteria) this;
        }

        public Criteria andShengIsNull() {
            addCriterion("sheng is null");
            return (Criteria) this;
        }

        public Criteria andShengIsNotNull() {
            addCriterion("sheng is not null");
            return (Criteria) this;
        }

        public Criteria andShengEqualTo(String value) {
            addCriterion("sheng =", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengNotEqualTo(String value) {
            addCriterion("sheng <>", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengGreaterThan(String value) {
            addCriterion("sheng >", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengGreaterThanOrEqualTo(String value) {
            addCriterion("sheng >=", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengLessThan(String value) {
            addCriterion("sheng <", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengLessThanOrEqualTo(String value) {
            addCriterion("sheng <=", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengLike(String value) {
            addCriterion("sheng like", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengNotLike(String value) {
            addCriterion("sheng not like", value, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengIn(List<String> values) {
            addCriterion("sheng in", values, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengNotIn(List<String> values) {
            addCriterion("sheng not in", values, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengBetween(String value1, String value2) {
            addCriterion("sheng between", value1, value2, "sheng");
            return (Criteria) this;
        }

        public Criteria andShengNotBetween(String value1, String value2) {
            addCriterion("sheng not between", value1, value2, "sheng");
            return (Criteria) this;
        }

        public Criteria andShiIsNull() {
            addCriterion("shi is null");
            return (Criteria) this;
        }

        public Criteria andShiIsNotNull() {
            addCriterion("shi is not null");
            return (Criteria) this;
        }

        public Criteria andShiEqualTo(String value) {
            addCriterion("shi =", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotEqualTo(String value) {
            addCriterion("shi <>", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiGreaterThan(String value) {
            addCriterion("shi >", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiGreaterThanOrEqualTo(String value) {
            addCriterion("shi >=", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiLessThan(String value) {
            addCriterion("shi <", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiLessThanOrEqualTo(String value) {
            addCriterion("shi <=", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiLike(String value) {
            addCriterion("shi like", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotLike(String value) {
            addCriterion("shi not like", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiIn(List<String> values) {
            addCriterion("shi in", values, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotIn(List<String> values) {
            addCriterion("shi not in", values, "shi");
            return (Criteria) this;
        }

        public Criteria andShiBetween(String value1, String value2) {
            addCriterion("shi between", value1, value2, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotBetween(String value1, String value2) {
            addCriterion("shi not between", value1, value2, "shi");
            return (Criteria) this;
        }

        public Criteria andQvIsNull() {
            addCriterion("qv is null");
            return (Criteria) this;
        }

        public Criteria andQvIsNotNull() {
            addCriterion("qv is not null");
            return (Criteria) this;
        }

        public Criteria andQvEqualTo(String value) {
            addCriterion("qv =", value, "qv");
            return (Criteria) this;
        }

        public Criteria andQvNotEqualTo(String value) {
            addCriterion("qv <>", value, "qv");
            return (Criteria) this;
        }

        public Criteria andQvGreaterThan(String value) {
            addCriterion("qv >", value, "qv");
            return (Criteria) this;
        }

        public Criteria andQvGreaterThanOrEqualTo(String value) {
            addCriterion("qv >=", value, "qv");
            return (Criteria) this;
        }

        public Criteria andQvLessThan(String value) {
            addCriterion("qv <", value, "qv");
            return (Criteria) this;
        }

        public Criteria andQvLessThanOrEqualTo(String value) {
            addCriterion("qv <=", value, "qv");
            return (Criteria) this;
        }

        public Criteria andQvLike(String value) {
            addCriterion("qv like", value, "qv");
            return (Criteria) this;
        }

        public Criteria andQvNotLike(String value) {
            addCriterion("qv not like", value, "qv");
            return (Criteria) this;
        }

        public Criteria andQvIn(List<String> values) {
            addCriterion("qv in", values, "qv");
            return (Criteria) this;
        }

        public Criteria andQvNotIn(List<String> values) {
            addCriterion("qv not in", values, "qv");
            return (Criteria) this;
        }

        public Criteria andQvBetween(String value1, String value2) {
            addCriterion("qv between", value1, value2, "qv");
            return (Criteria) this;
        }

        public Criteria andQvNotBetween(String value1, String value2) {
            addCriterion("qv not between", value1, value2, "qv");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberIsNull() {
            addCriterion("taxpayerNumber is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberIsNotNull() {
            addCriterion("taxpayerNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberEqualTo(String value) {
            addCriterion("taxpayerNumber =", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberNotEqualTo(String value) {
            addCriterion("taxpayerNumber <>", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberGreaterThan(String value) {
            addCriterion("taxpayerNumber >", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayerNumber >=", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberLessThan(String value) {
            addCriterion("taxpayerNumber <", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberLessThanOrEqualTo(String value) {
            addCriterion("taxpayerNumber <=", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberLike(String value) {
            addCriterion("taxpayerNumber like", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberNotLike(String value) {
            addCriterion("taxpayerNumber not like", value, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberIn(List<String> values) {
            addCriterion("taxpayerNumber in", values, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberNotIn(List<String> values) {
            addCriterion("taxpayerNumber not in", values, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberBetween(String value1, String value2) {
            addCriterion("taxpayerNumber between", value1, value2, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andTaxpayernumberNotBetween(String value1, String value2) {
            addCriterion("taxpayerNumber not between", value1, value2, "taxpayernumber");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneIsNull() {
            addCriterion("registerPhone is null");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneIsNotNull() {
            addCriterion("registerPhone is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneEqualTo(String value) {
            addCriterion("registerPhone =", value, "registerphone");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneNotEqualTo(String value) {
            addCriterion("registerPhone <>", value, "registerphone");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneGreaterThan(String value) {
            addCriterion("registerPhone >", value, "registerphone");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneGreaterThanOrEqualTo(String value) {
            addCriterion("registerPhone >=", value, "registerphone");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneLessThan(String value) {
            addCriterion("registerPhone <", value, "registerphone");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneLessThanOrEqualTo(String value) {
            addCriterion("registerPhone <=", value, "registerphone");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneLike(String value) {
            addCriterion("registerPhone like", value, "registerphone");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneNotLike(String value) {
            addCriterion("registerPhone not like", value, "registerphone");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneIn(List<String> values) {
            addCriterion("registerPhone in", values, "registerphone");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneNotIn(List<String> values) {
            addCriterion("registerPhone not in", values, "registerphone");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneBetween(String value1, String value2) {
            addCriterion("registerPhone between", value1, value2, "registerphone");
            return (Criteria) this;
        }

        public Criteria andRegisterphoneNotBetween(String value1, String value2) {
            addCriterion("registerPhone not between", value1, value2, "registerphone");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBanknumberIsNull() {
            addCriterion("bankNumber is null");
            return (Criteria) this;
        }

        public Criteria andBanknumberIsNotNull() {
            addCriterion("bankNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBanknumberEqualTo(String value) {
            addCriterion("bankNumber =", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotEqualTo(String value) {
            addCriterion("bankNumber <>", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberGreaterThan(String value) {
            addCriterion("bankNumber >", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberGreaterThanOrEqualTo(String value) {
            addCriterion("bankNumber >=", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLessThan(String value) {
            addCriterion("bankNumber <", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLessThanOrEqualTo(String value) {
            addCriterion("bankNumber <=", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberLike(String value) {
            addCriterion("bankNumber like", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotLike(String value) {
            addCriterion("bankNumber not like", value, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberIn(List<String> values) {
            addCriterion("bankNumber in", values, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotIn(List<String> values) {
            addCriterion("bankNumber not in", values, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberBetween(String value1, String value2) {
            addCriterion("bankNumber between", value1, value2, "banknumber");
            return (Criteria) this;
        }

        public Criteria andBanknumberNotBetween(String value1, String value2) {
            addCriterion("bankNumber not between", value1, value2, "banknumber");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressIsNull() {
            addCriterion("registerAddress is null");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressIsNotNull() {
            addCriterion("registerAddress is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressEqualTo(String value) {
            addCriterion("registerAddress =", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressNotEqualTo(String value) {
            addCriterion("registerAddress <>", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressGreaterThan(String value) {
            addCriterion("registerAddress >", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressGreaterThanOrEqualTo(String value) {
            addCriterion("registerAddress >=", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressLessThan(String value) {
            addCriterion("registerAddress <", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressLessThanOrEqualTo(String value) {
            addCriterion("registerAddress <=", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressLike(String value) {
            addCriterion("registerAddress like", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressNotLike(String value) {
            addCriterion("registerAddress not like", value, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressIn(List<String> values) {
            addCriterion("registerAddress in", values, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressNotIn(List<String> values) {
            addCriterion("registerAddress not in", values, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressBetween(String value1, String value2) {
            addCriterion("registerAddress between", value1, value2, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andRegisteraddressNotBetween(String value1, String value2) {
            addCriterion("registerAddress not between", value1, value2, "registeraddress");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andCarnoIsNull() {
            addCriterion("carNo is null");
            return (Criteria) this;
        }

        public Criteria andCarnoIsNotNull() {
            addCriterion("carNo is not null");
            return (Criteria) this;
        }

        public Criteria andCarnoEqualTo(String value) {
            addCriterion("carNo =", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotEqualTo(String value) {
            addCriterion("carNo <>", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoGreaterThan(String value) {
            addCriterion("carNo >", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoGreaterThanOrEqualTo(String value) {
            addCriterion("carNo >=", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLessThan(String value) {
            addCriterion("carNo <", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLessThanOrEqualTo(String value) {
            addCriterion("carNo <=", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoLike(String value) {
            addCriterion("carNo like", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotLike(String value) {
            addCriterion("carNo not like", value, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoIn(List<String> values) {
            addCriterion("carNo in", values, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotIn(List<String> values) {
            addCriterion("carNo not in", values, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoBetween(String value1, String value2) {
            addCriterion("carNo between", value1, value2, "carno");
            return (Criteria) this;
        }

        public Criteria andCarnoNotBetween(String value1, String value2) {
            addCriterion("carNo not between", value1, value2, "carno");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("Integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("Integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("Integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("Integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("Integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("Integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("Integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("Integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("Integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("Integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("Integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("Integral not between", value1, value2, "integral");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}