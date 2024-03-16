package com.it.mapper;

import com.it.pojo.ProjectExperience;
import com.it.pojo.ProjectExperienceExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectExperienceMapper {
    /**
     * This method corresponds to the database table project_experience
     */
    int countByExample(ProjectExperienceExample example);

    /**
     * This method corresponds to the database table project_experience
     */
    int deleteByExample(ProjectExperienceExample example);

    /**
     * This method corresponds to the database table project_experience
     */
    int deleteByPrimaryKey(Integer projectExperiId);

    /**
     * This method corresponds to the database table project_experience
     */
    int insert(ProjectExperience record);

    /**
     * This method corresponds to the database table project_experience
     */
    int insertSelective(ProjectExperience record);

    /**
     * This method corresponds to the database table project_experience
     */
    List<ProjectExperience> selectByExample(ProjectExperienceExample example);

    /**
     * This method corresponds to the database table project_experience
     */
    ProjectExperience selectByPrimaryKey(Integer projectExperiId);

    /**
     * This method corresponds to the database table project_experience
     */
    int updateByExampleSelective(@Param("record") ProjectExperience record, @Param("example") ProjectExperienceExample example);

    /**
     * This method corresponds to the database table project_experience
     */
    int updateByExample(@Param("record") ProjectExperience record, @Param("example") ProjectExperienceExample example);

    /**
     * This method corresponds to the database table project_experience
     */
    int updateByPrimaryKeySelective(ProjectExperience record);

    /**
     * This method corresponds to the database table project_experience
     */
    int updateByPrimaryKey(ProjectExperience record);
}