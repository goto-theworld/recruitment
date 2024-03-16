package com.it.controller;

import com.it.pojo.ProjectExperience;
import com.it.service.ProjectExperienceService;
import com.it.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/resume/{resumeId}/project_exp")
public class ProjectExperienceController {
    private ProjectExperienceService projectExperienceService;

    @Autowired
    public ProjectExperienceController(ProjectExperienceService projectExperienceService) {
        this.projectExperienceService = projectExperienceService;
    }
    @RequestMapping
    @ResponseBody
    public ServerResponse getByResumeId(@PathVariable("resumeId") Integer resumeId) {
        return projectExperienceService.getByResumeId(resumeId);
    }

    @RequestMapping("{id}")
    @ResponseBody
    public ServerResponse getResume(@PathVariable("id") Integer id) {
        return projectExperienceService.getById(id);
    }


    @RequestMapping("/del/{id}")
    @ResponseBody
    public ServerResponse delete(@PathVariable("id") Integer id) {
        return projectExperienceService.delete(id);
    }

    @RequestMapping("/modify/{id}")
    @ResponseBody
    public ServerResponse modify(@PathVariable("id") Integer id, ProjectExperience projectExperience) {
        projectExperience.setProjectExperiId(id);
        return projectExperienceService.modify(projectExperience);
    }

    @RequestMapping("/add")
    @ResponseBody
    public ServerResponse add(ProjectExperience projectExperience) {
        return projectExperienceService.add(projectExperience);
    }
}
