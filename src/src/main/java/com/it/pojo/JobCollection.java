package com.it.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class JobCollection implements Serializable {
    /**
     * This field corresponds to the database column job_collection.job_collection_id
     */
    private Integer jobCollectionId;

    /**
     * This field corresponds to the database column job_collection.cust_id
     */
    private Integer custId;

    /**
     * This field corresponds to the database column job_collection.job_id
     */
    private Integer jobId;

    /**
     * This field corresponds to the database column job_collection.collect_time
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date collectTime;

    /**
     * This field corresponds to the database column job_collection.status
     */
    private String status;

    /**
     * This field corresponds to the database column job_collection.other1
     */
    private String other1;

    /**
     * This field corresponds to the database column job_collection.other2
     */
    private String other2;

    /**
     * This field corresponds to the database table job_collection
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column job_collection.job_collection_id
     *
     * @return the value of job_collection.job_collection_id
     */
    public Integer getJobCollectionId() {
        return jobCollectionId;
    }

    /**
     * This method sets the value of the database column job_collection.job_collection_id
     *
     * @param jobCollectionId the value for job_collection.job_collection_id
     */
    public void setJobCollectionId(Integer jobCollectionId) {
        this.jobCollectionId = jobCollectionId;
    }

    /**
     * This method returns the value of the database column job_collection.cust_id
     *
     * @return the value of job_collection.cust_id
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * This method sets the value of the database column job_collection.cust_id
     *
     * @param custId the value for job_collection.cust_id
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * This method returns the value of the database column job_collection.job_id
     *
     * @return the value of job_collection.job_id
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * This method sets the value of the database column job_collection.job_id
     *
     * @param jobId the value for job_collection.job_id
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    /**
     * This method returns the value of the database column job_collection.collect_time
     *
     * @return the value of job_collection.collect_time
     */
    public Date getCollectTime() {
        return collectTime;
    }

    /**
     * This method sets the value of the database column job_collection.collect_time
     *
     * @param collectTime the value for job_collection.collect_time
     */
    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    /**
     * This method returns the value of the database column job_collection.status
     *
     * @return the value of job_collection.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column job_collection.status
     *
     * @param status the value for job_collection.status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method returns the value of the database column job_collection.other1
     *
     * @return the value of job_collection.other1
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method sets the value of the database column job_collection.other1
     *
     * @param other1 the value for job_collection.other1
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method returns the value of the database column job_collection.other2
     *
     * @return the value of job_collection.other2
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method sets the value of the database column job_collection.other2
     *
     * @param other2 the value for job_collection.other2
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method corresponds to the database table job_collection
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jobCollectionId=").append(jobCollectionId);
        sb.append(", custId=").append(custId);
        sb.append(", jobId=").append(jobId);
        sb.append(", collectTime=").append(collectTime);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}