package com.report;

import com.report.config.AppConfig;
import com.report.config.MongoConfig;
import com.report.model.Constants;
import com.report.service.ImportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.FileNotFoundException;

/**
 * spring集成测试类
 * Created by 刘东旭 on 2017/10/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class, MongoConfig.class})
//@WebAppConfiguration
public class Spring_Test {

    @Autowired
    private ImportService importService;


    @Test
    public void importStaff() throws FileNotFoundException {
        importService.importStaff(Constants.product,1);
        importService.importStaff(Constants.technology,2);
        importService.importStaff(Constants.customer_service,3);
        importService.importStaff(Constants.product_manager,4);
        importService.importStaff(Constants.market_relation,5);
        importService.importStaff(Constants.sale,6);
        importService.importStaff(Constants.research,7);
        importService.importStaff(Constants.quality,8);
        importService.importStaff(Constants.professional_support,9);
        importService.importStaff(Constants.finance,10);
        importService.importStaff(Constants.purchase_manager,11);

    }

    @Test
    public void importFirstLineManager() throws FileNotFoundException {
        importService.importFirstLine(Constants.product,1);
        importService.importFirstLine(Constants.technology,2);
        importService.importFirstLine(Constants.customer_service,3);
        importService.importFirstLine(Constants.product_manager,4);
        importService.importFirstLine(Constants.market_relation,5);
        importService.importFirstLine(Constants.sale,6);
        importService.importFirstLine(Constants.research,7);
        importService.importFirstLine(Constants.quality,8);
        importService.importFirstLine(Constants.professional_support,9);
        importService.importFirstLine(Constants.finance,10);
        importService.importFirstLine(Constants.purchase_manager,11);

    }

    @Test
    public void importMiddleManager() throws FileNotFoundException {
        importService.importMiddleManager(Constants.product,1);
        importService.importMiddleManager(Constants.technology,2);
        importService.importMiddleManager(Constants.customer_service,3);
        importService.importMiddleManager(Constants.product_manager,4);
        importService.importMiddleManager(Constants.market_relation,5);
        importService.importMiddleManager(Constants.sale,6);
        importService.importMiddleManager(Constants.research,7);
        importService.importMiddleManager(Constants.quality,8);
        importService.importMiddleManager(Constants.professional_support,9);
        importService.importMiddleManager(Constants.finance,10);
        importService.importMiddleManager(Constants.purchase_manager,11);

    }

    @Test
    public void importReserveCadres() throws FileNotFoundException {
        importService.importReserveCadres(Constants.reserve_cadres);
    }
}
