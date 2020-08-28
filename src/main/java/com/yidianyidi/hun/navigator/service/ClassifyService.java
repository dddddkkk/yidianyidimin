package com.yidianyidi.hun.navigator.service;

import com.yidianyidi.hun.navigator.modle.req.ClassifyAddreq;
import org.springframework.stereotype.Service;

@Service
public interface ClassifyService {
    /**
     *
     * @return
     */
    Long addClassify(ClassifyAddreq classifyAddreq);
}
