package com.it.config;

import com.it.pojo.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigRegistCanter implements WebMvcConfigurer {
    //注册拦截器
    //addPathPatterns 用来设置拦截路径
    //excludePathPatterns 用来设置白名单，也就是不需要触发这个拦截器的路径。
    //addPathPatterns("/**") 表示拦截所有的请求
    //.excludePathPatterns("/login","/regist")除了登录与注册之外，都会拦截（因为登录注册不需要登录页可以访问）
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/company/**", "/customer/center", "/record/**", "/resume/**", "/job/**")
                .excludePathPatterns("/job/getByPageForIndex");
                                                  /*  .excludePathPatterns("/login")
                                                    .excludePathPatterns("/regist");*/

    }

    //这个方法是用来配置静态资源的，比如html,js,css等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {


    }
}
