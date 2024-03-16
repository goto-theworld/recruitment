package com.it.controller;

import com.it.pojo.Skill;
import com.it.service.SkillService;
import com.it.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/resume/{resumeId}/skill")
public class SkillController {
    private SkillService skillService;

    @Autowired
    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }
    @RequestMapping
    @ResponseBody
    public ServerResponse getResumeAllVO(@PathVariable("resumeId") Integer resumeId) {
        return skillService.getByResumeId(resumeId);
    }

    @RequestMapping("{id}")
    @ResponseBody
    public ServerResponse getResume(@PathVariable("id") Integer id) {
        return skillService.getById(id);
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public ServerResponse delete(@PathVariable("id") Integer id) {
        return skillService.delete(id);
    }

    @RequestMapping("/modify/{id}")
    @ResponseBody
    public ServerResponse modify(@PathVariable("id") Integer id, Skill skill) {
        skill.setSkillId(id);
        return skillService.modify(skill);
    }

    @RequestMapping("/add")
    @ResponseBody
    public ServerResponse add(Skill skill) {
        return skillService.add(skill);
    }
}
