package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicaldiseaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicaldiseaseExample() {
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

        public Criteria andDiseaseidIsNull() {
            addCriterion("DiseaseID is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseidIsNotNull() {
            addCriterion("DiseaseID is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseidEqualTo(Integer value) {
            addCriterion("DiseaseID =", value, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidNotEqualTo(Integer value) {
            addCriterion("DiseaseID <>", value, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidGreaterThan(Integer value) {
            addCriterion("DiseaseID >", value, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DiseaseID >=", value, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidLessThan(Integer value) {
            addCriterion("DiseaseID <", value, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidLessThanOrEqualTo(Integer value) {
            addCriterion("DiseaseID <=", value, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidIn(List<Integer> values) {
            addCriterion("DiseaseID in", values, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidNotIn(List<Integer> values) {
            addCriterion("DiseaseID not in", values, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidBetween(Integer value1, Integer value2) {
            addCriterion("DiseaseID between", value1, value2, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("DiseaseID not between", value1, value2, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiagnosetypeIsNull() {
            addCriterion("DiagnoseType is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosetypeIsNotNull() {
            addCriterion("DiagnoseType is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosetypeEqualTo(Integer value) {
            addCriterion("DiagnoseType =", value, "diagnosetype");
            return (Criteria) this;
        }

        public Criteria andDiagnosetypeNotEqualTo(Integer value) {
            addCriterion("DiagnoseType <>", value, "diagnosetype");
            return (Criteria) this;
        }

        public Criteria andDiagnosetypeGreaterThan(Integer value) {
            addCriterion("DiagnoseType >", value, "diagnosetype");
            return (Criteria) this;
        }

        public Criteria andDiagnosetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DiagnoseType >=", value, "diagnosetype");
            return (Criteria) this;
        }

        public Criteria andDiagnosetypeLessThan(Integer value) {
            addCriterion("DiagnoseType <", value, "diagnosetype");
            return (Criteria) this;
        }

        public Criteria andDiagnosetypeLessThanOrEqualTo(Integer value) {
            addCriterion("DiagnoseType <=", value, "diagnosetype");
            return (Criteria) this;
        }

        public Criteria andDiagnosetypeIn(List<Integer> values) {
            addCriterion("DiagnoseType in", values, "diagnosetype");
            return (Criteria) this;
        }

        public Criteria andDiagnosetypeNotIn(List<Integer> values) {
            addCriterion("DiagnoseType not in", values, "diagnosetype");
            return (Criteria) this;
        }

        public Criteria andDiagnosetypeBetween(Integer value1, Integer value2) {
            addCriterion("DiagnoseType between", value1, value2, "diagnosetype");
            return (Criteria) this;
        }

        public Criteria andDiagnosetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DiagnoseType not between", value1, value2, "diagnosetype");
            return (Criteria) this;
        }

        public Criteria andGetsiskdateIsNull() {
            addCriterion("GetSiskDate is null");
            return (Criteria) this;
        }

        public Criteria andGetsiskdateIsNotNull() {
            addCriterion("GetSiskDate is not null");
            return (Criteria) this;
        }

        public Criteria andGetsiskdateEqualTo(Date value) {
            addCriterion("GetSiskDate =", value, "getsiskdate");
            return (Criteria) this;
        }

        public Criteria andGetsiskdateNotEqualTo(Date value) {
            addCriterion("GetSiskDate <>", value, "getsiskdate");
            return (Criteria) this;
        }

        public Criteria andGetsiskdateGreaterThan(Date value) {
            addCriterion("GetSiskDate >", value, "getsiskdate");
            return (Criteria) this;
        }

        public Criteria andGetsiskdateGreaterThanOrEqualTo(Date value) {
            addCriterion("GetSiskDate >=", value, "getsiskdate");
            return (Criteria) this;
        }

        public Criteria andGetsiskdateLessThan(Date value) {
            addCriterion("GetSiskDate <", value, "getsiskdate");
            return (Criteria) this;
        }

        public Criteria andGetsiskdateLessThanOrEqualTo(Date value) {
            addCriterion("GetSiskDate <=", value, "getsiskdate");
            return (Criteria) this;
        }

        public Criteria andGetsiskdateIn(List<Date> values) {
            addCriterion("GetSiskDate in", values, "getsiskdate");
            return (Criteria) this;
        }

        public Criteria andGetsiskdateNotIn(List<Date> values) {
            addCriterion("GetSiskDate not in", values, "getsiskdate");
            return (Criteria) this;
        }

        public Criteria andGetsiskdateBetween(Date value1, Date value2) {
            addCriterion("GetSiskDate between", value1, value2, "getsiskdate");
            return (Criteria) this;
        }

        public Criteria andGetsiskdateNotBetween(Date value1, Date value2) {
            addCriterion("GetSiskDate not between", value1, value2, "getsiskdate");
            return (Criteria) this;
        }

        public Criteria andDiagnosecateIsNull() {
            addCriterion("DiagnoseCate is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosecateIsNotNull() {
            addCriterion("DiagnoseCate is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosecateEqualTo(Integer value) {
            addCriterion("DiagnoseCate =", value, "diagnosecate");
            return (Criteria) this;
        }

        public Criteria andDiagnosecateNotEqualTo(Integer value) {
            addCriterion("DiagnoseCate <>", value, "diagnosecate");
            return (Criteria) this;
        }

        public Criteria andDiagnosecateGreaterThan(Integer value) {
            addCriterion("DiagnoseCate >", value, "diagnosecate");
            return (Criteria) this;
        }

        public Criteria andDiagnosecateGreaterThanOrEqualTo(Integer value) {
            addCriterion("DiagnoseCate >=", value, "diagnosecate");
            return (Criteria) this;
        }

        public Criteria andDiagnosecateLessThan(Integer value) {
            addCriterion("DiagnoseCate <", value, "diagnosecate");
            return (Criteria) this;
        }

        public Criteria andDiagnosecateLessThanOrEqualTo(Integer value) {
            addCriterion("DiagnoseCate <=", value, "diagnosecate");
            return (Criteria) this;
        }

        public Criteria andDiagnosecateIn(List<Integer> values) {
            addCriterion("DiagnoseCate in", values, "diagnosecate");
            return (Criteria) this;
        }

        public Criteria andDiagnosecateNotIn(List<Integer> values) {
            addCriterion("DiagnoseCate not in", values, "diagnosecate");
            return (Criteria) this;
        }

        public Criteria andDiagnosecateBetween(Integer value1, Integer value2) {
            addCriterion("DiagnoseCate between", value1, value2, "diagnosecate");
            return (Criteria) this;
        }

        public Criteria andDiagnosecateNotBetween(Integer value1, Integer value2) {
            addCriterion("DiagnoseCate not between", value1, value2, "diagnosecate");
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