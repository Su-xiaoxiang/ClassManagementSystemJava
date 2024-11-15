package com.lingnuokeji.ClassManagementSystemJava.pojo.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/16 0:17
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentStatusVO {
    // 课程名字
    private String courseName;
    // 上课课程状态
    private String courseStatus;
    // 课程描述
    private String courseDescription;
    // 课程状态日期
    private Date courseStatusDate;
}
