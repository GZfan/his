package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class HerbaltempdetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HerbaltempdetailedExample() {
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

        public Criteria andHerbaltempidIsNull() {
            addCriterion("HerbalTempID is null");
            return (Criteria) this;
        }

        public Criteria andHerbaltempidIsNotNull() {
            addCriterion("HerbalTempID is not null");
            return (Criteria) this;
        }

        public Criteria andHerbaltempidEqualTo(Integer value) {
            addCriterion("HerbalTempID =", value, "herbaltempid");
            return (Criteria) this;
        }

        public Criteria andHerbaltempidNotEqualTo(Integer value) {
            addCriterion("HerbalTempID <>", value, "herbaltempid");
            return (Criteria) this;
        }

        public Criteria andHerbaltempidGreaterThan(Integer value) {
            addCriterion("HerbalTempID >", value, "herbaltempid");
            return (Criteria) this;
        }

        public Criteria andHerbaltempidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HerbalTempID >=", value, "herbaltempid");
            return (Criteria) this;
        }

        public Criteria andHerbaltempidLessThan(Integer value) {
            addCriterion("HerbalTempID <", value, "herbaltempid");
            return (Criteria) this;
        }

        public Criteria andHerbaltempidLessThanOrEqualTo(Integer value) {
            addCriterion("HerbalTempID <=", value, "herbaltempid");
            return (Criteria) this;
        }

        public Criteria andHerbaltempidIn(List<Integer> values) {
            addCriterion("HerbalTempID in", values, "herbaltempid");
            return (Criteria) this;
        }

        public Criteria andHerbaltempidNotIn(List<Integer> values) {
            addCriterion("HerbalTempID not in", values, "herbaltempid");
            return (Criteria) this;
        }

        public Criteria andHerbaltempidBetween(Integer value1, Integer value2) {
            addCriterion("HerbalTempID between", value1, value2, "herbaltempid");
            return (Criteria) this;
        }

        public Criteria andHerbaltempidNotBetween(Integer value1, Integer value2) {
            addCriterion("HerbalTempID not between", value1, value2, "herbaltempid");
            return (Criteria) this;
        }

        public Criteria andHerbalidIsNull() {
            addCriterion("HerbalID is null");
            return (Criteria) this;
        }

        public Criteria andHerbalidIsNotNull() {
            addCriterion("HerbalID is not null");
            return (Criteria) this;
        }

        public Criteria andHerbalidEqualTo(Integer value) {
            addCriterion("HerbalID =", value, "herbalid");
            return (Criteria) this;
        }

        public Criteria andHerbalidNotEqualTo(Integer value) {
            addCriterion("HerbalID <>", value, "herbalid");
            return (Criteria) this;
        }

        public Criteria andHerbalidGreaterThan(Integer value) {
            addCriterion("HerbalID >", value, "herbalid");
            return (Criteria) this;
        }

        public Criteria andHerbalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HerbalID >=", value, "herbalid");
            return (Criteria) this;
        }

        public Criteria andHerbalidLessThan(Integer value) {
            addCriterion("HerbalID <", value, "herbalid");
            return (Criteria) this;
        }

        public Criteria andHerbalidLessThanOrEqualTo(Integer value) {
            addCriterion("HerbalID <=", value, "herbalid");
            return (Criteria) this;
        }

        public Criteria andHerbalidIn(List<Integer> values) {
            addCriterion("HerbalID in", values, "herbalid");
            return (Criteria) this;
        }

        public Criteria andHerbalidNotIn(List<Integer> values) {
            addCriterion("HerbalID not in", values, "herbalid");
            return (Criteria) this;
        }

        public Criteria andHerbalidBetween(Integer value1, Integer value2) {
            addCriterion("HerbalID between", value1, value2, "herbalid");
            return (Criteria) this;
        }

        public Criteria andHerbalidNotBetween(Integer value1, Integer value2) {
            addCriterion("HerbalID not between", value1, value2, "herbalid");
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

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andFootnoteIsNull() {
            addCriterion("Footnote is null");
            return (Criteria) this;
        }

        public Criteria andFootnoteIsNotNull() {
            addCriterion("Footnote is not null");
            return (Criteria) this;
        }

        public Criteria andFootnoteEqualTo(String value) {
            addCriterion("Footnote =", value, "footnote");
            return (Criteria) this;
        }

        public Criteria andFootnoteNotEqualTo(String value) {
            addCriterion("Footnote <>", value, "footnote");
            return (Criteria) this;
        }

        public Criteria andFootnoteGreaterThan(String value) {
            addCriterion("Footnote >", value, "footnote");
            return (Criteria) this;
        }

        public Criteria andFootnoteGreaterThanOrEqualTo(String value) {
            addCriterion("Footnote >=", value, "footnote");
            return (Criteria) this;
        }

        public Criteria andFootnoteLessThan(String value) {
            addCriterion("Footnote <", value, "footnote");
            return (Criteria) this;
        }

        public Criteria andFootnoteLessThanOrEqualTo(String value) {
            addCriterion("Footnote <=", value, "footnote");
            return (Criteria) this;
        }

        public Criteria andFootnoteLike(String value) {
            addCriterion("Footnote like", value, "footnote");
            return (Criteria) this;
        }

        public Criteria andFootnoteNotLike(String value) {
            addCriterion("Footnote not like", value, "footnote");
            return (Criteria) this;
        }

        public Criteria andFootnoteIn(List<String> values) {
            addCriterion("Footnote in", values, "footnote");
            return (Criteria) this;
        }

        public Criteria andFootnoteNotIn(List<String> values) {
            addCriterion("Footnote not in", values, "footnote");
            return (Criteria) this;
        }

        public Criteria andFootnoteBetween(String value1, String value2) {
            addCriterion("Footnote between", value1, value2, "footnote");
            return (Criteria) this;
        }

        public Criteria andFootnoteNotBetween(String value1, String value2) {
            addCriterion("Footnote not between", value1, value2, "footnote");
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