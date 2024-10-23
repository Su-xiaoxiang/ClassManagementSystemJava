package com.lingnuokeji.ClassManagementSystemJava.pojo.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @UserName 程序员_Suxiaoxiang
* @date 2024/10/22 21:11
* @Version 1.0
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImgcarouselVO {
   private  Integer ImgCarouselId; // 图片轮播id
   private  String ImgCarouselUrl; // 图片地址
   private  Integer ImgCarouselIsShow; // 图片标题 1 显示 0 不显示
   private  Integer classId; // 班级id
}
