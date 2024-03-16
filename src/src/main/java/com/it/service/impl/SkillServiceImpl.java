package com.it.service.impl;

import com.it.mapper.SkillMapper;
import com.it.pojo.Skill;
import com.it.pojo.SkillExample;
import com.it.service.SkillService;
import com.it.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {
    private SkillMapper skillMapper;

    @Autowired
    public SkillServiceImpl(SkillMapper skillMapper) {
        this.skillMapper = skillMapper;
    }

    @Override
    public ServerResponse add(Skill skill) {
        skill.setStatus(0);
        int rows = skillMapper.insert(skill);
        if (rows > 0)
            return ServerResponse.addSuccess();
        return ServerResponse.addFailed();
    }

    @Override
    public ServerResponse modify(Skill skill) {
        int rows = skillMapper.updateByPrimaryKeySelective(skill);
        if (rows > 0)
            return ServerResponse.modifySuccess();
        return ServerResponse.modifyFailed();
    }

    @Override
    public ServerResponse delete(Integer id) {
        SkillExample example = new SkillExample();
        SkillExample.Criteria criteria = example.createCriteria();
        criteria.andSkillIdEqualTo(id);
        Skill skill = new Skill();
        skill.setStatus(1);
        int rows = skillMapper.updateByExampleSelective(skill, example);
        if (rows > 0)
            return ServerResponse.deleteSuccess();
        return ServerResponse.deleteFailed();
    }

    @Override
    public ServerResponse getById(Integer id) {
        Skill skill = skillMapper.selectByPrimaryKey(id);
        if (skill != null)
            return ServerResponse.getSuccess(skill);
        return ServerResponse.getFailed();
    }

    @Override
    public ServerResponse getByResumeId(Integer resumeId) {
        SkillExample example = new SkillExample();
        SkillExample.Criteria criteria = example.createCriteria();
        criteria.andResumeIdEqualTo(resumeId);
        example.setOrderByClause("skill_id desc");
        criteria.andStatusEqualTo(0);
        List<Skill> skillList = skillMapper.selectByExample(example);
        if (skillList != null && skillList.size() > 0)
            return ServerResponse.getSuccess(skillList);
        return ServerResponse.getFailed();
    }

    @Override
    public ServerResponse deleteByResumeId(Integer resumeId) {
        Skill skill = new Skill();
        skill.setStatus(1);
        SkillExample example = new SkillExample();
        SkillExample.Criteria criteria = example.createCriteria();
        criteria.andResumeIdEqualTo(resumeId);
        int rows = skillMapper.updateByExampleSelective(skill, example);
        if (rows > 0)
            return ServerResponse.deleteSuccess();
        return ServerResponse.deleteFailed();
    }
}
