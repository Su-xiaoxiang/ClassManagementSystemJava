package com.lingnuokeji.ClassManagementSystemJava.service;

import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.PersonalInformationVO;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/14 23:58
 * @Version 1.0
 */
public interface PersonalInformationService {
    /**
     * 获取个人信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/15 0:24
     * @return PersonalInformationVO
     */
    PersonalInformationVO getPersonalInformation(Integer userId);
}
