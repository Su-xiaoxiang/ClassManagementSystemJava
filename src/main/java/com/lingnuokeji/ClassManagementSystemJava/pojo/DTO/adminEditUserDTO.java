package com.lingnuokeji.ClassManagementSystemJava.pojo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/18 0:15
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class adminEditUserDTO {
    // 用户ID
    private Integer id;
    // 用户姓名
    private String name;
    // 权限ID
    private String job;

}
