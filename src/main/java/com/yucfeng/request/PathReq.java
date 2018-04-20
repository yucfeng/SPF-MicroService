package com.yucfeng.request;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class PathReq implements Serializable{

    private String src;
    private String dst;
    private Constraint constraint;

    public String getSrc() {
        return src;
    }

    public String getDst() {
        return dst;
    }

    public Constraint getConstraint() {
        return constraint;
    }
}
