package com.yidianyidi.hun.navigator.mapper;

import com.yidianyidi.hun.navigator.modle.resp.SwiperQueryResp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SwiperMapper {
    /**
     * 查询
     *
     * @return
     */
    List<SwiperQueryResp> query();
}
