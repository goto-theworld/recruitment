package com.it.mapper;

import com.it.pojo.Job;
import com.it.pojo.JobExample;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobMapper {
    /**
     * This method corresponds to the database table job
     */
    int countByExample(JobExample example);

    /**
     * This method corresponds to the database table job
     */
    int deleteByExample(JobExample example);

    /**
     * This method corresponds to the database table job
     */
    int deleteByPrimaryKey(Integer jobId);

    /**
     * This method corresponds to the database table job
     */
    int insert(Job record);

    /**
     * This method corresponds to the database table job
     */
    int insertSelective(Job record);

    /**
     * This method corresponds to the database table job
     */
    List<Job> selectByExample(JobExample example);

    /**
     * This method corresponds to the database table job
     */
    Job selectByPrimaryKey(Integer jobId);

    /**
     * This method corresponds to the database table job
     */
    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    /**
     * This method corresponds to the database table job
     */
    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    /**
     * This method corresponds to the database table job
     */
    int updateByPrimaryKeySelective(Job record);

    /**
     * This method corresponds to the database table job
     */
    int updateByPrimaryKey(Job record);


    List<Job> selectAllJobBySearch(@Param("publishDay") Integer publishDay,
                                   @Param("minSalary") BigDecimal minSalary,
                                   @Param("maxSalary") BigDecimal maxSalary,
//                                   @Param("companyType") BigDecimal companyType,
                                   @Param("workYear") String workYear,
                                   @Param("keywords") String keywords,
                                   @Param("eduRequest") String eduRequest);
}