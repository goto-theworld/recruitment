package com.it.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class CompanyReceiveResumeRecord implements Serializable {
    /**
     * This field corresponds to the database column company_receive_resume_record.company_receive_resume_record_id
     */
    private Integer companyReceiveResumeRecordId;

    /**
     * This field corresponds to the database column company_receive_resume_record.company_id
     */
    private Integer companyId;

    /**
     * This field corresponds to the database column company_receive_resume_record.resume_id
     */
    private Integer resumeId;

    /**
     * This field corresponds to the database column company_receive_resume_record.receive_time
     */
    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private Date receiveTime;

    /**
     * This field corresponds to the database column company_receive_resume_record.company_admin_id
     */
    private Integer companyAdminId;

    /**
     * This field corresponds to the database column company_receive_resume_record.status
     */
    private Integer status;

    /**
     * This field corresponds to the database column company_receive_resume_record.other1
     */
    private String other1;

    /**
     * This field corresponds to the database column company_receive_resume_record.other2
     */
    private String other2;

    /**
     * This field corresponds to the database table company_receive_resume_record
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column company_receive_resume_record.company_receive_resume_record_id
     *
     * @return the value of company_receive_resume_record.company_receive_resume_record_id
     */
    public Integer getCompanyReceiveResumeRecordId() {
        return companyReceiveResumeRecordId;
    }

    /**
     * This method sets the value of the database column company_receive_resume_record.company_receive_resume_record_id
     *
     * @param companyReceiveResumeRecordId the value for company_receive_resume_record.company_receive_resume_record_id
     */
    public void setCompanyReceiveResumeRecordId(Integer companyReceiveResumeRecordId) {
        this.companyReceiveResumeRecordId = companyReceiveResumeRecordId;
    }

    /**
     * This method returns the value of the database column company_receive_resume_record.company_id
     *
     * @return the value of company_receive_resume_record.company_id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method sets the value of the database column company_receive_resume_record.company_id
     *
     * @param companyId the value for company_receive_resume_record.company_id
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method returns the value of the database column company_receive_resume_record.resume_id
     *
     * @return the value of company_receive_resume_record.resume_id
     */
    public Integer getResumeId() {
        return resumeId;
    }

    /**
     * This method sets the value of the database column company_receive_resume_record.resume_id
     *
     * @param resumeId the value for company_receive_resume_record.resume_id
     */
    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    /**
     * This method returns the value of the database column company_receive_resume_record.receive_time
     *
     * @return the value of company_receive_resume_record.receive_time
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * This method sets the value of the database column company_receive_resume_record.receive_time
     *
     * @param receiveTime the value for company_receive_resume_record.receive_time
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * This method returns the value of the database column company_receive_resume_record.company_admin_id
     *
     * @return the value of company_receive_resume_record.company_admin_id
     */
    public Integer getCompanyAdminId() {
        return companyAdminId;
    }

    /**
     * This method sets the value of the database column company_receive_resume_record.company_admin_id
     *
     * @param companyAdminId the value for company_receive_resume_record.company_admin_id
     */
    public void setCompanyAdminId(Integer companyAdminId) {
        this.companyAdminId = companyAdminId;
    }

    /**
     * This method returns the value of the database column company_receive_resume_record.status
     *
     * @return the value of company_receive_resume_record.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column company_receive_resume_record.status
     *
     * @param status the value for company_receive_resume_record.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column company_receive_resume_record.other1
     *
     * @return the value of company_receive_resume_record.other1
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method sets the value of the database column company_receive_resume_record.other1
     *
     * @param other1 the value for company_receive_resume_record.other1
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method returns the value of the database column company_receive_resume_record.other2
     *
     * @return the value of company_receive_resume_record.other2
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method sets the value of the database column company_receive_resume_record.other2
     *
     * @param other2 the value for company_receive_resume_record.other2
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method corresponds to the database table company_receive_resume_record
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyReceiveResumeRecordId=").append(companyReceiveResumeRecordId);
        sb.append(", companyId=").append(companyId);
        sb.append(", resumeId=").append(resumeId);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", companyAdminId=").append(companyAdminId);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}