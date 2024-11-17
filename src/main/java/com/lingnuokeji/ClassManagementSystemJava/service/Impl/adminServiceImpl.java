package com.lingnuokeji.ClassManagementSystemJava.service.Impl;

import com.lingnuokeji.ClassManagementSystemJava.mapper.AdminMapper;
import com.lingnuokeji.ClassManagementSystemJava.pojo.DTO.adminEditUserDTO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.RolesVO;
import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.adminSelectUserVO;
import com.lingnuokeji.ClassManagementSystemJava.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    /**
     * 获取角色列表
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/17 0:24
     * @return List<RolesVO>
     */
    @Override
    public List<RolesVO> getRolesList() {
       return  adminMapper.getRolesList();
    }

    /**
     * 更新用户密码
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/17 0:48
     */
    @Transactional
    @Override
    public void updateUserPassword(Integer userId) {
        adminMapper.updateUserPassword(userId);
    }

    /**
     * 删除用户
     * @param userId 用户id
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/17 22:57
     */
    @Transactional
    @Override
    public void delectUserByUserId(Integer userId) {
         adminMapper.delectUserByUserId(userId);
    }

    /**
     * 更新用户信息
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/18 0:21
     */
    @Transactional
    @Override
    public void updateUser(adminEditUserDTO adminEditUserDTO) {
        if (adminEditUserDTO.getJob().matches("-?\\d+(\\.\\d+)?")){
            // 传入的是数字
             adminMapper.updateUser(adminEditUserDTO);
        }else{
            // 传入的是字符串
            RolesVO rolesVO = adminMapper.selectRoles(adminEditUserDTO);
            if (rolesVO.getRolesId()!= null){
                adminEditUserDTO.setJob(String.valueOf(rolesVO.getRolesId()));
                 adminMapper.updateUser(adminEditUserDTO);
            }
        }
    }
}
