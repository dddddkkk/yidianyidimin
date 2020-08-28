package com.yidianyidi.hun.navigator.service.impl;

import com.yidianyidi.hun.navigator.mapper.SwiperMapper;
import com.yidianyidi.hun.navigator.modle.req.SwiperQueryReq;
import com.yidianyidi.hun.navigator.modle.resp.SwiperQueryResp;
import com.yidianyidi.hun.navigator.service.SwiperService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SwiperServiceImpl implements SwiperService {

    @Autowired
    SwiperMapper swiperMapper;
    public List<SwiperQueryResp> queryAll(SwiperQueryReq swiperQueryReq) {
        return swiperMapper.query();
    }

}
