package com.it.service.impl;

import com.it.mapper.CompanyMapper;
import com.it.pojo.Company;
import com.it.pojo.CompanyExample;
import com.it.service.CompanyService;
import com.it.util.ServerResponse;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    private CompanyMapper companyMapper;

    @Autowired
    public CompanyServiceImpl(CompanyMapper companyMapper) {
        this.companyMapper = companyMapper;
    }

    @Override
    public ServerResponse getByPage(Integer pageNum, Integer pageSize) {
        CompanyExample example = new CompanyExample();
        example.createCriteria().andStatusEqualTo(0);
        example.setOrderByClause("company_id desc");
        Page<Company> page = PageHelper.startPage(pageNum, pageSize);
        List<Company> companyList = companyMapper.selectByExample(example);// select
        if (companyList != null && companyList.size() > 0)
            return ServerResponse.getSuccess(page.toPageInfo());
        return ServerResponse.getFailed();
    }

    @Override
    public ServerResponse getById(Integer companyId) {
        Company company = companyMapper.selectByPrimaryKey(companyId);
        if (company != null)
            return ServerResponse.getSuccess(company);
        return ServerResponse.getFailed();
    }
}
