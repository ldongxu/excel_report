package com.report;

import com.report.common.utils.ExcelLogs;
import com.report.common.utils.ExcelUtil;
import com.report.domain.FirstLineManager;
import com.report.domain.MiddleManager;
import com.report.domain.ReserveCadres;
import com.report.domain.Staff;
import com.report.model.Constants;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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
    public void test() throws FileNotFoundException {
        File f = new File("/Users/liudongxu/Documents/人员测评报告系统开发-华夏基石/财务序列-修改.xlsx");
        InputStream inputStream= new FileInputStream(f);

        ExcelLogs logs =new ExcelLogs();
        Collection<Map> importExcel = ExcelUtil.importExcel(Map.class, 0,inputStream, "yyyy-MM-dd HH:mm:ss", logs , 0);

        for(Map m : importExcel){
            System.out.println(m);
        }
    }

    @Test
    public void testImportStaff() throws IllegalAccessException, InstantiationException, ClassNotFoundException, FileNotFoundException {

        File f=new File(Constants.technology);
        InputStream inputStream= new FileInputStream(f);

        ExcelLogs logs =new ExcelLogs();
        Collection<Staff> importExcel = ExcelUtil.importExcel(Staff.class, 0,inputStream, "yyyy-MM-dd HH:mm:ss", logs , 0);

        for(Staff m : importExcel){
            m.setSequence(1);
            System.out.println(m);
        }

    }

    @Test
    public void testImportFirstLine() throws IllegalAccessException, InstantiationException, ClassNotFoundException, FileNotFoundException {

        File f=new File(Constants.technology);
        InputStream inputStream= new FileInputStream(f);

        ExcelLogs logs =new ExcelLogs();
        Collection<FirstLineManager> importExcel = ExcelUtil.importExcel(FirstLineManager.class, 1,inputStream, "yyyy-MM-dd HH:mm:ss", logs , 0);

        for(FirstLineManager m : importExcel){
            System.out.println(m);
        }

    }

    @Test
    public void testImportMiddle() throws IllegalAccessException, InstantiationException, ClassNotFoundException, FileNotFoundException {

        File f=new File(Constants.technology);
        InputStream inputStream= new FileInputStream(f);

        ExcelLogs logs =new ExcelLogs();
        Collection<MiddleManager> importExcel = ExcelUtil.importExcel(MiddleManager.class, 2,inputStream, "yyyy-MM-dd HH:mm:ss", logs , 0);

        for(MiddleManager m : importExcel){
            System.out.println(m);
        }

    }

    @Test
    public void testImportReserveCadres() throws IllegalAccessException, InstantiationException, ClassNotFoundException, FileNotFoundException {

        File f=new File(Constants.reserve_cadres);
        InputStream inputStream= new FileInputStream(f);

        ExcelLogs logs =new ExcelLogs();
        Collection<ReserveCadres> importExcel = ExcelUtil.importExcel(ReserveCadres.class, 3,inputStream, "yyyy-MM-dd HH:mm:ss", logs , 0);

        for(ReserveCadres m : importExcel){
            System.out.println(m);
        }

    }



}
