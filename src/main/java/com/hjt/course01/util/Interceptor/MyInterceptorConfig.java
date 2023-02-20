package com.hjt.course01.util.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(    InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/ic/**");
    }
}
