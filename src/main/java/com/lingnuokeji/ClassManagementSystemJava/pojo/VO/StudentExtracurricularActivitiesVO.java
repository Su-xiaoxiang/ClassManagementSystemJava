package com.lingnuokeji.ClassManagementSystemJava.pojo.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/16 14:23
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentExtracurricularActivitiesVO {
    // 学生活动名称
    private String studentExtracurricularActivitiesName;
    // 学生活动职务
    private String studentExtracurricularActivitiesRoles;
    // 学生活动描述
    private String studentExtracurricularActivitiesDescription;
}
