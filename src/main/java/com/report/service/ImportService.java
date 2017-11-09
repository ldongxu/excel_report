package com.report.service;

import com.report.common.utils.ExcelLog;
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
import java.util.List;

/**
 * Created by 刘东旭 on 2017/10/26.
 */
@Service
public class ImportService {
    @Autowired
    private MongoOperations mongoOperations;

    public void importStaff(String path, Integer sequence) throws FileNotFoundException {
        File f = new File(path);
        InputStream inputStream = new FileInputStream(f);

        ExcelLogs logs = new ExcelLogs();
        Collection<Staff> staffs = ExcelUtil.importExcel(Staff.class, 0, inputStream, "yyyy-MM-dd HH:mm:ss", logs, 0);
        for (Staff m : staffs) {
            m.setSequence(sequence);
            System.out.println(m);
        }
        if (logs.getHasError()){
            List<ExcelLog> list= logs.getErrorLogList();
            for (ExcelLog log:list){
                System.out.println(log.getRowNum()+":"+log.getLog());
            }
        }
        mongoOperations.insert(staffs, Staff.class);
    }


    public void importFirstLine(String path, Integer sequence) throws FileNotFoundException {
        File f = new File(path);
        InputStream inputStream = new FileInputStream(f);

        ExcelLogs logs = new ExcelLogs();
        Collection<FirstLineManager> firstLineManagers = ExcelUtil.importExcel(FirstLineManager.class, 1, inputStream, "yyyy-MM-dd HH:mm:ss", logs, 0);
        for (FirstLineManager firstLineManager : firstLineManagers) {
            firstLineManager.setSequence(sequence);
            System.out.println(firstLineManager);
        }
        if (logs.getHasError()){
            List<ExcelLog> list= logs.getErrorLogList();
            for (ExcelLog log:list){
                System.out.println(log.getRowNum()+":"+log.getLog());
            }
        }
        mongoOperations.insert(firstLineManagers, FirstLineManager.class);
    }

    public void importMiddleManager(String path, Integer sequence) throws FileNotFoundException {

        File f = new File(path);
        InputStream inputStream = new FileInputStream(f);

        ExcelLogs logs = new ExcelLogs();
        Collection<MiddleManager> importExcel = ExcelUtil.importExcel(MiddleManager.class, 2, inputStream, "yyyy-MM-dd HH:mm:ss", logs, 0);

        for (MiddleManager m : importExcel) {
            m.setSequence(sequence);
            System.out.println(m);
        }
        if (logs.getHasError()){
           List<ExcelLog> list= logs.getErrorLogList();
           for (ExcelLog log:list){
               System.out.println(log.getRowNum()+":"+log.getLog());
           }
        }
        mongoOperations.insert(importExcel, MiddleManager.class);

    }

    public void importReserveCadres(String path) throws FileNotFoundException {

        File f = new File(path);
        InputStream inputStream = new FileInputStream(f);

        ExcelLogs logs = new ExcelLogs();
        Collection<ReserveCadres> importExcel = ExcelUtil.importExcel(ReserveCadres.class, 0, inputStream, "yyyy-MM-dd HH:mm:ss", logs, 0);

        for (ReserveCadres m : importExcel) {
            System.out.println(m);
        }
        if (logs.getHasError()){
            List<ExcelLog> list= logs.getErrorLogList();
            for (ExcelLog log:list){
                System.out.println(log.getRowNum()+":"+log.getLog());
            }
        }
        mongoOperations.insert(importExcel, ReserveCadres.class);

    }
}