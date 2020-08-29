package com.yidianyidi.hun.navigator.service;

import com.yidianyidi.hun.navigator.modle.req.ClassifyAddreq;
import com.yidianyidi.hun.navigator.modle.resp.ClassifyQueryResp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassifyService {
    /**
     *
     * @return
     */
    Long addClassify(ClassifyAddreq classifyAddreq);
    /**
     * 查询fen
     */
    List<ClassifyQueryResp> queryList();
}
