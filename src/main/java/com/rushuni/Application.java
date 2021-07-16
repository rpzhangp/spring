package com.rushuni;

import com.rushuni.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author rushuni
 * @date 2021年07月15日 3:29 下午
 */


public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // setter 注入了 name 和 userMapper
        UserService userService = context.getBean("userService", UserService.class);
        userService.query();
        // 构造器注入了 name 和 userMapper
        userService = (UserService) context.getBean("userServiceByConstructor");
        userService.query();
    }
}
