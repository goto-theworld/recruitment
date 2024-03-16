package com.it.controller;

import com.it.pojo.Company;
import com.it.service.CompanyService;
import com.it.service.JobService;
import com.it.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/company")
public class CompanyController {
    private CompanyService companyService;
    private final JobService jobService;

    @Autowired
    public CompanyController(CompanyService companyService, JobService jobService) {
        this.companyService = companyService;
        this.jobService = jobService;
    }

    //    主页查询公司信息ajax
    @GetMapping("/getByPageForIndex")
    @ResponseBody
    public ServerResponse getByPageForIndex() {
        return companyService.getByPage(1, 9);
    }

    //    根据主键查询跳转
    @GetMapping("/{id}")
    public String get(@PathVariable("id") Integer companyId, HttpServletRequest request) {
        ServerResponse serverResponse = companyService.getById(companyId);

        Company company = (Company) serverResponse.getData();
        request.setAttribute("company", company);
        request.setAttribute("companyJobList", jobService.getByCompanyId(companyId).getData());
        return "company/companyInfo";
    }
}
