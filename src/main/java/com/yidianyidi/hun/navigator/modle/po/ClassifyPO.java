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
    /**
     * 分类，类型
     */
    int type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentI() {
        return parentI;
    }

    public void setParentI(Long parentI) {
        this.parentI = parentI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getGoodIcon() {
        return GoodIcon;
    }

    public void setGoodIcon(String goodIcon) {
        GoodIcon = goodIcon;
    }

    public int getCateLevel() {
        return cateLevel;
    }

    public void setCateLevel(int cateLevel) {
        this.cateLevel = cateLevel;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
