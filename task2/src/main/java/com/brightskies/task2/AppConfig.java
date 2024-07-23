package com.brightskies.task2;

import com.brightskies.task2.Service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope(value="singleton")
    public FirstService firstService() {
        return new FirstService();
    }
    @Bean
    @Scope(value="prototype")
    public SecondService secondService() {
        return new SecondService();
    }
    /*@Bean
    public ServiceConsumer serviceConsumer() {
        return new ServiceConsumer(firstService());
    }*/
}
