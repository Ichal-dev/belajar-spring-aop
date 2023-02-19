package com.chaldev.belajarspringaop.service;

import com.chaldev.belajarspringaop.logger.Log;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProductService {

    @Log
    public void createProduct(){
        log.info("Create Product");
    }

}
