package com.yidianyidi.hun.navigator.service;

import com.yidianyidi.hun.navigator.modle.resp.CatitemsQueryResp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CatitemsService {

    /**
     * 查询功能
     */
    List<CatitemsQueryResp> queryAll();
}
