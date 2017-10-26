package com.report.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 刘东旭 on 2017/10/21.
 */
@Controller
public class TestController {

    @Autowired
    private MongoOperations mongoOperations;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){

        return "ok";
    }
}
