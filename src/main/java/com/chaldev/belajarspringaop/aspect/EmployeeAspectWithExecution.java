package com.chaldev.belajarspringaop.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class EmployeeAspectWithExecution {
    /*
    Note -> tambahkan type method after package name + nameMethod()
     */
    @Pointcut("execution(public void com.chaldev.belajarspringaop.service.EmployeeService.createEmployee())")
    public void logPointcutWithEmployeeExecution(){

    }

    @Before("logPointcutWithEmployeeExecution()")
    public void logMethodCallWithEmployeeAdvice(){
        log.info("In Aspect From Within");
    }
}
