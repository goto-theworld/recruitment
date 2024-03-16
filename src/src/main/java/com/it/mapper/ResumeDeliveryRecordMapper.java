package com.it.mapper;

import com.it.pojo.ResumeDeliveryRecord;
import com.it.pojo.ResumeDeliveryRecordExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeDeliveryRecordMapper {
    /**
     * This method corresponds to the database table resume_delivery_record
     */
    int countByExample(ResumeDeliveryRecordExample example);

    /**
     * This method corresponds to the database table resume_delivery_record
     */
    int deleteByExample(ResumeDeliveryRecordExample example);

    /**
     * This method corresponds to the database table resume_delivery_record
     */
    int deleteByPrimaryKey(Integer resumeDeliveryRecordId);

    /**
     * This method corresponds to the database table resume_delivery_record
     */
    int insert(ResumeDeliveryRecord record);

    /**
     * This method corresponds to the database table resume_delivery_record
     */
    int insertSelective(ResumeDeliveryRecord record);

    /**
     * This method corresponds to the database table resume_delivery_record
     */
    List<ResumeDeliveryRecord> selectByExample(ResumeDeliveryRecordExample example);

    /**
     * This method corresponds to the database table resume_delivery_record
     */
    ResumeDeliveryRecord selectByPrimaryKey(Integer resumeDeliveryRecordId);

    /**
     * This method corresponds to the database table resume_delivery_record
     */
    int updateByExampleSelective(@Param("record") ResumeDeliveryRecord record, @Param("example") ResumeDeliveryRecordExample example);

    /**
     * This method corresponds to the database table resume_delivery_record
     */
    int updateByExample(@Param("record") ResumeDeliveryRecord record, @Param("example") ResumeDeliveryRecordExample example);

    /**
     * This method corresponds to the database table resume_delivery_record
     */
    int updateByPrimaryKeySelective(ResumeDeliveryRecord record);

    /**
     * This method corresponds to the database table resume_delivery_record
     */
    int updateByPrimaryKey(ResumeDeliveryRecord record);
}