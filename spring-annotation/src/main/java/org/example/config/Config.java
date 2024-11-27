package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;

@Configuration
@ComponentScan(basePackages = "org.example")
public class Config {

    @Bean
    public String jdbcUrl() {
        return "0jdbc:postgresql://localhost:5432/postgres";
    }

    @Bean
    public String jdbcUrl1() {
        return "1jdbc:postgresql://localhost:5432/postgres";
    }

    @Bean
    public String jdbcUrl2() {
        return "2jdbc:postgresql://localhost:5432/postgres";
    }

}
