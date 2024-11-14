package com.lingnuokeji.ClassManagementSystemJava.mapper;

import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.CLassCommitteeVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.HomeActivitiesVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.ImgcarouselVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.studyResourcesVO;
import org.apache.ibatis.annotations.Mapper;

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

    List<ImgcarouselVO> getImgCarousel(Integer classId);

    /**
     * 获取班级委员会信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/10/23 23:33
     * @return List<CLassCommitteeVO>
     */
    List<CLassCommitteeVO> getCLassCommittee(Integer classId);

    /**
     * 获取活动信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/10/24 0:17
     * @return  List<HomeActivitiesVO>
     */
    List<HomeActivitiesVO> getActivities(Integer classId);

    /**
     * 获取学习资源信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/14 23:35
     * @return  List<studyResourcesVO>
     */
    List<studyResourcesVO> getStudyResources(Integer classId);
}
