package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompletedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompletedExample() {
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

        public Criteria andYesornoIsNull() {
            addCriterion("yesOrno is null");
            return (Criteria) this;
        }

        public Criteria andYesornoIsNotNull() {
            addCriterion("yesOrno is not null");
            return (Criteria) this;
        }

        public Criteria andYesornoEqualTo(Integer value) {
            addCriterion("yesOrno =", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoNotEqualTo(Integer value) {
            addCriterion("yesOrno <>", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoGreaterThan(Integer value) {
            addCriterion("yesOrno >", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoGreaterThanOrEqualTo(Integer value) {
            addCriterion("yesOrno >=", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoLessThan(Integer value) {
            addCriterion("yesOrno <", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoLessThanOrEqualTo(Integer value) {
            addCriterion("yesOrno <=", value, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoIn(List<Integer> values) {
            addCriterion("yesOrno in", values, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoNotIn(List<Integer> values) {
            addCriterion("yesOrno not in", values, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoBetween(Integer value1, Integer value2) {
            addCriterion("yesOrno between", value1, value2, "yesorno");
            return (Criteria) this;
        }

        public Criteria andYesornoNotBetween(Integer value1, Integer value2) {
            addCriterion("yesOrno not between", value1, value2, "yesorno");
            return (Criteria) this;
        }

        public Criteria andPredicttimeIsNull() {
            addCriterion("predicttime is null");
            return (Criteria) this;
        }

        public Criteria andPredicttimeIsNotNull() {
            addCriterion("predicttime is not null");
            return (Criteria) this;
        }

        public Criteria andPredicttimeEqualTo(Date value) {
            addCriterion("predicttime =", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeNotEqualTo(Date value) {
            addCriterion("predicttime <>", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeGreaterThan(Date value) {
            addCriterion("predicttime >", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("predicttime >=", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeLessThan(Date value) {
            addCriterion("predicttime <", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeLessThanOrEqualTo(Date value) {
            addCriterion("predicttime <=", value, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeIn(List<Date> values) {
            addCriterion("predicttime in", values, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeNotIn(List<Date> values) {
            addCriterion("predicttime not in", values, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeBetween(Date value1, Date value2) {
            addCriterion("predicttime between", value1, value2, "predicttime");
            return (Criteria) this;
        }

        public Criteria andPredicttimeNotBetween(Date value1, Date value2) {
            addCriterion("predicttime not between", value1, value2, "predicttime");
            return (Criteria) this;
        }

        public Criteria andNowtimeIsNull() {
            addCriterion("nowtime is null");
            return (Criteria) this;
        }

        public Criteria andNowtimeIsNotNull() {
            addCriterion("nowtime is not null");
            return (Criteria) this;
        }

        public Criteria andNowtimeEqualTo(Date value) {
            addCriterion("nowtime =", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeNotEqualTo(Date value) {
            addCriterion("nowtime <>", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeGreaterThan(Date value) {
            addCriterion("nowtime >", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nowtime >=", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeLessThan(Date value) {
            addCriterion("nowtime <", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeLessThanOrEqualTo(Date value) {
            addCriterion("nowtime <=", value, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeIn(List<Date> values) {
            addCriterion("nowtime in", values, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeNotIn(List<Date> values) {
            addCriterion("nowtime not in", values, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeBetween(Date value1, Date value2) {
            addCriterion("nowtime between", value1, value2, "nowtime");
            return (Criteria) this;
        }

        public Criteria andNowtimeNotBetween(Date value1, Date value2) {
            addCriterion("nowtime not between", value1, value2, "nowtime");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNull() {
            addCriterion("workid is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workid is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(Integer value) {
            addCriterion("workid =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(Integer value) {
            addCriterion("workid <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(Integer value) {
            addCriterion("workid >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("workid >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(Integer value) {
            addCriterion("workid <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(Integer value) {
            addCriterion("workid <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<Integer> values) {
            addCriterion("workid in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<Integer> values) {
            addCriterion("workid not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(Integer value1, Integer value2) {
            addCriterion("workid between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(Integer value1, Integer value2) {
            addCriterion("workid not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andDutyidIsNull() {
            addCriterion("dutyid is null");
            return (Criteria) this;
        }

        public Criteria andDutyidIsNotNull() {
            addCriterion("dutyid is not null");
            return (Criteria) this;
        }

        public Criteria andDutyidEqualTo(Integer value) {
            addCriterion("dutyid =", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotEqualTo(Integer value) {
            addCriterion("dutyid <>", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThan(Integer value) {
            addCriterion("dutyid >", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dutyid >=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThan(Integer value) {
            addCriterion("dutyid <", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidLessThanOrEqualTo(Integer value) {
            addCriterion("dutyid <=", value, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidIn(List<Integer> values) {
            addCriterion("dutyid in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotIn(List<Integer> values) {
            addCriterion("dutyid not in", values, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidBetween(Integer value1, Integer value2) {
            addCriterion("dutyid between", value1, value2, "dutyid");
            return (Criteria) this;
        }

        public Criteria andDutyidNotBetween(Integer value1, Integer value2) {
            addCriterion("dutyid not between", value1, value2, "dutyid");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
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