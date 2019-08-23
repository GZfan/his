package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrescriptionExample() {
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

        public Criteria andPrescriptiontimeIsNull() {
            addCriterion("PrescriptionTime is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptiontimeIsNotNull() {
            addCriterion("PrescriptionTime is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptiontimeEqualTo(Date value) {
            addCriterion("PrescriptionTime =", value, "prescriptiontime");
            return (Criteria) this;
        }

        public Criteria andPrescriptiontimeNotEqualTo(Date value) {
            addCriterion("PrescriptionTime <>", value, "prescriptiontime");
            return (Criteria) this;
        }

        public Criteria andPrescriptiontimeGreaterThan(Date value) {
            addCriterion("PrescriptionTime >", value, "prescriptiontime");
            return (Criteria) this;
        }

        public Criteria andPrescriptiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PrescriptionTime >=", value, "prescriptiontime");
            return (Criteria) this;
        }

        public Criteria andPrescriptiontimeLessThan(Date value) {
            addCriterion("PrescriptionTime <", value, "prescriptiontime");
            return (Criteria) this;
        }

        public Criteria andPrescriptiontimeLessThanOrEqualTo(Date value) {
            addCriterion("PrescriptionTime <=", value, "prescriptiontime");
            return (Criteria) this;
        }

        public Criteria andPrescriptiontimeIn(List<Date> values) {
            addCriterion("PrescriptionTime in", values, "prescriptiontime");
            return (Criteria) this;
        }

        public Criteria andPrescriptiontimeNotIn(List<Date> values) {
            addCriterion("PrescriptionTime not in", values, "prescriptiontime");
            return (Criteria) this;
        }

        public Criteria andPrescriptiontimeBetween(Date value1, Date value2) {
            addCriterion("PrescriptionTime between", value1, value2, "prescriptiontime");
            return (Criteria) this;
        }

        public Criteria andPrescriptiontimeNotBetween(Date value1, Date value2) {
            addCriterion("PrescriptionTime not between", value1, value2, "prescriptiontime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionstateIsNull() {
            addCriterion("PrescriptionState is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionstateIsNotNull() {
            addCriterion("PrescriptionState is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionstateEqualTo(Integer value) {
            addCriterion("PrescriptionState =", value, "prescriptionstate");
            return (Criteria) this;
        }

        public Criteria andPrescriptionstateNotEqualTo(Integer value) {
            addCriterion("PrescriptionState <>", value, "prescriptionstate");
            return (Criteria) this;
        }

        public Criteria andPrescriptionstateGreaterThan(Integer value) {
            addCriterion("PrescriptionState >", value, "prescriptionstate");
            return (Criteria) this;
        }

        public Criteria andPrescriptionstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrescriptionState >=", value, "prescriptionstate");
            return (Criteria) this;
        }

        public Criteria andPrescriptionstateLessThan(Integer value) {
            addCriterion("PrescriptionState <", value, "prescriptionstate");
            return (Criteria) this;
        }

        public Criteria andPrescriptionstateLessThanOrEqualTo(Integer value) {
            addCriterion("PrescriptionState <=", value, "prescriptionstate");
            return (Criteria) this;
        }

        public Criteria andPrescriptionstateIn(List<Integer> values) {
            addCriterion("PrescriptionState in", values, "prescriptionstate");
            return (Criteria) this;
        }

        public Criteria andPrescriptionstateNotIn(List<Integer> values) {
            addCriterion("PrescriptionState not in", values, "prescriptionstate");
            return (Criteria) this;
        }

        public Criteria andPrescriptionstateBetween(Integer value1, Integer value2) {
            addCriterion("PrescriptionState between", value1, value2, "prescriptionstate");
            return (Criteria) this;
        }

        public Criteria andPrescriptionstateNotBetween(Integer value1, Integer value2) {
            addCriterion("PrescriptionState not between", value1, value2, "prescriptionstate");
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