package com.lingnuokeji.ClassManagementSystemJava.controller.User;

import com.lingnuokeji.ClassManagementSystemJava.aop.Log;
import com.lingnuokeji.ClassManagementSystemJava.pojo.Result;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.ImgcarouselVO;
import com.lingnuokeji.ClassManagementSystemJava.service.HomePageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Result getImgCarousel() {
        log.info("执行【getImgCarousel接口】获取首页轮播图");
        List<ImgcarouselVO> imgCarousel = homePageService.getImgCarousel();
        log.info("首页轮播图获取成功");
        return Result.success(imgCarousel);
    }
}
