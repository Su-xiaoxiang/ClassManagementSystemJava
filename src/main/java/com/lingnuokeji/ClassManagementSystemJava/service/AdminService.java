package com.lingnuokeji.ClassManagementSystemJava.service;

import com.lingnuokeji.ClassManagementSystemJava.pojo.DTO.adminEditUserDTO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.RolesVO;
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

    /**
     * 获取角色列表
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/17 0:24
     * @return List<RolesVO>
     */
    List<RolesVO> getRolesList();

    /**
     * 更新用户密码
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/17 0:48
     */
    void updateUserPassword(Integer userId);

    /**
     * 删除用户
     * @param userId 用户id
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/17 22:57
     */
    void delectUserByUserId(Integer userId);

    /**
     * 更新用户信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/18 0:21
     */
    void updateUser(adminEditUserDTO adminEditUserDTO);
}
