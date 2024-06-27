package com.example.lastkatatask;

import com.example.lastkatatask.config.MyConfig;
import com.example.lastkatatask.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class LastKataTaskApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(LastKataTaskApplication.class, args);

        Communication communication = context.getBean("communication",
                Communication.class);
        List<User> allUsers = communication.getAllUser();
        System.out.println("Answer: " + communication.getAnswer());

    }

}
