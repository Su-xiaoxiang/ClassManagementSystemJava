package com.lingnuokeji.ClassManagementSystemJava.pojo.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/17 0:21
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolesVO {
    //权限ID
    private Integer rolesId;
    //权限名称
    private String rolesName;
}
