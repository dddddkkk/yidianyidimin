package com.yidianyidi.hun.navigator.service.impl;

import com.yidianyidi.hun.navigator.mapper.ClassifyMapper;
import com.yidianyidi.hun.navigator.modle.po.ClassifyPO;
import com.yidianyidi.hun.navigator.modle.req.ClassifyAddreq;
import com.yidianyidi.hun.navigator.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;

public class ClassifyServiceImpl implements ClassifyService {
    @Autowired
    ClassifyMapper classifyMapper;
    @Override
    public Long addClassify(ClassifyAddreq classifyAddreq) {
        ClassifyPO classifyPO=new ClassifyPO();
        classifyPO.setName(classifyAddreq.getName());
        Long row=classifyMapper.add(classifyPO);

        return row;
    }
}
