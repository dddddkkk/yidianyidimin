package com.yidianyidi.hun.navigator.mapper;

import com.yidianyidi.hun.navigator.modle.po.ClassifyPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassifyMapper {
    Long add(ClassifyPO classifyPO);
    /**
     * 查询分类树
     */
    List<ClassifyPO> queryAll();


}
