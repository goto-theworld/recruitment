package com.it.controller;

import com.it.pojo.Customer;
import com.it.pojo.Resume;
import com.it.pojoVO.ResumeAllVO;
import com.it.service.ResumeService;
import com.it.serviceVO.ResumeAllVOService;
import com.it.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
@RequestMapping("/resume")
public class ResumeController {
    private ResumeAllVOService resumeAllVOService;
    private ResumeService resumeService;

    @Autowired
    public ResumeController(ResumeAllVOService resumeAllVOService, ResumeService resumeService) {
        this.resumeAllVOService = resumeAllVOService;
        this.resumeService = resumeService;
    }

    @RequestMapping("/{resumeId}/all")
    @ResponseBody
    public ServerResponse getAllResume(@PathVariable("resumeId") Integer resumeId) {
        return resumeAllVOService.getAllResume(resumeId);
    }

    @DeleteMapping("/{resumeId}/del")
    @ResponseBody
    public void deleteAllResume(@PathVariable("resumeId") Integer resumeId) {
        resumeAllVOService.deleteAllResume(resumeId);
    }

    @RequestMapping("{resumeId}")
    @ResponseBody
    public ServerResponse getResume(@PathVariable("resumeId") Integer resumeId) {
        return resumeService.getById(resumeId);
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request) {
        Customer customer = (Customer) request.getSession().getAttribute("loginCustomer");
        Resume resume = new Resume();
        resume.setResumeName("我的简历");
        resume.setCustId(customer.getCustId());
        resume.setResumeTelno(customer.getCustTelno());
        resumeService.add(resume);
        resume = (Resume) resumeService.getLatestResume().getData();
        Integer resumeId = resume.getResumeId();
        return "redirect:" + resumeId + "/edit";
    }
    //    获取所有简历
    @GetMapping("/getAll")
    @ResponseBody
    public ServerResponse getAllResume(HttpServletRequest request) {
        Customer customer = (Customer) request.getSession().getAttribute("loginCustomer");
        return resumeService.getByCustomerId(customer.getCustId());
    }
    @RequestMapping("/{resumeId}/modify")
    @ResponseBody
    public ServerResponse modify(@PathVariable("resumeId") Integer resumeId,Resume resume) {
        resume.setResumeId(resumeId);
        return resumeService.modify(resume);
    }
    @RequestMapping("/{resumeId}/modifyName")
    @ResponseBody
    public ServerResponse modifyName(@PathVariable("resumeId") Integer resumeId,Resume resume) {
        resume.setResumeId(resumeId);
        resumeService.modify(resume);
        return resumeService.getById(resumeId);
    }


    @GetMapping("/{resumeId}/prev")
    public String preview(@PathVariable("resumeId") Integer resumeId, HttpServletRequest request) {
        ServerResponse serverResponse = resumeAllVOService.getAllResume(resumeId);
        ResumeAllVO resumeAllVO = (ResumeAllVO) serverResponse.getData();
        request.setAttribute("resumeAllVO", resumeAllVO);
        request.setAttribute("date", new Date().getTime());
        return "resume/preview";
    }

    @GetMapping("/{resumeId}/edit")
    public String create(@PathVariable("resumeId") Integer resumeId, HttpServletRequest request) {
        request.setAttribute("resumeId", resumeId);
        return "resume/create";
    }
}
