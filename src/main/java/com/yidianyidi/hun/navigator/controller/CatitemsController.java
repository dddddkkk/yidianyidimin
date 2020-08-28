package com.yidianyidi.hun.navigator.controller;

import com.yidianyidi.hun.navigator.modle.resp.CatitemsQueryResp;
import com.yidianyidi.hun.navigator.service.CatitemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("Catitems")
public class CatitemsController {
    @Autowired
    CatitemsService catitemsService;


    @RequestMapping("query")
    public List<CatitemsQueryResp> query(){
        catitemsService
    }

}
