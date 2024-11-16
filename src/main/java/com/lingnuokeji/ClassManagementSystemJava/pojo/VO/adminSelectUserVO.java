package com.lingnuokeji.ClassManagementSystemJava.pojo.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/16 20:56
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class adminSelectUserVO {
    //学号
    private String username;
    //姓名
    private String name;
    //职位
    private String job;
    //班级
    private String className;
}
