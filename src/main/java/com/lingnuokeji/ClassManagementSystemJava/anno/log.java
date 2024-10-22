package com.lingnuokeji.ClassManagementSystemJava.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* @UserName 程序员_Suxiaoxiang
* @date 2024/10/19 9:55
* @Version 1.0
*/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface log {
}
