package com.report;

import com.report.config.AppConfig;
import com.report.config.MongoConfig;
import com.report.config.WebConfig;
import com.report.dao.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**spring集成测试类
 * Created by 刘东旭 on 2017/10/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class, MongoConfig.class})
//@WebAppConfiguration
public class Spring_Test {

    @Autowired
    private MongoOperations mongoOperations;

    @Test
    public void test(){
        System.out.println(mongoOperations==null);
    }
}
