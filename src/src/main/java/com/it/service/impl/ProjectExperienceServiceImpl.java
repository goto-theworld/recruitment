package com.it.service.impl;

import com.it.mapper.ProjectExperienceMapper;
import com.it.pojo.ProjectExperience;
import com.it.pojo.ProjectExperienceExample;
import com.it.service.ProjectExperienceService;
import com.it.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectExperienceServiceImpl implements ProjectExperienceService {
    private ProjectExperienceMapper projectExperienceMapper;

    @Autowired
    public ProjectExperienceServiceImpl(ProjectExperienceMapper projectExperienceMapper) {
        this.projectExperienceMapper = projectExperienceMapper;
    }

    @Override
    public ServerResponse add(ProjectExperience projectExperience) {
        projectExperience.setStatus(0);
        int rows = projectExperienceMapper.insert(projectExperience);
        if (rows > 0)
            return ServerResponse.addSuccess();
        return ServerResponse.addFailed();
    }

    @Override
    public ServerResponse modify(ProjectExperience projectExperience) {
        int rows = projectExperienceMapper.updateByPrimaryKeySelective(projectExperience);
        if (rows > 0)
            return ServerResponse.modifySuccess();
        return ServerResponse.modifyFailed();
    }

    @Override
    public ServerResponse delete(Integer id) {
        ProjectExperienceExample example = new ProjectExperienceExample();
        ProjectExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andProjectExperiIdEqualTo(id);
        ProjectExperience projectExperience = new ProjectExperience();
        projectExperience.setStatus(1);
        int rows = projectExperienceMapper.updateByExampleSelective(projectExperience, example);
        if (rows > 0)
            return ServerResponse.deleteSuccess();
        return ServerResponse.deleteFailed();
    }

    @Override
    public ServerResponse getById(Integer id) {
        ProjectExperience projectExperience = projectExperienceMapper.selectByPrimaryKey(id);
        if (projectExperience != null)
            return ServerResponse.getSuccess(projectExperience);
        return ServerResponse.getFailed();
    }

    @Override
    public ServerResponse getByResumeId(Integer resumeId) {
        ProjectExperienceExample example = new ProjectExperienceExample();
        ProjectExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andResumeIdEqualTo(resumeId).andStatusEqualTo(0);
        example.setOrderByClause("project_experi_id desc");
        criteria.andStatusEqualTo(0);
        List<ProjectExperience> projectExperienceList = projectExperienceMapper.selectByExample(example);
        if (projectExperienceList != null && projectExperienceList.size() > 0)
            return ServerResponse.getSuccess(projectExperienceList);
        return ServerResponse.getFailed();
    }

    @Override
    public ServerResponse deleteByResumeId(Integer resumeId) {
        ProjectExperience projectExperience = new ProjectExperience();
        projectExperience.setStatus(1);
        ProjectExperienceExample example = new ProjectExperienceExample();
        ProjectExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andResumeIdEqualTo(resumeId);
        int rows = projectExperienceMapper.updateByExampleSelective(projectExperience, example);
        if (rows > 0)
            return ServerResponse.deleteSuccess();
        return ServerResponse.deleteFailed();
    }
}
