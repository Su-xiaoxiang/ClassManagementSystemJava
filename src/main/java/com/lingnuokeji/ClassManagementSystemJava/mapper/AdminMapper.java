package com.lingnuokeji.ClassManagementSystemJava.mapper;

import com.lingnuokeji.ClassManagementSystemJava.pojo.DTO.adminEditUserDTO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.RolesVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.adminSelectUserVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/16 21:04
 * @Version 1.0
 */
@Mapper
public interface AdminMapper {
    /**
     * 管理员查询用户
     *
     * @return List<adminSelectUserVO>
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 21:05
     */
    List<adminSelectUserVO> adminSelectUser(Integer classId);

    /**
     * 获取权限列表
     *
     * @return List<RolesVO>
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/17 0:24
     */
    List<RolesVO> getRolesList();

    /**
     * 更新用户密码
     *
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/17 0:48
     */
    void updateUserPassword(Integer userId);

    /**
     * 删除用户
     *
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/17 22:57
     */
    @Delete("delete from user where id = #{userId}")
    void delectUserByUserId(Integer userId);

    /**
     * 更新用户信息
     *
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/18 0:21
     */
    void updateUser(adminEditUserDTO adminEditUserDTO);

    /**
     * 通过ID或者名字进行查询权限
     * @return RolesVO
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/18 1:09
     */
    RolesVO selectRoles(adminEditUserDTO adminEditUserDTO);
}
