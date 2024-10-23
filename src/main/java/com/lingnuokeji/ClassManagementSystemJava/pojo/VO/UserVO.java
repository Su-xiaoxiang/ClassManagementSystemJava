package com.lingnuokeji.ClassManagementSystemJava.pojo.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
    private String id;// 用户序号
    private String username; //用户名
    private String password; //密码
    private String roles; // 用户权限
    private Integer classId; // 班级序号
}
