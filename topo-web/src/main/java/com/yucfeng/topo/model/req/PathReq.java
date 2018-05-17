package com.yucfeng.topo.model.req;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class PathReq implements Serializable{


    @JsonProperty("node_1")
    private String src;
    @JsonProperty("node_2")
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
