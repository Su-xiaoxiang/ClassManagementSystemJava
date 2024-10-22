package com.lingnuokeji.ClassManagementSystemJava.service.Impl;

import com.lingnuokeji.ClassManagementSystemJava.mapper.HomePageMapper;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.ImgcarouselVO;
import com.lingnuokeji.ClassManagementSystemJava.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/22 21:09
 * @Version 1.0
 */
@Service
public class HomePageServicelmpl implements HomePageService {
    // 注入HomePageMapper
    @Autowired
    private HomePageMapper homePageMapper;

    /**
     * 获取首页轮播图q
     *
     * @return ImgcarouselVO
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/10/22 21:19
     */
    @Override
    public List<ImgcarouselVO> getImgCarousel() {
        // 调用HomePageMapper的getImgCarousel方法
        List<ImgcarouselVO> imgcarouselVOList = homePageMapper.getImgCarousel();
        // 返回ImgcarouselVOList
        return imgcarouselVOList;
    }
}
