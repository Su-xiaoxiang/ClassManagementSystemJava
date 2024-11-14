package com.lingnuokeji.ClassManagementSystemJava.mapper;

import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.PersonalInformationVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/14 23:59
 * @Version 1.0
 */
@Mapper
public interface PersonalInformationMapper {

    /**
     * 获取个人信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/15 0:26
     * @return getPersonalInformation
     */
    PersonalInformationVO getPersonalInformation(Integer userId);
}
