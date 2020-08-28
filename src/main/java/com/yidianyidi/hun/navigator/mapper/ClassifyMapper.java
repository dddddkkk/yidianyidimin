package com.yidianyidi.hun.navigator.mapper;

import com.yidianyidi.hun.navigator.modle.po.ClassifyPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClassifyMapper {
    Long add(ClassifyPO classifyPO);


}
