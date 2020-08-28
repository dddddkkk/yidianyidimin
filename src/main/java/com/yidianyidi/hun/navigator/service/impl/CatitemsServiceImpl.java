package com.yidianyidi.hun.navigator.service.impl;

import com.yidianyidi.hun.navigator.mapper.CatitemsMapper;
import com.yidianyidi.hun.navigator.modle.resp.CatitemsQueryResp;
import com.yidianyidi.hun.navigator.service.CatitemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CatitemsServiceImpl  implements CatitemsService {
    @Autowired
    CatitemsMapper catitemsMapper;
    @Override
    public List<CatitemsQueryResp> queryAll() {
        catitemsMapper.queryAll();
        return catitemsMapper.queryAll();
    }
}
