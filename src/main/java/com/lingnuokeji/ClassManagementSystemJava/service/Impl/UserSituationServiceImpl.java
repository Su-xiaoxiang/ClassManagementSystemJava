package com.lingnuokeji.ClassManagementSystemJava.service.Impl;

import com.lingnuokeji.ClassManagementSystemJava.mapper.UserSituationMapper;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.InternshipinformationVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.StudentExtracurricularActivitiesVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.StudentStatusVO;
import com.lingnuokeji.ClassManagementSystemJava.service.UserSituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/16 0:20
 * @Version 1.0
 */
@Service
public class UserSituationServiceImpl  implements UserSituationService {
    @Autowired
    private UserSituationMapper userSituationMapper;
    /**
     * 根据用户id查询学生上课情况
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 0:24
     * @return List<StudentStatusVO>
     */
    @Override
    public List<StudentStatusVO> selectUserClassSituation(Integer userId) {
        List<StudentStatusVO> studentStatusVOList =  userSituationMapper.selectUserClassSituation(userId);
        return studentStatusVOList;
    }

    /**
     * 获取用户课外活动情况
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 14:28
     * @return List<StudentStatusVO>
     */
    @Override
    public List<StudentExtracurricularActivitiesVO> selectStudentExtracurricularActivities(Integer userId) {
        List<StudentExtracurricularActivitiesVO> studentExtracurricularActivitiesVOList =  userSituationMapper.selectStudentExtracurricularActivities(userId);
        return studentExtracurricularActivitiesVOList;
    }

    /**
     * 获取用户实习信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 14:55
     * @return List<InternshipinformationVO>
     */
    @Override
    public List<InternshipinformationVO> selectInternshipinformation(Integer userId) {
        List<InternshipinformationVO> internshipinformationVOList =  userSituationMapper.selectInternshipinformationVO(userId);
        return internshipinformationVOList;
    }
}
