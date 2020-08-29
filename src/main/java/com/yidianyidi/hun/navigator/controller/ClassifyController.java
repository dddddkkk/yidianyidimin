package com.yidianyidi.hun.navigator.controller;

import com.yidianyidi.hun.navigator.modle.req.ClassifyAddreq;
import com.yidianyidi.hun.navigator.modle.resp.ClassifyQueryResp;
import com.yidianyidi.hun.navigator.service.ClassifyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController()
@RequestMapping("Classify")
public class ClassifyController {
    @Autowired
    ClassifyService classifyService;

    @RequestMapping("add")
    public void addClassify(@RequestBody ClassifyAddreq classifyAddreq){

     classifyService.addClassify(classifyAddreq);
    }

    @RequestMapping("query")
    public List<ClassifyQueryResp> queryAll(){
        List<ClassifyQueryResp> list=classifyService.queryList();
        return list;

    }



}
