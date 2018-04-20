package com.yucfeng.request;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class PathReq implements Serializable{

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
