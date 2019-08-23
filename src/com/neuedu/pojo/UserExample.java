package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("RealName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("RealName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("RealName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("RealName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("RealName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("RealName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("RealName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("RealName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("RealName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("RealName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("RealName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("RealName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("RealName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("RealName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andUsetypeIsNull() {
            addCriterion("UseType is null");
            return (Criteria) this;
        }

        public Criteria andUsetypeIsNotNull() {
            addCriterion("UseType is not null");
            return (Criteria) this;
        }

        public Criteria andUsetypeEqualTo(Integer value) {
            addCriterion("UseType =", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotEqualTo(Integer value) {
            addCriterion("UseType <>", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeGreaterThan(Integer value) {
            addCriterion("UseType >", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("UseType >=", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLessThan(Integer value) {
            addCriterion("UseType <", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLessThanOrEqualTo(Integer value) {
            addCriterion("UseType <=", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeIn(List<Integer> values) {
            addCriterion("UseType in", values, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotIn(List<Integer> values) {
            addCriterion("UseType not in", values, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeBetween(Integer value1, Integer value2) {
            addCriterion("UseType between", value1, value2, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("UseType not between", value1, value2, "usetype");
            return (Criteria) this;
        }

        public Criteria andDoctitleidIsNull() {
            addCriterion("DocTitleID is null");
            return (Criteria) this;
        }

        public Criteria andDoctitleidIsNotNull() {
            addCriterion("DocTitleID is not null");
            return (Criteria) this;
        }

        public Criteria andDoctitleidEqualTo(Integer value) {
            addCriterion("DocTitleID =", value, "doctitleid");
            return (Criteria) this;
        }

        public Criteria andDoctitleidNotEqualTo(Integer value) {
            addCriterion("DocTitleID <>", value, "doctitleid");
            return (Criteria) this;
        }

        public Criteria andDoctitleidGreaterThan(Integer value) {
            addCriterion("DocTitleID >", value, "doctitleid");
            return (Criteria) this;
        }

        public Criteria andDoctitleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DocTitleID >=", value, "doctitleid");
            return (Criteria) this;
        }

        public Criteria andDoctitleidLessThan(Integer value) {
            addCriterion("DocTitleID <", value, "doctitleid");
            return (Criteria) this;
        }

        public Criteria andDoctitleidLessThanOrEqualTo(Integer value) {
            addCriterion("DocTitleID <=", value, "doctitleid");
            return (Criteria) this;
        }

        public Criteria andDoctitleidIn(List<Integer> values) {
            addCriterion("DocTitleID in", values, "doctitleid");
            return (Criteria) this;
        }

        public Criteria andDoctitleidNotIn(List<Integer> values) {
            addCriterion("DocTitleID not in", values, "doctitleid");
            return (Criteria) this;
        }

        public Criteria andDoctitleidBetween(Integer value1, Integer value2) {
            addCriterion("DocTitleID between", value1, value2, "doctitleid");
            return (Criteria) this;
        }

        public Criteria andDoctitleidNotBetween(Integer value1, Integer value2) {
            addCriterion("DocTitleID not between", value1, value2, "doctitleid");
            return (Criteria) this;
        }

        public Criteria andIsschedulingIsNull() {
            addCriterion("IsScheduling is null");
            return (Criteria) this;
        }

        public Criteria andIsschedulingIsNotNull() {
            addCriterion("IsScheduling is not null");
            return (Criteria) this;
        }

        public Criteria andIsschedulingEqualTo(String value) {
            addCriterion("IsScheduling =", value, "isscheduling");
            return (Criteria) this;
        }

        public Criteria andIsschedulingNotEqualTo(String value) {
            addCriterion("IsScheduling <>", value, "isscheduling");
            return (Criteria) this;
        }

        public Criteria andIsschedulingGreaterThan(String value) {
            addCriterion("IsScheduling >", value, "isscheduling");
            return (Criteria) this;
        }

        public Criteria andIsschedulingGreaterThanOrEqualTo(String value) {
            addCriterion("IsScheduling >=", value, "isscheduling");
            return (Criteria) this;
        }

        public Criteria andIsschedulingLessThan(String value) {
            addCriterion("IsScheduling <", value, "isscheduling");
            return (Criteria) this;
        }

        public Criteria andIsschedulingLessThanOrEqualTo(String value) {
            addCriterion("IsScheduling <=", value, "isscheduling");
            return (Criteria) this;
        }

        public Criteria andIsschedulingLike(String value) {
            addCriterion("IsScheduling like", value, "isscheduling");
            return (Criteria) this;
        }

        public Criteria andIsschedulingNotLike(String value) {
            addCriterion("IsScheduling not like", value, "isscheduling");
            return (Criteria) this;
        }

        public Criteria andIsschedulingIn(List<String> values) {
            addCriterion("IsScheduling in", values, "isscheduling");
            return (Criteria) this;
        }

        public Criteria andIsschedulingNotIn(List<String> values) {
            addCriterion("IsScheduling not in", values, "isscheduling");
            return (Criteria) this;
        }

        public Criteria andIsschedulingBetween(String value1, String value2) {
            addCriterion("IsScheduling between", value1, value2, "isscheduling");
            return (Criteria) this;
        }

        public Criteria andIsschedulingNotBetween(String value1, String value2) {
            addCriterion("IsScheduling not between", value1, value2, "isscheduling");
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

        public Criteria andRegistleidIsNull() {
            addCriterion("RegistLeID is null");
            return (Criteria) this;
        }

        public Criteria andRegistleidIsNotNull() {
            addCriterion("RegistLeID is not null");
            return (Criteria) this;
        }

        public Criteria andRegistleidEqualTo(Integer value) {
            addCriterion("RegistLeID =", value, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidNotEqualTo(Integer value) {
            addCriterion("RegistLeID <>", value, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidGreaterThan(Integer value) {
            addCriterion("RegistLeID >", value, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RegistLeID >=", value, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidLessThan(Integer value) {
            addCriterion("RegistLeID <", value, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidLessThanOrEqualTo(Integer value) {
            addCriterion("RegistLeID <=", value, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidIn(List<Integer> values) {
            addCriterion("RegistLeID in", values, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidNotIn(List<Integer> values) {
            addCriterion("RegistLeID not in", values, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidBetween(Integer value1, Integer value2) {
            addCriterion("RegistLeID between", value1, value2, "registleid");
            return (Criteria) this;
        }

        public Criteria andRegistleidNotBetween(Integer value1, Integer value2) {
            addCriterion("RegistLeID not between", value1, value2, "registleid");
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