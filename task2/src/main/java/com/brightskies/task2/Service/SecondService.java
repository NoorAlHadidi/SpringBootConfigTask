package com.brightskies.task2.Service;

import org.springframework.stereotype.Component;

@Component
public class SecondService implements Service {
    @Override
    public String getMessage() {
        return "Message from the second service.";
    }
}
