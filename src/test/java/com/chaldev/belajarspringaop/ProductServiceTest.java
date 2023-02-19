package com.chaldev.belajarspringaop;

import com.chaldev.belajarspringaop.configuration.AopConfig;
import com.chaldev.belajarspringaop.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductServiceTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testProductService() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        productService.createProduct();
    }
}
