package com.yucfeng.Entity;

public class EData {
    char start; // 边的起点
    char end;   // 边的终点
    int weight; // 边的权重

    public EData(char start, char end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
}
