package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceitemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintenanceitemsExample() {
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

        public Criteria andItemsnameIsNull() {
            addCriterion("itemsName is null");
            return (Criteria) this;
        }

        public Criteria andItemsnameIsNotNull() {
            addCriterion("itemsName is not null");
            return (Criteria) this;
        }

        public Criteria andItemsnameEqualTo(String value) {
            addCriterion("itemsName =", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameNotEqualTo(String value) {
            addCriterion("itemsName <>", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameGreaterThan(String value) {
            addCriterion("itemsName >", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameGreaterThanOrEqualTo(String value) {
            addCriterion("itemsName >=", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameLessThan(String value) {
            addCriterion("itemsName <", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameLessThanOrEqualTo(String value) {
            addCriterion("itemsName <=", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameLike(String value) {
            addCriterion("itemsName like", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameNotLike(String value) {
            addCriterion("itemsName not like", value, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameIn(List<String> values) {
            addCriterion("itemsName in", values, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameNotIn(List<String> values) {
            addCriterion("itemsName not in", values, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameBetween(String value1, String value2) {
            addCriterion("itemsName between", value1, value2, "itemsname");
            return (Criteria) this;
        }

        public Criteria andItemsnameNotBetween(String value1, String value2) {
            addCriterion("itemsName not between", value1, value2, "itemsname");
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

        public Criteria andNormalpriceIsNull() {
            addCriterion("normalPrice is null");
            return (Criteria) this;
        }

        public Criteria andNormalpriceIsNotNull() {
            addCriterion("normalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andNormalpriceEqualTo(Float value) {
            addCriterion("normalPrice =", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceNotEqualTo(Float value) {
            addCriterion("normalPrice <>", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceGreaterThan(Float value) {
            addCriterion("normalPrice >", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("normalPrice >=", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceLessThan(Float value) {
            addCriterion("normalPrice <", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceLessThanOrEqualTo(Float value) {
            addCriterion("normalPrice <=", value, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceIn(List<Float> values) {
            addCriterion("normalPrice in", values, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceNotIn(List<Float> values) {
            addCriterion("normalPrice not in", values, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceBetween(Float value1, Float value2) {
            addCriterion("normalPrice between", value1, value2, "normalprice");
            return (Criteria) this;
        }

        public Criteria andNormalpriceNotBetween(Float value1, Float value2) {
            addCriterion("normalPrice not between", value1, value2, "normalprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIsNull() {
            addCriterion("memberPrice is null");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIsNotNull() {
            addCriterion("memberPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMemberpriceEqualTo(Float value) {
            addCriterion("memberPrice =", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotEqualTo(Float value) {
            addCriterion("memberPrice <>", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceGreaterThan(Float value) {
            addCriterion("memberPrice >", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("memberPrice >=", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceLessThan(Float value) {
            addCriterion("memberPrice <", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceLessThanOrEqualTo(Float value) {
            addCriterion("memberPrice <=", value, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceIn(List<Float> values) {
            addCriterion("memberPrice in", values, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotIn(List<Float> values) {
            addCriterion("memberPrice not in", values, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceBetween(Float value1, Float value2) {
            addCriterion("memberPrice between", value1, value2, "memberprice");
            return (Criteria) this;
        }

        public Criteria andMemberpriceNotBetween(Float value1, Float value2) {
            addCriterion("memberPrice not between", value1, value2, "memberprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNull() {
            addCriterion("vipPrice is null");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNotNull() {
            addCriterion("vipPrice is not null");
            return (Criteria) this;
        }

        public Criteria andVippriceEqualTo(Float value) {
            addCriterion("vipPrice =", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotEqualTo(Float value) {
            addCriterion("vipPrice <>", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThan(Float value) {
            addCriterion("vipPrice >", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThanOrEqualTo(Float value) {
            addCriterion("vipPrice >=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThan(Float value) {
            addCriterion("vipPrice <", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThanOrEqualTo(Float value) {
            addCriterion("vipPrice <=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIn(List<Float> values) {
            addCriterion("vipPrice in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotIn(List<Float> values) {
            addCriterion("vipPrice not in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceBetween(Float value1, Float value2) {
            addCriterion("vipPrice between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotBetween(Float value1, Float value2) {
            addCriterion("vipPrice not between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceIsNull() {
            addCriterion("negotiatedPrice is null");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceIsNotNull() {
            addCriterion("negotiatedPrice is not null");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceEqualTo(Float value) {
            addCriterion("negotiatedPrice =", value, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceNotEqualTo(Float value) {
            addCriterion("negotiatedPrice <>", value, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceGreaterThan(Float value) {
            addCriterion("negotiatedPrice >", value, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("negotiatedPrice >=", value, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceLessThan(Float value) {
            addCriterion("negotiatedPrice <", value, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceLessThanOrEqualTo(Float value) {
            addCriterion("negotiatedPrice <=", value, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceIn(List<Float> values) {
            addCriterion("negotiatedPrice in", values, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceNotIn(List<Float> values) {
            addCriterion("negotiatedPrice not in", values, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceBetween(Float value1, Float value2) {
            addCriterion("negotiatedPrice between", value1, value2, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andNegotiatedpriceNotBetween(Float value1, Float value2) {
            addCriterion("negotiatedPrice not between", value1, value2, "negotiatedprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIsNull() {
            addCriterion("claimPrice is null");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIsNotNull() {
            addCriterion("claimPrice is not null");
            return (Criteria) this;
        }

        public Criteria andClaimpriceEqualTo(Float value) {
            addCriterion("claimPrice =", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotEqualTo(Float value) {
            addCriterion("claimPrice <>", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceGreaterThan(Float value) {
            addCriterion("claimPrice >", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("claimPrice >=", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceLessThan(Float value) {
            addCriterion("claimPrice <", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceLessThanOrEqualTo(Float value) {
            addCriterion("claimPrice <=", value, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceIn(List<Float> values) {
            addCriterion("claimPrice in", values, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotIn(List<Float> values) {
            addCriterion("claimPrice not in", values, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceBetween(Float value1, Float value2) {
            addCriterion("claimPrice between", value1, value2, "claimprice");
            return (Criteria) this;
        }

        public Criteria andClaimpriceNotBetween(Float value1, Float value2) {
            addCriterion("claimPrice not between", value1, value2, "claimprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIsNull() {
            addCriterion("insurancePrice is null");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIsNotNull() {
            addCriterion("insurancePrice is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceEqualTo(Float value) {
            addCriterion("insurancePrice =", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotEqualTo(Float value) {
            addCriterion("insurancePrice <>", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceGreaterThan(Float value) {
            addCriterion("insurancePrice >", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceGreaterThanOrEqualTo(Float value) {
            addCriterion("insurancePrice >=", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceLessThan(Float value) {
            addCriterion("insurancePrice <", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceLessThanOrEqualTo(Float value) {
            addCriterion("insurancePrice <=", value, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceIn(List<Float> values) {
            addCriterion("insurancePrice in", values, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotIn(List<Float> values) {
            addCriterion("insurancePrice not in", values, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceBetween(Float value1, Float value2) {
            addCriterion("insurancePrice between", value1, value2, "insuranceprice");
            return (Criteria) this;
        }

        public Criteria andInsurancepriceNotBetween(Float value1, Float value2) {
            addCriterion("insurancePrice not between", value1, value2, "insuranceprice");
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