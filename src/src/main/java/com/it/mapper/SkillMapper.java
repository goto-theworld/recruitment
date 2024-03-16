package com.it.mapper;

import com.it.pojo.Skill;
import com.it.pojo.SkillExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillMapper {
    /**
     * This method corresponds to the database table skill
     */
    int countByExample(SkillExample example);

    /**
     * This method corresponds to the database table skill
     */
    int deleteByExample(SkillExample example);

    /**
     * This method corresponds to the database table skill
     */
    int deleteByPrimaryKey(Integer skillId);

    /**
     * This method corresponds to the database table skill
     */
    int insert(Skill record);

    /**
     * This method corresponds to the database table skill
     */
    int insertSelective(Skill record);

    /**
     * This method corresponds to the database table skill
     */
    List<Skill> selectByExample(SkillExample example);

    /**
     * This method corresponds to the database table skill
     */
    Skill selectByPrimaryKey(Integer skillId);

    /**
     * This method corresponds to the database table skill
     */
    int updateByExampleSelective(@Param("record") Skill record, @Param("example") SkillExample example);

    /**
     * This method corresponds to the database table skill
     */
    int updateByExample(@Param("record") Skill record, @Param("example") SkillExample example);

    /**
     * This method corresponds to the database table skill
     */
    int updateByPrimaryKeySelective(Skill record);

    /**
     * This method corresponds to the database table skill
     */
    int updateByPrimaryKey(Skill record);
}