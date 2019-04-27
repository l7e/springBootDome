package com.like.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties(prefix = "jdbc")
@Data
public class JdbcProperties
{
    private String Driver;
    private String url;
    private String username;
    private String password;
}
