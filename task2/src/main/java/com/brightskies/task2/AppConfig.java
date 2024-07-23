package com.brightskies.task2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope(value="singleton")
    public FirstService getFirstService() {
        return new FirstService();
    }
    @Bean
    @Scope(value="prototype")
    public SecondService getSecondService() {
        return new SecondService();
    }
    @Bean
    public ServiceConsumer getServiceConsumer() {
        return new ServiceConsumer();
    }
}
