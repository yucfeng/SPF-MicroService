package com.yucfeng.entity;

public class VNode extends Node{ // 链表头

    ENode firstEdge;    // 指向第一条依附该顶点的弧

    public ENode getFirstEdge() {
        return firstEdge;
    }
}
