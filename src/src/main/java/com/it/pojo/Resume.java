package com.it.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Resume implements Serializable {
    /**
     * This field corresponds to the database column resume.resume_id
     */
    private Integer resumeId;

    /**
     * This field corresponds to the database column resume.cust_id
     */
    private Integer custId;

    /**
     * This field corresponds to the database column resume.resume_name
     */
    private String resumeName;

    /**
     * This field corresponds to the database column resume.resume_create_time
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date resumeCreateTime;

    /**
     * This field corresponds to the database column resume.resume_update_time
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date resumeUpdateTime;

    /**
     * This field corresponds to the database column resume.resume_profile
     */
    private String resumeProfile;

    /**
     * This field corresponds to the database column resume.resume_birth
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date resumeBirth;

    /**
     * This field corresponds to the database column resume.resume_telno
     */
    private Long resumeTelno;

    /**
     * This field corresponds to the database column resume.resume_email
     */
    private String resumeEmail;

    /**
     * This field corresponds to the database column resume.resume_gender
     */
    private String resumeGender;

    /**
     * This field corresponds to the database column resume.resume_leaving__working
     */
    private String resumeLeavingWorking;

    /**
     * This field corresponds to the database column resume.resume_live_city
     */
    private String resumeLiveCity;

    /**
     * This field corresponds to the database column resume.resume_personid
     */
    private String resumePersonid;

    /**
     * This field corresponds to the database column resume.resume_income
     */
    private Integer resumeIncome;

    /**
     * This field corresponds to the database column resume.resume_full_part_time
     */
    private String resumeFullPartTime;

    /**
     * This field corresponds to the database column resume.status
     */
    private Integer status;

    /**
     * This field corresponds to the database column resume.other1
     */
    private String other1;

    /**
     * This field corresponds to the database column resume.other2
     */
    private String other2;

    /**
     * This field corresponds to the database table resume
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column resume.resume_id
     *
     * @return the value of resume.resume_id
     */
    public Integer getResumeId() {
        return resumeId;
    }

    /**
     * This method sets the value of the database column resume.resume_id
     *
     * @param resumeId the value for resume.resume_id
     */
    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    /**
     * This method returns the value of the database column resume.cust_id
     *
     * @return the value of resume.cust_id
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * This method sets the value of the database column resume.cust_id
     *
     * @param custId the value for resume.cust_id
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * This method returns the value of the database column resume.resume_name
     *
     * @return the value of resume.resume_name
     */
    public String getResumeName() {
        return resumeName;
    }

    /**
     * This method sets the value of the database column resume.resume_name
     *
     * @param resumeName the value for resume.resume_name
     */
    public void setResumeName(String resumeName) {
        this.resumeName = resumeName == null ? null : resumeName.trim();
    }

    /**
     * This method returns the value of the database column resume.resume_create_time
     *
     * @return the value of resume.resume_create_time
     */
    public Date getResumeCreateTime() {
        return resumeCreateTime;
    }

    /**
     * This method sets the value of the database column resume.resume_create_time
     *
     * @param resumeCreateTime the value for resume.resume_create_time
     */
    public void setResumeCreateTime(Date resumeCreateTime) {
        this.resumeCreateTime = resumeCreateTime;
    }

    /**
     * This method returns the value of the database column resume.resume_update_time
     *
     * @return the value of resume.resume_update_time
     */
    public Date getResumeUpdateTime() {
        return resumeUpdateTime;
    }

    /**
     * This method sets the value of the database column resume.resume_update_time
     *
     * @param resumeUpdateTime the value for resume.resume_update_time
     */
    public void setResumeUpdateTime(Date resumeUpdateTime) {
        this.resumeUpdateTime = resumeUpdateTime;
    }

    /**
     * This method returns the value of the database column resume.resume_profile
     *
     * @return the value of resume.resume_profile
     */
    public String getResumeProfile() {
        return resumeProfile;
    }

    /**
     * This method sets the value of the database column resume.resume_profile
     *
     * @param resumeProfile the value for resume.resume_profile
     */
    public void setResumeProfile(String resumeProfile) {
        this.resumeProfile = resumeProfile == null ? null : resumeProfile.trim();
    }

    /**
     * This method returns the value of the database column resume.resume_birth
     *
     * @return the value of resume.resume_birth
     */
    public Date getResumeBirth() {
        return resumeBirth;
    }

    /**
     * This method sets the value of the database column resume.resume_birth
     *
     * @param resumeBirth the value for resume.resume_birth
     */
    public void setResumeBirth(Date resumeBirth) {
        this.resumeBirth = resumeBirth;
    }

    /**
     * This method returns the value of the database column resume.resume_telno
     *
     * @return the value of resume.resume_telno
     */
    public Long getResumeTelno() {
        return resumeTelno;
    }

    /**
     * This method sets the value of the database column resume.resume_telno
     *
     * @param resumeTelno the value for resume.resume_telno
     */
    public void setResumeTelno(Long resumeTelno) {
        this.resumeTelno = resumeTelno;
    }

    /**
     * This method returns the value of the database column resume.resume_email
     *
     * @return the value of resume.resume_email
     */
    public String getResumeEmail() {
        return resumeEmail;
    }

    /**
     * This method sets the value of the database column resume.resume_email
     *
     * @param resumeEmail the value for resume.resume_email
     */
    public void setResumeEmail(String resumeEmail) {
        this.resumeEmail = resumeEmail == null ? null : resumeEmail.trim();
    }

    /**
     * This method returns the value of the database column resume.resume_gender
     *
     * @return the value of resume.resume_gender
     */
    public String getResumeGender() {
        return resumeGender;
    }

    /**
     * This method sets the value of the database column resume.resume_gender
     *
     * @param resumeGender the value for resume.resume_gender
     */
    public void setResumeGender(String resumeGender) {
        this.resumeGender = resumeGender == null ? null : resumeGender.trim();
    }

    /**
     * This method returns the value of the database column resume.resume_leaving__working
     *
     * @return the value of resume.resume_leaving__working
     */
    public String getResumeLeavingWorking() {
        return resumeLeavingWorking;
    }

    /**
     * This method sets the value of the database column resume.resume_leaving__working
     *
     * @param resumeLeavingWorking the value for resume.resume_leaving__working
     */
    public void setResumeLeavingWorking(String resumeLeavingWorking) {
        this.resumeLeavingWorking = resumeLeavingWorking == null ? null : resumeLeavingWorking.trim();
    }

    /**
     * This method returns the value of the database column resume.resume_live_city
     *
     * @return the value of resume.resume_live_city
     */
    public String getResumeLiveCity() {
        return resumeLiveCity;
    }

    /**
     * This method sets the value of the database column resume.resume_live_city
     *
     * @param resumeLiveCity the value for resume.resume_live_city
     */
    public void setResumeLiveCity(String resumeLiveCity) {
        this.resumeLiveCity = resumeLiveCity == null ? null : resumeLiveCity.trim();
    }

    /**
     * This method returns the value of the database column resume.resume_personid
     *
     * @return the value of resume.resume_personid
     */
    public String getResumePersonid() {
        return resumePersonid;
    }

    /**
     * This method sets the value of the database column resume.resume_personid
     *
     * @param resumePersonid the value for resume.resume_personid
     */
    public void setResumePersonid(String resumePersonid) {
        this.resumePersonid = resumePersonid == null ? null : resumePersonid.trim();
    }

    /**
     * This method returns the value of the database column resume.resume_income
     *
     * @return the value of resume.resume_income
     */
    public Integer getResumeIncome() {
        return resumeIncome;
    }

    /**
     * This method sets the value of the database column resume.resume_income
     *
     * @param resumeIncome the value for resume.resume_income
     */
    public void setResumeIncome(Integer resumeIncome) {
        this.resumeIncome = resumeIncome;
    }

    /**
     * This method returns the value of the database column resume.resume_full_part_time
     *
     * @return the value of resume.resume_full_part_time
     */
    public String getResumeFullPartTime() {
        return resumeFullPartTime;
    }

    /**
     * This method sets the value of the database column resume.resume_full_part_time
     *
     * @param resumeFullPartTime the value for resume.resume_full_part_time
     */
    public void setResumeFullPartTime(String resumeFullPartTime) {
        this.resumeFullPartTime = resumeFullPartTime == null ? null : resumeFullPartTime.trim();
    }

    /**
     * This method returns the value of the database column resume.status
     *
     * @return the value of resume.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column resume.status
     *
     * @param status the value for resume.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column resume.other1
     *
     * @return the value of resume.other1
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method sets the value of the database column resume.other1
     *
     * @param other1 the value for resume.other1
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method returns the value of the database column resume.other2
     *
     * @return the value of resume.other2
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method sets the value of the database column resume.other2
     *
     * @param other2 the value for resume.other2
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method corresponds to the database table resume
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resumeId=").append(resumeId);
        sb.append(", custId=").append(custId);
        sb.append(", resumeName=").append(resumeName);
        sb.append(", resumeCreateTime=").append(resumeCreateTime);
        sb.append(", resumeUpdateTime=").append(resumeUpdateTime);
        sb.append(", resumeProfile=").append(resumeProfile);
        sb.append(", resumeBirth=").append(resumeBirth);
        sb.append(", resumeTelno=").append(resumeTelno);
        sb.append(", resumeEmail=").append(resumeEmail);
        sb.append(", resumeGender=").append(resumeGender);
        sb.append(", resumeLeavingWorking=").append(resumeLeavingWorking);
        sb.append(", resumeLiveCity=").append(resumeLiveCity);
        sb.append(", resumePersonid=").append(resumePersonid);
        sb.append(", resumeIncome=").append(resumeIncome);
        sb.append(", resumeFullPartTime=").append(resumeFullPartTime);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}