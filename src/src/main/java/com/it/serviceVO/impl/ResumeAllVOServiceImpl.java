package com.it.serviceVO.impl;

import com.it.pojo.*;
import com.it.pojoVO.ResumeAllVO;
import com.it.service.*;
import com.it.serviceVO.ResumeAllVOService;
import com.it.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeAllVOServiceImpl implements ResumeAllVOService {
    private ResumeService resumeService;
    private HonorService honorService;
    private ProjectExperienceService projectExperienceService;
    private SkillService skillService;

    @Autowired
    public ResumeAllVOServiceImpl(ResumeService resumeService, HonorService honorService, ProjectExperienceService projectExperienceService, SkillService skillService) {
        this.resumeService = resumeService;
        this.honorService = honorService;
        this.projectExperienceService = projectExperienceService;
        this.skillService = skillService;
    }

    @Override
    public ServerResponse getAllResume(Integer resumeId) {
        Resume resume = (Resume) resumeService.getById(resumeId).getData();

        List<ProjectExperience> projectExperienceList = (List<ProjectExperience>) projectExperienceService.getByResumeId(resumeId).getData();
        List<Skill> skillList = (List<Skill>) skillService.getByResumeId(resumeId).getData();
        List<Honor> honorList = (List<Honor>) honorService.getByResumeId(resumeId).getData();
        ResumeAllVO resumeAllVO = new ResumeAllVO(resume, projectExperienceList, skillList, honorList);
        if (resume != null)
            return ServerResponse.getSuccess(resumeAllVO);
        return ServerResponse.getFailed();
    }

    @Override
    public ServerResponse deleteAllResume(Integer resumeId) {
        projectExperienceService.deleteByResumeId(resumeId);
        skillService.deleteByResumeId(resumeId);
        honorService.deleteByResumeId(resumeId);
        return resumeService.delete(resumeId);
    }
}
