package com.chaldev.belajarspringaop.configuration;

import com.chaldev.belajarspringaop.LoggingAspect;
import com.chaldev.belajarspringaop.service.ProductService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAspectJAutoProxy
@Import({
        LoggingAspect.class,
        ProductService.class
})
public class AopConfig {

}
