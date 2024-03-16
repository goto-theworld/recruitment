package com.it.service.impl;

import com.it.mapper.CustomerMapper;
import com.it.pojo.Customer;
import com.it.pojo.CustomerExample;
import com.it.service.CustomerService;
import com.it.util.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerMapper customerMapper;

    @Autowired
    public CustomerServiceImpl(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    /**
     * @param username 手机号/邮箱
     * @param password 密码
     * @param userType 0手机号；1邮箱
     * @return 结果集
     */
    @Override
    public ServerResponse getByUsernameAndPwd(String username, String password, Integer userType) {
        CustomerExample example = new CustomerExample();
        CustomerExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        if (userType == 0)
            criteria.andCustTelnoEqualTo(Long.valueOf(username));
        else
            criteria.andCustEmailEqualTo(username);
        criteria.andCustPasswordEqualTo(password);
        List<Customer> customerList = customerMapper.selectByExample(example);
        if (customerList != null) {
            if (customerList.size() == 1)
                return ServerResponse.getSuccess(customerList.get(0));
            else if (customerList.size() > 1)
                return ServerResponse.getFailed("用户异常，请联系管理员");
        }
        return ServerResponse.getFailed("用户名/密码错误，请重试");
    }

    @Override
    public ServerResponse add(Customer customer) {
        customer.setCustRegistTime(new Date());
        customer.setStatus(0);
        int rows = customerMapper.insert(customer);
        if (rows > 0)
            return ServerResponse.addSuccess();
        return ServerResponse.addFailed();
    }

    @Override
    public ServerResponse getByTelno(Long custTelno) {
        CustomerExample example = new CustomerExample();
        example.createCriteria().andCustTelnoEqualTo(custTelno).andStatusEqualTo(0);
        List<Customer> customerList = customerMapper.selectByExample(example);
        if (customerList != null && customerList.size() > 0) {//找到用户了
            return ServerResponse.getSuccess(customerList.get(0)); // 1,"查询数据成功",customer
        } else // 用户不存在
            return ServerResponse.getFailed("用户不存在"); // 0,"查询数据失败","用户不存在"
    }


//    //根据账号与密码查询用户
//    @Override
//    public ServerResponse getByAccountAndPwd(Integer type, String account, String password) {
//        SqlSession session = MyBatisUtil.getSqlSession();
//        CustomerMapper mapper = session.getMapper(CustomerMapper.class);
//        CustomerExample example = new CustomerExample();
//        CustomerExample.Criteria criteria = example.createCriteria();
//        switch (type) {
//            case 0:
//                Long telno = Long.valueOf(account);
//                criteria.andCustTelnoEqualTo(telno);
//                break;
//            case 1:
//                criteria.andCustEmailEqualTo(account);
//                break;
//            case 2:
//                criteria.andCustNameEqualTo(account);
//                break;
//        }
//        criteria.andCustPasswordEqualTo(password);
//        List<Customer> customerList = mapper.selectByExample(example);
//        MyBatisUtil.closeSqlSession();
//        if (customerList != null && customerList.size() > 0)
//            return ServerResponse.getDataSuccess(customerList.get(0));
//        return ServerResponse.getDataFailed("账号或密码错误，登录失败");
//    }
//

//
//    @Override
//    public ServerResponse save(Customer customer) {
//        SqlSession session = MyBatisUtil.getSqlSession();
//        CustomerMapper mapper =  session.getMapper(CustomerMapper.class);
//        int rows = mapper.insert(customer);
//        session.commit();
//        MyBatisUtil.closeSqlSession();
//        if(rows == 0)
//            return ServerResponse.addFailed();
//
//        return ServerResponse.addSuccess();
//    }
//
//    @Override
//    public ServerResponse modifyStatus(Customer customer) {
//        return null;
//    }
//
//    @Override
//    public ServerResponse modify(Customer customer) {
//        return null;
//    }
//
//    @Override
//    public ServerResponse getById(Integer id) {
//        return null;
//    }
//
//    @Override
//    public ServerResponse getAll() {
//        return null;
//    }
}
