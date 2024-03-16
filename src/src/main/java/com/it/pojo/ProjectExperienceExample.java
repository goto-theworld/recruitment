package com.it.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectExperienceExample {
    /**
     * This field corresponds to the database table project_experience
     */
    protected String orderByClause;

    /**
     * This field corresponds to the database table project_experience
     */
    protected boolean distinct;

    /**
     * This field corresponds to the database table project_experience
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method corresponds to the database table project_experience
     */
    public ProjectExperienceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method corresponds to the database table project_experience
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method corresponds to the database table project_experience
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method corresponds to the database table project_experience
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method corresponds to the database table project_experience
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method corresponds to the database table project_experience
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method corresponds to the database table project_experience
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method corresponds to the database table project_experience
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method corresponds to the database table project_experience
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method corresponds to the database table project_experience
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method corresponds to the database table project_experience
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class corresponds to the database table project_experience
     */
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

        public Criteria andProjectExperiIdIsNull() {
            addCriterion("project_experi_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectExperiIdIsNotNull() {
            addCriterion("project_experi_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectExperiIdEqualTo(Integer value) {
            addCriterion("project_experi_id =", value, "projectExperiId");
            return (Criteria) this;
        }

        public Criteria andProjectExperiIdNotEqualTo(Integer value) {
            addCriterion("project_experi_id <>", value, "projectExperiId");
            return (Criteria) this;
        }

        public Criteria andProjectExperiIdGreaterThan(Integer value) {
            addCriterion("project_experi_id >", value, "projectExperiId");
            return (Criteria) this;
        }

        public Criteria andProjectExperiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_experi_id >=", value, "projectExperiId");
            return (Criteria) this;
        }

        public Criteria andProjectExperiIdLessThan(Integer value) {
            addCriterion("project_experi_id <", value, "projectExperiId");
            return (Criteria) this;
        }

        public Criteria andProjectExperiIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_experi_id <=", value, "projectExperiId");
            return (Criteria) this;
        }

        public Criteria andProjectExperiIdIn(List<Integer> values) {
            addCriterion("project_experi_id in", values, "projectExperiId");
            return (Criteria) this;
        }

        public Criteria andProjectExperiIdNotIn(List<Integer> values) {
            addCriterion("project_experi_id not in", values, "projectExperiId");
            return (Criteria) this;
        }

        public Criteria andProjectExperiIdBetween(Integer value1, Integer value2) {
            addCriterion("project_experi_id between", value1, value2, "projectExperiId");
            return (Criteria) this;
        }

        public Criteria andProjectExperiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_experi_id not between", value1, value2, "projectExperiId");
            return (Criteria) this;
        }

        public Criteria andResumeIdIsNull() {
            addCriterion("resume_id is null");
            return (Criteria) this;
        }

        public Criteria andResumeIdIsNotNull() {
            addCriterion("resume_id is not null");
            return (Criteria) this;
        }

        public Criteria andResumeIdEqualTo(Integer value) {
            addCriterion("resume_id =", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotEqualTo(Integer value) {
            addCriterion("resume_id <>", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThan(Integer value) {
            addCriterion("resume_id >", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resume_id >=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThan(Integer value) {
            addCriterion("resume_id <", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("resume_id <=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdIn(List<Integer> values) {
            addCriterion("resume_id in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotIn(List<Integer> values) {
            addCriterion("resume_id not in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdBetween(Integer value1, Integer value2) {
            addCriterion("resume_id between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resume_id not between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameIsNull() {
            addCriterion("project_company_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameIsNotNull() {
            addCriterion("project_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameEqualTo(String value) {
            addCriterion("project_company_name =", value, "projectCompanyName");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameNotEqualTo(String value) {
            addCriterion("project_company_name <>", value, "projectCompanyName");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameGreaterThan(String value) {
            addCriterion("project_company_name >", value, "projectCompanyName");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_company_name >=", value, "projectCompanyName");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameLessThan(String value) {
            addCriterion("project_company_name <", value, "projectCompanyName");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("project_company_name <=", value, "projectCompanyName");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameLike(String value) {
            addCriterion("project_company_name like", value, "projectCompanyName");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameNotLike(String value) {
            addCriterion("project_company_name not like", value, "projectCompanyName");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameIn(List<String> values) {
            addCriterion("project_company_name in", values, "projectCompanyName");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameNotIn(List<String> values) {
            addCriterion("project_company_name not in", values, "projectCompanyName");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameBetween(String value1, String value2) {
            addCriterion("project_company_name between", value1, value2, "projectCompanyName");
            return (Criteria) this;
        }

        public Criteria andProjectCompanyNameNotBetween(String value1, String value2) {
            addCriterion("project_company_name not between", value1, value2, "projectCompanyName");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIsNull() {
            addCriterion("project_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIsNotNull() {
            addCriterion("project_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_time =", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_time <>", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("project_start_time >", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_time >=", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("project_start_time <", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_time <=", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("project_start_time in", values, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_start_time not in", values, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_start_time between", value1, value2, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_start_time not between", value1, value2, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNull() {
            addCriterion("project_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNotNull() {
            addCriterion("project_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeEqualTo(Date value) {
            addCriterion("project_end_time =", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotEqualTo(Date value) {
            addCriterion("project_end_time <>", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThan(Date value) {
            addCriterion("project_end_time >", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("project_end_time >=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThan(Date value) {
            addCriterion("project_end_time <", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("project_end_time <=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIn(List<Date> values) {
            addCriterion("project_end_time in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotIn(List<Date> values) {
            addCriterion("project_end_time not in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeBetween(Date value1, Date value2) {
            addCriterion("project_end_time between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("project_end_time not between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescIsNull() {
            addCriterion("project_content_desc is null");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescIsNotNull() {
            addCriterion("project_content_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescEqualTo(String value) {
            addCriterion("project_content_desc =", value, "projectContentDesc");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescNotEqualTo(String value) {
            addCriterion("project_content_desc <>", value, "projectContentDesc");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescGreaterThan(String value) {
            addCriterion("project_content_desc >", value, "projectContentDesc");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescGreaterThanOrEqualTo(String value) {
            addCriterion("project_content_desc >=", value, "projectContentDesc");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescLessThan(String value) {
            addCriterion("project_content_desc <", value, "projectContentDesc");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescLessThanOrEqualTo(String value) {
            addCriterion("project_content_desc <=", value, "projectContentDesc");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescLike(String value) {
            addCriterion("project_content_desc like", value, "projectContentDesc");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescNotLike(String value) {
            addCriterion("project_content_desc not like", value, "projectContentDesc");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescIn(List<String> values) {
            addCriterion("project_content_desc in", values, "projectContentDesc");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescNotIn(List<String> values) {
            addCriterion("project_content_desc not in", values, "projectContentDesc");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescBetween(String value1, String value2) {
            addCriterion("project_content_desc between", value1, value2, "projectContentDesc");
            return (Criteria) this;
        }

        public Criteria andProjectContentDescNotBetween(String value1, String value2) {
            addCriterion("project_content_desc not between", value1, value2, "projectContentDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescIsNull() {
            addCriterion("project_duty_desc is null");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescIsNotNull() {
            addCriterion("project_duty_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescEqualTo(String value) {
            addCriterion("project_duty_desc =", value, "projectDutyDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescNotEqualTo(String value) {
            addCriterion("project_duty_desc <>", value, "projectDutyDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescGreaterThan(String value) {
            addCriterion("project_duty_desc >", value, "projectDutyDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescGreaterThanOrEqualTo(String value) {
            addCriterion("project_duty_desc >=", value, "projectDutyDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescLessThan(String value) {
            addCriterion("project_duty_desc <", value, "projectDutyDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescLessThanOrEqualTo(String value) {
            addCriterion("project_duty_desc <=", value, "projectDutyDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescLike(String value) {
            addCriterion("project_duty_desc like", value, "projectDutyDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescNotLike(String value) {
            addCriterion("project_duty_desc not like", value, "projectDutyDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescIn(List<String> values) {
            addCriterion("project_duty_desc in", values, "projectDutyDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescNotIn(List<String> values) {
            addCriterion("project_duty_desc not in", values, "projectDutyDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescBetween(String value1, String value2) {
            addCriterion("project_duty_desc between", value1, value2, "projectDutyDesc");
            return (Criteria) this;
        }

        public Criteria andProjectDutyDescNotBetween(String value1, String value2) {
            addCriterion("project_duty_desc not between", value1, value2, "projectDutyDesc");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOther1IsNull() {
            addCriterion("other1 is null");
            return (Criteria) this;
        }

        public Criteria andOther1IsNotNull() {
            addCriterion("other1 is not null");
            return (Criteria) this;
        }

        public Criteria andOther1EqualTo(String value) {
            addCriterion("other1 =", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotEqualTo(String value) {
            addCriterion("other1 <>", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThan(String value) {
            addCriterion("other1 >", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1GreaterThanOrEqualTo(String value) {
            addCriterion("other1 >=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThan(String value) {
            addCriterion("other1 <", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1LessThanOrEqualTo(String value) {
            addCriterion("other1 <=", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Like(String value) {
            addCriterion("other1 like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotLike(String value) {
            addCriterion("other1 not like", value, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1In(List<String> values) {
            addCriterion("other1 in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotIn(List<String> values) {
            addCriterion("other1 not in", values, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1Between(String value1, String value2) {
            addCriterion("other1 between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther1NotBetween(String value1, String value2) {
            addCriterion("other1 not between", value1, value2, "other1");
            return (Criteria) this;
        }

        public Criteria andOther2IsNull() {
            addCriterion("other2 is null");
            return (Criteria) this;
        }

        public Criteria andOther2IsNotNull() {
            addCriterion("other2 is not null");
            return (Criteria) this;
        }

        public Criteria andOther2EqualTo(String value) {
            addCriterion("other2 =", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotEqualTo(String value) {
            addCriterion("other2 <>", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThan(String value) {
            addCriterion("other2 >", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2GreaterThanOrEqualTo(String value) {
            addCriterion("other2 >=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThan(String value) {
            addCriterion("other2 <", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2LessThanOrEqualTo(String value) {
            addCriterion("other2 <=", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Like(String value) {
            addCriterion("other2 like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotLike(String value) {
            addCriterion("other2 not like", value, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2In(List<String> values) {
            addCriterion("other2 in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotIn(List<String> values) {
            addCriterion("other2 not in", values, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2Between(String value1, String value2) {
            addCriterion("other2 between", value1, value2, "other2");
            return (Criteria) this;
        }

        public Criteria andOther2NotBetween(String value1, String value2) {
            addCriterion("other2 not between", value1, value2, "other2");
            return (Criteria) this;
        }
    }

    /**
     * This class corresponds to the database table project_experience
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table project_experience
     */
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