package com.yucfeng.model.req;

import com.yucfeng.model.entity.Node;

import java.io.Serializable;
import java.util.List;

public class Constraint implements Serializable{

    private static final long serialVersionUID = 1L;

    private List<Node> includeNodes;
    private List<Node> excludeNodes;
    private int maxLoad;

    public List<Node> getIncludeNodes() {
        return includeNodes;
    }

    public void setIncludeNodes(List<Node> includeNodes) {
        this.includeNodes = includeNodes;
    }

    public List<Node> getExcludeNodes() {
        return excludeNodes;
    }

    public void setExcludeNodes(List<Node> excludeNodes) {
        this.excludeNodes = excludeNodes;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }
}
