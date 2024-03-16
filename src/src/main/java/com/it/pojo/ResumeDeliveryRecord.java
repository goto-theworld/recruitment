package com.it.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class ResumeDeliveryRecord implements Serializable {
    /**
     * This field corresponds to the database column resume_delivery_record.resume_delivery_record_id
     */
    private Integer resumeDeliveryRecordId;

    /**
     * This field corresponds to the database column resume_delivery_record.cust_id
     */
    private Integer custId;

    /**
     * This field corresponds to the database column resume_delivery_record.resume_id
     */
    private Integer resumeId;

    /**
     * This field corresponds to the database column resume_delivery_record.job_id
     */
    private Integer jobId;

    /**
     * This field corresponds to the database column resume_delivery_record.delivery_time
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date deliveryTime;

    /**
     * This field corresponds to the database column resume_delivery_record.delivery_status
     */
    private Integer deliveryStatus;

    /**
     * This field corresponds to the database column resume_delivery_record.other1
     */
    private String other1;

    /**
     * This field corresponds to the database column resume_delivery_record.other2
     */
    private String other2;

    /**
     * This field corresponds to the database table resume_delivery_record
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column resume_delivery_record.resume_delivery_record_id
     *
     * @return the value of resume_delivery_record.resume_delivery_record_id
     */
    public Integer getResumeDeliveryRecordId() {
        return resumeDeliveryRecordId;
    }

    /**
     * This method sets the value of the database column resume_delivery_record.resume_delivery_record_id
     *
     * @param resumeDeliveryRecordId the value for resume_delivery_record.resume_delivery_record_id
     */
    public void setResumeDeliveryRecordId(Integer resumeDeliveryRecordId) {
        this.resumeDeliveryRecordId = resumeDeliveryRecordId;
    }

    /**
     * This method returns the value of the database column resume_delivery_record.cust_id
     *
     * @return the value of resume_delivery_record.cust_id
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * This method sets the value of the database column resume_delivery_record.cust_id
     *
     * @param custId the value for resume_delivery_record.cust_id
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * This method returns the value of the database column resume_delivery_record.resume_id
     *
     * @return the value of resume_delivery_record.resume_id
     */
    public Integer getResumeId() {
        return resumeId;
    }

    /**
     * This method sets the value of the database column resume_delivery_record.resume_id
     *
     * @param resumeId the value for resume_delivery_record.resume_id
     */
    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    /**
     * This method returns the value of the database column resume_delivery_record.job_id
     *
     * @return the value of resume_delivery_record.job_id
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * This method sets the value of the database column resume_delivery_record.job_id
     *
     * @param jobId the value for resume_delivery_record.job_id
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    /**
     * This method returns the value of the database column resume_delivery_record.delivery_time
     *
     * @return the value of resume_delivery_record.delivery_time
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * This method sets the value of the database column resume_delivery_record.delivery_time
     *
     * @param deliveryTime the value for resume_delivery_record.delivery_time
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * This method returns the value of the database column resume_delivery_record.delivery_status
     *
     * @return the value of resume_delivery_record.delivery_status
     */
    public Integer getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * This method sets the value of the database column resume_delivery_record.delivery_status
     *
     * @param deliveryStatus the value for resume_delivery_record.delivery_status
     */
    public void setDeliveryStatus(Integer deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    /**
     * This method returns the value of the database column resume_delivery_record.other1
     *
     * @return the value of resume_delivery_record.other1
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method sets the value of the database column resume_delivery_record.other1
     *
     * @param other1 the value for resume_delivery_record.other1
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method returns the value of the database column resume_delivery_record.other2
     *
     * @return the value of resume_delivery_record.other2
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method sets the value of the database column resume_delivery_record.other2
     *
     * @param other2 the value for resume_delivery_record.other2
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method corresponds to the database table resume_delivery_record
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resumeDeliveryRecordId=").append(resumeDeliveryRecordId);
        sb.append(", custId=").append(custId);
        sb.append(", resumeId=").append(resumeId);
        sb.append(", jobId=").append(jobId);
        sb.append(", deliveryTime=").append(deliveryTime);
        sb.append(", deliveryStatus=").append(deliveryStatus);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}