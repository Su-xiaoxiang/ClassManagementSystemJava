package com.lingnuokeji.ClassManagementSystemJava.controller.admin;

import com.lingnuokeji.ClassManagementSystemJava.pojo.DTO.adminEditUserDTO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.Result;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.RolesVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.adminSelectUserVO;
import com.lingnuokeji.ClassManagementSystemJava.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.util.List;
/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/16 20:54
 * @Version 1.0
 */
@RestController
@Slf4j
public class adminController {
    @Autowired
    private AdminService adminService;

    /**
     * 管理员查询用户信息
     *
     * @return adminSelectUserVOList
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 20:59
     */
    @GetMapping("/admin/selectUser")
    public Result adminSelectUser(@RequestParam(value = "classId") Integer classId) {
        log.info("执行【/admin/selectUser接口】获取班级成员,当前班级id为：{}", classId);
        List<adminSelectUserVO> adminSelectUserVOList = adminService.adminSelectUser(classId);
        log.info("获取班级成员成功");
        return Result.success(adminSelectUserVOList);
    }

    /**
     * 管理员获取角色列表
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/17 0:40
     * @return List<RolesVO>
     */
    @GetMapping("/admin/getRolesList")
    public Result getRolesList() {
        log.info("执行【/admin/getRolesList接口】获取角色列表");
        List<RolesVO> rolesList = adminService.getRolesList();
        log.info("获取角色列表成功");
        return Result.success(rolesList);
    }

    /**
     * 初始化用户密码
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/17 0:47
     */
    @GetMapping("/admin/updateUserPassword")
    public Result updateUserPassword(@RequestParam(value = "userId") Integer userId){
        log.info("执行【/admin/updateUserPassword接口】修改用户密码,当前用户id为：{}", userId);
        adminService.updateUserPassword(userId);
        log.info("修改用户密码成功");
        return Result.success();
    }

    /**
     * param userId 用户id
     * 管理员删除用户
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/17 22:53
     */
    @DeleteMapping("/admin/delectUserByUserId")
    public Result delectUserByUserId(@RequestParam(value = "userId") Integer userId){
        log.info("执行【/admin/delectUserByUserId接口】删除用户,当前用户id为：{}", userId);
        adminService.delectUserByUserId(userId);
        log.info("删除用户成功");
        return Result.success();
    }

    /**
     * 管理员修改用户信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/18 0:18
     */
    @PostMapping("/admin/updateUser")
    public Result updateUser(@RequestBody adminEditUserDTO adminEditUserDTO){
        log.info("执行【/admin/updateUser接口】编辑用户,当前用户id属性为：{}", adminEditUserDTO);
       adminService.updateUser(adminEditUserDTO);
        log.info("编辑用户成功");
        return Result.success();
    }
}