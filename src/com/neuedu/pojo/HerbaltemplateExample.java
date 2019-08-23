package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HerbaltemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HerbaltemplateExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNull() {
            addCriterion("DoctorID is null");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNotNull() {
            addCriterion("DoctorID is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoridEqualTo(Integer value) {
            addCriterion("DoctorID =", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotEqualTo(Integer value) {
            addCriterion("DoctorID <>", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThan(Integer value) {
            addCriterion("DoctorID >", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("DoctorID >=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThan(Integer value) {
            addCriterion("DoctorID <", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThanOrEqualTo(Integer value) {
            addCriterion("DoctorID <=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIn(List<Integer> values) {
            addCriterion("DoctorID in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotIn(List<Integer> values) {
            addCriterion("DoctorID not in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridBetween(Integer value1, Integer value2) {
            addCriterion("DoctorID between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotBetween(Integer value1, Integer value2) {
            addCriterion("DoctorID not between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("CreationTime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("CreationTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterion("CreationTime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterion("CreationTime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterion("CreationTime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreationTime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterion("CreationTime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("CreationTime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterion("CreationTime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterion("CreationTime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterion("CreationTime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("CreationTime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeIsNull() {
            addCriterion("PrescriptioType is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeIsNotNull() {
            addCriterion("PrescriptioType is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeEqualTo(String value) {
            addCriterion("PrescriptioType =", value, "prescriptiotype");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeNotEqualTo(String value) {
            addCriterion("PrescriptioType <>", value, "prescriptiotype");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeGreaterThan(String value) {
            addCriterion("PrescriptioType >", value, "prescriptiotype");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeGreaterThanOrEqualTo(String value) {
            addCriterion("PrescriptioType >=", value, "prescriptiotype");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeLessThan(String value) {
            addCriterion("PrescriptioType <", value, "prescriptiotype");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeLessThanOrEqualTo(String value) {
            addCriterion("PrescriptioType <=", value, "prescriptiotype");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeLike(String value) {
            addCriterion("PrescriptioType like", value, "prescriptiotype");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeNotLike(String value) {
            addCriterion("PrescriptioType not like", value, "prescriptiotype");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeIn(List<String> values) {
            addCriterion("PrescriptioType in", values, "prescriptiotype");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeNotIn(List<String> values) {
            addCriterion("PrescriptioType not in", values, "prescriptiotype");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeBetween(String value1, String value2) {
            addCriterion("PrescriptioType between", value1, value2, "prescriptiotype");
            return (Criteria) this;
        }

        public Criteria andPrescriptiotypeNotBetween(String value1, String value2) {
            addCriterion("PrescriptioType not between", value1, value2, "prescriptiotype");
            return (Criteria) this;
        }

        public Criteria andPaynumberIsNull() {
            addCriterion("PayNumber is null");
            return (Criteria) this;
        }

        public Criteria andPaynumberIsNotNull() {
            addCriterion("PayNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPaynumberEqualTo(Integer value) {
            addCriterion("PayNumber =", value, "paynumber");
            return (Criteria) this;
        }

        public Criteria andPaynumberNotEqualTo(Integer value) {
            addCriterion("PayNumber <>", value, "paynumber");
            return (Criteria) this;
        }

        public Criteria andPaynumberGreaterThan(Integer value) {
            addCriterion("PayNumber >", value, "paynumber");
            return (Criteria) this;
        }

        public Criteria andPaynumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayNumber >=", value, "paynumber");
            return (Criteria) this;
        }

        public Criteria andPaynumberLessThan(Integer value) {
            addCriterion("PayNumber <", value, "paynumber");
            return (Criteria) this;
        }

        public Criteria andPaynumberLessThanOrEqualTo(Integer value) {
            addCriterion("PayNumber <=", value, "paynumber");
            return (Criteria) this;
        }

        public Criteria andPaynumberIn(List<Integer> values) {
            addCriterion("PayNumber in", values, "paynumber");
            return (Criteria) this;
        }

        public Criteria andPaynumberNotIn(List<Integer> values) {
            addCriterion("PayNumber not in", values, "paynumber");
            return (Criteria) this;
        }

        public Criteria andPaynumberBetween(Integer value1, Integer value2) {
            addCriterion("PayNumber between", value1, value2, "paynumber");
            return (Criteria) this;
        }

        public Criteria andPaynumberNotBetween(Integer value1, Integer value2) {
            addCriterion("PayNumber not between", value1, value2, "paynumber");
            return (Criteria) this;
        }

        public Criteria andDrugsusageIsNull() {
            addCriterion("DrugsUsage is null");
            return (Criteria) this;
        }

        public Criteria andDrugsusageIsNotNull() {
            addCriterion("DrugsUsage is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsusageEqualTo(String value) {
            addCriterion("DrugsUsage =", value, "drugsusage");
            return (Criteria) this;
        }

        public Criteria andDrugsusageNotEqualTo(String value) {
            addCriterion("DrugsUsage <>", value, "drugsusage");
            return (Criteria) this;
        }

        public Criteria andDrugsusageGreaterThan(String value) {
            addCriterion("DrugsUsage >", value, "drugsusage");
            return (Criteria) this;
        }

        public Criteria andDrugsusageGreaterThanOrEqualTo(String value) {
            addCriterion("DrugsUsage >=", value, "drugsusage");
            return (Criteria) this;
        }

        public Criteria andDrugsusageLessThan(String value) {
            addCriterion("DrugsUsage <", value, "drugsusage");
            return (Criteria) this;
        }

        public Criteria andDrugsusageLessThanOrEqualTo(String value) {
            addCriterion("DrugsUsage <=", value, "drugsusage");
            return (Criteria) this;
        }

        public Criteria andDrugsusageLike(String value) {
            addCriterion("DrugsUsage like", value, "drugsusage");
            return (Criteria) this;
        }

        public Criteria andDrugsusageNotLike(String value) {
            addCriterion("DrugsUsage not like", value, "drugsusage");
            return (Criteria) this;
        }

        public Criteria andDrugsusageIn(List<String> values) {
            addCriterion("DrugsUsage in", values, "drugsusage");
            return (Criteria) this;
        }

        public Criteria andDrugsusageNotIn(List<String> values) {
            addCriterion("DrugsUsage not in", values, "drugsusage");
            return (Criteria) this;
        }

        public Criteria andDrugsusageBetween(String value1, String value2) {
            addCriterion("DrugsUsage between", value1, value2, "drugsusage");
            return (Criteria) this;
        }

        public Criteria andDrugsusageNotBetween(String value1, String value2) {
            addCriterion("DrugsUsage not between", value1, value2, "drugsusage");
            return (Criteria) this;
        }

        public Criteria andTherapyIsNull() {
            addCriterion("Therapy is null");
            return (Criteria) this;
        }

        public Criteria andTherapyIsNotNull() {
            addCriterion("Therapy is not null");
            return (Criteria) this;
        }

        public Criteria andTherapyEqualTo(String value) {
            addCriterion("Therapy =", value, "therapy");
            return (Criteria) this;
        }

        public Criteria andTherapyNotEqualTo(String value) {
            addCriterion("Therapy <>", value, "therapy");
            return (Criteria) this;
        }

        public Criteria andTherapyGreaterThan(String value) {
            addCriterion("Therapy >", value, "therapy");
            return (Criteria) this;
        }

        public Criteria andTherapyGreaterThanOrEqualTo(String value) {
            addCriterion("Therapy >=", value, "therapy");
            return (Criteria) this;
        }

        public Criteria andTherapyLessThan(String value) {
            addCriterion("Therapy <", value, "therapy");
            return (Criteria) this;
        }

        public Criteria andTherapyLessThanOrEqualTo(String value) {
            addCriterion("Therapy <=", value, "therapy");
            return (Criteria) this;
        }

        public Criteria andTherapyLike(String value) {
            addCriterion("Therapy like", value, "therapy");
            return (Criteria) this;
        }

        public Criteria andTherapyNotLike(String value) {
            addCriterion("Therapy not like", value, "therapy");
            return (Criteria) this;
        }

        public Criteria andTherapyIn(List<String> values) {
            addCriterion("Therapy in", values, "therapy");
            return (Criteria) this;
        }

        public Criteria andTherapyNotIn(List<String> values) {
            addCriterion("Therapy not in", values, "therapy");
            return (Criteria) this;
        }

        public Criteria andTherapyBetween(String value1, String value2) {
            addCriterion("Therapy between", value1, value2, "therapy");
            return (Criteria) this;
        }

        public Criteria andTherapyNotBetween(String value1, String value2) {
            addCriterion("Therapy not between", value1, value2, "therapy");
            return (Criteria) this;
        }

        public Criteria andDetailedIsNull() {
            addCriterion("Detailed is null");
            return (Criteria) this;
        }

        public Criteria andDetailedIsNotNull() {
            addCriterion("Detailed is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedEqualTo(String value) {
            addCriterion("Detailed =", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedNotEqualTo(String value) {
            addCriterion("Detailed <>", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedGreaterThan(String value) {
            addCriterion("Detailed >", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedGreaterThanOrEqualTo(String value) {
            addCriterion("Detailed >=", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedLessThan(String value) {
            addCriterion("Detailed <", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedLessThanOrEqualTo(String value) {
            addCriterion("Detailed <=", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedLike(String value) {
            addCriterion("Detailed like", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedNotLike(String value) {
            addCriterion("Detailed not like", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedIn(List<String> values) {
            addCriterion("Detailed in", values, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedNotIn(List<String> values) {
            addCriterion("Detailed not in", values, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedBetween(String value1, String value2) {
            addCriterion("Detailed between", value1, value2, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedNotBetween(String value1, String value2) {
            addCriterion("Detailed not between", value1, value2, "detailed");
            return (Criteria) this;
        }

        public Criteria andAdviceIsNull() {
            addCriterion("Advice is null");
            return (Criteria) this;
        }

        public Criteria andAdviceIsNotNull() {
            addCriterion("Advice is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceEqualTo(String value) {
            addCriterion("Advice =", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceNotEqualTo(String value) {
            addCriterion("Advice <>", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceGreaterThan(String value) {
            addCriterion("Advice >", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("Advice >=", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceLessThan(String value) {
            addCriterion("Advice <", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceLessThanOrEqualTo(String value) {
            addCriterion("Advice <=", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceLike(String value) {
            addCriterion("Advice like", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceNotLike(String value) {
            addCriterion("Advice not like", value, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceIn(List<String> values) {
            addCriterion("Advice in", values, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceNotIn(List<String> values) {
            addCriterion("Advice not in", values, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceBetween(String value1, String value2) {
            addCriterion("Advice between", value1, value2, "advice");
            return (Criteria) this;
        }

        public Criteria andAdviceNotBetween(String value1, String value2) {
            addCriterion("Advice not between", value1, value2, "advice");
            return (Criteria) this;
        }

        public Criteria andScopeIsNull() {
            addCriterion("Scope is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("Scope is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(String value) {
            addCriterion("Scope =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(String value) {
            addCriterion("Scope <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(String value) {
            addCriterion("Scope >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(String value) {
            addCriterion("Scope >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(String value) {
            addCriterion("Scope <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(String value) {
            addCriterion("Scope <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLike(String value) {
            addCriterion("Scope like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotLike(String value) {
            addCriterion("Scope not like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<String> values) {
            addCriterion("Scope in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<String> values) {
            addCriterion("Scope not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(String value1, String value2) {
            addCriterion("Scope between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(String value1, String value2) {
            addCriterion("Scope not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andDelmarkIsNull() {
            addCriterion("DelMark is null");
            return (Criteria) this;
        }

        public Criteria andDelmarkIsNotNull() {
            addCriterion("DelMark is not null");
            return (Criteria) this;
        }

        public Criteria andDelmarkEqualTo(Integer value) {
            addCriterion("DelMark =", value, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkNotEqualTo(Integer value) {
            addCriterion("DelMark <>", value, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkGreaterThan(Integer value) {
            addCriterion("DelMark >", value, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("DelMark >=", value, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkLessThan(Integer value) {
            addCriterion("DelMark <", value, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkLessThanOrEqualTo(Integer value) {
            addCriterion("DelMark <=", value, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkIn(List<Integer> values) {
            addCriterion("DelMark in", values, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkNotIn(List<Integer> values) {
            addCriterion("DelMark not in", values, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkBetween(Integer value1, Integer value2) {
            addCriterion("DelMark between", value1, value2, "delmark");
            return (Criteria) this;
        }

        public Criteria andDelmarkNotBetween(Integer value1, Integer value2) {
            addCriterion("DelMark not between", value1, value2, "delmark");
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