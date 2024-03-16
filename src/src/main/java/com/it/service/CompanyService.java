package com.it.service;

import com.it.util.ServerResponse;

public interface CompanyService {
    ServerResponse getByPage(Integer pageNum, Integer pageSize);
    ServerResponse getById(Integer companyId);
}
