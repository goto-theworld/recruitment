package com.it.controller;

import com.it.pojoVO.CompanyJobVO;
import com.it.service.JobService;
import com.it.serviceVO.CompanyJobVOService;
import com.it.serviceVO.JobComAdminVOService;
import com.it.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

@Controller
@RequestMapping("/job")
public class JobController {
    private JobService jobService;
    private CompanyJobVOService companyJobVOService;
    private JobComAdminVOService jobComAdminVOService;

    @Autowired
    public JobController(JobService jobService, CompanyJobVOService companyJobVOService, JobComAdminVOService jobComAdminVOService) {
        this.jobService = jobService;
        this.companyJobVOService = companyJobVOService;
        this.jobComAdminVOService = jobComAdminVOService;
    }

    @GetMapping("/getByPageForIndex")
    @ResponseBody
    public ServerResponse getByPageForIndex() {
        return jobComAdminVOService.getJobAdminByPage(1, 9);
    }

    @GetMapping("/jobInfo")
    public String jobInfo(String keywords, RedirectAttributes attr) {
        attr.addFlashAttribute("keywords", keywords);
        return "redirect:/job/getSearchJob";
    }

    @GetMapping("/getSearchJob")
    public String toJobInfo() {
        return "job/jobInfo";
    }

    @PostMapping("/getSearchJob")
    @ResponseBody
    public ServerResponse getSearchJob(String keywords, Integer publishDay, BigDecimal minSalary,
                                       BigDecimal maxSalary, String workYear,
                                       String eduRequest, Integer pageNum) {
        return companyJobVOService.getJobByConditions(publishDay, minSalary, maxSalary,
                workYear, keywords, eduRequest, pageNum);
    }

    @GetMapping("/{id}")
    public String get(@PathVariable("id") Integer jobId, HttpServletRequest request) {
        ServerResponse serverResponse = companyJobVOService.getJobAll(jobId);
        CompanyJobVO companyJobVO = (CompanyJobVO) serverResponse.getData();
        request.setAttribute("companyJobVO", companyJobVO);
        return "job/jobDetail";
    }


}
