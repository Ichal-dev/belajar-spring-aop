package com.chaldev.belajarspringaop;

import com.chaldev.belajarspringaop.configuration.AopConfig;
import com.chaldev.belajarspringaop.service.ProductService;
import org.aspectj.lang.JoinPoint;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

public class LoggingAspectTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testAspect() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        productService.createProduct();
    }


}
