package com.report;

import com.report.common.utils.ExcelLogs;
import com.report.common.utils.ExcelUtil;
import com.report.domain.Staff;
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

        File f=new File("E:\\四个报告数据填充模板.xlsx");
        InputStream inputStream= new FileInputStream(f);

        ExcelLogs logs =new ExcelLogs();
        Collection<Staff> importExcel = ExcelUtil.importExcel(Staff.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs , 0);

        for(Staff m : importExcel){
            System.out.println(m);
        }

    }
}
