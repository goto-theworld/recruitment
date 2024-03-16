package com.it.service;

import com.it.util.ServerResponse;


public interface JobService {
    ServerResponse getByPage(Integer pageNum, Integer pageSize);
    ServerResponse getById(Integer jobId);
    public ServerResponse getByCompanyId(Integer companyId);
}
