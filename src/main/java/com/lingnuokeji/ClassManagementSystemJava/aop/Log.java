package com.lingnuokeji.ClassManagementSystemJava.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/19 12:35
 * @Version 1.0
 */
@Slf4j
@Aspect
@Component
public class Log {
    @Pointcut("@annotation(com.lingnuokeji.ClassManagementSystemJava.anno.log)")
    private void log(){}

    /**
     * 日志记录-在执行方法后记录日志 用于登录验证等操作
     *
     */
    @After("log()")
    public void before(){

    }
}
