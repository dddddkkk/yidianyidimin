package com.yidianyidi.hun.navigator.service;

import com.yidianyidi.hun.navigator.modle.req.SwiperQueryReq;
import com.yidianyidi.hun.navigator.modle.resp.SwiperQueryResp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SwiperService {
    /**
     * 查询全部
     * @return
     */
    List<SwiperQueryResp> queryAll(SwiperQueryReq swiperQueryReq);
}
