package com.it.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    /**
     * This field corresponds to the database column customer.cust_id
     */
    private Integer custId;

    /**
     * This field corresponds to the database column customer.cust_name
     */
    private String custName;

    /**
     * This field corresponds to the database column customer.cust_telno
     */
    private Long custTelno;

    /**
     * This field corresponds to the database column customer.cust_email
     */
    private String custEmail;

    /**
     * This field corresponds to the database column customer.cust_password
     */
    private String custPassword;

    /**
     * This field corresponds to the database column customer.cust_regist_time
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date custRegistTime;

    /**
     * This field corresponds to the database column customer.status
     */
    private Integer status;

    /**
     * This field corresponds to the database column customer.other1
     */
    private String other1;

    /**
     * This field corresponds to the database column customer.other2
     */
    private String other2;

    /**
     * This field corresponds to the database table customer
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column customer.cust_id
     *
     * @return the value of customer.cust_id
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * This method sets the value of the database column customer.cust_id
     *
     * @param custId the value for customer.cust_id
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * This method returns the value of the database column customer.cust_name
     *
     * @return the value of customer.cust_name
     */
    public String getCustName() {
        return custName;
    }

    /**
     * This method sets the value of the database column customer.cust_name
     *
     * @param custName the value for customer.cust_name
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    /**
     * This method returns the value of the database column customer.cust_telno
     *
     * @return the value of customer.cust_telno
     */
    public Long getCustTelno() {
        return custTelno;
    }

    /**
     * This method sets the value of the database column customer.cust_telno
     *
     * @param custTelno the value for customer.cust_telno
     */
    public void setCustTelno(Long custTelno) {
        this.custTelno = custTelno;
    }

    /**
     * This method returns the value of the database column customer.cust_email
     *
     * @return the value of customer.cust_email
     */
    public String getCustEmail() {
        return custEmail;
    }

    /**
     * This method sets the value of the database column customer.cust_email
     *
     * @param custEmail the value for customer.cust_email
     */
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail == null ? null : custEmail.trim();
    }

    /**
     * This method returns the value of the database column customer.cust_password
     *
     * @return the value of customer.cust_password
     */
    public String getCustPassword() {
        return custPassword;
    }

    /**
     * This method sets the value of the database column customer.cust_password
     *
     * @param custPassword the value for customer.cust_password
     */
    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword == null ? null : custPassword.trim();
    }

    /**
     * This method returns the value of the database column customer.cust_regist_time
     *
     * @return the value of customer.cust_regist_time
     */
    public Date getCustRegistTime() {
        return custRegistTime;
    }

    /**
     * This method sets the value of the database column customer.cust_regist_time
     *
     * @param custRegistTime the value for customer.cust_regist_time
     */
    public void setCustRegistTime(Date custRegistTime) {
        this.custRegistTime = custRegistTime;
    }

    /**
     * This method returns the value of the database column customer.status
     *
     * @return the value of customer.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method sets the value of the database column customer.status
     *
     * @param status the value for customer.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column customer.other1
     *
     * @return the value of customer.other1
     */
    public String getOther1() {
        return other1;
    }

    /**
     * This method sets the value of the database column customer.other1
     *
     * @param other1 the value for customer.other1
     */
    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    /**
     * This method returns the value of the database column customer.other2
     *
     * @return the value of customer.other2
     */
    public String getOther2() {
        return other2;
    }

    /**
     * This method sets the value of the database column customer.other2
     *
     * @param other2 the value for customer.other2
     */
    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    /**
     * This method corresponds to the database table customer
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", custName=").append(custName);
        sb.append(", custTelno=").append(custTelno);
        sb.append(", custEmail=").append(custEmail);
        sb.append(", custPassword=").append(custPassword);
        sb.append(", custRegistTime=").append(custRegistTime);
        sb.append(", status=").append(status);
        sb.append(", other1=").append(other1);
        sb.append(", other2=").append(other2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}