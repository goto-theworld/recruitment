package com.it.serviceVO;

import com.it.util.ServerResponse;

public interface JobComAdminVOService {
    ServerResponse getJobAdminByPage(Integer pageNum, Integer pageSize);
}
