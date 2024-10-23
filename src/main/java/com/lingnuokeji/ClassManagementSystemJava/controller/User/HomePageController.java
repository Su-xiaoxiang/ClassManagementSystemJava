package com.lingnuokeji.ClassManagementSystemJava.controller.User;

import com.lingnuokeji.ClassManagementSystemJava.pojo.Result;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.CLassCommitteeVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.HomeActivitiesVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.ImgcarouselVO;
import com.lingnuokeji.ClassManagementSystemJava.service.HomePageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;
import java.util.List;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/22 21:08
 * @Version 1.0
 */
@RestController
@Slf4j
public class HomePageController {
    @Autowired
    private HomePageService homePageService;

    /**
     * 获取首页轮播图
     *
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/10/22 21:13
     */
    @GetMapping("/getImgCarousel")
    public Result getImgCarousel(@RequestParam(value = "classId") Integer classId) {
        log.info("执行【getImgCarousel接口】获取首页轮播图,当前班级id为：{}",classId);
        List<ImgcarouselVO> imgCarousel = homePageService.getImgCarousel(classId);
        log.info("首页轮播图获取成功");
        return Result.success(imgCarousel);
    }

    /**
     *  获取班委信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/10/23 23:27
     */
    @GetMapping("/getCLassCommittee")
    public Result getCLassCommittee(@RequestParam(value = "classId") Integer classId){
        log.info("执行【getCLassCommittee接口】获取班委成员,当前班级id为：{}",classId);
        List<CLassCommitteeVO> CLassCommittee = homePageService.getCLassCommittee(classId);
        log.info("班委成员获取成功");
        return Result.success(CLassCommittee);
    }

    /**
     *  获取活动信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/10/24 0:13
     */
    @GetMapping("/getActivities")
    public Result getActivities(@RequestParam(value = "classId") Integer classId){
        log.info("执行【getActivities接口】获取活动信息,当前班级id为：{}",classId);
        List<HomeActivitiesVO> activities = homePageService.getActivities(classId);
        log.info("活动信息获取成功");
        return Result.success(activities);
    }
}
