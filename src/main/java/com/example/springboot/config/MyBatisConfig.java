package com.example.springboot.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName MyBatisConfig
 * @Description 自定义Mybatis的配置规则
 * @Author 张鸿志
 * @Date 2019年4月13日22:40:42 22:40
 * Version 1.0
 **/

@org.springframework.context.annotation.Configuration
public class MyBatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(Configuration configuration) {
                //开启驼峰命名自动映射
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }


}
