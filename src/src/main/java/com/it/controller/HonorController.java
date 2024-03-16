package com.it.controller;

import com.it.pojo.Honor;
import com.it.service.HonorService;
import com.it.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/resume/{resumeId}/honor")
public class HonorController {
    private HonorService honorService;

    @Autowired
    public HonorController(HonorService honorService) {
        this.honorService = honorService;
    }

//    简历编辑界面ajax
    @RequestMapping
    @ResponseBody
    public ServerResponse getByResumeId(@PathVariable("resumeId") Integer resumeId) {
        return honorService.getByResumeId(resumeId);
    }

    @RequestMapping("{id}")
    @ResponseBody
    public ServerResponse getResume(@PathVariable("id") Integer id) {
        return honorService.getById(id);
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public ServerResponse delete(@PathVariable("id") Integer id) {
        return honorService.delete(id);
    }

    @RequestMapping("/modify/{id}")
    @ResponseBody
    public ServerResponse modify(@PathVariable("id") Integer id, Honor honor) {
        honor.setHonorId(id);
        return honorService.modify(honor);
    }

    @RequestMapping("/add")
    @ResponseBody
    public ServerResponse add(Honor honor) {
        return honorService.add(honor);
    }

}
