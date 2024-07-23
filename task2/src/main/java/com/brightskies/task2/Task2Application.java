package com.brightskies.task2;

import com.brightskies.task2.Service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Task2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Task2Application.class, args);
		FirstService firstService = context.getBean(FirstService.class);
		SecondService secondService = context.getBean(SecondService.class);
		ServiceConsumer serviceConsumer = context.getBean(ServiceConsumer.class);
		serviceConsumer.displayMessages();
	}

}
