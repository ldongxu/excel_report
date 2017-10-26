package com.report.service;

import com.report.common.utils.ExcelLogs;
import com.report.common.utils.ExcelUtil;
import com.report.domain.FirstLineManager;
import com.report.domain.MiddleManager;
import com.report.domain.ReserveCadres;
import com.report.domain.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collection;

/**
 * Created by 刘东旭 on 2017/10/26.
 */
@Service
public class ImportService {
    @Autowired
    private MongoOperations mongoOperations;

    public void importStaff(String path) throws FileNotFoundException {
        File f = new File(path);
        InputStream inputStream = new FileInputStream(f);

        ExcelLogs logs = new ExcelLogs();
        Collection<Staff> staffs = ExcelUtil.importExcel(Staff.class, 0,inputStream, "yyyy-MM-dd HH:mm:ss", logs, 0);
        for(Staff m : staffs){
            System.out.println(m);
        }
        mongoOperations.insert(staffs, Staff.class);
    }


    public void importFirstLine(String path) throws FileNotFoundException {
        File f=new File(path);
        InputStream inputStream= new FileInputStream(f);

        ExcelLogs logs =new ExcelLogs();
        Collection<FirstLineManager> firstLineManagers = ExcelUtil.importExcel(FirstLineManager.class, 1,inputStream, "yyyy-MM-dd HH:mm:ss", logs , 0);

        mongoOperations.insert(firstLineManagers,FirstLineManager.class);
    }

    public void importMiddleManager(String path) throws FileNotFoundException {

        File f=new File(path);
        InputStream inputStream= new FileInputStream(f);

        ExcelLogs logs =new ExcelLogs();
        Collection<MiddleManager> importExcel = ExcelUtil.importExcel(MiddleManager.class, 2,inputStream, "yyyy-MM-dd HH:mm:ss", logs , 0);

        for(MiddleManager m : importExcel){
            System.out.println(m);
        }
        mongoOperations.insert(importExcel,MiddleManager.class);

    }

    public void importReserveCadres(String path) throws FileNotFoundException {

        File f=new File(path);
        InputStream inputStream= new FileInputStream(f);

        ExcelLogs logs =new ExcelLogs();
        Collection<ReserveCadres> importExcel = ExcelUtil.importExcel(ReserveCadres.class, 3,inputStream, "yyyy-MM-dd HH:mm:ss", logs , 0);

        for(ReserveCadres m : importExcel){
            System.out.println(m);
        }
        mongoOperations.insert(importExcel,ReserveCadres.class);

    }
}