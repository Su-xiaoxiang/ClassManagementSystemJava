package com.lingnuokeji.ClassManagementSystemJava.pojo.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/15 0:01
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalInformationVO {
    // 姓名
    private  String personalInformationName;
    // 学号
    private  String personalInformationXueHao;
    // 班级
    private  String personalInformationClassName;
    // 职位
    private  String personalInformationJob;
    // 个人描述
    private String personalInformationDescription;
    //个人头像
    private String personalInformationImg;
}
