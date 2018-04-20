package com.yucfeng.entity;

public class ENode { // 链表体 与链表头组成一条链路

    int ivex;       // 该边所指向的顶点的位置
    int weight;     // 该边的权
    ENode nextEdge; // 指向下一条弧的指针

    public int getIvex() {
        return ivex;
    }

    public int getWeight() {
        return weight;
    }

    public ENode getNextEdge() {
        return nextEdge;
    }
}
