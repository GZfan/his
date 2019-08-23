package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SchedulingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchedulingExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andScheddateIsNull() {
            addCriterion("SchedDate is null");
            return (Criteria) this;
        }

        public Criteria andScheddateIsNotNull() {
            addCriterion("SchedDate is not null");
            return (Criteria) this;
        }

        public Criteria andScheddateEqualTo(Date value) {
            addCriterionForJDBCDate("SchedDate =", value, "scheddate");
            return (Criteria) this;
        }

        public Criteria andScheddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SchedDate <>", value, "scheddate");
            return (Criteria) this;
        }

        public Criteria andScheddateGreaterThan(Date value) {
            addCriterionForJDBCDate("SchedDate >", value, "scheddate");
            return (Criteria) this;
        }

        public Criteria andScheddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SchedDate >=", value, "scheddate");
            return (Criteria) this;
        }

        public Criteria andScheddateLessThan(Date value) {
            addCriterionForJDBCDate("SchedDate <", value, "scheddate");
            return (Criteria) this;
        }

        public Criteria andScheddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SchedDate <=", value, "scheddate");
            return (Criteria) this;
        }

        public Criteria andScheddateIn(List<Date> values) {
            addCriterionForJDBCDate("SchedDate in", values, "scheddate");
            return (Criteria) this;
        }

        public Criteria andScheddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SchedDate not in", values, "scheddate");
            return (Criteria) this;
        }

        public Criteria andScheddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SchedDate between", value1, value2, "scheddate");
            return (Criteria) this;
        }

        public Criteria andScheddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SchedDate not between", value1, value2, "scheddate");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DeptID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DeptID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Integer value) {
            addCriterion("DeptID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Integer value) {
            addCriterion("DeptID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Integer value) {
            addCriterion("DeptID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DeptID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Integer value) {
            addCriterion("DeptID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Integer value) {
            addCriterion("DeptID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Integer> values) {
            addCriterion("DeptID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Integer> values) {
            addCriterion("DeptID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Integer value1, Integer value2) {
            addCriterion("DeptID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("DeptID not between", value1, value2, "deptid");
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

        public Criteria andNoonIsNull() {
            addCriterion("Noon is null");
            return (Criteria) this;
        }

        public Criteria andNoonIsNotNull() {
            addCriterion("Noon is not null");
            return (Criteria) this;
        }

        public Criteria andNoonEqualTo(String value) {
            addCriterion("Noon =", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotEqualTo(String value) {
            addCriterion("Noon <>", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonGreaterThan(String value) {
            addCriterion("Noon >", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonGreaterThanOrEqualTo(String value) {
            addCriterion("Noon >=", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLessThan(String value) {
            addCriterion("Noon <", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLessThanOrEqualTo(String value) {
            addCriterion("Noon <=", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLike(String value) {
            addCriterion("Noon like", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotLike(String value) {
            addCriterion("Noon not like", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonIn(List<String> values) {
            addCriterion("Noon in", values, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotIn(List<String> values) {
            addCriterion("Noon not in", values, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonBetween(String value1, String value2) {
            addCriterion("Noon between", value1, value2, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotBetween(String value1, String value2) {
            addCriterion("Noon not between", value1, value2, "noon");
            return (Criteria) this;
        }

        public Criteria andRuleidIsNull() {
            addCriterion("RuleID is null");
            return (Criteria) this;
        }

        public Criteria andRuleidIsNotNull() {
            addCriterion("RuleID is not null");
            return (Criteria) this;
        }

        public Criteria andRuleidEqualTo(Integer value) {
            addCriterion("RuleID =", value, "ruleid");
            return (Criteria) this;
        }

        public Criteria andRuleidNotEqualTo(Integer value) {
            addCriterion("RuleID <>", value, "ruleid");
            return (Criteria) this;
        }

        public Criteria andRuleidGreaterThan(Integer value) {
            addCriterion("RuleID >", value, "ruleid");
            return (Criteria) this;
        }

        public Criteria andRuleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RuleID >=", value, "ruleid");
            return (Criteria) this;
        }

        public Criteria andRuleidLessThan(Integer value) {
            addCriterion("RuleID <", value, "ruleid");
            return (Criteria) this;
        }

        public Criteria andRuleidLessThanOrEqualTo(Integer value) {
            addCriterion("RuleID <=", value, "ruleid");
            return (Criteria) this;
        }

        public Criteria andRuleidIn(List<Integer> values) {
            addCriterion("RuleID in", values, "ruleid");
            return (Criteria) this;
        }

        public Criteria andRuleidNotIn(List<Integer> values) {
            addCriterion("RuleID not in", values, "ruleid");
            return (Criteria) this;
        }

        public Criteria andRuleidBetween(Integer value1, Integer value2) {
            addCriterion("RuleID between", value1, value2, "ruleid");
            return (Criteria) this;
        }

        public Criteria andRuleidNotBetween(Integer value1, Integer value2) {
            addCriterion("RuleID not between", value1, value2, "ruleid");
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