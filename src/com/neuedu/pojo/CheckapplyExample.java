package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckapplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckapplyExample() {
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

        public Criteria andMedicalidIsNull() {
            addCriterion("MedicalID is null");
            return (Criteria) this;
        }

        public Criteria andMedicalidIsNotNull() {
            addCriterion("MedicalID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalidEqualTo(Integer value) {
            addCriterion("MedicalID =", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidNotEqualTo(Integer value) {
            addCriterion("MedicalID <>", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidGreaterThan(Integer value) {
            addCriterion("MedicalID >", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MedicalID >=", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidLessThan(Integer value) {
            addCriterion("MedicalID <", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidLessThanOrEqualTo(Integer value) {
            addCriterion("MedicalID <=", value, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidIn(List<Integer> values) {
            addCriterion("MedicalID in", values, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidNotIn(List<Integer> values) {
            addCriterion("MedicalID not in", values, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidBetween(Integer value1, Integer value2) {
            addCriterion("MedicalID between", value1, value2, "medicalid");
            return (Criteria) this;
        }

        public Criteria andMedicalidNotBetween(Integer value1, Integer value2) {
            addCriterion("MedicalID not between", value1, value2, "medicalid");
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

        public Criteria andItemidIsNull() {
            addCriterion("ItemID is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("ItemID is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(Integer value) {
            addCriterion("ItemID =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(Integer value) {
            addCriterion("ItemID <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(Integer value) {
            addCriterion("ItemID >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ItemID >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(Integer value) {
            addCriterion("ItemID <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(Integer value) {
            addCriterion("ItemID <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<Integer> values) {
            addCriterion("ItemID in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<Integer> values) {
            addCriterion("ItemID not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(Integer value1, Integer value2) {
            addCriterion("ItemID between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(Integer value1, Integer value2) {
            addCriterion("ItemID not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andObjectiveIsNull() {
            addCriterion("Objective is null");
            return (Criteria) this;
        }

        public Criteria andObjectiveIsNotNull() {
            addCriterion("Objective is not null");
            return (Criteria) this;
        }

        public Criteria andObjectiveEqualTo(String value) {
            addCriterion("Objective =", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveNotEqualTo(String value) {
            addCriterion("Objective <>", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveGreaterThan(String value) {
            addCriterion("Objective >", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveGreaterThanOrEqualTo(String value) {
            addCriterion("Objective >=", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveLessThan(String value) {
            addCriterion("Objective <", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveLessThanOrEqualTo(String value) {
            addCriterion("Objective <=", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveLike(String value) {
            addCriterion("Objective like", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveNotLike(String value) {
            addCriterion("Objective not like", value, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveIn(List<String> values) {
            addCriterion("Objective in", values, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveNotIn(List<String> values) {
            addCriterion("Objective not in", values, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveBetween(String value1, String value2) {
            addCriterion("Objective between", value1, value2, "objective");
            return (Criteria) this;
        }

        public Criteria andObjectiveNotBetween(String value1, String value2) {
            addCriterion("Objective not between", value1, value2, "objective");
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

        public Criteria andIsurgentIsNull() {
            addCriterion("IsUrgent is null");
            return (Criteria) this;
        }

        public Criteria andIsurgentIsNotNull() {
            addCriterion("IsUrgent is not null");
            return (Criteria) this;
        }

        public Criteria andIsurgentEqualTo(Integer value) {
            addCriterion("IsUrgent =", value, "isurgent");
            return (Criteria) this;
        }

        public Criteria andIsurgentNotEqualTo(Integer value) {
            addCriterion("IsUrgent <>", value, "isurgent");
            return (Criteria) this;
        }

        public Criteria andIsurgentGreaterThan(Integer value) {
            addCriterion("IsUrgent >", value, "isurgent");
            return (Criteria) this;
        }

        public Criteria andIsurgentGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsUrgent >=", value, "isurgent");
            return (Criteria) this;
        }

        public Criteria andIsurgentLessThan(Integer value) {
            addCriterion("IsUrgent <", value, "isurgent");
            return (Criteria) this;
        }

        public Criteria andIsurgentLessThanOrEqualTo(Integer value) {
            addCriterion("IsUrgent <=", value, "isurgent");
            return (Criteria) this;
        }

        public Criteria andIsurgentIn(List<Integer> values) {
            addCriterion("IsUrgent in", values, "isurgent");
            return (Criteria) this;
        }

        public Criteria andIsurgentNotIn(List<Integer> values) {
            addCriterion("IsUrgent not in", values, "isurgent");
            return (Criteria) this;
        }

        public Criteria andIsurgentBetween(Integer value1, Integer value2) {
            addCriterion("IsUrgent between", value1, value2, "isurgent");
            return (Criteria) this;
        }

        public Criteria andIsurgentNotBetween(Integer value1, Integer value2) {
            addCriterion("IsUrgent not between", value1, value2, "isurgent");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("Num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("Num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("Num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("Num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("Num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("Num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("Num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("Num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("Num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("Num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("Num not between", value1, value2, "num");
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

        public Criteria andDoctoridIsNull() {
            addCriterion("DoctorID is null");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNotNull() {
            addCriterion("DoctorID is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoridEqualTo(Integer value) {
            addCriterion("DoctorID =", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotEqualTo(Integer value) {
            addCriterion("DoctorID <>", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThan(Integer value) {
            addCriterion("DoctorID >", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("DoctorID >=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThan(Integer value) {
            addCriterion("DoctorID <", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThanOrEqualTo(Integer value) {
            addCriterion("DoctorID <=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIn(List<Integer> values) {
            addCriterion("DoctorID in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotIn(List<Integer> values) {
            addCriterion("DoctorID not in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridBetween(Integer value1, Integer value2) {
            addCriterion("DoctorID between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotBetween(Integer value1, Integer value2) {
            addCriterion("DoctorID not between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andCheckoperidIsNull() {
            addCriterion("CheckOperID is null");
            return (Criteria) this;
        }

        public Criteria andCheckoperidIsNotNull() {
            addCriterion("CheckOperID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckoperidEqualTo(Integer value) {
            addCriterion("CheckOperID =", value, "checkoperid");
            return (Criteria) this;
        }

        public Criteria andCheckoperidNotEqualTo(Integer value) {
            addCriterion("CheckOperID <>", value, "checkoperid");
            return (Criteria) this;
        }

        public Criteria andCheckoperidGreaterThan(Integer value) {
            addCriterion("CheckOperID >", value, "checkoperid");
            return (Criteria) this;
        }

        public Criteria andCheckoperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CheckOperID >=", value, "checkoperid");
            return (Criteria) this;
        }

        public Criteria andCheckoperidLessThan(Integer value) {
            addCriterion("CheckOperID <", value, "checkoperid");
            return (Criteria) this;
        }

        public Criteria andCheckoperidLessThanOrEqualTo(Integer value) {
            addCriterion("CheckOperID <=", value, "checkoperid");
            return (Criteria) this;
        }

        public Criteria andCheckoperidIn(List<Integer> values) {
            addCriterion("CheckOperID in", values, "checkoperid");
            return (Criteria) this;
        }

        public Criteria andCheckoperidNotIn(List<Integer> values) {
            addCriterion("CheckOperID not in", values, "checkoperid");
            return (Criteria) this;
        }

        public Criteria andCheckoperidBetween(Integer value1, Integer value2) {
            addCriterion("CheckOperID between", value1, value2, "checkoperid");
            return (Criteria) this;
        }

        public Criteria andCheckoperidNotBetween(Integer value1, Integer value2) {
            addCriterion("CheckOperID not between", value1, value2, "checkoperid");
            return (Criteria) this;
        }

        public Criteria andResultoperidIsNull() {
            addCriterion("ResultOperID is null");
            return (Criteria) this;
        }

        public Criteria andResultoperidIsNotNull() {
            addCriterion("ResultOperID is not null");
            return (Criteria) this;
        }

        public Criteria andResultoperidEqualTo(Integer value) {
            addCriterion("ResultOperID =", value, "resultoperid");
            return (Criteria) this;
        }

        public Criteria andResultoperidNotEqualTo(Integer value) {
            addCriterion("ResultOperID <>", value, "resultoperid");
            return (Criteria) this;
        }

        public Criteria andResultoperidGreaterThan(Integer value) {
            addCriterion("ResultOperID >", value, "resultoperid");
            return (Criteria) this;
        }

        public Criteria andResultoperidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ResultOperID >=", value, "resultoperid");
            return (Criteria) this;
        }

        public Criteria andResultoperidLessThan(Integer value) {
            addCriterion("ResultOperID <", value, "resultoperid");
            return (Criteria) this;
        }

        public Criteria andResultoperidLessThanOrEqualTo(Integer value) {
            addCriterion("ResultOperID <=", value, "resultoperid");
            return (Criteria) this;
        }

        public Criteria andResultoperidIn(List<Integer> values) {
            addCriterion("ResultOperID in", values, "resultoperid");
            return (Criteria) this;
        }

        public Criteria andResultoperidNotIn(List<Integer> values) {
            addCriterion("ResultOperID not in", values, "resultoperid");
            return (Criteria) this;
        }

        public Criteria andResultoperidBetween(Integer value1, Integer value2) {
            addCriterion("ResultOperID between", value1, value2, "resultoperid");
            return (Criteria) this;
        }

        public Criteria andResultoperidNotBetween(Integer value1, Integer value2) {
            addCriterion("ResultOperID not between", value1, value2, "resultoperid");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("CheckTime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("CheckTime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterion("CheckTime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterion("CheckTime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterion("CheckTime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CheckTime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterion("CheckTime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("CheckTime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterion("CheckTime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterion("CheckTime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterion("CheckTime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("CheckTime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("Result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("Result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("Result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("Result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("Result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("Result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("Result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("Result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("Result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("Result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("Result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("Result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("Result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("Result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResulttimeIsNull() {
            addCriterion("ResultTime is null");
            return (Criteria) this;
        }

        public Criteria andResulttimeIsNotNull() {
            addCriterion("ResultTime is not null");
            return (Criteria) this;
        }

        public Criteria andResulttimeEqualTo(Date value) {
            addCriterion("ResultTime =", value, "resulttime");
            return (Criteria) this;
        }

        public Criteria andResulttimeNotEqualTo(Date value) {
            addCriterion("ResultTime <>", value, "resulttime");
            return (Criteria) this;
        }

        public Criteria andResulttimeGreaterThan(Date value) {
            addCriterion("ResultTime >", value, "resulttime");
            return (Criteria) this;
        }

        public Criteria andResulttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ResultTime >=", value, "resulttime");
            return (Criteria) this;
        }

        public Criteria andResulttimeLessThan(Date value) {
            addCriterion("ResultTime <", value, "resulttime");
            return (Criteria) this;
        }

        public Criteria andResulttimeLessThanOrEqualTo(Date value) {
            addCriterion("ResultTime <=", value, "resulttime");
            return (Criteria) this;
        }

        public Criteria andResulttimeIn(List<Date> values) {
            addCriterion("ResultTime in", values, "resulttime");
            return (Criteria) this;
        }

        public Criteria andResulttimeNotIn(List<Date> values) {
            addCriterion("ResultTime not in", values, "resulttime");
            return (Criteria) this;
        }

        public Criteria andResulttimeBetween(Date value1, Date value2) {
            addCriterion("ResultTime between", value1, value2, "resulttime");
            return (Criteria) this;
        }

        public Criteria andResulttimeNotBetween(Date value1, Date value2) {
            addCriterion("ResultTime not between", value1, value2, "resulttime");
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

        public Criteria andRecordtypeIsNull() {
            addCriterion("RecordType is null");
            return (Criteria) this;
        }

        public Criteria andRecordtypeIsNotNull() {
            addCriterion("RecordType is not null");
            return (Criteria) this;
        }

        public Criteria andRecordtypeEqualTo(Integer value) {
            addCriterion("RecordType =", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNotEqualTo(Integer value) {
            addCriterion("RecordType <>", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeGreaterThan(Integer value) {
            addCriterion("RecordType >", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RecordType >=", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeLessThan(Integer value) {
            addCriterion("RecordType <", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeLessThanOrEqualTo(Integer value) {
            addCriterion("RecordType <=", value, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeIn(List<Integer> values) {
            addCriterion("RecordType in", values, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNotIn(List<Integer> values) {
            addCriterion("RecordType not in", values, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeBetween(Integer value1, Integer value2) {
            addCriterion("RecordType between", value1, value2, "recordtype");
            return (Criteria) this;
        }

        public Criteria andRecordtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("RecordType not between", value1, value2, "recordtype");
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