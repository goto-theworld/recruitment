package com.it.mapper;

import com.it.pojo.CompanyAdmin;
import com.it.pojo.CompanyAdminExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyAdminMapper {
    /**
     * This method corresponds to the database table company_admin
     */
    int countByExample(CompanyAdminExample example);

    /**
     * This method corresponds to the database table company_admin
     */
    int deleteByExample(CompanyAdminExample example);

    /**
     * This method corresponds to the database table company_admin
     */
    int deleteByPrimaryKey(Integer companyAdminId);

    /**
     * This method corresponds to the database table company_admin
     */
    int insert(CompanyAdmin record);

    /**
     * This method corresponds to the database table company_admin
     */
    int insertSelective(CompanyAdmin record);

    /**
     * This method corresponds to the database table company_admin
     */
    List<CompanyAdmin> selectByExample(CompanyAdminExample example);

    /**
     * This method corresponds to the database table company_admin
     */
    CompanyAdmin selectByPrimaryKey(Integer companyAdminId);

    /**
     * This method corresponds to the database table company_admin
     */
    int updateByExampleSelective(@Param("record") CompanyAdmin record, @Param("example") CompanyAdminExample example);

    /**
     * This method corresponds to the database table company_admin
     */
    int updateByExample(@Param("record") CompanyAdmin record, @Param("example") CompanyAdminExample example);

    /**
     * This method corresponds to the database table company_admin
     */
    int updateByPrimaryKeySelective(CompanyAdmin record);

    /**
     * This method corresponds to the database table company_admin
     */
    int updateByPrimaryKey(CompanyAdmin record);
}