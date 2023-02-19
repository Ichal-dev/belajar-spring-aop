package com.chaldev.belajarspringaop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class LoggingAspect {

    @Pointcut("@annotation(com.chaldev.belajarspringaop.logger.Log)")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void aspectWithAdviceBeforeCall(){
        log.info("Aspect Logging Before this Call");
    }

    @After("pointCut()")
    public void aspectWithAdviceAfterCall(){
        log.info("Aspect Logging After this Call");
    }

}
