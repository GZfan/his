package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ExpenseclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpenseclassExample() {
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

        public Criteria andExpcodeIsNull() {
            addCriterion("ExpCode is null");
            return (Criteria) this;
        }

        public Criteria andExpcodeIsNotNull() {
            addCriterion("ExpCode is not null");
            return (Criteria) this;
        }

        public Criteria andExpcodeEqualTo(String value) {
            addCriterion("ExpCode =", value, "expcode");
            return (Criteria) this;
        }

        public Criteria andExpcodeNotEqualTo(String value) {
            addCriterion("ExpCode <>", value, "expcode");
            return (Criteria) this;
        }

        public Criteria andExpcodeGreaterThan(String value) {
            addCriterion("ExpCode >", value, "expcode");
            return (Criteria) this;
        }

        public Criteria andExpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ExpCode >=", value, "expcode");
            return (Criteria) this;
        }

        public Criteria andExpcodeLessThan(String value) {
            addCriterion("ExpCode <", value, "expcode");
            return (Criteria) this;
        }

        public Criteria andExpcodeLessThanOrEqualTo(String value) {
            addCriterion("ExpCode <=", value, "expcode");
            return (Criteria) this;
        }

        public Criteria andExpcodeLike(String value) {
            addCriterion("ExpCode like", value, "expcode");
            return (Criteria) this;
        }

        public Criteria andExpcodeNotLike(String value) {
            addCriterion("ExpCode not like", value, "expcode");
            return (Criteria) this;
        }

        public Criteria andExpcodeIn(List<String> values) {
            addCriterion("ExpCode in", values, "expcode");
            return (Criteria) this;
        }

        public Criteria andExpcodeNotIn(List<String> values) {
            addCriterion("ExpCode not in", values, "expcode");
            return (Criteria) this;
        }

        public Criteria andExpcodeBetween(String value1, String value2) {
            addCriterion("ExpCode between", value1, value2, "expcode");
            return (Criteria) this;
        }

        public Criteria andExpcodeNotBetween(String value1, String value2) {
            addCriterion("ExpCode not between", value1, value2, "expcode");
            return (Criteria) this;
        }

        public Criteria andExpnameIsNull() {
            addCriterion("ExpName is null");
            return (Criteria) this;
        }

        public Criteria andExpnameIsNotNull() {
            addCriterion("ExpName is not null");
            return (Criteria) this;
        }

        public Criteria andExpnameEqualTo(String value) {
            addCriterion("ExpName =", value, "expname");
            return (Criteria) this;
        }

        public Criteria andExpnameNotEqualTo(String value) {
            addCriterion("ExpName <>", value, "expname");
            return (Criteria) this;
        }

        public Criteria andExpnameGreaterThan(String value) {
            addCriterion("ExpName >", value, "expname");
            return (Criteria) this;
        }

        public Criteria andExpnameGreaterThanOrEqualTo(String value) {
            addCriterion("ExpName >=", value, "expname");
            return (Criteria) this;
        }

        public Criteria andExpnameLessThan(String value) {
            addCriterion("ExpName <", value, "expname");
            return (Criteria) this;
        }

        public Criteria andExpnameLessThanOrEqualTo(String value) {
            addCriterion("ExpName <=", value, "expname");
            return (Criteria) this;
        }

        public Criteria andExpnameLike(String value) {
            addCriterion("ExpName like", value, "expname");
            return (Criteria) this;
        }

        public Criteria andExpnameNotLike(String value) {
            addCriterion("ExpName not like", value, "expname");
            return (Criteria) this;
        }

        public Criteria andExpnameIn(List<String> values) {
            addCriterion("ExpName in", values, "expname");
            return (Criteria) this;
        }

        public Criteria andExpnameNotIn(List<String> values) {
            addCriterion("ExpName not in", values, "expname");
            return (Criteria) this;
        }

        public Criteria andExpnameBetween(String value1, String value2) {
            addCriterion("ExpName between", value1, value2, "expname");
            return (Criteria) this;
        }

        public Criteria andExpnameNotBetween(String value1, String value2) {
            addCriterion("ExpName not between", value1, value2, "expname");
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