package com.chaldev.belajarspringaop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class ValidationAspect {

    @Pointcut("within(com.chaldev.belajarspringaop.service.ValidationService)")
    public void validationPointcut(){

    }

    @Around("validationPointcut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("In Around From Aspect");

        int arg = (int) joinPoint.getArgs()[0];
        if(arg < 0){
            throw new RuntimeException("Argument should not be negative");
        } else {
            joinPoint.proceed();
        }

    }


}
