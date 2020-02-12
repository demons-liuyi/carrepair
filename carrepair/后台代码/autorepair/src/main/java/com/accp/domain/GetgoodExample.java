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

        public Criteria andGoodidEqualTo(Integer value) {
            addCriterion("goodid =", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotEqualTo(Integer value) {
            addCriterion("goodid <>", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThan(Integer value) {
            addCriterion("goodid >", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodid >=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThan(Integer value) {
            addCriterion("goodid <", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("goodid <=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidIn(List<Integer> values) {
            addCriterion("goodid in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotIn(List<Integer> values) {
            addCriterion("goodid not in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidBetween(Integer value1, Integer value2) {
            addCriterion("goodid between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotBetween(Integer value1, Integer value2) {
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

        public Criteria andDiscountspriceEqualTo(String value) {
            addCriterion("discountsPrice =", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceNotEqualTo(String value) {
            addCriterion("discountsPrice <>", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceGreaterThan(String value) {
            addCriterion("discountsPrice >", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceGreaterThanOrEqualTo(String value) {
            addCriterion("discountsPrice >=", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceLessThan(String value) {
            addCriterion("discountsPrice <", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceLessThanOrEqualTo(String value) {
            addCriterion("discountsPrice <=", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceLike(String value) {
            addCriterion("discountsPrice like", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceNotLike(String value) {
            addCriterion("discountsPrice not like", value, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceIn(List<String> values) {
            addCriterion("discountsPrice in", values, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceNotIn(List<String> values) {
            addCriterion("discountsPrice not in", values, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceBetween(String value1, String value2) {
            addCriterion("discountsPrice between", value1, value2, "discountsprice");
            return (Criteria) this;
        }

        public Criteria andDiscountspriceNotBetween(String value1, String value2) {
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

        public Criteria andIsrepairEqualTo(String value) {
            addCriterion("isRepair =", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairNotEqualTo(String value) {
            addCriterion("isRepair <>", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairGreaterThan(String value) {
            addCriterion("isRepair >", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairGreaterThanOrEqualTo(String value) {
            addCriterion("isRepair >=", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairLessThan(String value) {
            addCriterion("isRepair <", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairLessThanOrEqualTo(String value) {
            addCriterion("isRepair <=", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairLike(String value) {
            addCriterion("isRepair like", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairNotLike(String value) {
            addCriterion("isRepair not like", value, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairIn(List<String> values) {
            addCriterion("isRepair in", values, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairNotIn(List<String> values) {
            addCriterion("isRepair not in", values, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairBetween(String value1, String value2) {
            addCriterion("isRepair between", value1, value2, "isrepair");
            return (Criteria) this;
        }

        public Criteria andIsrepairNotBetween(String value1, String value2) {
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

        public Criteria andOtheroneIsNull() {
            addCriterion("otherone is null");
            return (Criteria) this;
        }

        public Criteria andOtheroneIsNotNull() {
            addCriterion("otherone is not null");
            return (Criteria) this;
        }

        public Criteria andOtheroneEqualTo(String value) {
            addCriterion("otherone =", value, "otherone");
            return (Criteria) this;
        }

        public Criteria andOtheroneNotEqualTo(String value) {
            addCriterion("otherone <>", value, "otherone");
            return (Criteria) this;
        }

        public Criteria andOtheroneGreaterThan(String value) {
            addCriterion("otherone >", value, "otherone");
            return (Criteria) this;
        }

        public Criteria andOtheroneGreaterThanOrEqualTo(String value) {
            addCriterion("otherone >=", value, "otherone");
            return (Criteria) this;
        }

        public Criteria andOtheroneLessThan(String value) {
            addCriterion("otherone <", value, "otherone");
            return (Criteria) this;
        }

        public Criteria andOtheroneLessThanOrEqualTo(String value) {
            addCriterion("otherone <=", value, "otherone");
            return (Criteria) this;
        }

        public Criteria andOtheroneLike(String value) {
            addCriterion("otherone like", value, "otherone");
            return (Criteria) this;
        }

        public Criteria andOtheroneNotLike(String value) {
            addCriterion("otherone not like", value, "otherone");
            return (Criteria) this;
        }

        public Criteria andOtheroneIn(List<String> values) {
            addCriterion("otherone in", values, "otherone");
            return (Criteria) this;
        }

        public Criteria andOtheroneNotIn(List<String> values) {
            addCriterion("otherone not in", values, "otherone");
            return (Criteria) this;
        }

        public Criteria andOtheroneBetween(String value1, String value2) {
            addCriterion("otherone between", value1, value2, "otherone");
            return (Criteria) this;
        }

        public Criteria andOtheroneNotBetween(String value1, String value2) {
            addCriterion("otherone not between", value1, value2, "otherone");
            return (Criteria) this;
        }

        public Criteria andOthertwoIsNull() {
            addCriterion("othertwo is null");
            return (Criteria) this;
        }

        public Criteria andOthertwoIsNotNull() {
            addCriterion("othertwo is not null");
            return (Criteria) this;
        }

        public Criteria andOthertwoEqualTo(String value) {
            addCriterion("othertwo =", value, "othertwo");
            return (Criteria) this;
        }

        public Criteria andOthertwoNotEqualTo(String value) {
            addCriterion("othertwo <>", value, "othertwo");
            return (Criteria) this;
        }

        public Criteria andOthertwoGreaterThan(String value) {
            addCriterion("othertwo >", value, "othertwo");
            return (Criteria) this;
        }

        public Criteria andOthertwoGreaterThanOrEqualTo(String value) {
            addCriterion("othertwo >=", value, "othertwo");
            return (Criteria) this;
        }

        public Criteria andOthertwoLessThan(String value) {
            addCriterion("othertwo <", value, "othertwo");
            return (Criteria) this;
        }

        public Criteria andOthertwoLessThanOrEqualTo(String value) {
            addCriterion("othertwo <=", value, "othertwo");
            return (Criteria) this;
        }

        public Criteria andOthertwoLike(String value) {
            addCriterion("othertwo like", value, "othertwo");
            return (Criteria) this;
        }

        public Criteria andOthertwoNotLike(String value) {
            addCriterion("othertwo not like", value, "othertwo");
            return (Criteria) this;
        }

        public Criteria andOthertwoIn(List<String> values) {
            addCriterion("othertwo in", values, "othertwo");
            return (Criteria) this;
        }

        public Criteria andOthertwoNotIn(List<String> values) {
            addCriterion("othertwo not in", values, "othertwo");
            return (Criteria) this;
        }

        public Criteria andOthertwoBetween(String value1, String value2) {
            addCriterion("othertwo between", value1, value2, "othertwo");
            return (Criteria) this;
        }

        public Criteria andOthertwoNotBetween(String value1, String value2) {
            addCriterion("othertwo not between", value1, value2, "othertwo");
            return (Criteria) this;
        }

        public Criteria andOtherthreeIsNull() {
            addCriterion("otherthree is null");
            return (Criteria) this;
        }

        public Criteria andOtherthreeIsNotNull() {
            addCriterion("otherthree is not null");
            return (Criteria) this;
        }

        public Criteria andOtherthreeEqualTo(String value) {
            addCriterion("otherthree =", value, "otherthree");
            return (Criteria) this;
        }

        public Criteria andOtherthreeNotEqualTo(String value) {
            addCriterion("otherthree <>", value, "otherthree");
            return (Criteria) this;
        }

        public Criteria andOtherthreeGreaterThan(String value) {
            addCriterion("otherthree >", value, "otherthree");
            return (Criteria) this;
        }

        public Criteria andOtherthreeGreaterThanOrEqualTo(String value) {
            addCriterion("otherthree >=", value, "otherthree");
            return (Criteria) this;
        }

        public Criteria andOtherthreeLessThan(String value) {
            addCriterion("otherthree <", value, "otherthree");
            return (Criteria) this;
        }

        public Criteria andOtherthreeLessThanOrEqualTo(String value) {
            addCriterion("otherthree <=", value, "otherthree");
            return (Criteria) this;
        }

        public Criteria andOtherthreeLike(String value) {
            addCriterion("otherthree like", value, "otherthree");
            return (Criteria) this;
        }

        public Criteria andOtherthreeNotLike(String value) {
            addCriterion("otherthree not like", value, "otherthree");
            return (Criteria) this;
        }

        public Criteria andOtherthreeIn(List<String> values) {
            addCriterion("otherthree in", values, "otherthree");
            return (Criteria) this;
        }

        public Criteria andOtherthreeNotIn(List<String> values) {
            addCriterion("otherthree not in", values, "otherthree");
            return (Criteria) this;
        }

        public Criteria andOtherthreeBetween(String value1, String value2) {
            addCriterion("otherthree between", value1, value2, "otherthree");
            return (Criteria) this;
        }

        public Criteria andOtherthreeNotBetween(String value1, String value2) {
            addCriterion("otherthree not between", value1, value2, "otherthree");
            return (Criteria) this;
        }

        public Criteria andOtherfourIsNull() {
            addCriterion("otherfour is null");
            return (Criteria) this;
        }

        public Criteria andOtherfourIsNotNull() {
            addCriterion("otherfour is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfourEqualTo(String value) {
            addCriterion("otherfour =", value, "otherfour");
            return (Criteria) this;
        }

        public Criteria andOtherfourNotEqualTo(String value) {
            addCriterion("otherfour <>", value, "otherfour");
            return (Criteria) this;
        }

        public Criteria andOtherfourGreaterThan(String value) {
            addCriterion("otherfour >", value, "otherfour");
            return (Criteria) this;
        }

        public Criteria andOtherfourGreaterThanOrEqualTo(String value) {
            addCriterion("otherfour >=", value, "otherfour");
            return (Criteria) this;
        }

        public Criteria andOtherfourLessThan(String value) {
            addCriterion("otherfour <", value, "otherfour");
            return (Criteria) this;
        }

        public Criteria andOtherfourLessThanOrEqualTo(String value) {
            addCriterion("otherfour <=", value, "otherfour");
            return (Criteria) this;
        }

        public Criteria andOtherfourLike(String value) {
            addCriterion("otherfour like", value, "otherfour");
            return (Criteria) this;
        }

        public Criteria andOtherfourNotLike(String value) {
            addCriterion("otherfour not like", value, "otherfour");
            return (Criteria) this;
        }

        public Criteria andOtherfourIn(List<String> values) {
            addCriterion("otherfour in", values, "otherfour");
            return (Criteria) this;
        }

        public Criteria andOtherfourNotIn(List<String> values) {
            addCriterion("otherfour not in", values, "otherfour");
            return (Criteria) this;
        }

        public Criteria andOtherfourBetween(String value1, String value2) {
            addCriterion("otherfour between", value1, value2, "otherfour");
            return (Criteria) this;
        }

        public Criteria andOtherfourNotBetween(String value1, String value2) {
            addCriterion("otherfour not between", value1, value2, "otherfour");
            return (Criteria) this;
        }

        public Criteria andOtherfiveIsNull() {
            addCriterion("otherfive is null");
            return (Criteria) this;
        }

        public Criteria andOtherfiveIsNotNull() {
            addCriterion("otherfive is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfiveEqualTo(String value) {
            addCriterion("otherfive =", value, "otherfive");
            return (Criteria) this;
        }

        public Criteria andOtherfiveNotEqualTo(String value) {
            addCriterion("otherfive <>", value, "otherfive");
            return (Criteria) this;
        }

        public Criteria andOtherfiveGreaterThan(String value) {
            addCriterion("otherfive >", value, "otherfive");
            return (Criteria) this;
        }

        public Criteria andOtherfiveGreaterThanOrEqualTo(String value) {
            addCriterion("otherfive >=", value, "otherfive");
            return (Criteria) this;
        }

        public Criteria andOtherfiveLessThan(String value) {
            addCriterion("otherfive <", value, "otherfive");
            return (Criteria) this;
        }

        public Criteria andOtherfiveLessThanOrEqualTo(String value) {
            addCriterion("otherfive <=", value, "otherfive");
            return (Criteria) this;
        }

        public Criteria andOtherfiveLike(String value) {
            addCriterion("otherfive like", value, "otherfive");
            return (Criteria) this;
        }

        public Criteria andOtherfiveNotLike(String value) {
            addCriterion("otherfive not like", value, "otherfive");
            return (Criteria) this;
        }

        public Criteria andOtherfiveIn(List<String> values) {
            addCriterion("otherfive in", values, "otherfive");
            return (Criteria) this;
        }

        public Criteria andOtherfiveNotIn(List<String> values) {
            addCriterion("otherfive not in", values, "otherfive");
            return (Criteria) this;
        }

        public Criteria andOtherfiveBetween(String value1, String value2) {
            addCriterion("otherfive between", value1, value2, "otherfive");
            return (Criteria) this;
        }

        public Criteria andOtherfiveNotBetween(String value1, String value2) {
            addCriterion("otherfive not between", value1, value2, "otherfive");
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