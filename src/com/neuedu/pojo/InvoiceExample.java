package com.neuedu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvoiceExample() {
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

        public Criteria andInvoicenumIsNull() {
            addCriterion("InvoiceNum is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenumIsNotNull() {
            addCriterion("InvoiceNum is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenumEqualTo(String value) {
            addCriterion("InvoiceNum =", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotEqualTo(String value) {
            addCriterion("InvoiceNum <>", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumGreaterThan(String value) {
            addCriterion("InvoiceNum >", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumGreaterThanOrEqualTo(String value) {
            addCriterion("InvoiceNum >=", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumLessThan(String value) {
            addCriterion("InvoiceNum <", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumLessThanOrEqualTo(String value) {
            addCriterion("InvoiceNum <=", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumLike(String value) {
            addCriterion("InvoiceNum like", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotLike(String value) {
            addCriterion("InvoiceNum not like", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumIn(List<String> values) {
            addCriterion("InvoiceNum in", values, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotIn(List<String> values) {
            addCriterion("InvoiceNum not in", values, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumBetween(String value1, String value2) {
            addCriterion("InvoiceNum between", value1, value2, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotBetween(String value1, String value2) {
            addCriterion("InvoiceNum not between", value1, value2, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("Money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("Money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("Money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("Money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("Money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("Money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("Money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("Money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("CreationTime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("CreationTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterion("CreationTime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterion("CreationTime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterion("CreationTime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreationTime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterion("CreationTime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterion("CreationTime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterion("CreationTime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterion("CreationTime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterion("CreationTime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterion("CreationTime not between", value1, value2, "creationtime");
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

        public Criteria andFeetypeIsNull() {
            addCriterion("FeeType is null");
            return (Criteria) this;
        }

        public Criteria andFeetypeIsNotNull() {
            addCriterion("FeeType is not null");
            return (Criteria) this;
        }

        public Criteria andFeetypeEqualTo(Integer value) {
            addCriterion("FeeType =", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeNotEqualTo(Integer value) {
            addCriterion("FeeType <>", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeGreaterThan(Integer value) {
            addCriterion("FeeType >", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FeeType >=", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeLessThan(Integer value) {
            addCriterion("FeeType <", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeLessThanOrEqualTo(Integer value) {
            addCriterion("FeeType <=", value, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeIn(List<Integer> values) {
            addCriterion("FeeType in", values, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeNotIn(List<Integer> values) {
            addCriterion("FeeType not in", values, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeBetween(Integer value1, Integer value2) {
            addCriterion("FeeType between", value1, value2, "feetype");
            return (Criteria) this;
        }

        public Criteria andFeetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FeeType not between", value1, value2, "feetype");
            return (Criteria) this;
        }

        public Criteria andBackIsNull() {
            addCriterion("Back is null");
            return (Criteria) this;
        }

        public Criteria andBackIsNotNull() {
            addCriterion("Back is not null");
            return (Criteria) this;
        }

        public Criteria andBackEqualTo(String value) {
            addCriterion("Back =", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackNotEqualTo(String value) {
            addCriterion("Back <>", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackGreaterThan(String value) {
            addCriterion("Back >", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackGreaterThanOrEqualTo(String value) {
            addCriterion("Back >=", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackLessThan(String value) {
            addCriterion("Back <", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackLessThanOrEqualTo(String value) {
            addCriterion("Back <=", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackLike(String value) {
            addCriterion("Back like", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackNotLike(String value) {
            addCriterion("Back not like", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackIn(List<String> values) {
            addCriterion("Back in", values, "back");
            return (Criteria) this;
        }

        public Criteria andBackNotIn(List<String> values) {
            addCriterion("Back not in", values, "back");
            return (Criteria) this;
        }

        public Criteria andBackBetween(String value1, String value2) {
            addCriterion("Back between", value1, value2, "back");
            return (Criteria) this;
        }

        public Criteria andBackNotBetween(String value1, String value2) {
            addCriterion("Back not between", value1, value2, "back");
            return (Criteria) this;
        }

        public Criteria andDailystateIsNull() {
            addCriterion("DailyState is null");
            return (Criteria) this;
        }

        public Criteria andDailystateIsNotNull() {
            addCriterion("DailyState is not null");
            return (Criteria) this;
        }

        public Criteria andDailystateEqualTo(Integer value) {
            addCriterion("DailyState =", value, "dailystate");
            return (Criteria) this;
        }

        public Criteria andDailystateNotEqualTo(Integer value) {
            addCriterion("DailyState <>", value, "dailystate");
            return (Criteria) this;
        }

        public Criteria andDailystateGreaterThan(Integer value) {
            addCriterion("DailyState >", value, "dailystate");
            return (Criteria) this;
        }

        public Criteria andDailystateGreaterThanOrEqualTo(Integer value) {
            addCriterion("DailyState >=", value, "dailystate");
            return (Criteria) this;
        }

        public Criteria andDailystateLessThan(Integer value) {
            addCriterion("DailyState <", value, "dailystate");
            return (Criteria) this;
        }

        public Criteria andDailystateLessThanOrEqualTo(Integer value) {
            addCriterion("DailyState <=", value, "dailystate");
            return (Criteria) this;
        }

        public Criteria andDailystateIn(List<Integer> values) {
            addCriterion("DailyState in", values, "dailystate");
            return (Criteria) this;
        }

        public Criteria andDailystateNotIn(List<Integer> values) {
            addCriterion("DailyState not in", values, "dailystate");
            return (Criteria) this;
        }

        public Criteria andDailystateBetween(Integer value1, Integer value2) {
            addCriterion("DailyState between", value1, value2, "dailystate");
            return (Criteria) this;
        }

        public Criteria andDailystateNotBetween(Integer value1, Integer value2) {
            addCriterion("DailyState not between", value1, value2, "dailystate");
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