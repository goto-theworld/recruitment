package com.it.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    /**
     * This field corresponds to the database column product.pro_id
     */
    private String proId;

    /**
     * This field corresponds to the database column product.pro_name
     */
    private String proName;

    /**
     * This field corresponds to the database column product.pro_num
     */
    private Long proNum;

    /**
     * This field corresponds to the database column product.pro_size
     */
    private Float proSize;

    /**
     * This field corresponds to the database column product.pro_color
     */
    private String proColor;

    /**
     * This field corresponds to the database column product.pro_price
     */
    private Float proPrice;

    /**
     * This field corresponds to the database column product.pro_address
     */
    private String proAddress;

    /**
     * This field corresponds to the database column product.pro_date
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date proDate;

    /**
     * This field corresponds to the database table product
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column product.pro_id
     *
     * @return the value of product.pro_id
     */
    public String getProId() {
        return proId;
    }

    /**
     * This method sets the value of the database column product.pro_id
     *
     * @param proId the value for product.pro_id
     */
    public void setProId(String proId) {
        this.proId = proId == null ? null : proId.trim();
    }

    /**
     * This method returns the value of the database column product.pro_name
     *
     * @return the value of product.pro_name
     */
    public String getProName() {
        return proName;
    }

    /**
     * This method sets the value of the database column product.pro_name
     *
     * @param proName the value for product.pro_name
     */
    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    /**
     * This method returns the value of the database column product.pro_num
     *
     * @return the value of product.pro_num
     */
    public Long getProNum() {
        return proNum;
    }

    /**
     * This method sets the value of the database column product.pro_num
     *
     * @param proNum the value for product.pro_num
     */
    public void setProNum(Long proNum) {
        this.proNum = proNum;
    }

    /**
     * This method returns the value of the database column product.pro_size
     *
     * @return the value of product.pro_size
     */
    public Float getProSize() {
        return proSize;
    }

    /**
     * This method sets the value of the database column product.pro_size
     *
     * @param proSize the value for product.pro_size
     */
    public void setProSize(Float proSize) {
        this.proSize = proSize;
    }

    /**
     * This method returns the value of the database column product.pro_color
     *
     * @return the value of product.pro_color
     */
    public String getProColor() {
        return proColor;
    }

    /**
     * This method sets the value of the database column product.pro_color
     *
     * @param proColor the value for product.pro_color
     */
    public void setProColor(String proColor) {
        this.proColor = proColor == null ? null : proColor.trim();
    }

    /**
     * This method returns the value of the database column product.pro_price
     *
     * @return the value of product.pro_price
     */
    public Float getProPrice() {
        return proPrice;
    }

    /**
     * This method sets the value of the database column product.pro_price
     *
     * @param proPrice the value for product.pro_price
     */
    public void setProPrice(Float proPrice) {
        this.proPrice = proPrice;
    }

    /**
     * This method returns the value of the database column product.pro_address
     *
     * @return the value of product.pro_address
     */
    public String getProAddress() {
        return proAddress;
    }

    /**
     * This method sets the value of the database column product.pro_address
     *
     * @param proAddress the value for product.pro_address
     */
    public void setProAddress(String proAddress) {
        this.proAddress = proAddress == null ? null : proAddress.trim();
    }

    /**
     * This method returns the value of the database column product.pro_date
     *
     * @return the value of product.pro_date
     */
    public Date getProDate() {
        return proDate;
    }

    /**
     * This method sets the value of the database column product.pro_date
     *
     * @param proDate the value for product.pro_date
     */
    public void setProDate(Date proDate) {
        this.proDate = proDate;
    }

    /**
     * This method corresponds to the database table product
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proId=").append(proId);
        sb.append(", proName=").append(proName);
        sb.append(", proNum=").append(proNum);
        sb.append(", proSize=").append(proSize);
        sb.append(", proColor=").append(proColor);
        sb.append(", proPrice=").append(proPrice);
        sb.append(", proAddress=").append(proAddress);
        sb.append(", proDate=").append(proDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}