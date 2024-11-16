package com.lingnuokeji.ClassManagementSystemJava.mapper;

import com.lingnuokeji.ClassManagementSystemJava.pojo.VO.adminSelectUserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author DELL
 * @UserName 程序员_Suxiaoxiang
* @date 2024/11/16 21:04
* @Version 1.0
*/
@Mapper
public interface AdminMapper {
    /**
     * 管理员查询用户
     * @Username 程序员-Su_xiaoxiang
     * @date 2024/11/16 21:05
     * @return List<adminSelectUserVO>
     */
    List<adminSelectUserVO> adminSelectUser(Integer classId);
}
