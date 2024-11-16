package com.lingnuokeji.ClassManagementSystemJava.mapper;

import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.InternshipinformationVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.StudentExtracurricularActivitiesVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.StudentStatusVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/16 0:20
 * @Version 1.0
 */
@Mapper
public interface UserSituationMapper {
    /**
     * 查询学生的上课情况
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 0:26
     * @return List<StudentStatusVO>
     */
    List<StudentStatusVO> selectUserClassSituation(Integer userId);

    /**
     * 查询学生的课外活动情况
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 14:30
     * @return  List<StudentExtracurricularActivitiesVO>
     */
    List<StudentExtracurricularActivitiesVO> selectStudentExtracurricularActivities(Integer userId);

    /**
     * 查询学生实习公司
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 14:56
     * @return List<InternshipinformationVO>
     */
    List<InternshipinformationVO> selectInternshipinformationVO(Integer userId);
}
