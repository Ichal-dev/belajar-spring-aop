package com.chaldev.belajarspringaop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class MahasiswaCrudAspect {
    @Before("execution(* com.chaldev.belajarspringaop.service.MahasiswaServiceImpl.create(..))")
    public void logBeforeSave(JoinPoint joinPoint){
        log.info("Mahasiswa Log Before Save : " + joinPoint.getTarget().getClass().getName());

    }

    @Around("execution(* com.chaldev.belajarspringaop.service.MahasiswaServiceImpl.create(..))")
    public Object logAroundSave(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Mahasiswa Log AroundSave: " + joinPoint.getTarget().getClass().getName());
        Object arg = joinPoint.getArgs()[0];
        joinPoint.proceed();
        log.info("Data Mahasiswa : " + arg.toString());
        return arg;
    }


    @After("execution(* com.chaldev.belajarspringaop.service.MahasiswaServiceImpl.create(..))")
    public void logAfterSave(JoinPoint joinPoint){
        log.info("Mahasiswa Log After Save : " + joinPoint.getTarget().getClass().getName());
    }

//    @AfterReturning(value = "execution(* com.chaldev.belajarspringaop.service.MahasiswaServiceImpl.create(..))", returning = "data")
//    public void logAfterReturningSave(JoinPoint joinPoint, Object data){
//        Object[] arguments= joinPoint.getArgs();
//        Object arg = arguments[0];
//        log.info("Log After Return With Data Object Operation " + arg.toString());
//    }


}
