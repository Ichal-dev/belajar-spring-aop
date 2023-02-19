package com.chaldev.belajarspringaop;

import com.chaldev.belajarspringaop.aspect.EmployeeAspectWithExecution;
import com.chaldev.belajarspringaop.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;


public class EmployeeAspectWithExecutionTest {

    @Configuration
    @EnableAspectJAutoProxy
    @Import({
            EmployeeAspectWithExecution.class,
            EmployeeService.class
    })
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;


    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
    }

    @Test
    void testEmployeeAspect() {
        EmployeeService employeeAspect = applicationContext.getBean(EmployeeService.class);
        employeeAspect.createEmployee();

    }
}
