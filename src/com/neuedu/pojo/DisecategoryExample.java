package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class DisecategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DisecategoryExample() {
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

        public Criteria andDicacodeIsNull() {
            addCriterion("DicaCode is null");
            return (Criteria) this;
        }

        public Criteria andDicacodeIsNotNull() {
            addCriterion("DicaCode is not null");
            return (Criteria) this;
        }

        public Criteria andDicacodeEqualTo(String value) {
            addCriterion("DicaCode =", value, "dicacode");
            return (Criteria) this;
        }

        public Criteria andDicacodeNotEqualTo(String value) {
            addCriterion("DicaCode <>", value, "dicacode");
            return (Criteria) this;
        }

        public Criteria andDicacodeGreaterThan(String value) {
            addCriterion("DicaCode >", value, "dicacode");
            return (Criteria) this;
        }

        public Criteria andDicacodeGreaterThanOrEqualTo(String value) {
            addCriterion("DicaCode >=", value, "dicacode");
            return (Criteria) this;
        }

        public Criteria andDicacodeLessThan(String value) {
            addCriterion("DicaCode <", value, "dicacode");
            return (Criteria) this;
        }

        public Criteria andDicacodeLessThanOrEqualTo(String value) {
            addCriterion("DicaCode <=", value, "dicacode");
            return (Criteria) this;
        }

        public Criteria andDicacodeLike(String value) {
            addCriterion("DicaCode like", value, "dicacode");
            return (Criteria) this;
        }

        public Criteria andDicacodeNotLike(String value) {
            addCriterion("DicaCode not like", value, "dicacode");
            return (Criteria) this;
        }

        public Criteria andDicacodeIn(List<String> values) {
            addCriterion("DicaCode in", values, "dicacode");
            return (Criteria) this;
        }

        public Criteria andDicacodeNotIn(List<String> values) {
            addCriterion("DicaCode not in", values, "dicacode");
            return (Criteria) this;
        }

        public Criteria andDicacodeBetween(String value1, String value2) {
            addCriterion("DicaCode between", value1, value2, "dicacode");
            return (Criteria) this;
        }

        public Criteria andDicacodeNotBetween(String value1, String value2) {
            addCriterion("DicaCode not between", value1, value2, "dicacode");
            return (Criteria) this;
        }

        public Criteria andDicanameIsNull() {
            addCriterion("DicaName is null");
            return (Criteria) this;
        }

        public Criteria andDicanameIsNotNull() {
            addCriterion("DicaName is not null");
            return (Criteria) this;
        }

        public Criteria andDicanameEqualTo(String value) {
            addCriterion("DicaName =", value, "dicaname");
            return (Criteria) this;
        }

        public Criteria andDicanameNotEqualTo(String value) {
            addCriterion("DicaName <>", value, "dicaname");
            return (Criteria) this;
        }

        public Criteria andDicanameGreaterThan(String value) {
            addCriterion("DicaName >", value, "dicaname");
            return (Criteria) this;
        }

        public Criteria andDicanameGreaterThanOrEqualTo(String value) {
            addCriterion("DicaName >=", value, "dicaname");
            return (Criteria) this;
        }

        public Criteria andDicanameLessThan(String value) {
            addCriterion("DicaName <", value, "dicaname");
            return (Criteria) this;
        }

        public Criteria andDicanameLessThanOrEqualTo(String value) {
            addCriterion("DicaName <=", value, "dicaname");
            return (Criteria) this;
        }

        public Criteria andDicanameLike(String value) {
            addCriterion("DicaName like", value, "dicaname");
            return (Criteria) this;
        }

        public Criteria andDicanameNotLike(String value) {
            addCriterion("DicaName not like", value, "dicaname");
            return (Criteria) this;
        }

        public Criteria andDicanameIn(List<String> values) {
            addCriterion("DicaName in", values, "dicaname");
            return (Criteria) this;
        }

        public Criteria andDicanameNotIn(List<String> values) {
            addCriterion("DicaName not in", values, "dicaname");
            return (Criteria) this;
        }

        public Criteria andDicanameBetween(String value1, String value2) {
            addCriterion("DicaName between", value1, value2, "dicaname");
            return (Criteria) this;
        }

        public Criteria andDicanameNotBetween(String value1, String value2) {
            addCriterion("DicaName not between", value1, value2, "dicaname");
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

        public Criteria andDicatypeIsNull() {
            addCriterion("DicaType is null");
            return (Criteria) this;
        }

        public Criteria andDicatypeIsNotNull() {
            addCriterion("DicaType is not null");
            return (Criteria) this;
        }

        public Criteria andDicatypeEqualTo(Integer value) {
            addCriterion("DicaType =", value, "dicatype");
            return (Criteria) this;
        }

        public Criteria andDicatypeNotEqualTo(Integer value) {
            addCriterion("DicaType <>", value, "dicatype");
            return (Criteria) this;
        }

        public Criteria andDicatypeGreaterThan(Integer value) {
            addCriterion("DicaType >", value, "dicatype");
            return (Criteria) this;
        }

        public Criteria andDicatypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DicaType >=", value, "dicatype");
            return (Criteria) this;
        }

        public Criteria andDicatypeLessThan(Integer value) {
            addCriterion("DicaType <", value, "dicatype");
            return (Criteria) this;
        }

        public Criteria andDicatypeLessThanOrEqualTo(Integer value) {
            addCriterion("DicaType <=", value, "dicatype");
            return (Criteria) this;
        }

        public Criteria andDicatypeIn(List<Integer> values) {
            addCriterion("DicaType in", values, "dicatype");
            return (Criteria) this;
        }

        public Criteria andDicatypeNotIn(List<Integer> values) {
            addCriterion("DicaType not in", values, "dicatype");
            return (Criteria) this;
        }

        public Criteria andDicatypeBetween(Integer value1, Integer value2) {
            addCriterion("DicaType between", value1, value2, "dicatype");
            return (Criteria) this;
        }

        public Criteria andDicatypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DicaType not between", value1, value2, "dicatype");
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