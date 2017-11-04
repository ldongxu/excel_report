package com.report.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by 刘东旭 on 2017/10/21.
 */
public class BaseBean {
    @Id
    private String id;

    private String position;//职位

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
