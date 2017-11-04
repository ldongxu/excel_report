package com.report.service;

import com.report.common.utils.GsonUtil;
import com.report.domain.FirstLineManager;
import com.report.domain.MiddleManager;
import com.report.domain.ReserveCadres;
import com.report.domain.Staff;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

/**
 * Created by 刘东旭 on 2017/11/4.
 */
@Service
public class DataService {
    @Autowired
    private MongoOperations mongoOperations;

    public String getJsonData(String identifier){
        if (StringUtils.isBlank(identifier)) return "";
        Criteria criteria = Criteria.where("identifier").is(identifier);
        Query query = Query.query(criteria);
        Staff staff = mongoOperations.findOne(query, Staff.class);
        if (staff!=null){
            staff.setPosition(Staff.class.getSimpleName());
            return GsonUtil.toJson(staff);
        }
        FirstLineManager firstLineManager = mongoOperations.findOne(query,FirstLineManager.class);
        if (firstLineManager!=null){
            firstLineManager.setPosition(FirstLineManager.class.getSimpleName());
            return GsonUtil.toJson(firstLineManager);
        }
        MiddleManager middleManager = mongoOperations.findOne(query,MiddleManager.class);
        if (middleManager!=null){
            middleManager.setPosition(MiddleManager.class.getSimpleName());
            return GsonUtil.toJson(middleManager);
        }
        ReserveCadres reserveCadres = mongoOperations.findOne(query,ReserveCadres.class);
        if (reserveCadres!=null){
            reserveCadres.setPosition(ReserveCadres.class.getSimpleName());
            return GsonUtil.toJson(reserveCadres);
        }
        return  "";
    }
}
