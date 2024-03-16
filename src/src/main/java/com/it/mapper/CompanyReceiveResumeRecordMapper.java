package com.it.mapper;

import com.it.pojo.CompanyReceiveResumeRecord;
import com.it.pojo.CompanyReceiveResumeRecordExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyReceiveResumeRecordMapper {
    /**
     * This method corresponds to the database table company_receive_resume_record
     */
    int countByExample(CompanyReceiveResumeRecordExample example);

    /**
     * This method corresponds to the database table company_receive_resume_record
     */
    int deleteByExample(CompanyReceiveResumeRecordExample example);

    /**
     * This method corresponds to the database table company_receive_resume_record
     */
    int deleteByPrimaryKey(Integer companyReceiveResumeRecordId);

    /**
     * This method corresponds to the database table company_receive_resume_record
     */
    int insert(CompanyReceiveResumeRecord record);

    /**
     * This method corresponds to the database table company_receive_resume_record
     */
    int insertSelective(CompanyReceiveResumeRecord record);

    /**
     * This method corresponds to the database table company_receive_resume_record
     */
    List<CompanyReceiveResumeRecord> selectByExample(CompanyReceiveResumeRecordExample example);

    /**
     * This method corresponds to the database table company_receive_resume_record
     */
    CompanyReceiveResumeRecord selectByPrimaryKey(Integer companyReceiveResumeRecordId);

    /**
     * This method corresponds to the database table company_receive_resume_record
     */
    int updateByExampleSelective(@Param("record") CompanyReceiveResumeRecord record, @Param("example") CompanyReceiveResumeRecordExample example);

    /**
     * This method corresponds to the database table company_receive_resume_record
     */
    int updateByExample(@Param("record") CompanyReceiveResumeRecord record, @Param("example") CompanyReceiveResumeRecordExample example);

    /**
     * This method corresponds to the database table company_receive_resume_record
     */
    int updateByPrimaryKeySelective(CompanyReceiveResumeRecord record);

    /**
     * This method corresponds to the database table company_receive_resume_record
     */
    int updateByPrimaryKey(CompanyReceiveResumeRecord record);
}