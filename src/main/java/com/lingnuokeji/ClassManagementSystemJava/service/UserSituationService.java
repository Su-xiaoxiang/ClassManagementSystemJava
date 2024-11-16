package com.lingnuokeji.ClassManagementSystemJava.service;

import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.InternshipinformationVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.StudentExtracurricularActivitiesVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.StudentStatusVO;

import java.util.List;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/16 0:19
 * @Version 1.0
 */
public interface UserSituationService {
    /**
     * 获取用户上课情况
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 0:24
     * @return  List<StudentStatusVO>
     */
    List<StudentStatusVO> selectUserClassSituation(Integer userId);

    /**
     * 获取学生课外活动情况
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 14:27
     * @return List<StudentStatusVO>
     */
    List<StudentExtracurricularActivitiesVO> selectStudentExtracurricularActivities(Integer userId);

    /**
     * 获取学生实习信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 14:54
     * @return  List<InternshipinformationVO>
     */
    List<InternshipinformationVO> selectInternshipinformation(Integer userId);
}
