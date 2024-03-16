package com.it.mapper;

import com.it.pojo.Product;
import com.it.pojo.ProductExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
    /**
     * This method corresponds to the database table product
     */
    int countByExample(ProductExample example);

    /**
     * This method corresponds to the database table product
     */
    int deleteByExample(ProductExample example);

    /**
     * This method corresponds to the database table product
     */
    int deleteByPrimaryKey(String proId);

    /**
     * This method corresponds to the database table product
     */
    int insert(Product record);

    /**
     * This method corresponds to the database table product
     */
    int insertSelective(Product record);

    /**
     * This method corresponds to the database table product
     */
    List<Product> selectByExample(ProductExample example);

    /**
     * This method corresponds to the database table product
     */
    Product selectByPrimaryKey(String proId);

    /**
     * This method corresponds to the database table product
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method corresponds to the database table product
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method corresponds to the database table product
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method corresponds to the database table product
     */
    int updateByPrimaryKey(Product record);
}