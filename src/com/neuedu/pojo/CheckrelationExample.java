package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CheckrelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckrelationExample() {
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

        public Criteria andCheckprojidIsNull() {
            addCriterion("CheckProjID is null");
            return (Criteria) this;
        }

        public Criteria andCheckprojidIsNotNull() {
            addCriterion("CheckProjID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckprojidEqualTo(Integer value) {
            addCriterion("CheckProjID =", value, "checkprojid");
            return (Criteria) this;
        }

        public Criteria andCheckprojidNotEqualTo(Integer value) {
            addCriterion("CheckProjID <>", value, "checkprojid");
            return (Criteria) this;
        }

        public Criteria andCheckprojidGreaterThan(Integer value) {
            addCriterion("CheckProjID >", value, "checkprojid");
            return (Criteria) this;
        }

        public Criteria andCheckprojidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CheckProjID >=", value, "checkprojid");
            return (Criteria) this;
        }

        public Criteria andCheckprojidLessThan(Integer value) {
            addCriterion("CheckProjID <", value, "checkprojid");
            return (Criteria) this;
        }

        public Criteria andCheckprojidLessThanOrEqualTo(Integer value) {
            addCriterion("CheckProjID <=", value, "checkprojid");
            return (Criteria) this;
        }

        public Criteria andCheckprojidIn(List<Integer> values) {
            addCriterion("CheckProjID in", values, "checkprojid");
            return (Criteria) this;
        }

        public Criteria andCheckprojidNotIn(List<Integer> values) {
            addCriterion("CheckProjID not in", values, "checkprojid");
            return (Criteria) this;
        }

        public Criteria andCheckprojidBetween(Integer value1, Integer value2) {
            addCriterion("CheckProjID between", value1, value2, "checkprojid");
            return (Criteria) this;
        }

        public Criteria andCheckprojidNotBetween(Integer value1, Integer value2) {
            addCriterion("CheckProjID not between", value1, value2, "checkprojid");
            return (Criteria) this;
        }

        public Criteria andChecktempidIsNull() {
            addCriterion("CheckTempID is null");
            return (Criteria) this;
        }

        public Criteria andChecktempidIsNotNull() {
            addCriterion("CheckTempID is not null");
            return (Criteria) this;
        }

        public Criteria andChecktempidEqualTo(Integer value) {
            addCriterion("CheckTempID =", value, "checktempid");
            return (Criteria) this;
        }

        public Criteria andChecktempidNotEqualTo(Integer value) {
            addCriterion("CheckTempID <>", value, "checktempid");
            return (Criteria) this;
        }

        public Criteria andChecktempidGreaterThan(Integer value) {
            addCriterion("CheckTempID >", value, "checktempid");
            return (Criteria) this;
        }

        public Criteria andChecktempidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CheckTempID >=", value, "checktempid");
            return (Criteria) this;
        }

        public Criteria andChecktempidLessThan(Integer value) {
            addCriterion("CheckTempID <", value, "checktempid");
            return (Criteria) this;
        }

        public Criteria andChecktempidLessThanOrEqualTo(Integer value) {
            addCriterion("CheckTempID <=", value, "checktempid");
            return (Criteria) this;
        }

        public Criteria andChecktempidIn(List<Integer> values) {
            addCriterion("CheckTempID in", values, "checktempid");
            return (Criteria) this;
        }

        public Criteria andChecktempidNotIn(List<Integer> values) {
            addCriterion("CheckTempID not in", values, "checktempid");
            return (Criteria) this;
        }

        public Criteria andChecktempidBetween(Integer value1, Integer value2) {
            addCriterion("CheckTempID between", value1, value2, "checktempid");
            return (Criteria) this;
        }

        public Criteria andChecktempidNotBetween(Integer value1, Integer value2) {
            addCriterion("CheckTempID not between", value1, value2, "checktempid");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("Position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("Position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("Position not between", value1, value2, "position");
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