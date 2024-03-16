package com.it.pojo;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
    //检查登录业务拦截器，实在执行(controller)login方法之前就需要拦截检验的，所以需要把拦截的业务写在preHandle方法中
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("loginCustomer");
        if (customer == null) {
            System.out.println("用户尚未登录，请先登录");
            // request.getRequestDispatcher("/member/login.jsp").forward(request, response);
            response.sendRedirect(request.getContextPath() + "/login");//发现拦截，到登陆界面
            return false;
        } else {
            System.out.println("用户已经登录，放行");
            return true;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
