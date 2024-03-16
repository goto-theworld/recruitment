package com.it.service;

import com.it.util.ServerResponse;


public interface BaseService<T> {
    ServerResponse add(T t);
    ServerResponse modify(T t);
    ServerResponse delete(Integer id);
    ServerResponse getById(Integer id);
    ServerResponse getByResumeId(Integer resumeId);
    ServerResponse deleteByResumeId(Integer resumeId);
}
