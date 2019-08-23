package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class SettlecategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettlecategoryExample() {
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

        public Criteria andSettlecodeIsNull() {
            addCriterion("SettleCode is null");
            return (Criteria) this;
        }

        public Criteria andSettlecodeIsNotNull() {
            addCriterion("SettleCode is not null");
            return (Criteria) this;
        }

        public Criteria andSettlecodeEqualTo(String value) {
            addCriterion("SettleCode =", value, "settlecode");
            return (Criteria) this;
        }

        public Criteria andSettlecodeNotEqualTo(String value) {
            addCriterion("SettleCode <>", value, "settlecode");
            return (Criteria) this;
        }

        public Criteria andSettlecodeGreaterThan(String value) {
            addCriterion("SettleCode >", value, "settlecode");
            return (Criteria) this;
        }

        public Criteria andSettlecodeGreaterThanOrEqualTo(String value) {
            addCriterion("SettleCode >=", value, "settlecode");
            return (Criteria) this;
        }

        public Criteria andSettlecodeLessThan(String value) {
            addCriterion("SettleCode <", value, "settlecode");
            return (Criteria) this;
        }

        public Criteria andSettlecodeLessThanOrEqualTo(String value) {
            addCriterion("SettleCode <=", value, "settlecode");
            return (Criteria) this;
        }

        public Criteria andSettlecodeLike(String value) {
            addCriterion("SettleCode like", value, "settlecode");
            return (Criteria) this;
        }

        public Criteria andSettlecodeNotLike(String value) {
            addCriterion("SettleCode not like", value, "settlecode");
            return (Criteria) this;
        }

        public Criteria andSettlecodeIn(List<String> values) {
            addCriterion("SettleCode in", values, "settlecode");
            return (Criteria) this;
        }

        public Criteria andSettlecodeNotIn(List<String> values) {
            addCriterion("SettleCode not in", values, "settlecode");
            return (Criteria) this;
        }

        public Criteria andSettlecodeBetween(String value1, String value2) {
            addCriterion("SettleCode between", value1, value2, "settlecode");
            return (Criteria) this;
        }

        public Criteria andSettlecodeNotBetween(String value1, String value2) {
            addCriterion("SettleCode not between", value1, value2, "settlecode");
            return (Criteria) this;
        }

        public Criteria andSettlenameIsNull() {
            addCriterion("SettleName is null");
            return (Criteria) this;
        }

        public Criteria andSettlenameIsNotNull() {
            addCriterion("SettleName is not null");
            return (Criteria) this;
        }

        public Criteria andSettlenameEqualTo(String value) {
            addCriterion("SettleName =", value, "settlename");
            return (Criteria) this;
        }

        public Criteria andSettlenameNotEqualTo(String value) {
            addCriterion("SettleName <>", value, "settlename");
            return (Criteria) this;
        }

        public Criteria andSettlenameGreaterThan(String value) {
            addCriterion("SettleName >", value, "settlename");
            return (Criteria) this;
        }

        public Criteria andSettlenameGreaterThanOrEqualTo(String value) {
            addCriterion("SettleName >=", value, "settlename");
            return (Criteria) this;
        }

        public Criteria andSettlenameLessThan(String value) {
            addCriterion("SettleName <", value, "settlename");
            return (Criteria) this;
        }

        public Criteria andSettlenameLessThanOrEqualTo(String value) {
            addCriterion("SettleName <=", value, "settlename");
            return (Criteria) this;
        }

        public Criteria andSettlenameLike(String value) {
            addCriterion("SettleName like", value, "settlename");
            return (Criteria) this;
        }

        public Criteria andSettlenameNotLike(String value) {
            addCriterion("SettleName not like", value, "settlename");
            return (Criteria) this;
        }

        public Criteria andSettlenameIn(List<String> values) {
            addCriterion("SettleName in", values, "settlename");
            return (Criteria) this;
        }

        public Criteria andSettlenameNotIn(List<String> values) {
            addCriterion("SettleName not in", values, "settlename");
            return (Criteria) this;
        }

        public Criteria andSettlenameBetween(String value1, String value2) {
            addCriterion("SettleName between", value1, value2, "settlename");
            return (Criteria) this;
        }

        public Criteria andSettlenameNotBetween(String value1, String value2) {
            addCriterion("SettleName not between", value1, value2, "settlename");
            return (Criteria) this;
        }

        public Criteria andSequencenoIsNull() {
            addCriterion("SequenceNo is null");
            return (Criteria) this;
        }

        public Criteria andSequencenoIsNotNull() {
            addCriterion("SequenceNo is not null");
            return (Criteria) this;
        }

        public Criteria andSequencenoEqualTo(Integer value) {
            addCriterion("SequenceNo =", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotEqualTo(Integer value) {
            addCriterion("SequenceNo <>", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoGreaterThan(Integer value) {
            addCriterion("SequenceNo >", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SequenceNo >=", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoLessThan(Integer value) {
            addCriterion("SequenceNo <", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoLessThanOrEqualTo(Integer value) {
            addCriterion("SequenceNo <=", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoIn(List<Integer> values) {
            addCriterion("SequenceNo in", values, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotIn(List<Integer> values) {
            addCriterion("SequenceNo not in", values, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoBetween(Integer value1, Integer value2) {
            addCriterion("SequenceNo between", value1, value2, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotBetween(Integer value1, Integer value2) {
            addCriterion("SequenceNo not between", value1, value2, "sequenceno");
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