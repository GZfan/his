package com.neuedu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RegistlevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegistlevelExample() {
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

        public Criteria andRegistcodeIsNull() {
            addCriterion("RegistCode is null");
            return (Criteria) this;
        }

        public Criteria andRegistcodeIsNotNull() {
            addCriterion("RegistCode is not null");
            return (Criteria) this;
        }

        public Criteria andRegistcodeEqualTo(String value) {
            addCriterion("RegistCode =", value, "registcode");
            return (Criteria) this;
        }

        public Criteria andRegistcodeNotEqualTo(String value) {
            addCriterion("RegistCode <>", value, "registcode");
            return (Criteria) this;
        }

        public Criteria andRegistcodeGreaterThan(String value) {
            addCriterion("RegistCode >", value, "registcode");
            return (Criteria) this;
        }

        public Criteria andRegistcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RegistCode >=", value, "registcode");
            return (Criteria) this;
        }

        public Criteria andRegistcodeLessThan(String value) {
            addCriterion("RegistCode <", value, "registcode");
            return (Criteria) this;
        }

        public Criteria andRegistcodeLessThanOrEqualTo(String value) {
            addCriterion("RegistCode <=", value, "registcode");
            return (Criteria) this;
        }

        public Criteria andRegistcodeLike(String value) {
            addCriterion("RegistCode like", value, "registcode");
            return (Criteria) this;
        }

        public Criteria andRegistcodeNotLike(String value) {
            addCriterion("RegistCode not like", value, "registcode");
            return (Criteria) this;
        }

        public Criteria andRegistcodeIn(List<String> values) {
            addCriterion("RegistCode in", values, "registcode");
            return (Criteria) this;
        }

        public Criteria andRegistcodeNotIn(List<String> values) {
            addCriterion("RegistCode not in", values, "registcode");
            return (Criteria) this;
        }

        public Criteria andRegistcodeBetween(String value1, String value2) {
            addCriterion("RegistCode between", value1, value2, "registcode");
            return (Criteria) this;
        }

        public Criteria andRegistcodeNotBetween(String value1, String value2) {
            addCriterion("RegistCode not between", value1, value2, "registcode");
            return (Criteria) this;
        }

        public Criteria andRegistnameIsNull() {
            addCriterion("RegistName is null");
            return (Criteria) this;
        }

        public Criteria andRegistnameIsNotNull() {
            addCriterion("RegistName is not null");
            return (Criteria) this;
        }

        public Criteria andRegistnameEqualTo(String value) {
            addCriterion("RegistName =", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameNotEqualTo(String value) {
            addCriterion("RegistName <>", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameGreaterThan(String value) {
            addCriterion("RegistName >", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameGreaterThanOrEqualTo(String value) {
            addCriterion("RegistName >=", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameLessThan(String value) {
            addCriterion("RegistName <", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameLessThanOrEqualTo(String value) {
            addCriterion("RegistName <=", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameLike(String value) {
            addCriterion("RegistName like", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameNotLike(String value) {
            addCriterion("RegistName not like", value, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameIn(List<String> values) {
            addCriterion("RegistName in", values, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameNotIn(List<String> values) {
            addCriterion("RegistName not in", values, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameBetween(String value1, String value2) {
            addCriterion("RegistName between", value1, value2, "registname");
            return (Criteria) this;
        }

        public Criteria andRegistnameNotBetween(String value1, String value2) {
            addCriterion("RegistName not between", value1, value2, "registname");
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

        public Criteria andRegistfeeIsNull() {
            addCriterion("RegistFee is null");
            return (Criteria) this;
        }

        public Criteria andRegistfeeIsNotNull() {
            addCriterion("RegistFee is not null");
            return (Criteria) this;
        }

        public Criteria andRegistfeeEqualTo(BigDecimal value) {
            addCriterion("RegistFee =", value, "registfee");
            return (Criteria) this;
        }

        public Criteria andRegistfeeNotEqualTo(BigDecimal value) {
            addCriterion("RegistFee <>", value, "registfee");
            return (Criteria) this;
        }

        public Criteria andRegistfeeGreaterThan(BigDecimal value) {
            addCriterion("RegistFee >", value, "registfee");
            return (Criteria) this;
        }

        public Criteria andRegistfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RegistFee >=", value, "registfee");
            return (Criteria) this;
        }

        public Criteria andRegistfeeLessThan(BigDecimal value) {
            addCriterion("RegistFee <", value, "registfee");
            return (Criteria) this;
        }

        public Criteria andRegistfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RegistFee <=", value, "registfee");
            return (Criteria) this;
        }

        public Criteria andRegistfeeIn(List<BigDecimal> values) {
            addCriterion("RegistFee in", values, "registfee");
            return (Criteria) this;
        }

        public Criteria andRegistfeeNotIn(List<BigDecimal> values) {
            addCriterion("RegistFee not in", values, "registfee");
            return (Criteria) this;
        }

        public Criteria andRegistfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RegistFee between", value1, value2, "registfee");
            return (Criteria) this;
        }

        public Criteria andRegistfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RegistFee not between", value1, value2, "registfee");
            return (Criteria) this;
        }

        public Criteria andRegistquotaIsNull() {
            addCriterion("RegistQuota is null");
            return (Criteria) this;
        }

        public Criteria andRegistquotaIsNotNull() {
            addCriterion("RegistQuota is not null");
            return (Criteria) this;
        }

        public Criteria andRegistquotaEqualTo(Integer value) {
            addCriterion("RegistQuota =", value, "registquota");
            return (Criteria) this;
        }

        public Criteria andRegistquotaNotEqualTo(Integer value) {
            addCriterion("RegistQuota <>", value, "registquota");
            return (Criteria) this;
        }

        public Criteria andRegistquotaGreaterThan(Integer value) {
            addCriterion("RegistQuota >", value, "registquota");
            return (Criteria) this;
        }

        public Criteria andRegistquotaGreaterThanOrEqualTo(Integer value) {
            addCriterion("RegistQuota >=", value, "registquota");
            return (Criteria) this;
        }

        public Criteria andRegistquotaLessThan(Integer value) {
            addCriterion("RegistQuota <", value, "registquota");
            return (Criteria) this;
        }

        public Criteria andRegistquotaLessThanOrEqualTo(Integer value) {
            addCriterion("RegistQuota <=", value, "registquota");
            return (Criteria) this;
        }

        public Criteria andRegistquotaIn(List<Integer> values) {
            addCriterion("RegistQuota in", values, "registquota");
            return (Criteria) this;
        }

        public Criteria andRegistquotaNotIn(List<Integer> values) {
            addCriterion("RegistQuota not in", values, "registquota");
            return (Criteria) this;
        }

        public Criteria andRegistquotaBetween(Integer value1, Integer value2) {
            addCriterion("RegistQuota between", value1, value2, "registquota");
            return (Criteria) this;
        }

        public Criteria andRegistquotaNotBetween(Integer value1, Integer value2) {
            addCriterion("RegistQuota not between", value1, value2, "registquota");
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