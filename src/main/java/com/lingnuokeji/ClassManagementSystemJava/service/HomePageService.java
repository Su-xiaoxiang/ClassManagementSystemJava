package com.lingnuokeji.ClassManagementSystemJava.service;

import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.CLassCommitteeVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.HomeActivitiesVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.ImgcarouselVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.studyResourcesVO;

import java.util.List;

/**
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/10/22 21:09
 * @Version 1.0
 */
public interface HomePageService {
    /**
     * 获取首页轮播图
     *
     * @return ImgcarouselVO
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/10/22 21:19
     */
    List<ImgcarouselVO> getImgCarousel(Integer classId);

    /**
     * 获取班级委员会信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/10/23 23:32
     */
    List<CLassCommitteeVO> getCLassCommittee(Integer classId);

    /**
     * 获取活动信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/10/24 0:16
     * @return  List<HomeActivitiesVO>
     */
    List<HomeActivitiesVO> getActivities(Integer classId);

    /**
     * 获取学习资源信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/14 23:32
     * @return studyResourcesVO
     */
    List<studyResourcesVO> getStudyResource(Integer classId);
}
