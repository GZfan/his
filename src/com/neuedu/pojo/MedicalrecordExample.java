package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.List;

public class MedicalrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicalrecordExample() {
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

        public Criteria andCasenumberIsNull() {
            addCriterion("CaseNumber is null");
            return (Criteria) this;
        }

        public Criteria andCasenumberIsNotNull() {
            addCriterion("CaseNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCasenumberEqualTo(String value) {
            addCriterion("CaseNumber =", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberNotEqualTo(String value) {
            addCriterion("CaseNumber <>", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberGreaterThan(String value) {
            addCriterion("CaseNumber >", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberGreaterThanOrEqualTo(String value) {
            addCriterion("CaseNumber >=", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberLessThan(String value) {
            addCriterion("CaseNumber <", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberLessThanOrEqualTo(String value) {
            addCriterion("CaseNumber <=", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberLike(String value) {
            addCriterion("CaseNumber like", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberNotLike(String value) {
            addCriterion("CaseNumber not like", value, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberIn(List<String> values) {
            addCriterion("CaseNumber in", values, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberNotIn(List<String> values) {
            addCriterion("CaseNumber not in", values, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberBetween(String value1, String value2) {
            addCriterion("CaseNumber between", value1, value2, "casenumber");
            return (Criteria) this;
        }

        public Criteria andCasenumberNotBetween(String value1, String value2) {
            addCriterion("CaseNumber not between", value1, value2, "casenumber");
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

        public Criteria andReadmeIsNull() {
            addCriterion("Readme is null");
            return (Criteria) this;
        }

        public Criteria andReadmeIsNotNull() {
            addCriterion("Readme is not null");
            return (Criteria) this;
        }

        public Criteria andReadmeEqualTo(String value) {
            addCriterion("Readme =", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeNotEqualTo(String value) {
            addCriterion("Readme <>", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeGreaterThan(String value) {
            addCriterion("Readme >", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeGreaterThanOrEqualTo(String value) {
            addCriterion("Readme >=", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeLessThan(String value) {
            addCriterion("Readme <", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeLessThanOrEqualTo(String value) {
            addCriterion("Readme <=", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeLike(String value) {
            addCriterion("Readme like", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeNotLike(String value) {
            addCriterion("Readme not like", value, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeIn(List<String> values) {
            addCriterion("Readme in", values, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeNotIn(List<String> values) {
            addCriterion("Readme not in", values, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeBetween(String value1, String value2) {
            addCriterion("Readme between", value1, value2, "readme");
            return (Criteria) this;
        }

        public Criteria andReadmeNotBetween(String value1, String value2) {
            addCriterion("Readme not between", value1, value2, "readme");
            return (Criteria) this;
        }

        public Criteria andPresentIsNull() {
            addCriterion("Present is null");
            return (Criteria) this;
        }

        public Criteria andPresentIsNotNull() {
            addCriterion("Present is not null");
            return (Criteria) this;
        }

        public Criteria andPresentEqualTo(String value) {
            addCriterion("Present =", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentNotEqualTo(String value) {
            addCriterion("Present <>", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentGreaterThan(String value) {
            addCriterion("Present >", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentGreaterThanOrEqualTo(String value) {
            addCriterion("Present >=", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentLessThan(String value) {
            addCriterion("Present <", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentLessThanOrEqualTo(String value) {
            addCriterion("Present <=", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentLike(String value) {
            addCriterion("Present like", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentNotLike(String value) {
            addCriterion("Present not like", value, "present");
            return (Criteria) this;
        }

        public Criteria andPresentIn(List<String> values) {
            addCriterion("Present in", values, "present");
            return (Criteria) this;
        }

        public Criteria andPresentNotIn(List<String> values) {
            addCriterion("Present not in", values, "present");
            return (Criteria) this;
        }

        public Criteria andPresentBetween(String value1, String value2) {
            addCriterion("Present between", value1, value2, "present");
            return (Criteria) this;
        }

        public Criteria andPresentNotBetween(String value1, String value2) {
            addCriterion("Present not between", value1, value2, "present");
            return (Criteria) this;
        }

        public Criteria andPresenttreatIsNull() {
            addCriterion("PresentTreat is null");
            return (Criteria) this;
        }

        public Criteria andPresenttreatIsNotNull() {
            addCriterion("PresentTreat is not null");
            return (Criteria) this;
        }

        public Criteria andPresenttreatEqualTo(String value) {
            addCriterion("PresentTreat =", value, "presenttreat");
            return (Criteria) this;
        }

        public Criteria andPresenttreatNotEqualTo(String value) {
            addCriterion("PresentTreat <>", value, "presenttreat");
            return (Criteria) this;
        }

        public Criteria andPresenttreatGreaterThan(String value) {
            addCriterion("PresentTreat >", value, "presenttreat");
            return (Criteria) this;
        }

        public Criteria andPresenttreatGreaterThanOrEqualTo(String value) {
            addCriterion("PresentTreat >=", value, "presenttreat");
            return (Criteria) this;
        }

        public Criteria andPresenttreatLessThan(String value) {
            addCriterion("PresentTreat <", value, "presenttreat");
            return (Criteria) this;
        }

        public Criteria andPresenttreatLessThanOrEqualTo(String value) {
            addCriterion("PresentTreat <=", value, "presenttreat");
            return (Criteria) this;
        }

        public Criteria andPresenttreatLike(String value) {
            addCriterion("PresentTreat like", value, "presenttreat");
            return (Criteria) this;
        }

        public Criteria andPresenttreatNotLike(String value) {
            addCriterion("PresentTreat not like", value, "presenttreat");
            return (Criteria) this;
        }

        public Criteria andPresenttreatIn(List<String> values) {
            addCriterion("PresentTreat in", values, "presenttreat");
            return (Criteria) this;
        }

        public Criteria andPresenttreatNotIn(List<String> values) {
            addCriterion("PresentTreat not in", values, "presenttreat");
            return (Criteria) this;
        }

        public Criteria andPresenttreatBetween(String value1, String value2) {
            addCriterion("PresentTreat between", value1, value2, "presenttreat");
            return (Criteria) this;
        }

        public Criteria andPresenttreatNotBetween(String value1, String value2) {
            addCriterion("PresentTreat not between", value1, value2, "presenttreat");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNull() {
            addCriterion("History is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNotNull() {
            addCriterion("History is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryEqualTo(String value) {
            addCriterion("History =", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotEqualTo(String value) {
            addCriterion("History <>", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThan(String value) {
            addCriterion("History >", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("History >=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThan(String value) {
            addCriterion("History <", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThanOrEqualTo(String value) {
            addCriterion("History <=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLike(String value) {
            addCriterion("History like", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotLike(String value) {
            addCriterion("History not like", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryIn(List<String> values) {
            addCriterion("History in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotIn(List<String> values) {
            addCriterion("History not in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryBetween(String value1, String value2) {
            addCriterion("History between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotBetween(String value1, String value2) {
            addCriterion("History not between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andAllergyIsNull() {
            addCriterion("Allergy is null");
            return (Criteria) this;
        }

        public Criteria andAllergyIsNotNull() {
            addCriterion("Allergy is not null");
            return (Criteria) this;
        }

        public Criteria andAllergyEqualTo(String value) {
            addCriterion("Allergy =", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotEqualTo(String value) {
            addCriterion("Allergy <>", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyGreaterThan(String value) {
            addCriterion("Allergy >", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyGreaterThanOrEqualTo(String value) {
            addCriterion("Allergy >=", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyLessThan(String value) {
            addCriterion("Allergy <", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyLessThanOrEqualTo(String value) {
            addCriterion("Allergy <=", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyLike(String value) {
            addCriterion("Allergy like", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotLike(String value) {
            addCriterion("Allergy not like", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyIn(List<String> values) {
            addCriterion("Allergy in", values, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotIn(List<String> values) {
            addCriterion("Allergy not in", values, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyBetween(String value1, String value2) {
            addCriterion("Allergy between", value1, value2, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotBetween(String value1, String value2) {
            addCriterion("Allergy not between", value1, value2, "allergy");
            return (Criteria) this;
        }

        public Criteria andPhysiqueIsNull() {
            addCriterion("Physique is null");
            return (Criteria) this;
        }

        public Criteria andPhysiqueIsNotNull() {
            addCriterion("Physique is not null");
            return (Criteria) this;
        }

        public Criteria andPhysiqueEqualTo(String value) {
            addCriterion("Physique =", value, "physique");
            return (Criteria) this;
        }

        public Criteria andPhysiqueNotEqualTo(String value) {
            addCriterion("Physique <>", value, "physique");
            return (Criteria) this;
        }

        public Criteria andPhysiqueGreaterThan(String value) {
            addCriterion("Physique >", value, "physique");
            return (Criteria) this;
        }

        public Criteria andPhysiqueGreaterThanOrEqualTo(String value) {
            addCriterion("Physique >=", value, "physique");
            return (Criteria) this;
        }

        public Criteria andPhysiqueLessThan(String value) {
            addCriterion("Physique <", value, "physique");
            return (Criteria) this;
        }

        public Criteria andPhysiqueLessThanOrEqualTo(String value) {
            addCriterion("Physique <=", value, "physique");
            return (Criteria) this;
        }

        public Criteria andPhysiqueLike(String value) {
            addCriterion("Physique like", value, "physique");
            return (Criteria) this;
        }

        public Criteria andPhysiqueNotLike(String value) {
            addCriterion("Physique not like", value, "physique");
            return (Criteria) this;
        }

        public Criteria andPhysiqueIn(List<String> values) {
            addCriterion("Physique in", values, "physique");
            return (Criteria) this;
        }

        public Criteria andPhysiqueNotIn(List<String> values) {
            addCriterion("Physique not in", values, "physique");
            return (Criteria) this;
        }

        public Criteria andPhysiqueBetween(String value1, String value2) {
            addCriterion("Physique between", value1, value2, "physique");
            return (Criteria) this;
        }

        public Criteria andPhysiqueNotBetween(String value1, String value2) {
            addCriterion("Physique not between", value1, value2, "physique");
            return (Criteria) this;
        }

        public Criteria andProposalIsNull() {
            addCriterion("Proposal is null");
            return (Criteria) this;
        }

        public Criteria andProposalIsNotNull() {
            addCriterion("Proposal is not null");
            return (Criteria) this;
        }

        public Criteria andProposalEqualTo(String value) {
            addCriterion("Proposal =", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalNotEqualTo(String value) {
            addCriterion("Proposal <>", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalGreaterThan(String value) {
            addCriterion("Proposal >", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalGreaterThanOrEqualTo(String value) {
            addCriterion("Proposal >=", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalLessThan(String value) {
            addCriterion("Proposal <", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalLessThanOrEqualTo(String value) {
            addCriterion("Proposal <=", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalLike(String value) {
            addCriterion("Proposal like", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalNotLike(String value) {
            addCriterion("Proposal not like", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalIn(List<String> values) {
            addCriterion("Proposal in", values, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalNotIn(List<String> values) {
            addCriterion("Proposal not in", values, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalBetween(String value1, String value2) {
            addCriterion("Proposal between", value1, value2, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalNotBetween(String value1, String value2) {
            addCriterion("Proposal not between", value1, value2, "proposal");
            return (Criteria) this;
        }

        public Criteria andCarefulIsNull() {
            addCriterion("Careful is null");
            return (Criteria) this;
        }

        public Criteria andCarefulIsNotNull() {
            addCriterion("Careful is not null");
            return (Criteria) this;
        }

        public Criteria andCarefulEqualTo(String value) {
            addCriterion("Careful =", value, "careful");
            return (Criteria) this;
        }

        public Criteria andCarefulNotEqualTo(String value) {
            addCriterion("Careful <>", value, "careful");
            return (Criteria) this;
        }

        public Criteria andCarefulGreaterThan(String value) {
            addCriterion("Careful >", value, "careful");
            return (Criteria) this;
        }

        public Criteria andCarefulGreaterThanOrEqualTo(String value) {
            addCriterion("Careful >=", value, "careful");
            return (Criteria) this;
        }

        public Criteria andCarefulLessThan(String value) {
            addCriterion("Careful <", value, "careful");
            return (Criteria) this;
        }

        public Criteria andCarefulLessThanOrEqualTo(String value) {
            addCriterion("Careful <=", value, "careful");
            return (Criteria) this;
        }

        public Criteria andCarefulLike(String value) {
            addCriterion("Careful like", value, "careful");
            return (Criteria) this;
        }

        public Criteria andCarefulNotLike(String value) {
            addCriterion("Careful not like", value, "careful");
            return (Criteria) this;
        }

        public Criteria andCarefulIn(List<String> values) {
            addCriterion("Careful in", values, "careful");
            return (Criteria) this;
        }

        public Criteria andCarefulNotIn(List<String> values) {
            addCriterion("Careful not in", values, "careful");
            return (Criteria) this;
        }

        public Criteria andCarefulBetween(String value1, String value2) {
            addCriterion("Careful between", value1, value2, "careful");
            return (Criteria) this;
        }

        public Criteria andCarefulNotBetween(String value1, String value2) {
            addCriterion("Careful not between", value1, value2, "careful");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNull() {
            addCriterion("CheckResult is null");
            return (Criteria) this;
        }

        public Criteria andCheckresultIsNotNull() {
            addCriterion("CheckResult is not null");
            return (Criteria) this;
        }

        public Criteria andCheckresultEqualTo(String value) {
            addCriterion("CheckResult =", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotEqualTo(String value) {
            addCriterion("CheckResult <>", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThan(String value) {
            addCriterion("CheckResult >", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultGreaterThanOrEqualTo(String value) {
            addCriterion("CheckResult >=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThan(String value) {
            addCriterion("CheckResult <", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLessThanOrEqualTo(String value) {
            addCriterion("CheckResult <=", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultLike(String value) {
            addCriterion("CheckResult like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotLike(String value) {
            addCriterion("CheckResult not like", value, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultIn(List<String> values) {
            addCriterion("CheckResult in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotIn(List<String> values) {
            addCriterion("CheckResult not in", values, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultBetween(String value1, String value2) {
            addCriterion("CheckResult between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andCheckresultNotBetween(String value1, String value2) {
            addCriterion("CheckResult not between", value1, value2, "checkresult");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIsNull() {
            addCriterion("Diagnosis is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIsNotNull() {
            addCriterion("Diagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisEqualTo(String value) {
            addCriterion("Diagnosis =", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotEqualTo(String value) {
            addCriterion("Diagnosis <>", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisGreaterThan(String value) {
            addCriterion("Diagnosis >", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("Diagnosis >=", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLessThan(String value) {
            addCriterion("Diagnosis <", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLessThanOrEqualTo(String value) {
            addCriterion("Diagnosis <=", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisLike(String value) {
            addCriterion("Diagnosis like", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotLike(String value) {
            addCriterion("Diagnosis not like", value, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisIn(List<String> values) {
            addCriterion("Diagnosis in", values, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotIn(List<String> values) {
            addCriterion("Diagnosis not in", values, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisBetween(String value1, String value2) {
            addCriterion("Diagnosis between", value1, value2, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andDiagnosisNotBetween(String value1, String value2) {
            addCriterion("Diagnosis not between", value1, value2, "diagnosis");
            return (Criteria) this;
        }

        public Criteria andHandlingIsNull() {
            addCriterion("Handling is null");
            return (Criteria) this;
        }

        public Criteria andHandlingIsNotNull() {
            addCriterion("Handling is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingEqualTo(String value) {
            addCriterion("Handling =", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingNotEqualTo(String value) {
            addCriterion("Handling <>", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingGreaterThan(String value) {
            addCriterion("Handling >", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingGreaterThanOrEqualTo(String value) {
            addCriterion("Handling >=", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingLessThan(String value) {
            addCriterion("Handling <", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingLessThanOrEqualTo(String value) {
            addCriterion("Handling <=", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingLike(String value) {
            addCriterion("Handling like", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingNotLike(String value) {
            addCriterion("Handling not like", value, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingIn(List<String> values) {
            addCriterion("Handling in", values, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingNotIn(List<String> values) {
            addCriterion("Handling not in", values, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingBetween(String value1, String value2) {
            addCriterion("Handling between", value1, value2, "handling");
            return (Criteria) this;
        }

        public Criteria andHandlingNotBetween(String value1, String value2) {
            addCriterion("Handling not between", value1, value2, "handling");
            return (Criteria) this;
        }

        public Criteria andCasestateIsNull() {
            addCriterion("CaseState is null");
            return (Criteria) this;
        }

        public Criteria andCasestateIsNotNull() {
            addCriterion("CaseState is not null");
            return (Criteria) this;
        }

        public Criteria andCasestateEqualTo(Integer value) {
            addCriterion("CaseState =", value, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateNotEqualTo(Integer value) {
            addCriterion("CaseState <>", value, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateGreaterThan(Integer value) {
            addCriterion("CaseState >", value, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CaseState >=", value, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateLessThan(Integer value) {
            addCriterion("CaseState <", value, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateLessThanOrEqualTo(Integer value) {
            addCriterion("CaseState <=", value, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateIn(List<Integer> values) {
            addCriterion("CaseState in", values, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateNotIn(List<Integer> values) {
            addCriterion("CaseState not in", values, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateBetween(Integer value1, Integer value2) {
            addCriterion("CaseState between", value1, value2, "casestate");
            return (Criteria) this;
        }

        public Criteria andCasestateNotBetween(Integer value1, Integer value2) {
            addCriterion("CaseState not between", value1, value2, "casestate");
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