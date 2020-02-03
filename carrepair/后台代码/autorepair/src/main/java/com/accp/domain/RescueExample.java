package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RescueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RescueExample() {
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

        public Criteria andCarinfoidIsNull() {
            addCriterion("carinfoid is null");
            return (Criteria) this;
        }

        public Criteria andCarinfoidIsNotNull() {
            addCriterion("carinfoid is not null");
            return (Criteria) this;
        }

        public Criteria andCarinfoidEqualTo(Integer value) {
            addCriterion("carinfoid =", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotEqualTo(Integer value) {
            addCriterion("carinfoid <>", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidGreaterThan(Integer value) {
            addCriterion("carinfoid >", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("carinfoid >=", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidLessThan(Integer value) {
            addCriterion("carinfoid <", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("carinfoid <=", value, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidIn(List<Integer> values) {
            addCriterion("carinfoid in", values, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotIn(List<Integer> values) {
            addCriterion("carinfoid not in", values, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidBetween(Integer value1, Integer value2) {
            addCriterion("carinfoid between", value1, value2, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCarinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("carinfoid not between", value1, value2, "carinfoid");
            return (Criteria) this;
        }

        public Criteria andCounseloridIsNull() {
            addCriterion("counselorid is null");
            return (Criteria) this;
        }

        public Criteria andCounseloridIsNotNull() {
            addCriterion("counselorid is not null");
            return (Criteria) this;
        }

        public Criteria andCounseloridEqualTo(Integer value) {
            addCriterion("counselorid =", value, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridNotEqualTo(Integer value) {
            addCriterion("counselorid <>", value, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridGreaterThan(Integer value) {
            addCriterion("counselorid >", value, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridGreaterThanOrEqualTo(Integer value) {
            addCriterion("counselorid >=", value, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridLessThan(Integer value) {
            addCriterion("counselorid <", value, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridLessThanOrEqualTo(Integer value) {
            addCriterion("counselorid <=", value, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridIn(List<Integer> values) {
            addCriterion("counselorid in", values, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridNotIn(List<Integer> values) {
            addCriterion("counselorid not in", values, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridBetween(Integer value1, Integer value2) {
            addCriterion("counselorid between", value1, value2, "counselorid");
            return (Criteria) this;
        }

        public Criteria andCounseloridNotBetween(Integer value1, Integer value2) {
            addCriterion("counselorid not between", value1, value2, "counselorid");
            return (Criteria) this;
        }

        public Criteria andRescueteamidIsNull() {
            addCriterion("rescueTeamid is null");
            return (Criteria) this;
        }

        public Criteria andRescueteamidIsNotNull() {
            addCriterion("rescueTeamid is not null");
            return (Criteria) this;
        }

        public Criteria andRescueteamidEqualTo(Integer value) {
            addCriterion("rescueTeamid =", value, "rescueteamid");
            return (Criteria) this;
        }

        public Criteria andRescueteamidNotEqualTo(Integer value) {
            addCriterion("rescueTeamid <>", value, "rescueteamid");
            return (Criteria) this;
        }

        public Criteria andRescueteamidGreaterThan(Integer value) {
            addCriterion("rescueTeamid >", value, "rescueteamid");
            return (Criteria) this;
        }

        public Criteria andRescueteamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rescueTeamid >=", value, "rescueteamid");
            return (Criteria) this;
        }

        public Criteria andRescueteamidLessThan(Integer value) {
            addCriterion("rescueTeamid <", value, "rescueteamid");
            return (Criteria) this;
        }

        public Criteria andRescueteamidLessThanOrEqualTo(Integer value) {
            addCriterion("rescueTeamid <=", value, "rescueteamid");
            return (Criteria) this;
        }

        public Criteria andRescueteamidIn(List<Integer> values) {
            addCriterion("rescueTeamid in", values, "rescueteamid");
            return (Criteria) this;
        }

        public Criteria andRescueteamidNotIn(List<Integer> values) {
            addCriterion("rescueTeamid not in", values, "rescueteamid");
            return (Criteria) this;
        }

        public Criteria andRescueteamidBetween(Integer value1, Integer value2) {
            addCriterion("rescueTeamid between", value1, value2, "rescueteamid");
            return (Criteria) this;
        }

        public Criteria andRescueteamidNotBetween(Integer value1, Integer value2) {
            addCriterion("rescueTeamid not between", value1, value2, "rescueteamid");
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

        public Criteria andWorktimesIsNull() {
            addCriterion("worktimes is null");
            return (Criteria) this;
        }

        public Criteria andWorktimesIsNotNull() {
            addCriterion("worktimes is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimesEqualTo(String value) {
            addCriterion("worktimes =", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesNotEqualTo(String value) {
            addCriterion("worktimes <>", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesGreaterThan(String value) {
            addCriterion("worktimes >", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesGreaterThanOrEqualTo(String value) {
            addCriterion("worktimes >=", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesLessThan(String value) {
            addCriterion("worktimes <", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesLessThanOrEqualTo(String value) {
            addCriterion("worktimes <=", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesLike(String value) {
            addCriterion("worktimes like", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesNotLike(String value) {
            addCriterion("worktimes not like", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesIn(List<String> values) {
            addCriterion("worktimes in", values, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesNotIn(List<String> values) {
            addCriterion("worktimes not in", values, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesBetween(String value1, String value2) {
            addCriterion("worktimes between", value1, value2, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesNotBetween(String value1, String value2) {
            addCriterion("worktimes not between", value1, value2, "worktimes");
            return (Criteria) this;
        }

        public Criteria andGetmanIsNull() {
            addCriterion("getman is null");
            return (Criteria) this;
        }

        public Criteria andGetmanIsNotNull() {
            addCriterion("getman is not null");
            return (Criteria) this;
        }

        public Criteria andGetmanEqualTo(String value) {
            addCriterion("getman =", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanNotEqualTo(String value) {
            addCriterion("getman <>", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanGreaterThan(String value) {
            addCriterion("getman >", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanGreaterThanOrEqualTo(String value) {
            addCriterion("getman >=", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanLessThan(String value) {
            addCriterion("getman <", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanLessThanOrEqualTo(String value) {
            addCriterion("getman <=", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanLike(String value) {
            addCriterion("getman like", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanNotLike(String value) {
            addCriterion("getman not like", value, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanIn(List<String> values) {
            addCriterion("getman in", values, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanNotIn(List<String> values) {
            addCriterion("getman not in", values, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanBetween(String value1, String value2) {
            addCriterion("getman between", value1, value2, "getman");
            return (Criteria) this;
        }

        public Criteria andGetmanNotBetween(String value1, String value2) {
            addCriterion("getman not between", value1, value2, "getman");
            return (Criteria) this;
        }

        public Criteria andWorkdateIsNull() {
            addCriterion("workdate is null");
            return (Criteria) this;
        }

        public Criteria andWorkdateIsNotNull() {
            addCriterion("workdate is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdateEqualTo(Date value) {
            addCriterion("workdate =", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotEqualTo(Date value) {
            addCriterion("workdate <>", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateGreaterThan(Date value) {
            addCriterion("workdate >", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateGreaterThanOrEqualTo(Date value) {
            addCriterion("workdate >=", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLessThan(Date value) {
            addCriterion("workdate <", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLessThanOrEqualTo(Date value) {
            addCriterion("workdate <=", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateIn(List<Date> values) {
            addCriterion("workdate in", values, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotIn(List<Date> values) {
            addCriterion("workdate not in", values, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateBetween(Date value1, Date value2) {
            addCriterion("workdate between", value1, value2, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotBetween(Date value1, Date value2) {
            addCriterion("workdate not between", value1, value2, "workdate");
            return (Criteria) this;
        }

        public Criteria andNowdateIsNull() {
            addCriterion("nowdate is null");
            return (Criteria) this;
        }

        public Criteria andNowdateIsNotNull() {
            addCriterion("nowdate is not null");
            return (Criteria) this;
        }

        public Criteria andNowdateEqualTo(Date value) {
            addCriterion("nowdate =", value, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateNotEqualTo(Date value) {
            addCriterion("nowdate <>", value, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateGreaterThan(Date value) {
            addCriterion("nowdate >", value, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateGreaterThanOrEqualTo(Date value) {
            addCriterion("nowdate >=", value, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateLessThan(Date value) {
            addCriterion("nowdate <", value, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateLessThanOrEqualTo(Date value) {
            addCriterion("nowdate <=", value, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateIn(List<Date> values) {
            addCriterion("nowdate in", values, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateNotIn(List<Date> values) {
            addCriterion("nowdate not in", values, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateBetween(Date value1, Date value2) {
            addCriterion("nowdate between", value1, value2, "nowdate");
            return (Criteria) this;
        }

        public Criteria andNowdateNotBetween(Date value1, Date value2) {
            addCriterion("nowdate not between", value1, value2, "nowdate");
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

        public Criteria andCarIsNull() {
            addCriterion("car is null");
            return (Criteria) this;
        }

        public Criteria andCarIsNotNull() {
            addCriterion("car is not null");
            return (Criteria) this;
        }

        public Criteria andCarEqualTo(String value) {
            addCriterion("car =", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotEqualTo(String value) {
            addCriterion("car <>", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarGreaterThan(String value) {
            addCriterion("car >", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarGreaterThanOrEqualTo(String value) {
            addCriterion("car >=", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLessThan(String value) {
            addCriterion("car <", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLessThanOrEqualTo(String value) {
            addCriterion("car <=", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLike(String value) {
            addCriterion("car like", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotLike(String value) {
            addCriterion("car not like", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarIn(List<String> values) {
            addCriterion("car in", values, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotIn(List<String> values) {
            addCriterion("car not in", values, "car");
            return (Criteria) this;
        }

        public Criteria andCarBetween(String value1, String value2) {
            addCriterion("car between", value1, value2, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotBetween(String value1, String value2) {
            addCriterion("car not between", value1, value2, "car");
            return (Criteria) this;
        }

        public Criteria andLicheIsNull() {
            addCriterion("liche is null");
            return (Criteria) this;
        }

        public Criteria andLicheIsNotNull() {
            addCriterion("liche is not null");
            return (Criteria) this;
        }

        public Criteria andLicheEqualTo(Float value) {
            addCriterion("liche =", value, "liche");
            return (Criteria) this;
        }

        public Criteria andLicheNotEqualTo(Float value) {
            addCriterion("liche <>", value, "liche");
            return (Criteria) this;
        }

        public Criteria andLicheGreaterThan(Float value) {
            addCriterion("liche >", value, "liche");
            return (Criteria) this;
        }

        public Criteria andLicheGreaterThanOrEqualTo(Float value) {
            addCriterion("liche >=", value, "liche");
            return (Criteria) this;
        }

        public Criteria andLicheLessThan(Float value) {
            addCriterion("liche <", value, "liche");
            return (Criteria) this;
        }

        public Criteria andLicheLessThanOrEqualTo(Float value) {
            addCriterion("liche <=", value, "liche");
            return (Criteria) this;
        }

        public Criteria andLicheIn(List<Float> values) {
            addCriterion("liche in", values, "liche");
            return (Criteria) this;
        }

        public Criteria andLicheNotIn(List<Float> values) {
            addCriterion("liche not in", values, "liche");
            return (Criteria) this;
        }

        public Criteria andLicheBetween(Float value1, Float value2) {
            addCriterion("liche between", value1, value2, "liche");
            return (Criteria) this;
        }

        public Criteria andLicheNotBetween(Float value1, Float value2) {
            addCriterion("liche not between", value1, value2, "liche");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("worktime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("worktime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(Date value) {
            addCriterion("worktime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(Date value) {
            addCriterion("worktime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(Date value) {
            addCriterion("worktime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("worktime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(Date value) {
            addCriterion("worktime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(Date value) {
            addCriterion("worktime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<Date> values) {
            addCriterion("worktime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<Date> values) {
            addCriterion("worktime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(Date value1, Date value2) {
            addCriterion("worktime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(Date value1, Date value2) {
            addCriterion("worktime not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNull() {
            addCriterion("overtime is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNotNull() {
            addCriterion("overtime is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeEqualTo(Date value) {
            addCriterion("overtime =", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotEqualTo(Date value) {
            addCriterion("overtime <>", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThan(Date value) {
            addCriterion("overtime >", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("overtime >=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThan(Date value) {
            addCriterion("overtime <", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThanOrEqualTo(Date value) {
            addCriterion("overtime <=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn(List<Date> values) {
            addCriterion("overtime in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotIn(List<Date> values) {
            addCriterion("overtime not in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeBetween(Date value1, Date value2) {
            addCriterion("overtime between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotBetween(Date value1, Date value2) {
            addCriterion("overtime not between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andRescueaddressIsNull() {
            addCriterion("rescueaddress is null");
            return (Criteria) this;
        }

        public Criteria andRescueaddressIsNotNull() {
            addCriterion("rescueaddress is not null");
            return (Criteria) this;
        }

        public Criteria andRescueaddressEqualTo(String value) {
            addCriterion("rescueaddress =", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressNotEqualTo(String value) {
            addCriterion("rescueaddress <>", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressGreaterThan(String value) {
            addCriterion("rescueaddress >", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressGreaterThanOrEqualTo(String value) {
            addCriterion("rescueaddress >=", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressLessThan(String value) {
            addCriterion("rescueaddress <", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressLessThanOrEqualTo(String value) {
            addCriterion("rescueaddress <=", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressLike(String value) {
            addCriterion("rescueaddress like", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressNotLike(String value) {
            addCriterion("rescueaddress not like", value, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressIn(List<String> values) {
            addCriterion("rescueaddress in", values, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressNotIn(List<String> values) {
            addCriterion("rescueaddress not in", values, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressBetween(String value1, String value2) {
            addCriterion("rescueaddress between", value1, value2, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andRescueaddressNotBetween(String value1, String value2) {
            addCriterion("rescueaddress not between", value1, value2, "rescueaddress");
            return (Criteria) this;
        }

        public Criteria andSetterIsNull() {
            addCriterion("setter is null");
            return (Criteria) this;
        }

        public Criteria andSetterIsNotNull() {
            addCriterion("setter is not null");
            return (Criteria) this;
        }

        public Criteria andSetterEqualTo(String value) {
            addCriterion("setter =", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterNotEqualTo(String value) {
            addCriterion("setter <>", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterGreaterThan(String value) {
            addCriterion("setter >", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterGreaterThanOrEqualTo(String value) {
            addCriterion("setter >=", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterLessThan(String value) {
            addCriterion("setter <", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterLessThanOrEqualTo(String value) {
            addCriterion("setter <=", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterLike(String value) {
            addCriterion("setter like", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterNotLike(String value) {
            addCriterion("setter not like", value, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterIn(List<String> values) {
            addCriterion("setter in", values, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterNotIn(List<String> values) {
            addCriterion("setter not in", values, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterBetween(String value1, String value2) {
            addCriterion("setter between", value1, value2, "setter");
            return (Criteria) this;
        }

        public Criteria andSetterNotBetween(String value1, String value2) {
            addCriterion("setter not between", value1, value2, "setter");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andFaultIsNull() {
            addCriterion("fault is null");
            return (Criteria) this;
        }

        public Criteria andFaultIsNotNull() {
            addCriterion("fault is not null");
            return (Criteria) this;
        }

        public Criteria andFaultEqualTo(String value) {
            addCriterion("fault =", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotEqualTo(String value) {
            addCriterion("fault <>", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultGreaterThan(String value) {
            addCriterion("fault >", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultGreaterThanOrEqualTo(String value) {
            addCriterion("fault >=", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultLessThan(String value) {
            addCriterion("fault <", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultLessThanOrEqualTo(String value) {
            addCriterion("fault <=", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultLike(String value) {
            addCriterion("fault like", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotLike(String value) {
            addCriterion("fault not like", value, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultIn(List<String> values) {
            addCriterion("fault in", values, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotIn(List<String> values) {
            addCriterion("fault not in", values, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultBetween(String value1, String value2) {
            addCriterion("fault between", value1, value2, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultNotBetween(String value1, String value2) {
            addCriterion("fault not between", value1, value2, "fault");
            return (Criteria) this;
        }

        public Criteria andFaultreasultIsNull() {
            addCriterion("faultreasult is null");
            return (Criteria) this;
        }

        public Criteria andFaultreasultIsNotNull() {
            addCriterion("faultreasult is not null");
            return (Criteria) this;
        }

        public Criteria andFaultreasultEqualTo(String value) {
            addCriterion("faultreasult =", value, "faultreasult");
            return (Criteria) this;
        }

        public Criteria andFaultreasultNotEqualTo(String value) {
            addCriterion("faultreasult <>", value, "faultreasult");
            return (Criteria) this;
        }

        public Criteria andFaultreasultGreaterThan(String value) {
            addCriterion("faultreasult >", value, "faultreasult");
            return (Criteria) this;
        }

        public Criteria andFaultreasultGreaterThanOrEqualTo(String value) {
            addCriterion("faultreasult >=", value, "faultreasult");
            return (Criteria) this;
        }

        public Criteria andFaultreasultLessThan(String value) {
            addCriterion("faultreasult <", value, "faultreasult");
            return (Criteria) this;
        }

        public Criteria andFaultreasultLessThanOrEqualTo(String value) {
            addCriterion("faultreasult <=", value, "faultreasult");
            return (Criteria) this;
        }

        public Criteria andFaultreasultLike(String value) {
            addCriterion("faultreasult like", value, "faultreasult");
            return (Criteria) this;
        }

        public Criteria andFaultreasultNotLike(String value) {
            addCriterion("faultreasult not like", value, "faultreasult");
            return (Criteria) this;
        }

        public Criteria andFaultreasultIn(List<String> values) {
            addCriterion("faultreasult in", values, "faultreasult");
            return (Criteria) this;
        }

        public Criteria andFaultreasultNotIn(List<String> values) {
            addCriterion("faultreasult not in", values, "faultreasult");
            return (Criteria) this;
        }

        public Criteria andFaultreasultBetween(String value1, String value2) {
            addCriterion("faultreasult between", value1, value2, "faultreasult");
            return (Criteria) this;
        }

        public Criteria andFaultreasultNotBetween(String value1, String value2) {
            addCriterion("faultreasult not between", value1, value2, "faultreasult");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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