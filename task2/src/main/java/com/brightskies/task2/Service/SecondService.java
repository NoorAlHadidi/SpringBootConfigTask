package com.brightskies.task2.Service;

import org.springframework.stereotype.Service;

@Service
public class SecondService implements ServiceInterface {
    @Override
    public String getMessage() {
        return "Message from the second service.";
    }
}
