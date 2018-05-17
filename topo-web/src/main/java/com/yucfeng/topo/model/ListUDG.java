package com.yucfeng.topo.model;



public class ListUDG {

    private int mEdgNum;    // 边的数量
    private VNode[] mVexs;  // 顶点数组

    public int getmEdgNum() {
        return mEdgNum;
    }

    public VNode[] getmVexs() {
        return mVexs;
    }

    // 邻接表中表的顶点
    private class VNode {
        String data;          // 顶点信息
        ENode firstEdge;    // 指向第一条依附该顶点的弧

        public String getData() {
            return data;
        }

        public ENode getFirstEdge() {
            return firstEdge;
        }
    }

    // 邻接表中表对应的链表的节点
    private class ENode {
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

    // Link的结构体
//    private static class EData {
//        String start; // 边的起点
//        String end;   // 边的终点
//        int weight; // 边的权重
//
//        public EData(String start, String end, int weight) {
//            this.start = start;
//            this.end = end;
//            this.weight = weight;
//        }
//    }

//    public ListUDG(String[] vexs, EData[] edges) {
//
//        // 初始化"顶点数"和"边数"
//        int vlen = vexs.length;
//        int elen = edges.length;
//
//        // 初始化"顶点"
//        mVexs = new VNode[vlen];
//        for (int i = 0; i < mVexs.length; i++) {
//            mVexs[i] = new VNode();
//            mVexs[i].data = vexs[i];
//            mVexs[i].firstEdge = null;
//        }
//
//        // 初始化"边"
//        mEdgNum = elen;
//        for (int i = 0; i < elen; i++) {
//            // 读取边的起始顶点和结束顶点
//            String c1 = edges[i].getStart();
//            String c2 = edges[i].getEnd();
//            int weight = edges[i].getWeight();
//
//            // 读取边的起始顶点和结束顶点
//            int p1 = getPosition(c1);
//            int p2 = getPosition(c2);
//            // 初始化node1
//            ENode node1 = new ENode();
//            node1.ivex = p2;
//            node1.weight = weight;
//            // 将node1链接到"p1所在链表的末尾"
//            if(mVexs[p1].firstEdge == null)
//                mVexs[p1].firstEdge = node1;
//            else
//                linkLast(mVexs[p1].firstEdge, node1);
//            // 初始化node2
//            ENode node2 = new ENode();
//            node2.ivex = p1;
//            node2.weight = weight;
//            // 将node2链接到"p2所在链表的末尾"
//            if(mVexs[p2].firstEdge == null)
//                mVexs[p2].firstEdge = node2;
//            else
//                linkLast(mVexs[p2].firstEdge, node2);
//        }
//    }

    /*
     * 返回ch位置
     */
    private int getPosition(String ch) {
        for(int i=0; i<mVexs.length; i++)
            if(mVexs[i].data==ch)
                return i;
        return -1;
    }

    /*
     * 将node节点链接到list的最后
     */
    private void linkLast(ENode list, ENode node) {
        ENode p = list;
        while(p.nextEdge!=null)
            p = p.nextEdge;
        p.nextEdge = node;
    }
}
