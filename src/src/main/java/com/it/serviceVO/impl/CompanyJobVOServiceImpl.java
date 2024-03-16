package com.it.serviceVO.impl;

import com.it.mapper.JobMapper;
import com.it.pojo.Company;
import com.it.pojo.Job;
import com.it.pojoVO.CompanyJobVO;
import com.it.service.CompanyService;
import com.it.serviceVO.CompanyJobVOService;
import com.it.util.ServerResponse;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyJobVOServiceImpl implements CompanyJobVOService {
    private JobMapper jobMapper;
    private CompanyService companyService;


    @Autowired
    public CompanyJobVOServiceImpl(JobMapper jobMapper, CompanyService companyService) {
        this.jobMapper = jobMapper;
        this.companyService = companyService;
    }

    @Override
    public ServerResponse getJobByConditions(Integer publishDay, BigDecimal minSalary, BigDecimal maxSalary, String workYear, String keywords, String eduRequest, Integer pageNum) {
        Page<Job> page = PageHelper.startPage(pageNum, 5);
        List<Job> jobList = jobMapper.selectAllJobBySearch(publishDay, minSalary,
                maxSalary, workYear, keywords, eduRequest);

        List<CompanyJobVO> companyJobVO = new ArrayList<>();
        for (Job job : jobList) {
            ServerResponse companyServerResponse = companyService.getById(job.getCompanyId());
            Company company = (Company) companyServerResponse.getData();
            companyJobVO.add(new CompanyJobVO(job, company));
        }

        PageInfo<CompanyJobVO> pageInfo = new PageInfo<>();
        pageInfo.setList(companyJobVO);
        pageInfo.setPageNum(page.getPageNum());
        pageInfo.setPageSize(page.getPageSize());
        pageInfo.setTotal(page.getTotal());
        pageInfo.setPages(page.getPages());

        if (jobList.size() > 0)
            return ServerResponse.getSuccess(pageInfo);
        else
            return ServerResponse.getFailed("对不起，没有找到符合你条件的职位！");
    }

    @Override
    public ServerResponse getJobAll(Integer jobId) {
        Job job = jobMapper.selectByPrimaryKey(jobId);
        if (job != null) {
            Company company = (Company) companyService.getById(job.getCompanyId()).getData();
            CompanyJobVO companyJobVO = new CompanyJobVO(job, company);
            return ServerResponse.getSuccess(companyJobVO);
        } else
            return ServerResponse.getFailed("无此职位");
    }
}
