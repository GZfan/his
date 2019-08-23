package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class ConstantitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConstantitemExample() {
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

        public Criteria andConstanttypeidIsNull() {
            addCriterion("ConstantTypeID is null");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidIsNotNull() {
            addCriterion("ConstantTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidEqualTo(Integer value) {
            addCriterion("ConstantTypeID =", value, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidNotEqualTo(Integer value) {
            addCriterion("ConstantTypeID <>", value, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidGreaterThan(Integer value) {
            addCriterion("ConstantTypeID >", value, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ConstantTypeID >=", value, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidLessThan(Integer value) {
            addCriterion("ConstantTypeID <", value, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidLessThanOrEqualTo(Integer value) {
            addCriterion("ConstantTypeID <=", value, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidIn(List<Integer> values) {
            addCriterion("ConstantTypeID in", values, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidNotIn(List<Integer> values) {
            addCriterion("ConstantTypeID not in", values, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidBetween(Integer value1, Integer value2) {
            addCriterion("ConstantTypeID between", value1, value2, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("ConstantTypeID not between", value1, value2, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstantcodeIsNull() {
            addCriterion("ConstantCode is null");
            return (Criteria) this;
        }

        public Criteria andConstantcodeIsNotNull() {
            addCriterion("ConstantCode is not null");
            return (Criteria) this;
        }

        public Criteria andConstantcodeEqualTo(String value) {
            addCriterion("ConstantCode =", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeNotEqualTo(String value) {
            addCriterion("ConstantCode <>", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeGreaterThan(String value) {
            addCriterion("ConstantCode >", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ConstantCode >=", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeLessThan(String value) {
            addCriterion("ConstantCode <", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeLessThanOrEqualTo(String value) {
            addCriterion("ConstantCode <=", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeLike(String value) {
            addCriterion("ConstantCode like", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeNotLike(String value) {
            addCriterion("ConstantCode not like", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeIn(List<String> values) {
            addCriterion("ConstantCode in", values, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeNotIn(List<String> values) {
            addCriterion("ConstantCode not in", values, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeBetween(String value1, String value2) {
            addCriterion("ConstantCode between", value1, value2, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeNotBetween(String value1, String value2) {
            addCriterion("ConstantCode not between", value1, value2, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantnameIsNull() {
            addCriterion("ConstantName is null");
            return (Criteria) this;
        }

        public Criteria andConstantnameIsNotNull() {
            addCriterion("ConstantName is not null");
            return (Criteria) this;
        }

        public Criteria andConstantnameEqualTo(String value) {
            addCriterion("ConstantName =", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameNotEqualTo(String value) {
            addCriterion("ConstantName <>", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameGreaterThan(String value) {
            addCriterion("ConstantName >", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameGreaterThanOrEqualTo(String value) {
            addCriterion("ConstantName >=", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameLessThan(String value) {
            addCriterion("ConstantName <", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameLessThanOrEqualTo(String value) {
            addCriterion("ConstantName <=", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameLike(String value) {
            addCriterion("ConstantName like", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameNotLike(String value) {
            addCriterion("ConstantName not like", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameIn(List<String> values) {
            addCriterion("ConstantName in", values, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameNotIn(List<String> values) {
            addCriterion("ConstantName not in", values, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameBetween(String value1, String value2) {
            addCriterion("ConstantName between", value1, value2, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameNotBetween(String value1, String value2) {
            addCriterion("ConstantName not between", value1, value2, "constantname");
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