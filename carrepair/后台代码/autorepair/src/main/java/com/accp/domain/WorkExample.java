package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkExample() {
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

        public Criteria andInstationwhiteIsNull() {
            addCriterion("instationWhite is null");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteIsNotNull() {
            addCriterion("instationWhite is not null");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteEqualTo(Integer value) {
            addCriterion("instationWhite =", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteNotEqualTo(Integer value) {
            addCriterion("instationWhite <>", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteGreaterThan(Integer value) {
            addCriterion("instationWhite >", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteGreaterThanOrEqualTo(Integer value) {
            addCriterion("instationWhite >=", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteLessThan(Integer value) {
            addCriterion("instationWhite <", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteLessThanOrEqualTo(Integer value) {
            addCriterion("instationWhite <=", value, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteIn(List<Integer> values) {
            addCriterion("instationWhite in", values, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteNotIn(List<Integer> values) {
            addCriterion("instationWhite not in", values, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteBetween(Integer value1, Integer value2) {
            addCriterion("instationWhite between", value1, value2, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationwhiteNotBetween(Integer value1, Integer value2) {
            addCriterion("instationWhite not between", value1, value2, "instationwhite");
            return (Criteria) this;
        }

        public Criteria andInstationblackIsNull() {
            addCriterion("instationBlack is null");
            return (Criteria) this;
        }

        public Criteria andInstationblackIsNotNull() {
            addCriterion("instationBlack is not null");
            return (Criteria) this;
        }

        public Criteria andInstationblackEqualTo(Integer value) {
            addCriterion("instationBlack =", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackNotEqualTo(Integer value) {
            addCriterion("instationBlack <>", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackGreaterThan(Integer value) {
            addCriterion("instationBlack >", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackGreaterThanOrEqualTo(Integer value) {
            addCriterion("instationBlack >=", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackLessThan(Integer value) {
            addCriterion("instationBlack <", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackLessThanOrEqualTo(Integer value) {
            addCriterion("instationBlack <=", value, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackIn(List<Integer> values) {
            addCriterion("instationBlack in", values, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackNotIn(List<Integer> values) {
            addCriterion("instationBlack not in", values, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackBetween(Integer value1, Integer value2) {
            addCriterion("instationBlack between", value1, value2, "instationblack");
            return (Criteria) this;
        }

        public Criteria andInstationblackNotBetween(Integer value1, Integer value2) {
            addCriterion("instationBlack not between", value1, value2, "instationblack");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteIsNull() {
            addCriterion("outsideWhite is null");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteIsNotNull() {
            addCriterion("outsideWhite is not null");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteEqualTo(Integer value) {
            addCriterion("outsideWhite =", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteNotEqualTo(Integer value) {
            addCriterion("outsideWhite <>", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteGreaterThan(Integer value) {
            addCriterion("outsideWhite >", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteGreaterThanOrEqualTo(Integer value) {
            addCriterion("outsideWhite >=", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteLessThan(Integer value) {
            addCriterion("outsideWhite <", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteLessThanOrEqualTo(Integer value) {
            addCriterion("outsideWhite <=", value, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteIn(List<Integer> values) {
            addCriterion("outsideWhite in", values, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteNotIn(List<Integer> values) {
            addCriterion("outsideWhite not in", values, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteBetween(Integer value1, Integer value2) {
            addCriterion("outsideWhite between", value1, value2, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsidewhiteNotBetween(Integer value1, Integer value2) {
            addCriterion("outsideWhite not between", value1, value2, "outsidewhite");
            return (Criteria) this;
        }

        public Criteria andOutsideblackIsNull() {
            addCriterion("outsideBlack is null");
            return (Criteria) this;
        }

        public Criteria andOutsideblackIsNotNull() {
            addCriterion("outsideBlack is not null");
            return (Criteria) this;
        }

        public Criteria andOutsideblackEqualTo(Integer value) {
            addCriterion("outsideBlack =", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackNotEqualTo(Integer value) {
            addCriterion("outsideBlack <>", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackGreaterThan(Integer value) {
            addCriterion("outsideBlack >", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackGreaterThanOrEqualTo(Integer value) {
            addCriterion("outsideBlack >=", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackLessThan(Integer value) {
            addCriterion("outsideBlack <", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackLessThanOrEqualTo(Integer value) {
            addCriterion("outsideBlack <=", value, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackIn(List<Integer> values) {
            addCriterion("outsideBlack in", values, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackNotIn(List<Integer> values) {
            addCriterion("outsideBlack not in", values, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackBetween(Integer value1, Integer value2) {
            addCriterion("outsideBlack between", value1, value2, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andOutsideblackNotBetween(Integer value1, Integer value2) {
            addCriterion("outsideBlack not between", value1, value2, "outsideblack");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("workTime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("workTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(Date value) {
            addCriterion("workTime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(Date value) {
            addCriterion("workTime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(Date value) {
            addCriterion("workTime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("workTime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(Date value) {
            addCriterion("workTime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(Date value) {
            addCriterion("workTime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<Date> values) {
            addCriterion("workTime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<Date> values) {
            addCriterion("workTime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(Date value1, Date value2) {
            addCriterion("workTime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(Date value1, Date value2) {
            addCriterion("workTime not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidIsNull() {
            addCriterion("artisanClassId is null");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidIsNotNull() {
            addCriterion("artisanClassId is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidEqualTo(Integer value) {
            addCriterion("artisanClassId =", value, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidNotEqualTo(Integer value) {
            addCriterion("artisanClassId <>", value, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidGreaterThan(Integer value) {
            addCriterion("artisanClassId >", value, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("artisanClassId >=", value, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidLessThan(Integer value) {
            addCriterion("artisanClassId <", value, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidLessThanOrEqualTo(Integer value) {
            addCriterion("artisanClassId <=", value, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidIn(List<Integer> values) {
            addCriterion("artisanClassId in", values, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidNotIn(List<Integer> values) {
            addCriterion("artisanClassId not in", values, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidBetween(Integer value1, Integer value2) {
            addCriterion("artisanClassId between", value1, value2, "artisanclassid");
            return (Criteria) this;
        }

        public Criteria andArtisanclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("artisanClassId not between", value1, value2, "artisanclassid");
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