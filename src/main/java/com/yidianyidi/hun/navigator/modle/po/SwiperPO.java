package com.yidianyidi.hun.navigator.modle.po;

import lombok.Data;

import java.util.Date;

@Data
public class SwiperPO {
    /**
     * 商品id
     */
    Long id;
    /**
     * 图片url
     */
    String imageSrc;
    /**
     * 打开方式
     */
    String openType;
    /**
     * 导航链接
     */
    String navigatorUrl;
    /**
     * 创建时间
     */
     Date createTime;
    /**
     * 更新时间
     */
    Date updateTime;


}
