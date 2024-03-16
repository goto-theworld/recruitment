package com.it.serviceVO;

import com.it.util.ServerResponse;

public interface ResumeJobCompanyRDRVOService {
    //通过用户id来获取信息渲染在投递记录中
    ServerResponse getByCustomerId(Integer customerId);
}
