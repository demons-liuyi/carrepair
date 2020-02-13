package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GetgoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GetgoodExample() {
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

        public Criteria andGoodidIsNull() {
            addCriterion("goodid is null");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNotNull() {
            addCriterion("goodid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodidEqualTo(String value) {
            addCriterion("goodid =", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotEqualTo(String value) {
            addCriterion("goodid <>", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThan(String value) {
            addCriterion("goodid >", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThanOrEqualTo(String value) {
            addCriterion("goodid >=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThan(String value) {
            addCriterion("goodid <", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThanOrEqualTo(String value) {
            addCriterion("goodid <=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLike(String value) {
            addCriterion("goodid like", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotLike(String value) {
            addCriterion("goodid not like", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidIn(List<String> values) {
            addCriterion("goodid in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotIn(List<String> values) {
            addCriterion("goodid not in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidBetween(String value1, String value2) {
            addCriterion("goodid between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotBetween(String value1, String value2) {
            addCriterion("goodid not between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andItemIsNull() {
            addCriterion("item is null");
            return (Criteria) this;
        }

        public Criteria andItemIsNotNull() {
            addCriterion("item is not null");
            return (Criteria) this;
        }

        public Criteria andItemEqualTo(String value) {
            addCriterion("item =", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotEqualTo(String value) {
            addCriterion("item <>", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemGreaterThan(String value) {
            addCriterion("item >", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemGreaterThanOrEqualTo(String value) {
            addCriterion("item >=", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLessThan(String value) {
            addCriterion("item <", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLessThanOrEqualTo(String value) {
            addCriterion("item <=", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLike(String value) {
            addCriterion("item like", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotLike(String value) {
            addCriterion("item not like", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemIn(List<String> values) {
            addCriterion("item in", values, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotIn(List<String> values) {
            addCriterion("item not in", values, "item");
            return (Criteria) this;
        }

        public Criteria andItemBetween(String value1, String value2) {
            addCriterion("item between", value1, value2, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotBetween(String value1, String value2) {
            addCriterion("item not between", value1, value2, "item");
            return (Criteria) this;
        }

        public Criteria andPricetypeIsNull() {
            addCriterion("priceType is null");
            return (Criteria) this;
        }

        public Criteria andPricetypeIsNotNull() {
            addCriterion("priceType is not null");
            return (Criteria) this;
        }

        public Criteria andPricetypeEqualTo(String value) {
            addCriterion("priceType =", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotEqualTo(String value) {
            addCriterion("priceType <>", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeGreaterThan(String value) {
            addCriterion("priceType >", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeGreaterThanOrEqualTo(String value) {
            addCriterion("priceType >=", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLessThan(String value) {
            addCriterion("priceType <", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLessThanOrEqualTo(String value) {
            addCriterion("priceType <=", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLike(String value) {
            addCriterion("priceType like", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotLike(String value) {
            addCriterion("priceType not like", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeIn(List<String> values) {
            addCriterion("priceType in", values, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotIn(List<String> values) {
            addCriterion("priceType not in", values, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeBetween(String value1, String value2) {
            addCriterion("priceType between", value1, value2, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotBetween(String value1, String value2) {
            addCriterion("priceType not between", value1, value2, "pricetype");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceIsNull() {
            addCriterion("discountsPrice is null");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceIsNotNull() {
            addCriterion("discountsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceEqualTo(Long value) {
            addCriterion("discountsPrice =", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceNotEqualTo(Long value) {
            addCriterion("discountsPrice <>", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceGreaterThan(Long value) {
            addCriterion("discountsPrice >", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceGreaterThanOrEqualTo(Long value) {
            addCriterion("discountsPrice >=", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceLessThan(Long value) {
            addCriterion("discountsPrice <", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceLessThanOrEqualTo(Long value) {
            addCriterion("discountsPrice <=", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceIn(List<Long> values) {
            addCriterion("discountsPrice in", values, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceNotIn(List<Long> values) {
            addCriterion("discountsPrice not in", values, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceBetween(Long value1, Long value2) {
            addCriterion("discountsPrice between", value1, value2, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceNotBetween(Long value1, Long value2) {
            addCriterion("discountsPrice not between", value1, value2, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andWjidIsNull() {
            addCriterion("wjid is null");
            return (Criteria) this;
        }

        public Criteria andWjidIsNotNull() {
            addCriterion("wjid is not null");
            return (Criteria) this;
        }

        public Criteria andWjidEqualTo(String value) {
            addCriterion("wjid =", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidNotEqualTo(String value) {
            addCriterion("wjid <>", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidGreaterThan(String value) {
            addCriterion("wjid >", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidGreaterThanOrEqualTo(String value) {
            addCriterion("wjid >=", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidLessThan(String value) {
            addCriterion("wjid <", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidLessThanOrEqualTo(String value) {
            addCriterion("wjid <=", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidLike(String value) {
            addCriterion("wjid like", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidNotLike(String value) {
            addCriterion("wjid not like", value, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidIn(List<String> values) {
            addCriterion("wjid in", values, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidNotIn(List<String> values) {
            addCriterion("wjid not in", values, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidBetween(String value1, String value2) {
            addCriterion("wjid between", value1, value2, "wjid");
            return (Criteria) this;
        }

        public Criteria andWjidNotBetween(String value1, String value2) {
            addCriterion("wjid not between", value1, value2, "wjid");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNull() {
            addCriterion("warehouse is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIsNotNull() {
            addCriterion("warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseEqualTo(String value) {
            addCriterion("warehouse =", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotEqualTo(String value) {
            addCriterion("warehouse <>", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThan(String value) {
            addCriterion("warehouse >", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse >=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThan(String value) {
            addCriterion("warehouse <", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLessThanOrEqualTo(String value) {
            addCriterion("warehouse <=", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseLike(String value) {
            addCriterion("warehouse like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotLike(String value) {
            addCriterion("warehouse not like", value, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseIn(List<String> values) {
            addCriterion("warehouse in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotIn(List<String> values) {
            addCriterion("warehouse not in", values, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseBetween(String value1, String value2) {
            addCriterion("warehouse between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andWarehouseNotBetween(String value1, String value2) {
            addCriterion("warehouse not between", value1, value2, "warehouse");
            return (Criteria) this;
        }

        public Criteria andIsrepairIsNull() {
            addCriterion("isRepair is null");
            return (Criteria) this;
        }

        public Criteria andIsrepairIsNotNull() {
            addCriterion("isRepair is not null");
            return (Criteria) this;
        }

        public Criteria andIsrepairEqualTo(Integer value) {
            addCriterion("isRepair =", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairNotEqualTo(Integer value) {
            addCriterion("isRepair <>", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairGreaterThan(Integer value) {
            addCriterion("isRepair >", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairGreaterThanOrEqualTo(Integer value) {
            addCriterion("isRepair >=", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairLessThan(Integer value) {
            addCriterion("isRepair <", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairLessThanOrEqualTo(Integer value) {
            addCriterion("isRepair <=", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairIn(List<Integer> values) {
            addCriterion("isRepair in", values, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairNotIn(List<Integer> values) {
            addCriterion("isRepair not in", values, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairBetween(Integer value1, Integer value2) {
            addCriterion("isRepair between", value1, value2, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairNotBetween(Integer value1, Integer value2) {
            addCriterion("isRepair not between", value1, value2, "isrepair");
            return (Criteria) this;
        }

        public Criteria andCauseIsNull() {
            addCriterion("cause is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("cause is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(String value) {
            addCriterion("cause =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(String value) {
            addCriterion("cause <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(String value) {
            addCriterion("cause >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(String value) {
            addCriterion("cause >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(String value) {
            addCriterion("cause <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(String value) {
            addCriterion("cause <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLike(String value) {
            addCriterion("cause like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotLike(String value) {
            addCriterion("cause not like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<String> values) {
            addCriterion("cause in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<String> values) {
            addCriterion("cause not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(String value1, String value2) {
            addCriterion("cause between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(String value1, String value2) {
            addCriterion("cause not between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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