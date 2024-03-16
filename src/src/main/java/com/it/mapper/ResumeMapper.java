package com.it.mapper;

import com.it.pojo.Resume;
import com.it.pojo.ResumeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeMapper {
    /**
     * This method corresponds to the database table resume
     */
    int countByExample(ResumeExample example);

    /**
     * This method corresponds to the database table resume
     */
    int deleteByExample(ResumeExample example);

    /**
     * This method corresponds to the database table resume
     */
    int deleteByPrimaryKey(Integer resumeId);

    /**
     * This method corresponds to the database table resume
     */
    int insert(Resume record);

    /**
     * This method corresponds to the database table resume
     */
    int insertSelective(Resume record);

    /**
     * This method corresponds to the database table resume
     */
    List<Resume> selectByExample(ResumeExample example);

    /**
     * This method corresponds to the database table resume
     */
    Resume selectByPrimaryKey(Integer resumeId);

    /**
     * This method corresponds to the database table resume
     */
    int updateByExampleSelective(@Param("record") Resume record, @Param("example") ResumeExample example);

    /**
     * This method corresponds to the database table resume
     */
    int updateByExample(@Param("record") Resume record, @Param("example") ResumeExample example);

    /**
     * This method corresponds to the database table resume
     */
    int updateByPrimaryKeySelective(Resume record);

    /**
     * This method corresponds to the database table resume
     */
    int updateByPrimaryKey(Resume record);
}