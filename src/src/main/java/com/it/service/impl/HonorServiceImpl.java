package com.it.service.impl;

import com.it.mapper.HonorMapper;
import com.it.pojo.Honor;
import com.it.pojo.HonorExample;
import com.it.service.HonorService;
import com.it.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HonorServiceImpl implements HonorService {
    private HonorMapper honorMapper;

    @Autowired
    public HonorServiceImpl(HonorMapper honorMapper) {
        this.honorMapper = honorMapper;
    }

    @Override
    public ServerResponse add(Honor honor) {
        honor.setStatus(0);
        int rows = honorMapper.insert(honor);
        if (rows > 0)
            return ServerResponse.addSuccess();
        return ServerResponse.addFailed();
    }

    @Override
    public ServerResponse modify(Honor honor) {
        int rows = honorMapper.updateByPrimaryKeySelective(honor);
        if (rows > 0)
            return ServerResponse.modifySuccess();
        return ServerResponse.modifyFailed();
    }

    @Override
    public ServerResponse delete(Integer id) {
        HonorExample example = new HonorExample();
        HonorExample.Criteria criteria = example.createCriteria();
        criteria.andHonorIdEqualTo(id);
        Honor honor = new Honor();
        honor.setStatus(1);
        int rows = honorMapper.updateByExampleSelective(honor, example);
        if (rows > 0)
            return ServerResponse.deleteSuccess();
        return ServerResponse.deleteFailed();
    }

    @Override
    public ServerResponse getById(Integer id) {
        Honor honor = honorMapper.selectByPrimaryKey(id);
        if (honor != null)
            return ServerResponse.getSuccess(honor);
        return ServerResponse.getFailed();
    }

    @Override
    public ServerResponse getByResumeId(Integer resumeId) {
        HonorExample example = new HonorExample();
        HonorExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("honor_id desc");
        criteria.andResumeIdEqualTo(resumeId);
        criteria.andStatusEqualTo(0);
        List<Honor> honorList = honorMapper.selectByExample(example);
        if (honorList != null && honorList.size() > 0)
            return ServerResponse.getSuccess(honorList);
        return ServerResponse.getFailed();
    }

    @Override
    public ServerResponse deleteByResumeId(Integer resumeId) {
        Honor honor = new Honor();
        honor.setStatus(1);
        HonorExample example = new HonorExample();
        HonorExample.Criteria criteria = example.createCriteria();
        criteria.andResumeIdEqualTo(resumeId);
        int rows = honorMapper.updateByExampleSelective(honor, example);
        if (rows > 0)
            return ServerResponse.deleteSuccess();
        return ServerResponse.deleteFailed();
    }
}
