package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class DrugsdetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugsdetailedExample() {
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

        public Criteria andDrugstempidIsNull() {
            addCriterion("DrugsTempID is null");
            return (Criteria) this;
        }

        public Criteria andDrugstempidIsNotNull() {
            addCriterion("DrugsTempID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugstempidEqualTo(Integer value) {
            addCriterion("DrugsTempID =", value, "drugstempid");
            return (Criteria) this;
        }

        public Criteria andDrugstempidNotEqualTo(Integer value) {
            addCriterion("DrugsTempID <>", value, "drugstempid");
            return (Criteria) this;
        }

        public Criteria andDrugstempidGreaterThan(Integer value) {
            addCriterion("DrugsTempID >", value, "drugstempid");
            return (Criteria) this;
        }

        public Criteria andDrugstempidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DrugsTempID >=", value, "drugstempid");
            return (Criteria) this;
        }

        public Criteria andDrugstempidLessThan(Integer value) {
            addCriterion("DrugsTempID <", value, "drugstempid");
            return (Criteria) this;
        }

        public Criteria andDrugstempidLessThanOrEqualTo(Integer value) {
            addCriterion("DrugsTempID <=", value, "drugstempid");
            return (Criteria) this;
        }

        public Criteria andDrugstempidIn(List<Integer> values) {
            addCriterion("DrugsTempID in", values, "drugstempid");
            return (Criteria) this;
        }

        public Criteria andDrugstempidNotIn(List<Integer> values) {
            addCriterion("DrugsTempID not in", values, "drugstempid");
            return (Criteria) this;
        }

        public Criteria andDrugstempidBetween(Integer value1, Integer value2) {
            addCriterion("DrugsTempID between", value1, value2, "drugstempid");
            return (Criteria) this;
        }

        public Criteria andDrugstempidNotBetween(Integer value1, Integer value2) {
            addCriterion("DrugsTempID not between", value1, value2, "drugstempid");
            return (Criteria) this;
        }

        public Criteria andDrugsidIsNull() {
            addCriterion("DrugsID is null");
            return (Criteria) this;
        }

        public Criteria andDrugsidIsNotNull() {
            addCriterion("DrugsID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsidEqualTo(Integer value) {
            addCriterion("DrugsID =", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidNotEqualTo(Integer value) {
            addCriterion("DrugsID <>", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidGreaterThan(Integer value) {
            addCriterion("DrugsID >", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DrugsID >=", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidLessThan(Integer value) {
            addCriterion("DrugsID <", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidLessThanOrEqualTo(Integer value) {
            addCriterion("DrugsID <=", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidIn(List<Integer> values) {
            addCriterion("DrugsID in", values, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidNotIn(List<Integer> values) {
            addCriterion("DrugsID not in", values, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidBetween(Integer value1, Integer value2) {
            addCriterion("DrugsID between", value1, value2, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidNotBetween(Integer value1, Integer value2) {
            addCriterion("DrugsID not between", value1, value2, "drugsid");
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

        public Criteria andDosageIsNull() {
            addCriterion("Dosage is null");
            return (Criteria) this;
        }

        public Criteria andDosageIsNotNull() {
            addCriterion("Dosage is not null");
            return (Criteria) this;
        }

        public Criteria andDosageEqualTo(String value) {
            addCriterion("Dosage =", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotEqualTo(String value) {
            addCriterion("Dosage <>", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThan(String value) {
            addCriterion("Dosage >", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThanOrEqualTo(String value) {
            addCriterion("Dosage >=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThan(String value) {
            addCriterion("Dosage <", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThanOrEqualTo(String value) {
            addCriterion("Dosage <=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLike(String value) {
            addCriterion("Dosage like", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotLike(String value) {
            addCriterion("Dosage not like", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageIn(List<String> values) {
            addCriterion("Dosage in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotIn(List<String> values) {
            addCriterion("Dosage not in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageBetween(String value1, String value2) {
            addCriterion("Dosage between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotBetween(String value1, String value2) {
            addCriterion("Dosage not between", value1, value2, "dosage");
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