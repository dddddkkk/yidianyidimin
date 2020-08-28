package com.yidianyidi.hun.navigator.modle.resp;

import lombok.Data;

@Data
public class CatitemsQueryResp {
    /**
     * id
     */
    Long id;
    /**
     * name
     */
    String name;
    /**
     * 打开类型
     */
    String openType;
    /**
     * imageSrc
     */
    String imageSrc;
    /**
     * 导航路径
     */
    String navigatorUrl;
}
