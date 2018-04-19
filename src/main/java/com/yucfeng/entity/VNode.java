package com.yucfeng.entity;

public class VNode {
    String data;          // 顶点信息

    public String getData() {
        return data;
    }

    ENode firstEdge;    // 指向第一条依附该顶点的弧

    public ENode getFirstEdge() {
        return firstEdge;
    }
}
