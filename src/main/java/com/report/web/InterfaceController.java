package com.report.web;

import com.report.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 刘东旭 on 2017/10/21.
 */
@Controller
public class InterfaceController {

    @Autowired
    private DataService dataService;

    @RequestMapping(value = "/get/{identifier}",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getStaff(@PathVariable String identifier,String jsonpCallback){
        String jsonResult = dataService.getJsonData(identifier);
        return jsonpCallback+"("+jsonResult+")";
    }
}
