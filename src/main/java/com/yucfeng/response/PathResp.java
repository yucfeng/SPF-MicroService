package com.yucfeng.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class PathResp implements Serializable{

    @JsonProperty("node_list")
    private List<String> nodes;
    @JsonProperty("cost")
    private int cost;

    public PathResp(List<String> nodes, int cost) {
        this.nodes = nodes;
        this.cost = cost;
    }

    public List<String> getNodes() {
        return nodes;
    }

    public int getCost() {
        return cost;
    }
}
