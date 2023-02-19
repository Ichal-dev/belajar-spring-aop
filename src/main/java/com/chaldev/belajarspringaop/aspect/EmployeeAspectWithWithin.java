package com.chaldev.belajarspringaop.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class EmployeeAspectWithWithin {

    /*
    Note -> within digunakan untuk match all joint point methods
         -> package or subpackage name after give the name class
         -> match all method .* after package name or subpackage
     */

    @Pointcut("within(com.chaldev.belajarspringaop.service.EmployeeService)")
    public void logPointcutWithEmployeeExecution(){

    }

    @Before("logPointcutWithEmployeeExecution()")
    public void logMethodCallWithEmployeeAdvice(){
        log.info("In Aspect From Execution");
    }
}
