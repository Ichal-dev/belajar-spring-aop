package com.chaldev.belajarspringaop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ValidationService {

    public void validateNumber(int argument){
        log.info(argument + " is Valid");
    }

}
