package com.yucfeng.entity;

public class Link {

    private String start; // 边的起点
    private String end;   // 边的终点
    private int weight; // 边的权重

    public Link(String start, String end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public int getWeight() {
        return weight;
    }
}
