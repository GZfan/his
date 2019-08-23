package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegisterExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCasenumberIsNull() {
            addCriterion("CaseNumber is null");
            return (Criteria) this;
        }

        public Criteria andCasenumberIsNotNull() {
            addCriterion("CaseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCasenumberEqualTo(String value) {
            addCriterion("CaseNumber =", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberNotEqualTo(String value) {
            addCriterion("CaseNumber <>", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberGreaterThan(String value) {
            addCriterion("CaseNumber >", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberGreaterThanOrEqualTo(String value) {
            addCriterion("CaseNumber >=", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberLessThan(String value) {
            addCriterion("CaseNumber <", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberLessThanOrEqualTo(String value) {
            addCriterion("CaseNumber <=", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberLike(String value) {
            addCriterion("CaseNumber like", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberNotLike(String value) {
            addCriterion("CaseNumber not like", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberIn(List<String> values) {
            addCriterion("CaseNumber in", values, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberNotIn(List<String> values) {
            addCriterion("CaseNumber not in", values, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberBetween(String value1, String value2) {
            addCriterion("CaseNumber between", value1, value2, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberNotBetween(String value1, String value2) {
            addCriterion("CaseNumber not between", value1, value2, "casenumber");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("RealName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("RealName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("RealName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("RealName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("RealName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("RealName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("RealName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("RealName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("RealName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("RealName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("RealName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("RealName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("RealName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("RealName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("Gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("IDnumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("IDnumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("IDnumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("IDnumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("IDnumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("IDnumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("IDnumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("IDnumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("IDnumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("IDnumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("IDnumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("IDnumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("IDnumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("IDnumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("BirthDate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("BirthDate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(Date value) {
            addCriterionForJDBCDate("BirthDate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BirthDate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(Date value) {
            addCriterionForJDBCDate("BirthDate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BirthDate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(Date value) {
            addCriterionForJDBCDate("BirthDate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BirthDate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<Date> values) {
            addCriterionForJDBCDate("BirthDate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BirthDate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BirthDate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BirthDate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("Age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("Age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("Age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("Age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("Age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("Age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("Age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("Age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("Age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("Age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("Age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgetypeIsNull() {
            addCriterion("AgeType is null");
            return (Criteria) this;
        }

        public Criteria andAgetypeIsNotNull() {
            addCriterion("AgeType is not null");
            return (Criteria) this;
        }

        public Criteria andAgetypeEqualTo(String value) {
            addCriterion("AgeType =", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotEqualTo(String value) {
            addCriterion("AgeType <>", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeGreaterThan(String value) {
            addCriterion("AgeType >", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeGreaterThanOrEqualTo(String value) {
            addCriterion("AgeType >=", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeLessThan(String value) {
            addCriterion("AgeType <", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeLessThanOrEqualTo(String value) {
            addCriterion("AgeType <=", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeLike(String value) {
            addCriterion("AgeType like", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotLike(String value) {
            addCriterion("AgeType not like", value, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeIn(List<String> values) {
            addCriterion("AgeType in", values, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotIn(List<String> values) {
            addCriterion("AgeType not in", values, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeBetween(String value1, String value2) {
            addCriterion("AgeType between", value1, value2, "agetype");
            return (Criteria) this;
        }

        public Criteria andAgetypeNotBetween(String value1, String value2) {
            addCriterion("AgeType not between", value1, value2, "agetype");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNull() {
            addCriterion("HomeAddress is null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNotNull() {
            addCriterion("HomeAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressEqualTo(String value) {
            addCriterion("HomeAddress =", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotEqualTo(String value) {
            addCriterion("HomeAddress <>", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThan(String value) {
            addCriterion("HomeAddress >", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("HomeAddress >=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThan(String value) {
            addCriterion("HomeAddress <", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThanOrEqualTo(String value) {
            addCriterion("HomeAddress <=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLike(String value) {
            addCriterion("HomeAddress like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotLike(String value) {
            addCriterion("HomeAddress not like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIn(List<String> values) {
            addCriterion("HomeAddress in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotIn(List<String> values) {
            addCriterion("HomeAddress not in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressBetween(String value1, String value2) {
            addCriterion("HomeAddress between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotBetween(String value1, String value2) {
            addCriterion("HomeAddress not between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andVisitdateIsNull() {
            addCriterion("VisitDate is null");
            return (Criteria) this;
        }

        public Criteria andVisitdateIsNotNull() {
            addCriterion("VisitDate is not null");
            return (Criteria) this;
        }

        public Criteria andVisitdateEqualTo(Date value) {
            addCriterionForJDBCDate("VisitDate =", value, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("VisitDate <>", value, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateGreaterThan(Date value) {
            addCriterionForJDBCDate("VisitDate >", value, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VisitDate >=", value, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateLessThan(Date value) {
            addCriterionForJDBCDate("VisitDate <", value, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VisitDate <=", value, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateIn(List<Date> values) {
            addCriterionForJDBCDate("VisitDate in", values, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("VisitDate not in", values, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VisitDate between", value1, value2, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VisitDate not between", value1, value2, "visitdate");
            return (Criteria) this;
        }

        public Criteria andNoonIsNull() {
            addCriterion("Noon is null");
            return (Criteria) this;
        }

        public Criteria andNoonIsNotNull() {
            addCriterion("Noon is not null");
            return (Criteria) this;
        }

        public Criteria andNoonEqualTo(String value) {
            addCriterion("Noon =", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotEqualTo(String value) {
            addCriterion("Noon <>", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonGreaterThan(String value) {
            addCriterion("Noon >", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonGreaterThanOrEqualTo(String value) {
            addCriterion("Noon >=", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLessThan(String value) {
            addCriterion("Noon <", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLessThanOrEqualTo(String value) {
            addCriterion("Noon <=", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLike(String value) {
            addCriterion("Noon like", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotLike(String value) {
            addCriterion("Noon not like", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonIn(List<String> values) {
            addCriterion("Noon in", values, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotIn(List<String> values) {
            addCriterion("Noon not in", values, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonBetween(String value1, String value2) {
            addCriterion("Noon between", value1, value2, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotBetween(String value1, String value2) {
            addCriterion("Noon not between", value1, value2, "noon");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DeptID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DeptID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Integer value) {
            addCriterion("DeptID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Integer value) {
            addCriterion("DeptID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Integer value) {
            addCriterion("DeptID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DeptID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Integer value) {
            addCriterion("DeptID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Integer value) {
            addCriterion("DeptID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Integer> values) {
            addCriterion("DeptID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Integer> values) {
            addCriterion("DeptID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Integer value1, Integer value2) {
            addCriterion("DeptID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("DeptID not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andRegistleidIsNull() {
            addCriterion("RegistLeID is null");
            return (Criteria) this;
        }

        public Criteria andRegistleidIsNotNull() {
            addCriterion("RegistLeID is not null");
            return (Criteria) this;
        }

        public Criteria andRegistleidEqualTo(Integer value) {
            addCriterion("RegistLeID =", value, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidNotEqualTo(Integer value) {
            addCriterion("RegistLeID <>", value, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidGreaterThan(Integer value) {
            addCriterion("RegistLeID >", value, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RegistLeID >=", value, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidLessThan(Integer value) {
            addCriterion("RegistLeID <", value, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidLessThanOrEqualTo(Integer value) {
            addCriterion("RegistLeID <=", value, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidIn(List<Integer> values) {
            addCriterion("RegistLeID in", values, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidNotIn(List<Integer> values) {
            addCriterion("RegistLeID not in", values, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidBetween(Integer value1, Integer value2) {
            addCriterion("RegistLeID between", value1, value2, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidNotBetween(Integer value1, Integer value2) {
            addCriterion("RegistLeID not between", value1, value2, "registleid");
            return (Criteria) this;
        }

        public Criteria andSettleidIsNull() {
            addCriterion("SettleID is null");
            return (Criteria) this;
        }

        public Criteria andSettleidIsNotNull() {
            addCriterion("SettleID is not null");
            return (Criteria) this;
        }

        public Criteria andSettleidEqualTo(Integer value) {
            addCriterion("SettleID =", value, "settleid");
            return (Criteria) this;
        }

        public Criteria andSettleidNotEqualTo(Integer value) {
            addCriterion("SettleID <>", value, "settleid");
            return (Criteria) this;
        }

        public Criteria andSettleidGreaterThan(Integer value) {
            addCriterion("SettleID >", value, "settleid");
            return (Criteria) this;
        }

        public Criteria andSettleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SettleID >=", value, "settleid");
            return (Criteria) this;
        }

        public Criteria andSettleidLessThan(Integer value) {
            addCriterion("SettleID <", value, "settleid");
            return (Criteria) this;
        }

        public Criteria andSettleidLessThanOrEqualTo(Integer value) {
            addCriterion("SettleID <=", value, "settleid");
            return (Criteria) this;
        }

        public Criteria andSettleidIn(List<Integer> values) {
            addCriterion("SettleID in", values, "settleid");
            return (Criteria) this;
        }

        public Criteria andSettleidNotIn(List<Integer> values) {
            addCriterion("SettleID not in", values, "settleid");
            return (Criteria) this;
        }

        public Criteria andSettleidBetween(Integer value1, Integer value2) {
            addCriterion("SettleID between", value1, value2, "settleid");
            return (Criteria) this;
        }

        public Criteria andSettleidNotBetween(Integer value1, Integer value2) {
            addCriterion("SettleID not between", value1, value2, "settleid");
            return (Criteria) this;
        }

        public Criteria andIsbookIsNull() {
            addCriterion("IsBook is null");
            return (Criteria) this;
        }

        public Criteria andIsbookIsNotNull() {
            addCriterion("IsBook is not null");
            return (Criteria) this;
        }

        public Criteria andIsbookEqualTo(String value) {
            addCriterion("IsBook =", value, "isbook");
            return (Criteria) this;
        }

        public Criteria andIsbookNotEqualTo(String value) {
            addCriterion("IsBook <>", value, "isbook");
            return (Criteria) this;
        }

        public Criteria andIsbookGreaterThan(String value) {
            addCriterion("IsBook >", value, "isbook");
            return (Criteria) this;
        }

        public Criteria andIsbookGreaterThanOrEqualTo(String value) {
            addCriterion("IsBook >=", value, "isbook");
            return (Criteria) this;
        }

        public Criteria andIsbookLessThan(String value) {
            addCriterion("IsBook <", value, "isbook");
            return (Criteria) this;
        }

        public Criteria andIsbookLessThanOrEqualTo(String value) {
            addCriterion("IsBook <=", value, "isbook");
            return (Criteria) this;
        }

        public Criteria andIsbookLike(String value) {
            addCriterion("IsBook like", value, "isbook");
            return (Criteria) this;
        }

        public Criteria andIsbookNotLike(String value) {
            addCriterion("IsBook not like", value, "isbook");
            return (Criteria) this;
        }

        public Criteria andIsbookIn(List<String> values) {
            addCriterion("IsBook in", values, "isbook");
            return (Criteria) this;
        }

        public Criteria andIsbookNotIn(List<String> values) {
            addCriterion("IsBook not in", values, "isbook");
            return (Criteria) this;
        }

        public Criteria andIsbookBetween(String value1, String value2) {
            addCriterion("IsBook between", value1, value2, "isbook");
            return (Criteria) this;
        }

        public Criteria andIsbookNotBetween(String value1, String value2) {
            addCriterion("IsBook not between", value1, value2, "isbook");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIsNull() {
            addCriterion("RegistTime is null");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIsNotNull() {
            addCriterion("RegistTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegisttimeEqualTo(Date value) {
            addCriterion("RegistTime =", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotEqualTo(Date value) {
            addCriterion("RegistTime <>", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeGreaterThan(Date value) {
            addCriterion("RegistTime >", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RegistTime >=", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeLessThan(Date value) {
            addCriterion("RegistTime <", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeLessThanOrEqualTo(Date value) {
            addCriterion("RegistTime <=", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIn(List<Date> values) {
            addCriterion("RegistTime in", values, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotIn(List<Date> values) {
            addCriterion("RegistTime not in", values, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeBetween(Date value1, Date value2) {
            addCriterion("RegistTime between", value1, value2, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotBetween(Date value1, Date value2) {
            addCriterion("RegistTime not between", value1, value2, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisteridIsNull() {
            addCriterion("RegisterID is null");
            return (Criteria) this;
        }

        public Criteria andRegisteridIsNotNull() {
            addCriterion("RegisterID is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteridEqualTo(Integer value) {
            addCriterion("RegisterID =", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotEqualTo(Integer value) {
            addCriterion("RegisterID <>", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridGreaterThan(Integer value) {
            addCriterion("RegisterID >", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("RegisterID >=", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridLessThan(Integer value) {
            addCriterion("RegisterID <", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridLessThanOrEqualTo(Integer value) {
            addCriterion("RegisterID <=", value, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridIn(List<Integer> values) {
            addCriterion("RegisterID in", values, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotIn(List<Integer> values) {
            addCriterion("RegisterID not in", values, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridBetween(Integer value1, Integer value2) {
            addCriterion("RegisterID between", value1, value2, "registerid");
            return (Criteria) this;
        }

        public Criteria andRegisteridNotBetween(Integer value1, Integer value2) {
            addCriterion("RegisterID not between", value1, value2, "registerid");
            return (Criteria) this;
        }

        public Criteria andVisitstateIsNull() {
            addCriterion("VisitState is null");
            return (Criteria) this;
        }

        public Criteria andVisitstateIsNotNull() {
            addCriterion("VisitState is not null");
            return (Criteria) this;
        }

        public Criteria andVisitstateEqualTo(Integer value) {
            addCriterion("VisitState =", value, "visitstate");
            return (Criteria) this;
        }

        public Criteria andVisitstateNotEqualTo(Integer value) {
            addCriterion("VisitState <>", value, "visitstate");
            return (Criteria) this;
        }

        public Criteria andVisitstateGreaterThan(Integer value) {
            addCriterion("VisitState >", value, "visitstate");
            return (Criteria) this;
        }

        public Criteria andVisitstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("VisitState >=", value, "visitstate");
            return (Criteria) this;
        }

        public Criteria andVisitstateLessThan(Integer value) {
            addCriterion("VisitState <", value, "visitstate");
            return (Criteria) this;
        }

        public Criteria andVisitstateLessThanOrEqualTo(Integer value) {
            addCriterion("VisitState <=", value, "visitstate");
            return (Criteria) this;
        }

        public Criteria andVisitstateIn(List<Integer> values) {
            addCriterion("VisitState in", values, "visitstate");
            return (Criteria) this;
        }

        public Criteria andVisitstateNotIn(List<Integer> values) {
            addCriterion("VisitState not in", values, "visitstate");
            return (Criteria) this;
        }

        public Criteria andVisitstateBetween(Integer value1, Integer value2) {
            addCriterion("VisitState between", value1, value2, "visitstate");
            return (Criteria) this;
        }

        public Criteria andVisitstateNotBetween(Integer value1, Integer value2) {
            addCriterion("VisitState not between", value1, value2, "visitstate");
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