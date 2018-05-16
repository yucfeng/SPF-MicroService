package com.yucfeng.model.entity;

import com.yucfeng.model.base.NodeAttribute;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Node extends NodeAttribute{

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
