package com.lingnuokeji.ClassManagementSystemJava.service;

import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.adminSelectUserVO;

import java.util.List;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/16 20:55
 * @Version 1.0
 */
public interface AdminService {
    /**
     * 管理员查询用户
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 21:02
     * @return   List<adminSelectUserVO>
     */
    List<adminSelectUserVO> adminSelectUser(Integer classId);
}
