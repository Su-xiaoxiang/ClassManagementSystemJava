package com.lingnuokeji.ClassManagementSystemJava.controller.admin;

import com.lingnuokeji.ClassManagementSystemJava.pojo.Result;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.adminSelectUserVO;
import com.lingnuokeji.ClassManagementSystemJava.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
     *  管理员查询用户信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 20:59
     * @return adminSelectUserVOList
     */
    @GetMapping("/admin/selectUser")
   public Result adminSelectUser(@RequestParam(value = "classId") Integer classId){
        log.info("执行【/admin/selectUser接口】获取班级成员,当前班级id为：{}",classId);
        List<adminSelectUserVO> adminSelectUserVOList = adminService.adminSelectUser(classId);
        log.info("获取班级成员成功");
        return Result.success(adminSelectUserVOList);
   }
}
