package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CashierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CashierExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNull() {
            addCriterion("totalNum is null");
            return (Criteria) this;
        }

        public Criteria andTotalnumIsNotNull() {
            addCriterion("totalNum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalnumEqualTo(Float value) {
            addCriterion("totalNum =", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotEqualTo(Float value) {
            addCriterion("totalNum <>", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThan(Float value) {
            addCriterion("totalNum >", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumGreaterThanOrEqualTo(Float value) {
            addCriterion("totalNum >=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThan(Float value) {
            addCriterion("totalNum <", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumLessThanOrEqualTo(Float value) {
            addCriterion("totalNum <=", value, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumIn(List<Float> values) {
            addCriterion("totalNum in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotIn(List<Float> values) {
            addCriterion("totalNum not in", values, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumBetween(Float value1, Float value2) {
            addCriterion("totalNum between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andTotalnumNotBetween(Float value1, Float value2) {
            addCriterion("totalNum not between", value1, value2, "totalnum");
            return (Criteria) this;
        }

        public Criteria andCashierstaticIsNull() {
            addCriterion("cashierstatic is null");
            return (Criteria) this;
        }

        public Criteria andCashierstaticIsNotNull() {
            addCriterion("cashierstatic is not null");
            return (Criteria) this;
        }

        public Criteria andCashierstaticEqualTo(String value) {
            addCriterion("cashierstatic =", value, "cashierstatic");
            return (Criteria) this;
        }

        public Criteria andCashierstaticNotEqualTo(String value) {
            addCriterion("cashierstatic <>", value, "cashierstatic");
            return (Criteria) this;
        }

        public Criteria andCashierstaticGreaterThan(String value) {
            addCriterion("cashierstatic >", value, "cashierstatic");
            return (Criteria) this;
        }

        public Criteria andCashierstaticGreaterThanOrEqualTo(String value) {
            addCriterion("cashierstatic >=", value, "cashierstatic");
            return (Criteria) this;
        }

        public Criteria andCashierstaticLessThan(String value) {
            addCriterion("cashierstatic <", value, "cashierstatic");
            return (Criteria) this;
        }

        public Criteria andCashierstaticLessThanOrEqualTo(String value) {
            addCriterion("cashierstatic <=", value, "cashierstatic");
            return (Criteria) this;
        }

        public Criteria andCashierstaticLike(String value) {
            addCriterion("cashierstatic like", value, "cashierstatic");
            return (Criteria) this;
        }

        public Criteria andCashierstaticNotLike(String value) {
            addCriterion("cashierstatic not like", value, "cashierstatic");
            return (Criteria) this;
        }

        public Criteria andCashierstaticIn(List<String> values) {
            addCriterion("cashierstatic in", values, "cashierstatic");
            return (Criteria) this;
        }

        public Criteria andCashierstaticNotIn(List<String> values) {
            addCriterion("cashierstatic not in", values, "cashierstatic");
            return (Criteria) this;
        }

        public Criteria andCashierstaticBetween(String value1, String value2) {
            addCriterion("cashierstatic between", value1, value2, "cashierstatic");
            return (Criteria) this;
        }

        public Criteria andCashierstaticNotBetween(String value1, String value2) {
            addCriterion("cashierstatic not between", value1, value2, "cashierstatic");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIsNull() {
            addCriterion("paymentType is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIsNotNull() {
            addCriterion("paymentType is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeEqualTo(String value) {
            addCriterion("paymentType =", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotEqualTo(String value) {
            addCriterion("paymentType <>", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThan(String value) {
            addCriterion("paymentType >", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("paymentType >=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThan(String value) {
            addCriterion("paymentType <", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThanOrEqualTo(String value) {
            addCriterion("paymentType <=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLike(String value) {
            addCriterion("paymentType like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotLike(String value) {
            addCriterion("paymentType not like", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIn(List<String> values) {
            addCriterion("paymentType in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotIn(List<String> values) {
            addCriterion("paymentType not in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeBetween(String value1, String value2) {
            addCriterion("paymentType between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotBetween(String value1, String value2) {
            addCriterion("paymentType not between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIsNull() {
            addCriterion("invoiceNo is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIsNotNull() {
            addCriterion("invoiceNo is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenoEqualTo(String value) {
            addCriterion("invoiceNo =", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotEqualTo(String value) {
            addCriterion("invoiceNo <>", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThan(String value) {
            addCriterion("invoiceNo >", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceNo >=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThan(String value) {
            addCriterion("invoiceNo <", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLessThanOrEqualTo(String value) {
            addCriterion("invoiceNo <=", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoLike(String value) {
            addCriterion("invoiceNo like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotLike(String value) {
            addCriterion("invoiceNo not like", value, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoIn(List<String> values) {
            addCriterion("invoiceNo in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotIn(List<String> values) {
            addCriterion("invoiceNo not in", values, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoBetween(String value1, String value2) {
            addCriterion("invoiceNo between", value1, value2, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andInvoicenoNotBetween(String value1, String value2) {
            addCriterion("invoiceNo not between", value1, value2, "invoiceno");
            return (Criteria) this;
        }

        public Criteria andCashiertimeIsNull() {
            addCriterion("cashiertime is null");
            return (Criteria) this;
        }

        public Criteria andCashiertimeIsNotNull() {
            addCriterion("cashiertime is not null");
            return (Criteria) this;
        }

        public Criteria andCashiertimeEqualTo(Date value) {
            addCriterion("cashiertime =", value, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeNotEqualTo(Date value) {
            addCriterion("cashiertime <>", value, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeGreaterThan(Date value) {
            addCriterion("cashiertime >", value, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cashiertime >=", value, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeLessThan(Date value) {
            addCriterion("cashiertime <", value, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeLessThanOrEqualTo(Date value) {
            addCriterion("cashiertime <=", value, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeIn(List<Date> values) {
            addCriterion("cashiertime in", values, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeNotIn(List<Date> values) {
            addCriterion("cashiertime not in", values, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeBetween(Date value1, Date value2) {
            addCriterion("cashiertime between", value1, value2, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andCashiertimeNotBetween(Date value1, Date value2) {
            addCriterion("cashiertime not between", value1, value2, "cashiertime");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNull() {
            addCriterion("staffId is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffId is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(String value) {
            addCriterion("staffId =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(String value) {
            addCriterion("staffId <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(String value) {
            addCriterion("staffId >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(String value) {
            addCriterion("staffId >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(String value) {
            addCriterion("staffId <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(String value) {
            addCriterion("staffId <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLike(String value) {
            addCriterion("staffId like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotLike(String value) {
            addCriterion("staffId not like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<String> values) {
            addCriterion("staffId in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<String> values) {
            addCriterion("staffId not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(String value1, String value2) {
            addCriterion("staffId between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(String value1, String value2) {
            addCriterion("staffId not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andOncreditIsNull() {
            addCriterion("onCredit is null");
            return (Criteria) this;
        }

        public Criteria andOncreditIsNotNull() {
            addCriterion("onCredit is not null");
            return (Criteria) this;
        }

        public Criteria andOncreditEqualTo(Float value) {
            addCriterion("onCredit =", value, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditNotEqualTo(Float value) {
            addCriterion("onCredit <>", value, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditGreaterThan(Float value) {
            addCriterion("onCredit >", value, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditGreaterThanOrEqualTo(Float value) {
            addCriterion("onCredit >=", value, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditLessThan(Float value) {
            addCriterion("onCredit <", value, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditLessThanOrEqualTo(Float value) {
            addCriterion("onCredit <=", value, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditIn(List<Float> values) {
            addCriterion("onCredit in", values, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditNotIn(List<Float> values) {
            addCriterion("onCredit not in", values, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditBetween(Float value1, Float value2) {
            addCriterion("onCredit between", value1, value2, "oncredit");
            return (Criteria) this;
        }

        public Criteria andOncreditNotBetween(Float value1, Float value2) {
            addCriterion("onCredit not between", value1, value2, "oncredit");
            return (Criteria) this;
        }

        public Criteria andInteriorIsNull() {
            addCriterion("interior is null");
            return (Criteria) this;
        }

        public Criteria andInteriorIsNotNull() {
            addCriterion("interior is not null");
            return (Criteria) this;
        }

        public Criteria andInteriorEqualTo(Float value) {
            addCriterion("interior =", value, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorNotEqualTo(Float value) {
            addCriterion("interior <>", value, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorGreaterThan(Float value) {
            addCriterion("interior >", value, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorGreaterThanOrEqualTo(Float value) {
            addCriterion("interior >=", value, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorLessThan(Float value) {
            addCriterion("interior <", value, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorLessThanOrEqualTo(Float value) {
            addCriterion("interior <=", value, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorIn(List<Float> values) {
            addCriterion("interior in", values, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorNotIn(List<Float> values) {
            addCriterion("interior not in", values, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorBetween(Float value1, Float value2) {
            addCriterion("interior between", value1, value2, "interior");
            return (Criteria) this;
        }

        public Criteria andInteriorNotBetween(Float value1, Float value2) {
            addCriterion("interior not between", value1, value2, "interior");
            return (Criteria) this;
        }

        public Criteria andClientidIsNull() {
            addCriterion("clientId is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("clientId is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(String value) {
            addCriterion("clientId =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(String value) {
            addCriterion("clientId <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(String value) {
            addCriterion("clientId >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(String value) {
            addCriterion("clientId >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(String value) {
            addCriterion("clientId <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(String value) {
            addCriterion("clientId <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLike(String value) {
            addCriterion("clientId like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotLike(String value) {
            addCriterion("clientId not like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<String> values) {
            addCriterion("clientId in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<String> values) {
            addCriterion("clientId not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(String value1, String value2) {
            addCriterion("clientId between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(String value1, String value2) {
            addCriterion("clientId not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andChangeIsNull() {
            addCriterion("change is null");
            return (Criteria) this;
        }

        public Criteria andChangeIsNotNull() {
            addCriterion("change is not null");
            return (Criteria) this;
        }

        public Criteria andChangeEqualTo(Float value) {
            addCriterion("change =", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotEqualTo(Float value) {
            addCriterion("change <>", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeGreaterThan(Float value) {
            addCriterion("change >", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeGreaterThanOrEqualTo(Float value) {
            addCriterion("change >=", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeLessThan(Float value) {
            addCriterion("change <", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeLessThanOrEqualTo(Float value) {
            addCriterion("change <=", value, "change");
            return (Criteria) this;
        }

        public Criteria andChangeIn(List<Float> values) {
            addCriterion("change in", values, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotIn(List<Float> values) {
            addCriterion("change not in", values, "change");
            return (Criteria) this;
        }

        public Criteria andChangeBetween(Float value1, Float value2) {
            addCriterion("change between", value1, value2, "change");
            return (Criteria) this;
        }

        public Criteria andChangeNotBetween(Float value1, Float value2) {
            addCriterion("change not between", value1, value2, "change");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("Number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("Number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("Number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("Number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("Number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("Number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("Number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("Number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("Number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("Number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("Number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("Number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("Number not between", value1, value2, "number");
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