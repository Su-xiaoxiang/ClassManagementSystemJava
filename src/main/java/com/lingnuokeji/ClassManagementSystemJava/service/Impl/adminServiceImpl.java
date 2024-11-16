package com.lingnuokeji.ClassManagementSystemJava.service.Impl;

import com.lingnuokeji.ClassManagementSystemJava.mapper.AdminMapper;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.adminSelectUserVO;
import com.lingnuokeji.ClassManagementSystemJava.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DELL
 * @UserName 程序员_Suxiaoxiang
 * @date 2024/11/16 20:55
 * @Version 1.0
 */
@Service
public class adminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    /**
     * 管理员查询用户信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 21:02
     * @return List<adminSelectUserVO>
     */
    @Override
    public List<adminSelectUserVO> adminSelectUser(Integer classId) {
        List<adminSelectUserVO> adminSelectUserVOlist = adminMapper.adminSelectUser(classId);
        return adminSelectUserVOlist;
    }
}
