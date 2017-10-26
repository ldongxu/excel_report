package com.report;

import com.report.config.AppConfig;
import com.report.config.MongoConfig;
import com.report.service.ImportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.FileNotFoundException;

/**spring集成测试类
 * Created by 刘东旭 on 2017/10/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class, MongoConfig.class})
//@WebAppConfiguration
public class Spring_Test {

    @Autowired
    private MongoOperations mongoOperations;
    @Autowired
    private ImportService importService;

    @Test
    public void test(){
        System.out.println(mongoOperations==null);
    }

    @Test
    public void testImport() throws FileNotFoundException {
        importService.importStaff("/Users/liudongxu/Documents/人员测评报告系统开发-华夏基石/四个报告数据填充模板.xlsx");
    }
}
