package com.lingnuokeji.ClassManagementSystemJava.pojo.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/14 23:26
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class studyResourcesVO {
    // 学习资源id
    private Integer studyResourcesId;
    // 学习资源名称
    private String studyResourcesName;
    // 学习资源类型
    private String studyResourcesUrl;
}
