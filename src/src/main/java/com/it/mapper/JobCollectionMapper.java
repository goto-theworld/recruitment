package com.it.mapper;

import com.it.pojo.JobCollection;
import com.it.pojo.JobCollectionExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobCollectionMapper {
    /**
     * This method corresponds to the database table job_collection
     */
    int countByExample(JobCollectionExample example);

    /**
     * This method corresponds to the database table job_collection
     */
    int deleteByExample(JobCollectionExample example);

    /**
     * This method corresponds to the database table job_collection
     */
    int deleteByPrimaryKey(Integer jobCollectionId);

    /**
     * This method corresponds to the database table job_collection
     */
    int insert(JobCollection record);

    /**
     * This method corresponds to the database table job_collection
     */
    int insertSelective(JobCollection record);

    /**
     * This method corresponds to the database table job_collection
     */
    List<JobCollection> selectByExample(JobCollectionExample example);

    /**
     * This method corresponds to the database table job_collection
     */
    JobCollection selectByPrimaryKey(Integer jobCollectionId);

    /**
     * This method corresponds to the database table job_collection
     */
    int updateByExampleSelective(@Param("record") JobCollection record, @Param("example") JobCollectionExample example);

    /**
     * This method corresponds to the database table job_collection
     */
    int updateByExample(@Param("record") JobCollection record, @Param("example") JobCollectionExample example);

    /**
     * This method corresponds to the database table job_collection
     */
    int updateByPrimaryKeySelective(JobCollection record);

    /**
     * This method corresponds to the database table job_collection
     */
    int updateByPrimaryKey(JobCollection record);
}