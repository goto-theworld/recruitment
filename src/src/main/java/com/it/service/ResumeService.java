package com.it.service;

import com.it.pojo.Resume;
import com.it.util.ServerResponse;

public interface ResumeService {
    ServerResponse add(Resume resume);
    ServerResponse modify(Resume resume);
    ServerResponse delete(Integer id);
    ServerResponse getById(Integer id);
    ServerResponse getLatestResume();
    ServerResponse getByCustomerId(Integer customerId);
}
