package com.it.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Honor implements Serializable {
    /**
     * This field corresponds to the database column honor.honor_id
     */
    private Integer honorId;

    /**
     * This field corresponds to the database column honor.resume_id
     */
    private Integer resumeId;

    /**
     * This field corresponds to the database column honor.honor_create_time
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date honorCreateTime;

    /**
     * This field corresponds to the database column honor.honor_name
     */
    private String honorName;

    /**
     * This field corresponds to the database column honor.honor_grade
     */
    private String honorGrade;

    /**
     * This field corresponds to the database column honor.status
     */
    private Integer status;

    /**
     * This field corresponds to the database column honor.other1
     */
    private String other1;

    /**
     * This field corresponds to the database table honor
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column honor.honor_id
     *
     * @return the value of honor.honor_id
     */
    public Integer getHonorId() {
        return honorId;
    }

    /**
     * This method sets the value of the database column honor.honor_id
     *
     * @param honorId the value for honor.honor_id
     */
    public void setHonorId(Integer honorId) {
        this.honorId = honorId;
    }

    /**
     * This method returns the value of the database column honor.resume_id
     *
     * @return the value of honor.resume_id
     */
    public Integer getResumeId() {
        return resumeId;
    }

    /**
     * This method sets the value of the database column honor.resume_id
     *
     * @param resumeId the value for honor.resume_id
     */
    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    /**
     * This method returns the value of the database column honor.honor_create_time
     *
     * @return the value of honor.honor_create_time
     */
    public Date getHonorCreateTime() {
        return honorCreateTime;
    }

    /**
     * This method sets the value of the database column honor.honor_create_time
     *
     * @param honorCreateTime the value for honor.honor_create_time
     */
    public void setHonorCreateTime(Date honorCreateTime) {
        this.honorCreateTime = honorCreateTime;
    }

    /**
     * This method returns the value of the database column honor.honor_name
     *
     * @return the value of honor.honor_name
     */
    public String getHonorName() {
        return honorName;
    }

    /**
     * This method sets the value of the database column honor.honor_name
     *
     * @param honorName the value for honor.honor_name
     */
    public void setHonorName(String honorName) {
        this.honorName = honorName == null ? null : honorName.trim();
    }

    /**
     * This method returns the value of the database column honor.honor_grade
     *
     * @return the value of honor.honor_grade
     */
    public String getHonorGrade() {
        return honorGrade;
    }

    /**
     * This method sets the value of the database column honor.honor_grade
     *
     * @param honorGrade the value for honor.honor_grade
     */
    public void setHonorGrade(String honorGrade) {
        this.honorGrade = honorGrade == null ? null : honorGrade.trim();
    }

    /**
     * This method returns the value of the database column honor.status
     *
     * @return the value of honor.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column honor.status
     *
     * @param status the value for honor.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column honor.other1
     *
     * @return the value of honor.other1
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method sets the value of the database column honor.other1
     *
     * @param other1 the value for honor.other1
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method corresponds to the database table honor
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", honorId=").append(honorId);
        sb.append(", resumeId=").append(resumeId);
        sb.append(", honorCreateTime=").append(honorCreateTime);
        sb.append(", honorName=").append(honorName);
        sb.append(", honorGrade=").append(honorGrade);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}