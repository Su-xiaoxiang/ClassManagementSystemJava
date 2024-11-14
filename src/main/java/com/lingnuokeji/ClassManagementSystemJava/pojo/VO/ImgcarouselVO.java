package com.lingnuokeji.ClassManagementSystemJava.pojo.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author DELL
 * @UserName 程序员_Suxiaoxiang
* @date 2024/10/22 21:11
* @Version 1.0
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImgcarouselVO {
   // 图片轮播id
   private  Integer imgCarouselId;
   // 图片地址
   private  String imgCarouselUrl;
   // 图片标题 1 显示 0 不显示
   private  Integer imgCarouselIsShow;
   // 班级id
   private  Integer classId;
}
