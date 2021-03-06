package com.shcem.artemis.configuration;

import com.shcem.artemis.Interceptor.MyInterceptor;
import com.shcem.artemis.utils.ZkUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ZkwebConfig extends WebMvcConfigurerAdapter {
    @Autowired
    Environment env;
    @Bean
    public ZkUtils getZkUtils(){
        return new ZkUtils(env.getProperty("zkhost"));
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        MyInterceptor myInterceptor=new MyInterceptor();
        registry.addInterceptor(myInterceptor);
    }
}
