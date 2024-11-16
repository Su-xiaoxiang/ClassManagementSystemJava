package com.lingnuokeji.ClassManagementSystemJava.service.Impl;

import com.lingnuokeji.ClassManagementSystemJava.mapper.PersonalInformationMapper;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.PersonalInformationVO;
import com.lingnuokeji.ClassManagementSystemJava.service.PersonalInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/14 23:58
 * @Version 1.0
 */
@Service
public class PersonalInformationServiceImpl implements PersonalInformationService {
    @Autowired
    private PersonalInformationMapper personalInformationMapper;

    /**
     * 获取个人信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/15 0:25
     * @return personalInformationVO
     */
    @Override
    public PersonalInformationVO getPersonalInformation(Integer userId) {
        PersonalInformationVO personalInformationVO = personalInformationMapper.getPersonalInformation(userId);
        return personalInformationVO;
    }
}
