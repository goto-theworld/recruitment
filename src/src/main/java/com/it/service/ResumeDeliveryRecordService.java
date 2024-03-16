package com.it.service;

import com.it.pojo.ResumeDeliveryRecord;
import com.it.util.ServerResponse;

public interface ResumeDeliveryRecordService {
    ServerResponse getByCustomerId(Integer custId);
    ServerResponse add(ResumeDeliveryRecord resumeDeliveryRecord);
    ServerResponse getByJobId(Integer jobId);
}
