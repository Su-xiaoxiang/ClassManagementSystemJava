package com.lingnuokeji.ClassManagementSystemJava.pojo.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/16 14:51
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InternshipinformationVO {
    //实习公司名字
    private String internshipInformationName;
    //实习岗位
    private String internshipInformationJob;
    //实习描述
    private String internshipInformationDescription;
}
