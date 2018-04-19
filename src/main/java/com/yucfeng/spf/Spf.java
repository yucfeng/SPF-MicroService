package com.yucfeng.spf;

import com.yucfeng.entity.VNode;
import com.yucfeng.entity.ENode;

import java.util.ArrayList;
import java.util.List;

public class Spf {

    private static int UNREACHABLE = Integer.MAX_VALUE;

    private VNode[] mVexs;
    private String[] vexs;

    public Spf(VNode[] mVexs, String[] vexs){
        this.mVexs = mVexs;
        this.vexs = vexs;
    }

    public class ShortestPath {

        private String src;
        private String dst;
        private int cost;

        public ShortestPath(String src, String dst, int cost) {
            this.src = src;
            this.dst =dst;
            this.cost=cost;
        }

        public String getSrc() {
            return src;
        }

        public String getDst() {
            return dst;
        }

        public int getCost() {
            return cost;
        }
    }

    public class PathResp{

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

    public PathResp getShortestPath(int vs, int vd) {
        // flag[i]=true表示"顶点vs"到"顶点i"的最短路径已成功获取。
        boolean[] flag = new boolean[mVexs.length];
        int[] prev = new int[vexs.length];
        int[] dist = new int[vexs.length];

        // 初始化
        for (int i = 0; i < mVexs.length; i++) {
            flag[i] = false;            // 顶点i的最短路径还没获取到。
            prev[i] = 0;                // 顶点i的前驱顶点为0。
            dist[i] = getWeight(vs, i); // 顶点i的最短路径为"顶点vs"到"顶点i"的权。
        }

        // 对"顶点vs"自身进行初始化
        flag[vs] = true;
        dist[vs] = 0;

        // 遍历mVexs.length-1次；每次找出一个顶点的最短路径。
        int k = 0;
        for (int i = 1; i < mVexs.length; i++) {
            // 寻找当前最小的路径；
            // 即，在未获取最短路径的顶点中，找到离vs最近的顶点(k)。
            int min = UNREACHABLE;
            for (int j = 0; j < mVexs.length; j++) {
                if (flag[j]==false && dist[j]<min) {
                    min = dist[j];
                    k = j;
                }
            }
            // 标记"顶点k"为已经获取到最短路径
            flag[k] = true;
            if (k == vd) {
                break;
            }

            // 修正当前最短路径和前驱顶点
            // 即，当已经"顶点k的最短路径"之后，更新"未获取最短路径的顶点的最短路径和前驱顶点"。
            for (int j = 0; j < mVexs.length; j++) {
                int tmp = getWeight(k, j);
                tmp = (tmp==UNREACHABLE ? UNREACHABLE : (min + tmp)); // 防止溢出
                if (flag[j]==false && (tmp<dist[j]) )
                {
                    dist[j] = tmp;
                    prev[j] = k;
                }
            }
        }

        PathResp pathResp = new PathResp(getPassedNodes(vs, vd, prev), dist[vd]);
        return pathResp;
    }

    public List<ShortestPath> dijkstra(int vs) {
        // flag[i]=true表示"顶点vs"到"顶点i"的最短路径已成功获取。
        boolean[] flag = new boolean[mVexs.length];
        int[] prev = new int[vexs.length];
        int[] dist = new int[vexs.length];

        // 初始化
        for (int i = 0; i < mVexs.length; i++) {
            flag[i] = false;            // 顶点i的最短路径还没获取到。
            prev[i] = 0;                // 顶点i的前驱顶点为0。
            dist[i] = getWeight(vs, i); // 顶点i的最短路径为"顶点vs"到"顶点i"的权。
        }

        // 对"顶点vs"自身进行初始化
        flag[vs] = true;
        dist[vs] = 0;

        // 遍历mVexs.length-1次；每次找出一个顶点的最短路径。
        int k = 0;
        for (int i = 1; i < mVexs.length; i++) {
            // 寻找当前最小的路径；
            // 即，在未获取最短路径的顶点中，找到离vs最近的顶点(k)。
            int min = UNREACHABLE;
            for (int j = 0; j < mVexs.length; j++) {
                if (flag[j]==false && dist[j]<min) {
                    min = dist[j];
                    k = j;
                }
            }
            // 标记"顶点k"为已经获取到最短路径
            flag[k] = true;
            if (k == 0) {
                System.out.println(dist[k]);
            }

            // 修正当前最短路径和前驱顶点
            // 即，当已经"顶点k的最短路径"之后，更新"未获取最短路径的顶点的最短路径和前驱顶点"。
            for (int j = 0; j < mVexs.length; j++) {
                int tmp = getWeight(k, j);
                tmp = (tmp==UNREACHABLE ? UNREACHABLE : (min + tmp)); // 防止溢出
                if (flag[j]==false && (tmp<dist[j]) )
                {
                    dist[j] = tmp;
                    prev[j] = k;
                }
            }
        }

        // 打印dijkstra最短路径的结果
        List<ShortestPath> res = new ArrayList<>();
//        System.out.printf("dijkstra(%c): \n", mVexs[vs].getData());
        for (int i = 0; i < mVexs.length; i++) {
            System.out.printf("  shortest(%s, %s)=%d\n", mVexs[vs].getData(), mVexs[i].getData(), dist[i]);
            ShortestPath sp = new ShortestPath(mVexs[vs].getData(), mVexs[i].getData(), dist[i]);
            res.add(sp);
        }
        return res;
    }

    private int getWeight(int start, int end) {

        if (start==end)
            return 0;

        ENode node = mVexs[start].getFirstEdge();
        while (node!=null) {
            if (end==node.getIvex())
                return node.getWeight();
            node = node.getNextEdge();
        }

        return UNREACHABLE;
    }

    private List<String> getPassedNodes( int vs, int vd, int[] prev){
        List<String> res = new ArrayList<>();
        if (vs == vd) return res;
        res.add(vexs[vd]);
        while (prev[vd] != 0) {
            System.out.println(vexs[vd]);
            vd = prev[vd];
            res.add(vexs[vd]);
        }
        res.add(vexs[vs]);
        return res;
    }
}
