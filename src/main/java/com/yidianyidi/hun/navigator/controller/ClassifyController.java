package com.yidianyidi.hun.navigator.controller;

import com.yidianyidi.hun.navigator.modle.req.ClassifyAddreq;
import com.yidianyidi.hun.navigator.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("Classify")
public class ClassifyController {
    @Autowired
    ClassifyService classifyService;

    @RequestMapping("add")
    public void addClassify(@RequestBody ClassifyAddreq classifyAddreq){

     classifyService.addClassify(classifyAddreq);
    }



}
