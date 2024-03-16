package com.it.mapper;

import com.it.pojo.Company;
import com.it.pojo.CompanyExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyMapper {
    /**
     * This method corresponds to the database table company
     */
    int countByExample(CompanyExample example);

    /**
     * This method corresponds to the database table company
     */
    int deleteByExample(CompanyExample example);

    /**
     * This method corresponds to the database table company
     */
    int deleteByPrimaryKey(Integer companyId);

    /**
     * This method corresponds to the database table company
     */
    int insert(Company record);

    /**
     * This method corresponds to the database table company
     */
    int insertSelective(Company record);

    /**
     * This method corresponds to the database table company
     */
    List<Company> selectByExample(CompanyExample example);

    /**
     * This method corresponds to the database table company
     */
    Company selectByPrimaryKey(Integer companyId);

    /**
     * This method corresponds to the database table company
     */
    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     * This method corresponds to the database table company
     */
    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     * This method corresponds to the database table company
     */
    int updateByPrimaryKeySelective(Company record);

    /**
     * This method corresponds to the database table company
     */
    int updateByPrimaryKey(Company record);
}