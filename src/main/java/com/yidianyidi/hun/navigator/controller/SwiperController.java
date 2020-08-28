package com.yidianyidi.hun.navigator.controller;

import com.yidianyidi.hun.navigator.modle.req.SwiperQueryReq;
import com.yidianyidi.hun.navigator.modle.resp.SwiperQueryResp;
import com.yidianyidi.hun.navigator.service.SwiperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("Swiper")
public class SwiperController {
    /**
     * 轮播图查询
     */
    @Autowired
    SwiperService swiperService;
    @RequestMapping("query")
    public List<SwiperQueryResp> query(@RequestBody SwiperQueryReq swiperQueryReq){

     return swiperService.queryAll(swiperQueryReq);
    }
}
