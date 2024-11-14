package com.lingnuokeji.ClassManagementSystemJava.controller.User;

import com.lingnuokeji.ClassManagementSystemJava.pojo.Result;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.PersonalInformationVO;
import com.lingnuokeji.ClassManagementSystemJava.service.PersonalInformationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/14 23:57
 * @Version 1.0
 */
@RestController
@Slf4j
public class PersonalInformationController {
    @Autowired
    private PersonalInformationService personalInformationService;

    /**
     * 获取个人信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/15 0:22
     * @return personalInformationVO
     */
    @GetMapping("/getPersonalInformation")
    public Result getPersonalInformation(@RequestParam(value = "userId") Integer userId){
        log.info("执行【getPersonalInformation】获取个人信息,当前用户id为：{}",userId);
        PersonalInformationVO personalInformationVO = personalInformationService.getPersonalInformation(userId);
        log.info("个人信息获取成功");
        return Result.success(personalInformationVO);
    }
}
