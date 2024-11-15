package com.lingnuokeji.ClassManagementSystemJava.controller.User;

import com.lingnuokeji.ClassManagementSystemJava.pojo.Result;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.StudentStatusVO;
import com.lingnuokeji.ClassManagementSystemJava.service.UserSituationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/16 0:19
 * @Version 1.0
 */
@RestController
@Slf4j
public class UserSituationController {
    @Autowired
    private UserSituationService userSituationService;

    /**
     * 查询用户上课情况
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 0:22
     * @return studentStatusVOList
     */
    @GetMapping("/getUserClassSituation")
    public Result selectUserClassSituation(@RequestParam(value = "userId") Integer userId){
        log.info("执行【getUserClassSituation】获取个人上课信息,当前用户id为：{}",userId);
        List<StudentStatusVO> studentStatusVOList = userSituationService.selectUserClassSituation(userId);
        log.info("个人上课信息获取成功");
        return Result.success(studentStatusVOList);
    }
}
