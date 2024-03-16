package com.it.serviceVO;

import com.it.util.ServerResponse;

import java.math.BigDecimal;

public interface CompanyJobVOService {
    //条件查询
    ServerResponse getJobByConditions(Integer publishDay, BigDecimal minSalary,
                                      BigDecimal maxSalary, String workYear,
                                      String keywords, String eduRequest,
                                      Integer pageNum);
    ServerResponse getJobAll(Integer jobId);
}
