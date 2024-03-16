package com.it.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Job implements Serializable {
    /**
     * This field corresponds to the database column job.job_id
     */
    private Integer jobId;

    /**
     * This field corresponds to the database column job.company_id
     */
    private Integer companyId;

    /**
     * This field corresponds to the database column job.job_name*
     */
    private String jobName;

    /**
     * This field corresponds to the database column job.job_city
     */
    private String jobCity;

    /**
     * This field corresponds to the database column job.job_year
     */
    private String jobYear;

    /**
     * This field corresponds to the database column job.job_degree
     */
    private String jobDegree;

    /**
     * This field corresponds to the database column job.job_need_number
     */
    private Integer jobNeedNumber;

    /**
     * This field corresponds to the database column job.job_publish_time
     */
    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private Date jobPublishTime;

    /**
     * This field corresponds to the database column job.job_welfare
     */
    private String jobWelfare;

    /**
     * This field corresponds to the database column job.job_duty
     */
    private String jobDuty;

    /**
     * This field corresponds to the database column job.job_demand
     */
    private String jobDemand;

    /**
     * This field corresponds to the database column job.job_addr_detail
     */
    private String jobAddrDetail;

    /**
     * This field corresponds to the database column job.job_min_salary
     */
    private BigDecimal jobMinSalary;

    /**
     * This field corresponds to the database column job.job_max_salary
     */
    private BigDecimal jobMaxSalary;

    /**
     * This field corresponds to the database column job.job_search_keyword
     */
    private String jobSearchKeyword;

    /**
     * This field corresponds to the database column job.status
     */
    private Integer status;

    /**
     * This field corresponds to the database column job.other1
     */
    private String other1;

    /**
     * This field corresponds to the database column job.other2
     */
    private String other2;

    /**
     * This field corresponds to the database table job
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_id
     *
     * @return the value of job.job_id
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_id
     *
     * @param jobId the value for job.job_id
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.company_id
     *
     * @return the value of job.company_id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.company_id
     *
     * @param companyId the value for job.company_id
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_name
     *
     * @return the value of job.job_name
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_name
     *
     * @param jobName the value for job.job_name
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_city
     *
     * @return the value of job.job_city
     */
    public String getJobCity() {
        return jobCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_city
     *
     * @param jobCity the value for job.job_city
     */
    public void setJobCity(String jobCity) {
        this.jobCity = jobCity == null ? null : jobCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_year
     *
     * @return the value of job.job_year
     */
    public String getJobYear() {
        return jobYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_year
     *
     * @param jobYear the value for job.job_year
     */
    public void setJobYear(String jobYear) {
        this.jobYear = jobYear == null ? null : jobYear.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_degree
     *
     * @return the value of job.job_degree
     */
    public String getJobDegree() {
        return jobDegree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_degree
     *
     * @param jobDegree the value for job.job_degree
     */
    public void setJobDegree(String jobDegree) {
        this.jobDegree = jobDegree == null ? null : jobDegree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_need_number
     *
     * @return the value of job.job_need_number
     */
    public Integer getJobNeedNumber() {
        return jobNeedNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_need_number
     *
     * @param jobNeedNumber the value for job.job_need_number
     */
    public void setJobNeedNumber(Integer jobNeedNumber) {
        this.jobNeedNumber = jobNeedNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_publish_time
     *
     * @return the value of job.job_publish_time
     */
    public Date getJobPublishTime() {
        return jobPublishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_publish_time
     *
     * @param jobPublishTime the value for job.job_publish_time
     */
    public void setJobPublishTime(Date jobPublishTime) {
        this.jobPublishTime = jobPublishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_welfare
     *
     * @return the value of job.job_welfare
     */
    public String getJobWelfare() {
        return jobWelfare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_welfare
     *
     * @param jobWelfare the value for job.job_welfare
     */
    public void setJobWelfare(String jobWelfare) {
        this.jobWelfare = jobWelfare == null ? null : jobWelfare.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_duty
     *
     * @return the value of job.job_duty
     */
    public String getJobDuty() {
        return jobDuty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_duty
     *
     * @param jobDuty the value for job.job_duty
     */
    public void setJobDuty(String jobDuty) {
        this.jobDuty = jobDuty == null ? null : jobDuty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_demand
     *
     * @return the value of job.job_demand
     */
    public String getJobDemand() {
        return jobDemand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_demand
     *
     * @param jobDemand the value for job.job_demand
     */
    public void setJobDemand(String jobDemand) {
        this.jobDemand = jobDemand == null ? null : jobDemand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_addr_detail
     *
     * @return the value of job.job_addr_detail
     */
    public String getJobAddrDetail() {
        return jobAddrDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_addr_detail
     *
     * @param jobAddrDetail the value for job.job_addr_detail
     */
    public void setJobAddrDetail(String jobAddrDetail) {
        this.jobAddrDetail = jobAddrDetail == null ? null : jobAddrDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_min_salary
     *
     * @return the value of job.job_min_salary
     */
    public BigDecimal getJobMinSalary() {
        return jobMinSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_min_salary
     *
     * @param jobMinSalary the value for job.job_min_salary
     */
    public void setJobMinSalary(BigDecimal jobMinSalary) {
        this.jobMinSalary = jobMinSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_max_salary
     *
     * @return the value of job.job_max_salary
     */
    public BigDecimal getJobMaxSalary() {
        return jobMaxSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_max_salary
     *
     * @param jobMaxSalary the value for job.job_max_salary
     */
    public void setJobMaxSalary(BigDecimal jobMaxSalary) {
        this.jobMaxSalary = jobMaxSalary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.job_search_keyword
     *
     * @return the value of job.job_search_keyword
     */
    public String getJobSearchKeyword() {
        return jobSearchKeyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.job_search_keyword
     *
     * @param jobSearchKeyword the value for job.job_search_keyword
     */
    public void setJobSearchKeyword(String jobSearchKeyword) {
        this.jobSearchKeyword = jobSearchKeyword == null ? null : jobSearchKeyword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.status
     *
     * @return the value of job.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.status
     *
     * @param status the value for job.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.other1
     *
     * @return the value of job.other1
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.other1
     *
     * @param other1 the value for job.other1
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column job.other2
     *
     * @return the value of job.other2
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column job.other2
     *
     * @param other2 the value for job.other2
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jobId=").append(jobId);
        sb.append(", companyId=").append(companyId);
        sb.append(", jobName=").append(jobName);
        sb.append(", jobCity=").append(jobCity);
        sb.append(", jobYear=").append(jobYear);
        sb.append(", jobDegree=").append(jobDegree);
        sb.append(", jobNeedNumber=").append(jobNeedNumber);
        sb.append(", jobPublishTime=").append(jobPublishTime);
        sb.append(", jobWelfare=").append(jobWelfare);
        sb.append(", jobDuty=").append(jobDuty);
        sb.append(", jobDemand=").append(jobDemand);
        sb.append(", jobAddrDetail=").append(jobAddrDetail);
        sb.append(", jobMinSalary=").append(jobMinSalary);
        sb.append(", jobMaxSalary=").append(jobMaxSalary);
        sb.append(", jobSearchKeyword=").append(jobSearchKeyword);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}