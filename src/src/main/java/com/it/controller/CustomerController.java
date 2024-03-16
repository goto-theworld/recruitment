package com.it.controller;

import com.it.pojo.Customer;
import com.it.service.CustomerService;
import com.it.service.ResumeService;
import com.it.serviceVO.ResumeJobCompanyRDRVOService;
import com.it.util.ServerResponse;
import com.it.util.ValidateCodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;
    private ResumeService resumeService;
    private ResumeJobCompanyRDRVOService resumeJobCompanyRDRVOService;

    @Autowired
    public CustomerController(ResumeJobCompanyRDRVOService resumeJobCompanyRDRVOService, CustomerService customerService, ResumeService resumeService) {
        this.resumeJobCompanyRDRVOService = resumeJobCompanyRDRVOService;
        this.customerService = customerService;
        this.resumeService = resumeService;
    }

    //    个人中心跳转
    @GetMapping("/center/{type}")
    public String center(@PathVariable("type") Integer type, HttpServletRequest request) {
        Customer customer = (Customer) request.getSession().getAttribute("loginCustomer");
        ServerResponse serverResponse;
        if (customer != null) {
            if (type == 1) {
                serverResponse = resumeService.getByCustomerId(customer.getCustId());
                request.setAttribute("resumeList", serverResponse.getData());
            } else if (type == 2) {
                serverResponse = resumeJobCompanyRDRVOService.getByCustomerId(customer.getCustId());//封装了用户简历，工作 公司的对象
                request.setAttribute("rdrList", serverResponse.getData());
            }
            request.setAttribute("type", type);//这里的type需要判断
            return "customer/personalCenter";
        } else
            return "redirect:/"; // 未登录
    }

    //    登录ajax
    @GetMapping("/login")
    @ResponseBody
    public ServerResponse login(String username, String password, Integer type, Integer userType, HttpServletRequest request) {
        ServerResponse serverResponse = null;
        if (1 == type) { // 手机号、邮箱 & 密码
            // userType = 0手机号；1邮箱
            serverResponse = customerService.getByUsernameAndPwd(username, password, userType);
            if (serverResponse.getStatus() == 1) { // 登录成功 用户存在
                Customer customer = (Customer) serverResponse.getData();
                request.getSession().setAttribute("loginCustomer", customer);
            }
        } else {
            // 手机号 & 验证码
            System.out.println("手机号，验证码登录");
        }
        return serverResponse;
    }

    //    退出登录跳转
    @RequestMapping("/logout")
    public String register(HttpServletRequest request) {
        request.getSession().removeAttribute("loginCustomer");
        return "redirect:/";
    }

    //    注册ajax
    @PostMapping("/add")
    @ResponseBody
    public ServerResponse register(Customer customer) {
        customer.setCustName(customer.getCustTelno().toString());
        return customerService.add(customer);
    }

    //    获取验证码ajax
    @GetMapping("/getCode")
    @ResponseBody
    public ServerResponse getCheckedCode(Long custTelno) {
        // 数据库中查看手机号是否已经注册
        ServerResponse serverResponse = customerService.getByTelno(custTelno);
        ServerResponse result;
        if (serverResponse.getStatus() != 1) {
            // 失败 - 用户不存在，可以创建
            //生成随机的4位验证码
            String code = ValidateCodeUtils.generateValidateCode(4).toString();
            //为了测试，防止真实的手机号泄露，控制台直接输出验证码
            log.info("code={}", code);

            // 获取验证码 - 调用短信接口
            //调用阿里云提供的短信服务API，完成发送短信
            //SMSUtils.sendMessage("招聘系统","",phone,code);
            // String code =  GetMessageCode.getCode(telnoStr);

            result = ServerResponse.getSuccess(code);
        } else {
            // 成功 - 用户已经存在
            result = ServerResponse.getFailed("用户已存在，请前往登录页面");
        }
        return result;
    }

}
