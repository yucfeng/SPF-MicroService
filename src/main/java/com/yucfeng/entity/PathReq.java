package com.yucfeng.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class PathReq {

    @Autowired
    private String src;
    @Autowired
    private String dst;
    @Autowired
    private int constraint;

    public String getSrc() {
        return src;
    }

    public String getDst() {
        return dst;
    }

    public int getConstraint() {
        return constraint;
    }
}
