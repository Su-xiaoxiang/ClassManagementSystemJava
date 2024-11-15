package com.lingnuokeji.ClassManagementSystemJava;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author DELL
 */
@SpringBootApplication
@ServletComponentScan
@Slf4j
public class ClassManagementSystemJava {

    public static void main(String[] args) {
        log.info("ClassManagementSystemJava 服务器已经启动");
        SpringApplication.run(ClassManagementSystemJava.class, args);
    }

}
