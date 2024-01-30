package com.maple.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MPConfig {
    // 第三方bean的配置方式
    // 创建拦截器交给spring管理
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        //创建拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //在拦截器中添加分页拦截
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
