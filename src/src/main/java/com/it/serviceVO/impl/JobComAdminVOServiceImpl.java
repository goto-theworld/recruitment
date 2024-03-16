package com.it.serviceVO.impl;

import com.it.mapper.CompanyAdminMapper;
import com.it.mapper.JobMapper;
import com.it.pojo.*;
import com.it.pojoVO.JobComAdminVO;
import com.it.serviceVO.JobComAdminVOService;
import com.it.util.ServerResponse;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobComAdminVOServiceImpl implements JobComAdminVOService {
    private JobMapper jobMapper;
    private CompanyAdminMapper companyAdminMapper;

    @Autowired
    public JobComAdminVOServiceImpl(JobMapper jobMapper, CompanyAdminMapper companyAdminMapper) {
        this.jobMapper = jobMapper;
        this.companyAdminMapper = companyAdminMapper;
    }

    @Override
    public ServerResponse getJobAdminByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        JobExample example = new JobExample();
        example.createCriteria().andStatusEqualTo(0);
        example.setOrderByClause("job_publish_time desc");
        List<Job> jobList = jobMapper.selectByExample(example);
        List<JobComAdminVO> jobComAdminVOList = new ArrayList<>();
        for (Job job : jobList) {
            CompanyAdminExample companyAdminExample = new CompanyAdminExample();
            companyAdminExample.createCriteria().andCompanyIdEqualTo(job.getCompanyId());
            List<CompanyAdmin> companyAdminList = companyAdminMapper.selectByExample(companyAdminExample);
            if (companyAdminList.size() > 0)
                jobComAdminVOList.add(new JobComAdminVO(job, companyAdminList.get(0)));
            else
                return ServerResponse.getFailed();
        }
        return ServerResponse.getSuccess(jobComAdminVOList);
    }
}
