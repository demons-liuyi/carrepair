package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MaintainregistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MaintainregistExample() {
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

        public Criteria andMaintainnameIsNull() {
            addCriterion("maintainName is null");
            return (Criteria) this;
        }

        public Criteria andMaintainnameIsNotNull() {
            addCriterion("maintainName is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainnameEqualTo(String value) {
            addCriterion("maintainName =", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameNotEqualTo(String value) {
            addCriterion("maintainName <>", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameGreaterThan(String value) {
            addCriterion("maintainName >", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameGreaterThanOrEqualTo(String value) {
            addCriterion("maintainName >=", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameLessThan(String value) {
            addCriterion("maintainName <", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameLessThanOrEqualTo(String value) {
            addCriterion("maintainName <=", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameLike(String value) {
            addCriterion("maintainName like", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameNotLike(String value) {
            addCriterion("maintainName not like", value, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameIn(List<String> values) {
            addCriterion("maintainName in", values, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameNotIn(List<String> values) {
            addCriterion("maintainName not in", values, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameBetween(String value1, String value2) {
            addCriterion("maintainName between", value1, value2, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMaintainnameNotBetween(String value1, String value2) {
            addCriterion("maintainName not between", value1, value2, "maintainname");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(Float value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(Float value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(Float value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(Float value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(Float value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(Float value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<Float> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<Float> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(Float value1, Float value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(Float value1, Float value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileagedateIsNull() {
            addCriterion("mileageDate is null");
            return (Criteria) this;
        }

        public Criteria andMileagedateIsNotNull() {
            addCriterion("mileageDate is not null");
            return (Criteria) this;
        }

        public Criteria andMileagedateEqualTo(Date value) {
            addCriterionForJDBCDate("mileageDate =", value, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("mileageDate <>", value, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateGreaterThan(Date value) {
            addCriterionForJDBCDate("mileageDate >", value, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mileageDate >=", value, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateLessThan(Date value) {
            addCriterionForJDBCDate("mileageDate <", value, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mileageDate <=", value, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateIn(List<Date> values) {
            addCriterionForJDBCDate("mileageDate in", values, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("mileageDate not in", values, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mileageDate between", value1, value2, "mileagedate");
            return (Criteria) this;
        }

        public Criteria andMileagedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mileageDate not between", value1, value2, "mileagedate");
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

        public Criteria andSjmileageIsNull() {
            addCriterion("sjmileage is null");
            return (Criteria) this;
        }

        public Criteria andSjmileageIsNotNull() {
            addCriterion("sjmileage is not null");
            return (Criteria) this;
        }

        public Criteria andSjmileageEqualTo(Float value) {
            addCriterion("sjmileage =", value, "sjmileage");
            return (Criteria) this;
        }

        public Criteria andSjmileageNotEqualTo(Float value) {
            addCriterion("sjmileage <>", value, "sjmileage");
            return (Criteria) this;
        }

        public Criteria andSjmileageGreaterThan(Float value) {
            addCriterion("sjmileage >", value, "sjmileage");
            return (Criteria) this;
        }

        public Criteria andSjmileageGreaterThanOrEqualTo(Float value) {
            addCriterion("sjmileage >=", value, "sjmileage");
            return (Criteria) this;
        }

        public Criteria andSjmileageLessThan(Float value) {
            addCriterion("sjmileage <", value, "sjmileage");
            return (Criteria) this;
        }

        public Criteria andSjmileageLessThanOrEqualTo(Float value) {
            addCriterion("sjmileage <=", value, "sjmileage");
            return (Criteria) this;
        }

        public Criteria andSjmileageIn(List<Float> values) {
            addCriterion("sjmileage in", values, "sjmileage");
            return (Criteria) this;
        }

        public Criteria andSjmileageNotIn(List<Float> values) {
            addCriterion("sjmileage not in", values, "sjmileage");
            return (Criteria) this;
        }

        public Criteria andSjmileageBetween(Float value1, Float value2) {
            addCriterion("sjmileage between", value1, value2, "sjmileage");
            return (Criteria) this;
        }

        public Criteria andSjmileageNotBetween(Float value1, Float value2) {
            addCriterion("sjmileage not between", value1, value2, "sjmileage");
            return (Criteria) this;
        }

        public Criteria andSjmileagedateIsNull() {
            addCriterion("Sjmileagedate is null");
            return (Criteria) this;
        }

        public Criteria andSjmileagedateIsNotNull() {
            addCriterion("Sjmileagedate is not null");
            return (Criteria) this;
        }

        public Criteria andSjmileagedateEqualTo(Date value) {
            addCriterionForJDBCDate("Sjmileagedate =", value, "sjmileagedate");
            return (Criteria) this;
        }

        public Criteria andSjmileagedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Sjmileagedate <>", value, "sjmileagedate");
            return (Criteria) this;
        }

        public Criteria andSjmileagedateGreaterThan(Date value) {
            addCriterionForJDBCDate("Sjmileagedate >", value, "sjmileagedate");
            return (Criteria) this;
        }

        public Criteria andSjmileagedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Sjmileagedate >=", value, "sjmileagedate");
            return (Criteria) this;
        }

        public Criteria andSjmileagedateLessThan(Date value) {
            addCriterionForJDBCDate("Sjmileagedate <", value, "sjmileagedate");
            return (Criteria) this;
        }

        public Criteria andSjmileagedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Sjmileagedate <=", value, "sjmileagedate");
            return (Criteria) this;
        }

        public Criteria andSjmileagedateIn(List<Date> values) {
            addCriterionForJDBCDate("Sjmileagedate in", values, "sjmileagedate");
            return (Criteria) this;
        }

        public Criteria andSjmileagedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Sjmileagedate not in", values, "sjmileagedate");
            return (Criteria) this;
        }

        public Criteria andSjmileagedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Sjmileagedate between", value1, value2, "sjmileagedate");
            return (Criteria) this;
        }

        public Criteria andSjmileagedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Sjmileagedate not between", value1, value2, "sjmileagedate");
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