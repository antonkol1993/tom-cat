package org.example.config;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:db.properties")
@ToString
public class DbConfig {

    @Value("${jdbcUrl}")
    private String jdbcUrl;
    @Value("${username}")
    private String username;
    @Value("${password:123456}")
    private String password;
}
