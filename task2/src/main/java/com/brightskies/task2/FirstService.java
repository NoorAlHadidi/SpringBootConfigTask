package com.brightskies.task2;

import org.springframework.stereotype.Component;

@Component
public class FirstService implements Service{
    @Override
    public String getMessage() {
        return "Message from the first service.";
    }
}
