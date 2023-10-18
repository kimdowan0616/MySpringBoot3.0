package com.basic.myspringboot.runner;

import com.basic.myspringboot.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Order(2)   // 숫자가 낮을 수록 우선 순위
public class MyRunner implements ApplicationRunner {
    @Value("${myboot.name}")
    private String name;

    @Value("${myboot.age}")
    private int age;

    @Value("${myboot.fullName}")
    private String fullName;

    @Autowired
    private Environment environment;

    @Autowired
    private Customer customer;

    Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("Logger 클래스 이름 {}", logger.getClass().getName());
        logger.info("Customer 현재모드 = {}", customer.getName());
        logger.info("Port Num = {}", environment.getProperty("local.server.port"));
        logger.info("myboot.name = {}", name);
        logger.info("myboot.age = {}", age);
        logger.info("myboot.fullName = {}", fullName);
        logger.info(">>> Git Test!");

        logger.debug("VM Argument foo = {}, Program Argument bar = {}",
                        args.containsOption("foo"),
                        args.containsOption("bar"));
    }
}
