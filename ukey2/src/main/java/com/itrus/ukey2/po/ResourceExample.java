package com.itrus.ukey2.po;

import java.util.ArrayList;
import java.util.List;

public class ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParentResCodeIsNull() {
            addCriterion("parent_res_code is null");
            return (Criteria) this;
        }

        public Criteria andParentResCodeIsNotNull() {
            addCriterion("parent_res_code is not null");
            return (Criteria) this;
        }

        public Criteria andParentResCodeEqualTo(String value) {
            addCriterion("parent_res_code =", value, "parentResCode");
            return (Criteria) this;
        }

        public Criteria andParentResCodeNotEqualTo(String value) {
            addCriterion("parent_res_code <>", value, "parentResCode");
            return (Criteria) this;
        }

        public Criteria andParentResCodeGreaterThan(String value) {
            addCriterion("parent_res_code >", value, "parentResCode");
            return (Criteria) this;
        }

        public Criteria andParentResCodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_res_code >=", value, "parentResCode");
            return (Criteria) this;
        }

        public Criteria andParentResCodeLessThan(String value) {
            addCriterion("parent_res_code <", value, "parentResCode");
            return (Criteria) this;
        }

        public Criteria andParentResCodeLessThanOrEqualTo(String value) {
            addCriterion("parent_res_code <=", value, "parentResCode");
            return (Criteria) this;
        }

        public Criteria andParentResCodeLike(String value) {
            addCriterion("parent_res_code like", value, "parentResCode");
            return (Criteria) this;
        }

        public Criteria andParentResCodeNotLike(String value) {
            addCriterion("parent_res_code not like", value, "parentResCode");
            return (Criteria) this;
        }

        public Criteria andParentResCodeIn(List<String> values) {
            addCriterion("parent_res_code in", values, "parentResCode");
            return (Criteria) this;
        }

        public Criteria andParentResCodeNotIn(List<String> values) {
            addCriterion("parent_res_code not in", values, "parentResCode");
            return (Criteria) this;
        }

        public Criteria andParentResCodeBetween(String value1, String value2) {
            addCriterion("parent_res_code between", value1, value2, "parentResCode");
            return (Criteria) this;
        }

        public Criteria andParentResCodeNotBetween(String value1, String value2) {
            addCriterion("parent_res_code not between", value1, value2, "parentResCode");
            return (Criteria) this;
        }

        public Criteria andResCodeIsNull() {
            addCriterion("res_code is null");
            return (Criteria) this;
        }

        public Criteria andResCodeIsNotNull() {
            addCriterion("res_code is not null");
            return (Criteria) this;
        }

        public Criteria andResCodeEqualTo(String value) {
            addCriterion("res_code =", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotEqualTo(String value) {
            addCriterion("res_code <>", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeGreaterThan(String value) {
            addCriterion("res_code >", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeGreaterThanOrEqualTo(String value) {
            addCriterion("res_code >=", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLessThan(String value) {
            addCriterion("res_code <", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLessThanOrEqualTo(String value) {
            addCriterion("res_code <=", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeLike(String value) {
            addCriterion("res_code like", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotLike(String value) {
            addCriterion("res_code not like", value, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeIn(List<String> values) {
            addCriterion("res_code in", values, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotIn(List<String> values) {
            addCriterion("res_code not in", values, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeBetween(String value1, String value2) {
            addCriterion("res_code between", value1, value2, "resCode");
            return (Criteria) this;
        }

        public Criteria andResCodeNotBetween(String value1, String value2) {
            addCriterion("res_code not between", value1, value2, "resCode");
            return (Criteria) this;
        }

        public Criteria andResRoleNameIsNull() {
            addCriterion("res_role_name is null");
            return (Criteria) this;
        }

        public Criteria andResRoleNameIsNotNull() {
            addCriterion("res_role_name is not null");
            return (Criteria) this;
        }

        public Criteria andResRoleNameEqualTo(String value) {
            addCriterion("res_role_name =", value, "resRoleName");
            return (Criteria) this;
        }

        public Criteria andResRoleNameNotEqualTo(String value) {
            addCriterion("res_role_name <>", value, "resRoleName");
            return (Criteria) this;
        }

        public Criteria andResRoleNameGreaterThan(String value) {
            addCriterion("res_role_name >", value, "resRoleName");
            return (Criteria) this;
        }

        public Criteria andResRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("res_role_name >=", value, "resRoleName");
            return (Criteria) this;
        }

        public Criteria andResRoleNameLessThan(String value) {
            addCriterion("res_role_name <", value, "resRoleName");
            return (Criteria) this;
        }

        public Criteria andResRoleNameLessThanOrEqualTo(String value) {
            addCriterion("res_role_name <=", value, "resRoleName");
            return (Criteria) this;
        }

        public Criteria andResRoleNameLike(String value) {
            addCriterion("res_role_name like", value, "resRoleName");
            return (Criteria) this;
        }

        public Criteria andResRoleNameNotLike(String value) {
            addCriterion("res_role_name not like", value, "resRoleName");
            return (Criteria) this;
        }

        public Criteria andResRoleNameIn(List<String> values) {
            addCriterion("res_role_name in", values, "resRoleName");
            return (Criteria) this;
        }

        public Criteria andResRoleNameNotIn(List<String> values) {
            addCriterion("res_role_name not in", values, "resRoleName");
            return (Criteria) this;
        }

        public Criteria andResRoleNameBetween(String value1, String value2) {
            addCriterion("res_role_name between", value1, value2, "resRoleName");
            return (Criteria) this;
        }

        public Criteria andResRoleNameNotBetween(String value1, String value2) {
            addCriterion("res_role_name not between", value1, value2, "resRoleName");
            return (Criteria) this;
        }

        public Criteria andResTitleIsNull() {
            addCriterion("res_title is null");
            return (Criteria) this;
        }

        public Criteria andResTitleIsNotNull() {
            addCriterion("res_title is not null");
            return (Criteria) this;
        }

        public Criteria andResTitleEqualTo(String value) {
            addCriterion("res_title =", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleNotEqualTo(String value) {
            addCriterion("res_title <>", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleGreaterThan(String value) {
            addCriterion("res_title >", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleGreaterThanOrEqualTo(String value) {
            addCriterion("res_title >=", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleLessThan(String value) {
            addCriterion("res_title <", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleLessThanOrEqualTo(String value) {
            addCriterion("res_title <=", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleLike(String value) {
            addCriterion("res_title like", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleNotLike(String value) {
            addCriterion("res_title not like", value, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleIn(List<String> values) {
            addCriterion("res_title in", values, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleNotIn(List<String> values) {
            addCriterion("res_title not in", values, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleBetween(String value1, String value2) {
            addCriterion("res_title between", value1, value2, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResTitleNotBetween(String value1, String value2) {
            addCriterion("res_title not between", value1, value2, "resTitle");
            return (Criteria) this;
        }

        public Criteria andResUrlIsNull() {
            addCriterion("res_url is null");
            return (Criteria) this;
        }

        public Criteria andResUrlIsNotNull() {
            addCriterion("res_url is not null");
            return (Criteria) this;
        }

        public Criteria andResUrlEqualTo(String value) {
            addCriterion("res_url =", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotEqualTo(String value) {
            addCriterion("res_url <>", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlGreaterThan(String value) {
            addCriterion("res_url >", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlGreaterThanOrEqualTo(String value) {
            addCriterion("res_url >=", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLessThan(String value) {
            addCriterion("res_url <", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLessThanOrEqualTo(String value) {
            addCriterion("res_url <=", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlLike(String value) {
            addCriterion("res_url like", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotLike(String value) {
            addCriterion("res_url not like", value, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlIn(List<String> values) {
            addCriterion("res_url in", values, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotIn(List<String> values) {
            addCriterion("res_url not in", values, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlBetween(String value1, String value2) {
            addCriterion("res_url between", value1, value2, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResUrlNotBetween(String value1, String value2) {
            addCriterion("res_url not between", value1, value2, "resUrl");
            return (Criteria) this;
        }

        public Criteria andResOrderIsNull() {
            addCriterion("res_order is null");
            return (Criteria) this;
        }

        public Criteria andResOrderIsNotNull() {
            addCriterion("res_order is not null");
            return (Criteria) this;
        }

        public Criteria andResOrderEqualTo(Long value) {
            addCriterion("res_order =", value, "resOrder");
            return (Criteria) this;
        }

        public Criteria andResOrderNotEqualTo(Long value) {
            addCriterion("res_order <>", value, "resOrder");
            return (Criteria) this;
        }

        public Criteria andResOrderGreaterThan(Long value) {
            addCriterion("res_order >", value, "resOrder");
            return (Criteria) this;
        }

        public Criteria andResOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("res_order >=", value, "resOrder");
            return (Criteria) this;
        }

        public Criteria andResOrderLessThan(Long value) {
            addCriterion("res_order <", value, "resOrder");
            return (Criteria) this;
        }

        public Criteria andResOrderLessThanOrEqualTo(Long value) {
            addCriterion("res_order <=", value, "resOrder");
            return (Criteria) this;
        }

        public Criteria andResOrderIn(List<Long> values) {
            addCriterion("res_order in", values, "resOrder");
            return (Criteria) this;
        }

        public Criteria andResOrderNotIn(List<Long> values) {
            addCriterion("res_order not in", values, "resOrder");
            return (Criteria) this;
        }

        public Criteria andResOrderBetween(Long value1, Long value2) {
            addCriterion("res_order between", value1, value2, "resOrder");
            return (Criteria) this;
        }

        public Criteria andResOrderNotBetween(Long value1, Long value2) {
            addCriterion("res_order not between", value1, value2, "resOrder");
            return (Criteria) this;
        }

        public Criteria andResStatusIsNull() {
            addCriterion("res_status is null");
            return (Criteria) this;
        }

        public Criteria andResStatusIsNotNull() {
            addCriterion("res_status is not null");
            return (Criteria) this;
        }

        public Criteria andResStatusEqualTo(Long value) {
            addCriterion("res_status =", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusNotEqualTo(Long value) {
            addCriterion("res_status <>", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusGreaterThan(Long value) {
            addCriterion("res_status >", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("res_status >=", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusLessThan(Long value) {
            addCriterion("res_status <", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusLessThanOrEqualTo(Long value) {
            addCriterion("res_status <=", value, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusIn(List<Long> values) {
            addCriterion("res_status in", values, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusNotIn(List<Long> values) {
            addCriterion("res_status not in", values, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusBetween(Long value1, Long value2) {
            addCriterion("res_status between", value1, value2, "resStatus");
            return (Criteria) this;
        }

        public Criteria andResStatusNotBetween(Long value1, Long value2) {
            addCriterion("res_status not between", value1, value2, "resStatus");
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