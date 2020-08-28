package com.yidianyidi.hun.navigator.modle.po;

import lombok.Data;

import java.util.Date;



/**
 * 分类po
 */
@Data
public class ClassifyPO {

    /**
     * id
     */
    Long id;
    /**
     * parentId
     */
    Long parentI;
    /**
     * name；
     */
    String name;

    /**
     * 创建时间
     */
    Date createTime;
    /**
     * 更新时间
     */
    Date updateTime;

    /**
     * 图形路径
     * @return
     */
    String GoodIcon;
    /**
     * 分类等级
     */
    int cateLevel;


}
