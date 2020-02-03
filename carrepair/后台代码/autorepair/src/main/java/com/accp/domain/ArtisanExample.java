package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArtisanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtisanExample() {
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

        public Criteria andArtisannoIsNull() {
            addCriterion("artisanNo is null");
            return (Criteria) this;
        }

        public Criteria andArtisannoIsNotNull() {
            addCriterion("artisanNo is not null");
            return (Criteria) this;
        }

        public Criteria andArtisannoEqualTo(String value) {
            addCriterion("artisanNo =", value, "artisanno");
            return (Criteria) this;
        }

        public Criteria andArtisannoNotEqualTo(String value) {
            addCriterion("artisanNo <>", value, "artisanno");
            return (Criteria) this;
        }

        public Criteria andArtisannoGreaterThan(String value) {
            addCriterion("artisanNo >", value, "artisanno");
            return (Criteria) this;
        }

        public Criteria andArtisannoGreaterThanOrEqualTo(String value) {
            addCriterion("artisanNo >=", value, "artisanno");
            return (Criteria) this;
        }

        public Criteria andArtisannoLessThan(String value) {
            addCriterion("artisanNo <", value, "artisanno");
            return (Criteria) this;
        }

        public Criteria andArtisannoLessThanOrEqualTo(String value) {
            addCriterion("artisanNo <=", value, "artisanno");
            return (Criteria) this;
        }

        public Criteria andArtisannoLike(String value) {
            addCriterion("artisanNo like", value, "artisanno");
            return (Criteria) this;
        }

        public Criteria andArtisannoNotLike(String value) {
            addCriterion("artisanNo not like", value, "artisanno");
            return (Criteria) this;
        }

        public Criteria andArtisannoIn(List<String> values) {
            addCriterion("artisanNo in", values, "artisanno");
            return (Criteria) this;
        }

        public Criteria andArtisannoNotIn(List<String> values) {
            addCriterion("artisanNo not in", values, "artisanno");
            return (Criteria) this;
        }

        public Criteria andArtisannoBetween(String value1, String value2) {
            addCriterion("artisanNo between", value1, value2, "artisanno");
            return (Criteria) this;
        }

        public Criteria andArtisannoNotBetween(String value1, String value2) {
            addCriterion("artisanNo not between", value1, value2, "artisanno");
            return (Criteria) this;
        }

        public Criteria andArtisannameIsNull() {
            addCriterion("artisanName is null");
            return (Criteria) this;
        }

        public Criteria andArtisannameIsNotNull() {
            addCriterion("artisanName is not null");
            return (Criteria) this;
        }

        public Criteria andArtisannameEqualTo(String value) {
            addCriterion("artisanName =", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameNotEqualTo(String value) {
            addCriterion("artisanName <>", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameGreaterThan(String value) {
            addCriterion("artisanName >", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameGreaterThanOrEqualTo(String value) {
            addCriterion("artisanName >=", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameLessThan(String value) {
            addCriterion("artisanName <", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameLessThanOrEqualTo(String value) {
            addCriterion("artisanName <=", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameLike(String value) {
            addCriterion("artisanName like", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameNotLike(String value) {
            addCriterion("artisanName not like", value, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameIn(List<String> values) {
            addCriterion("artisanName in", values, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameNotIn(List<String> values) {
            addCriterion("artisanName not in", values, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameBetween(String value1, String value2) {
            addCriterion("artisanName between", value1, value2, "artisanname");
            return (Criteria) this;
        }

        public Criteria andArtisannameNotBetween(String value1, String value2) {
            addCriterion("artisanName not between", value1, value2, "artisanname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("weChat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("weChat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("weChat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("weChat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("weChat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("weChat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("weChat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("weChat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("weChat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("weChat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("weChat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("weChat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("weChat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("weChat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNull() {
            addCriterion("idCardNo is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNotNull() {
            addCriterion("idCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoEqualTo(String value) {
            addCriterion("idCardNo =", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotEqualTo(String value) {
            addCriterion("idCardNo <>", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThan(String value) {
            addCriterion("idCardNo >", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("idCardNo >=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThan(String value) {
            addCriterion("idCardNo <", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThanOrEqualTo(String value) {
            addCriterion("idCardNo <=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLike(String value) {
            addCriterion("idCardNo like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotLike(String value) {
            addCriterion("idCardNo not like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIn(List<String> values) {
            addCriterion("idCardNo in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotIn(List<String> values) {
            addCriterion("idCardNo not in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoBetween(String value1, String value2) {
            addCriterion("idCardNo between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotBetween(String value1, String value2) {
            addCriterion("idCardNo not between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNull() {
            addCriterion("residence is null");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNotNull() {
            addCriterion("residence is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceEqualTo(String value) {
            addCriterion("residence =", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotEqualTo(String value) {
            addCriterion("residence <>", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThan(String value) {
            addCriterion("residence >", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("residence >=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThan(String value) {
            addCriterion("residence <", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThanOrEqualTo(String value) {
            addCriterion("residence <=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLike(String value) {
            addCriterion("residence like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotLike(String value) {
            addCriterion("residence not like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceIn(List<String> values) {
            addCriterion("residence in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotIn(List<String> values) {
            addCriterion("residence not in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceBetween(String value1, String value2) {
            addCriterion("residence between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotBetween(String value1, String value2) {
            addCriterion("residence not between", value1, value2, "residence");
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

        public Criteria andBankaccountIsNull() {
            addCriterion("bankAccount is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNotNull() {
            addCriterion("bankAccount is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountEqualTo(String value) {
            addCriterion("bankAccount =", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotEqualTo(String value) {
            addCriterion("bankAccount <>", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThan(String value) {
            addCriterion("bankAccount >", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("bankAccount >=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThan(String value) {
            addCriterion("bankAccount <", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThanOrEqualTo(String value) {
            addCriterion("bankAccount <=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLike(String value) {
            addCriterion("bankAccount like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotLike(String value) {
            addCriterion("bankAccount not like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountIn(List<String> values) {
            addCriterion("bankAccount in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotIn(List<String> values) {
            addCriterion("bankAccount not in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountBetween(String value1, String value2) {
            addCriterion("bankAccount between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotBetween(String value1, String value2) {
            addCriterion("bankAccount not between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidIsNull() {
            addCriterion("artisanLevelId is null");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidIsNotNull() {
            addCriterion("artisanLevelId is not null");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidEqualTo(Integer value) {
            addCriterion("artisanLevelId =", value, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidNotEqualTo(Integer value) {
            addCriterion("artisanLevelId <>", value, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidGreaterThan(Integer value) {
            addCriterion("artisanLevelId >", value, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("artisanLevelId >=", value, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidLessThan(Integer value) {
            addCriterion("artisanLevelId <", value, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidLessThanOrEqualTo(Integer value) {
            addCriterion("artisanLevelId <=", value, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidIn(List<Integer> values) {
            addCriterion("artisanLevelId in", values, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidNotIn(List<Integer> values) {
            addCriterion("artisanLevelId not in", values, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidBetween(Integer value1, Integer value2) {
            addCriterion("artisanLevelId between", value1, value2, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andArtisanlevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("artisanLevelId not between", value1, value2, "artisanlevelid");
            return (Criteria) this;
        }

        public Criteria andGroupleaderIsNull() {
            addCriterion("groupLeader is null");
            return (Criteria) this;
        }

        public Criteria andGroupleaderIsNotNull() {
            addCriterion("groupLeader is not null");
            return (Criteria) this;
        }

        public Criteria andGroupleaderEqualTo(Boolean value) {
            addCriterion("groupLeader =", value, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderNotEqualTo(Boolean value) {
            addCriterion("groupLeader <>", value, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderGreaterThan(Boolean value) {
            addCriterion("groupLeader >", value, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("groupLeader >=", value, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderLessThan(Boolean value) {
            addCriterion("groupLeader <", value, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderLessThanOrEqualTo(Boolean value) {
            addCriterion("groupLeader <=", value, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderIn(List<Boolean> values) {
            addCriterion("groupLeader in", values, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderNotIn(List<Boolean> values) {
            addCriterion("groupLeader not in", values, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderBetween(Boolean value1, Boolean value2) {
            addCriterion("groupLeader between", value1, value2, "groupleader");
            return (Criteria) this;
        }

        public Criteria andGroupleaderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("groupLeader not between", value1, value2, "groupleader");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeIsNull() {
            addCriterion("maintainType is null");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeIsNotNull() {
            addCriterion("maintainType is not null");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeEqualTo(String value) {
            addCriterion("maintainType =", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeNotEqualTo(String value) {
            addCriterion("maintainType <>", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeGreaterThan(String value) {
            addCriterion("maintainType >", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeGreaterThanOrEqualTo(String value) {
            addCriterion("maintainType >=", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeLessThan(String value) {
            addCriterion("maintainType <", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeLessThanOrEqualTo(String value) {
            addCriterion("maintainType <=", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeLike(String value) {
            addCriterion("maintainType like", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeNotLike(String value) {
            addCriterion("maintainType not like", value, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeIn(List<String> values) {
            addCriterion("maintainType in", values, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeNotIn(List<String> values) {
            addCriterion("maintainType not in", values, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeBetween(String value1, String value2) {
            addCriterion("maintainType between", value1, value2, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintaintypeNotBetween(String value1, String value2) {
            addCriterion("maintainType not between", value1, value2, "maintaintype");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandIsNull() {
            addCriterion("maintainBrand is null");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandIsNotNull() {
            addCriterion("maintainBrand is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandEqualTo(String value) {
            addCriterion("maintainBrand =", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandNotEqualTo(String value) {
            addCriterion("maintainBrand <>", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandGreaterThan(String value) {
            addCriterion("maintainBrand >", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandGreaterThanOrEqualTo(String value) {
            addCriterion("maintainBrand >=", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandLessThan(String value) {
            addCriterion("maintainBrand <", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandLessThanOrEqualTo(String value) {
            addCriterion("maintainBrand <=", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandLike(String value) {
            addCriterion("maintainBrand like", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandNotLike(String value) {
            addCriterion("maintainBrand not like", value, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandIn(List<String> values) {
            addCriterion("maintainBrand in", values, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandNotIn(List<String> values) {
            addCriterion("maintainBrand not in", values, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandBetween(String value1, String value2) {
            addCriterion("maintainBrand between", value1, value2, "maintainbrand");
            return (Criteria) this;
        }

        public Criteria andMaintainbrandNotBetween(String value1, String value2) {
            addCriterion("maintainBrand not between", value1, value2, "maintainbrand");
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