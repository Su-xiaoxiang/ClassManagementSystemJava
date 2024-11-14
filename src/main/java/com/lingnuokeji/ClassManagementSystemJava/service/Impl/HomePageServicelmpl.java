package com.lingnuokeji.ClassManagementSystemJava.service.Impl;

import com.lingnuokeji.ClassManagementSystemJava.mapper.HomePageMapper;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.CLassCommitteeVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.HomeActivitiesVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.ImgcarouselVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.studyResourcesVO;
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
    public List<ImgcarouselVO> getImgCarousel(Integer classId) {
        // 调用HomePageMapper的getImgCarousel方法
        List<ImgcarouselVO> imgcarouselVOList = homePageMapper.getImgCarousel(classId);
        // 返回ImgcarouselVOList
        return imgcarouselVOList;
    }

    /**
     * 获取班级委员会信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/10/23 23:32
     * @return CLassCommitteeVO
     */
    @Override
    public List<CLassCommitteeVO> getCLassCommittee(Integer classId) {
        // 调用HomePageMapper的getCLassCommittee方法
        List<CLassCommitteeVO> classCommitteeVOList = homePageMapper.getCLassCommittee(classId);
        // 返回CLassCommitteeVOList
        return classCommitteeVOList;
    }

    /**
     * 获取近期活动信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/10/24 0:16
     * @return  List<HomeActivitiesVO>
     */
    @Override
    public List<HomeActivitiesVO> getActivities(Integer classId) {
        // 调用HomePageMapper的getActivities方法
        List<HomeActivitiesVO> homeActivitiesVOList = homePageMapper.getActivities(classId);
        // 返回HomeActivitiesVOList
        return homeActivitiesVOList;
    }

    /**
     * 获取学习资源
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/14 23:34
     * @return List<studyResourcesVO>
     */
    @Override
    public List<studyResourcesVO> getStudyResource(Integer classId) {
        // 调用HomePageMapper的getStudyResources方法
        List<studyResourcesVO> studyResourcesVOList = homePageMapper.getStudyResources(classId);
        // 返回studyResourcesVOList
        return studyResourcesVOList;
    }
}
