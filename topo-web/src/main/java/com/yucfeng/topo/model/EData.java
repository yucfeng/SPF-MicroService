package com.yucfeng.topo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class EData implements Serializable{

    private static final long serialVersionUID = -1L;

//    private Long id;
    @JsonProperty("src_node")
    private String start;
    @JsonProperty("src_node")
    private String end;
    @JsonProperty("cost")
    private Integer weight;

    public EData(){}

    public EData(String start, String end, Integer weight) {
//        this.id = id;Long id,
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

//    public Long getId() {
//        return id;
//    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public Integer getWeight() {
        return weight;
    }
}
