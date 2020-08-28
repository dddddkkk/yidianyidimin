package com.yidianyidi.hun.navigator.mapper;

import com.yidianyidi.hun.navigator.modle.resp.CatitemsQueryResp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CatitemsMapper {
    /**
     * 查询全部
     */
    List<CatitemsQueryResp> queryAll();

}
