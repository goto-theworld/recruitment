package com.it.mapper;

import com.it.pojo.Customer;
import com.it.pojo.CustomerExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {
    /**
     * This method corresponds to the database table customer
     */
    int countByExample(CustomerExample example);

    /**
     * This method corresponds to the database table customer
     */
    int deleteByExample(CustomerExample example);

    /**
     * This method corresponds to the database table customer
     */
    int deleteByPrimaryKey(Integer custId);

    /**
     * This method corresponds to the database table customer
     */
    int insert(Customer record);

    /**
     * This method corresponds to the database table customer
     */
    int insertSelective(Customer record);

    /**
     * This method corresponds to the database table customer
     */
    List<Customer> selectByExample(CustomerExample example);

    /**
     * This method corresponds to the database table customer
     */
    Customer selectByPrimaryKey(Integer custId);

    /**
     * This method corresponds to the database table customer
     */
    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    /**
     * This method corresponds to the database table customer
     */
    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    /**
     * This method corresponds to the database table customer
     */
    int updateByPrimaryKeySelective(Customer record);

    /**
     * This method corresponds to the database table customer
     */
    int updateByPrimaryKey(Customer record);
}