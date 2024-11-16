package com.lingnuokeji.ClassManagementSystemJava.controller.User;

import com.lingnuokeji.ClassManagementSystemJava.pojo.Result;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.InternshipinformationVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.StudentExtracurricularActivitiesVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.StudentStatusVO;
import com.lingnuokeji.ClassManagementSystemJava.service.UserSituationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
     *
     * @return studentStatusVOList
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 0:22
     */
    @GetMapping("/getUserClassSituation")
    public Result selectUserClassSituation(@RequestParam(value = "userId") Integer userId) {
        log.info("执行【getUserClassSituation】获取个人上课信息,当前用户id为：{}", userId);
        List<StudentStatusVO> studentStatusVOList = userSituationService.selectUserClassSituation(userId);
        log.info("个人上课信息获取成功");
        return Result.success(studentStatusVOList);
    }

    /**
     * 查询用户活动情况
     *
     * @return studentStatusVOList
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 14:26
     */
    @GetMapping("/getUserExtracurricularActivities")
    public Result selectStudentExtracurricularActivities(@RequestParam(value = "userId") Integer userId) {
        log.info("执行【getUserExtracurricularActivities】获取个人活动信息,当前用户id为：{}", userId);
        List<StudentExtracurricularActivitiesVO> studentExtracurricularActivitiesVOList = userSituationService.selectStudentExtracurricularActivities(userId);
        log.info("个人活动信息获取成功");
        return Result.success(studentExtracurricularActivitiesVOList);
    }

    /**
     * 查询学生实习信息
     *
     * @return InternshipinformationVOList
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 14:54
     */
    @GetMapping("/getInternshipinformation")
    public Result selectInternshipinformation(@RequestParam(value = "userId") Integer userId) {
        log.info("执行【selectInternshipinformation】获取学生实习信息,当前用户id为：{}", userId);
        List<InternshipinformationVO> internshipinformationVOList = userSituationService.selectInternshipinformation(userId);
        log.info("学生实习信息获取成功");
        return Result.success(internshipinformationVOList);
    }
}