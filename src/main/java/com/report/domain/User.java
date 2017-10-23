package com.report.domain;


/**
 * Created by 刘东旭 on 2017/10/21.
 */
public class User extends BaseBean{
    private String name;

    private String 姓名;

    private Integer 年纪;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名;
    }

    public Integer get年纪() {
        return 年纪;
    }

    public void set年纪(Integer 年纪) {
        this.年纪 = 年纪;
    }
}
