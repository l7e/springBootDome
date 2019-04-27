package com.like.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig
{
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource createDataSource()
    {
        return new DruidDataSource();
    }
}
