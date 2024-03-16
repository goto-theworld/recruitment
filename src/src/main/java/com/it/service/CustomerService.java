package com.it.service;

import com.it.pojo.Customer;
import com.it.util.ServerResponse;

public interface CustomerService {
    //    public ServerResponse getByAccountAndPwd(Integer type,String account,String password);
    ServerResponse getByUsernameAndPwd(String username, String password, Integer userType);

    ServerResponse getByTelno(Long custTelno);

    ServerResponse add(Customer customer);
}
