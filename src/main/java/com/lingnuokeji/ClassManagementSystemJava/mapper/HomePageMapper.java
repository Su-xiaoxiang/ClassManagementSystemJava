package com.lingnuokeji.ClassManagementSystemJava.mapper;

import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.ImgcarouselVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/22 21:09
 * @Version 1.0
 */
@Mapper
public interface HomePageMapper {
    /**
     * 获取首页轮播图
     *
     * @return ImgcarouselVO
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/10/22 21:20
     */

    List<ImgcarouselVO> getImgCarousel();
}
