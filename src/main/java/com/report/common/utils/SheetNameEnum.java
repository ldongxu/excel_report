package com.report.common.utils;

import com.report.domain.*;

/**
 * sheet名和对应的bean
 *
 * Created by 刘东旭 on 2017/10/23.
 */
public enum SheetNameEnum {
    STAFF(Staff.class,"普通员工数据模版"),
    FIRST_LINE_MANAGER(FirstLineManager.class,"基层管理数据模版"),
    MIDDLE_MANAGER(MiddleManager.class,"中层管理数据模版"),
    RESERVE_CADRES(ReserveCadres.class,"后备干部数据模版");

    private Class<?> beanClass;
    private String name;

    public static SheetNameEnum getByName(String name){
        for (SheetNameEnum sheetNameEnum:SheetNameEnum.values()){
            if (name.equals(sheetNameEnum.getName())){
                return sheetNameEnum;
            }
        }
        throw new IllegalArgumentException("命名为"+name+"的sheet对应的bean未定义");
    }

    public static Class getClass(String name){
        return getByName(name).getBeanClass();
    }
    SheetNameEnum(Class beanClass, String name) {
        this.beanClass = beanClass;
        this.name = name;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
