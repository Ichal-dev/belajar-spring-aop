package com.chaldev.belajarspringaop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EmployeeService {

    public void createEmployee(){
        log.info("Create Employee");
    }

}
