package com.yucfeng.response;

import java.io.Serializable;
import java.util.List;

public class PathResp implements Serializable{

    private List<String> nodes;
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
