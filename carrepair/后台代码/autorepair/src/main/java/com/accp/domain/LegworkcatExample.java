package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class LegworkcatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LegworkcatExample() {
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

        public Criteria andLicenseplatenumberIsNull() {
            addCriterion("licensePlateNumber is null");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberIsNotNull() {
            addCriterion("licensePlateNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberEqualTo(String value) {
            addCriterion("licensePlateNumber =", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberNotEqualTo(String value) {
            addCriterion("licensePlateNumber <>", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberGreaterThan(String value) {
            addCriterion("licensePlateNumber >", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberGreaterThanOrEqualTo(String value) {
            addCriterion("licensePlateNumber >=", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberLessThan(String value) {
            addCriterion("licensePlateNumber <", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberLessThanOrEqualTo(String value) {
            addCriterion("licensePlateNumber <=", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberLike(String value) {
            addCriterion("licensePlateNumber like", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberNotLike(String value) {
            addCriterion("licensePlateNumber not like", value, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberIn(List<String> values) {
            addCriterion("licensePlateNumber in", values, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberNotIn(List<String> values) {
            addCriterion("licensePlateNumber not in", values, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberBetween(String value1, String value2) {
            addCriterion("licensePlateNumber between", value1, value2, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andLicenseplatenumberNotBetween(String value1, String value2) {
            addCriterion("licensePlateNumber not between", value1, value2, "licenseplatenumber");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
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

        public Criteria andMileageEqualTo(String value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(String value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(String value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(String value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(String value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(String value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLike(String value) {
            addCriterion("mileage like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotLike(String value) {
            addCriterion("mileage not like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<String> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<String> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(String value1, String value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(String value1, String value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
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