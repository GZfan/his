package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HerbalprescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HerbalprescriptionExample() {
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

        public Criteria andMedicalidIsNull() {
            addCriterion("MedicalID is null");
            return (Criteria) this;
        }

        public Criteria andMedicalidIsNotNull() {
            addCriterion("MedicalID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalidEqualTo(Integer value) {
            addCriterion("MedicalID =", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidNotEqualTo(Integer value) {
            addCriterion("MedicalID <>", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidGreaterThan(Integer value) {
            addCriterion("MedicalID >", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MedicalID >=", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidLessThan(Integer value) {
            addCriterion("MedicalID <", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidLessThanOrEqualTo(Integer value) {
            addCriterion("MedicalID <=", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidIn(List<Integer> values) {
            addCriterion("MedicalID in", values, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidNotIn(List<Integer> values) {
            addCriterion("MedicalID not in", values, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidBetween(Integer value1, Integer value2) {
            addCriterion("MedicalID between", value1, value2, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidNotBetween(Integer value1, Integer value2) {
            addCriterion("MedicalID not between", value1, value2, "medicalid");
            return (Criteria) this;
        }

        public Criteria andRegistidIsNull() {
            addCriterion("RegistID is null");
            return (Criteria) this;
        }

        public Criteria andRegistidIsNotNull() {
            addCriterion("RegistID is not null");
            return (Criteria) this;
        }

        public Criteria andRegistidEqualTo(Integer value) {
            addCriterion("RegistID =", value, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidNotEqualTo(Integer value) {
            addCriterion("RegistID <>", value, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidGreaterThan(Integer value) {
            addCriterion("RegistID >", value, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RegistID >=", value, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidLessThan(Integer value) {
            addCriterion("RegistID <", value, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidLessThanOrEqualTo(Integer value) {
            addCriterion("RegistID <=", value, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidIn(List<Integer> values) {
            addCriterion("RegistID in", values, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidNotIn(List<Integer> values) {
            addCriterion("RegistID not in", values, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidBetween(Integer value1, Integer value2) {
            addCriterion("RegistID between", value1, value2, "registid");
            return (Criteria) this;
        }

        public Criteria andRegistidNotBetween(Integer value1, Integer value2) {
            addCriterion("RegistID not between", value1, value2, "registid");
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

        public Criteria andPrescriptionnameIsNull() {
            addCriterion("PrescriptionName is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnameIsNotNull() {
            addCriterion("PrescriptionName is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnameEqualTo(String value) {
            addCriterion("PrescriptionName =", value, "prescriptionname");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnameNotEqualTo(String value) {
            addCriterion("PrescriptionName <>", value, "prescriptionname");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnameGreaterThan(String value) {
            addCriterion("PrescriptionName >", value, "prescriptionname");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnameGreaterThanOrEqualTo(String value) {
            addCriterion("PrescriptionName >=", value, "prescriptionname");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnameLessThan(String value) {
            addCriterion("PrescriptionName <", value, "prescriptionname");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnameLessThanOrEqualTo(String value) {
            addCriterion("PrescriptionName <=", value, "prescriptionname");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnameLike(String value) {
            addCriterion("PrescriptionName like", value, "prescriptionname");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnameNotLike(String value) {
            addCriterion("PrescriptionName not like", value, "prescriptionname");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnameIn(List<String> values) {
            addCriterion("PrescriptionName in", values, "prescriptionname");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnameNotIn(List<String> values) {
            addCriterion("PrescriptionName not in", values, "prescriptionname");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnameBetween(String value1, String value2) {
            addCriterion("PrescriptionName between", value1, value2, "prescriptionname");
            return (Criteria) this;
        }

        public Criteria andPrescriptionnameNotBetween(String value1, String value2) {
            addCriterion("PrescriptionName not between", value1, value2, "prescriptionname");
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

        public Criteria andFrequencyIsNull() {
            addCriterion("Frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("Frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(String value) {
            addCriterion("Frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(String value) {
            addCriterion("Frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(String value) {
            addCriterion("Frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("Frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(String value) {
            addCriterion("Frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(String value) {
            addCriterion("Frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLike(String value) {
            addCriterion("Frequency like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotLike(String value) {
            addCriterion("Frequency not like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<String> values) {
            addCriterion("Frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<String> values) {
            addCriterion("Frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(String value1, String value2) {
            addCriterion("Frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(String value1, String value2) {
            addCriterion("Frequency not between", value1, value2, "frequency");
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

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("State not between", value1, value2, "state");
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