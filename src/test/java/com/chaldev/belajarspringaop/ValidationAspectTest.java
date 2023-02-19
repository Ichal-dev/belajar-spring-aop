package com.chaldev.belajarspringaop;

import com.chaldev.belajarspringaop.aspect.EmployeeAspectWithExecution;
import com.chaldev.belajarspringaop.aspect.ValidationAspect;
import com.chaldev.belajarspringaop.service.EmployeeService;
import com.chaldev.belajarspringaop.service.ValidationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

public class ValidationAspectTest {
    @Configuration
    @EnableAspectJAutoProxy
    @Import({
            ValidationAspect.class,
            ValidationService.class
    })
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;


    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testValidationAspect() {
        ValidationService validationService = applicationContext.getBean(ValidationService.class);
        validationService.validateNumber(10);
        // validationService.validateNumber(-1); Error Validate

    }
}
