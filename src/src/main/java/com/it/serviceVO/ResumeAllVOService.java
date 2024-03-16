package com.it.serviceVO;

import com.it.util.ServerResponse;

public interface ResumeAllVOService {
    ServerResponse getAllResume(Integer resumeId);
    ServerResponse deleteAllResume(Integer resumeId);
}
