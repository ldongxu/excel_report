package com.report;

import com.report.common.utils.ExcelLogs;
import com.report.common.utils.ExcelUtil;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;

/**
 * Created by 刘东旭 on 2017/8/15.
 */
public class App_Test {
    @Test
    public void testMockMethod() throws IllegalAccessException, InstantiationException, ClassNotFoundException, FileNotFoundException {

        File f=new File("/Users/liudongxu/Documents/人员测评报告系统开发-华夏基石/四个报告数据填充模板.xlsx");
        InputStream inputStream= new FileInputStream(f);

        ExcelLogs logs =new ExcelLogs();
        Collection<Map> importExcel = ExcelUtil.importExcel(Map.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs , 0);

        for(Map m : importExcel){
            System.out.println(m);
        }

    }
}
