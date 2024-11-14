package com.lingnuokeji.ClassManagementSystemJava.pojo.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/23 23:25
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CLassCommitteeVO {
    /* 班委姓名 */
    private String committeeName;
    /* 职务名称 */
    private String classrolesName;
    /* 班委电话 */
    private String phone;
}
