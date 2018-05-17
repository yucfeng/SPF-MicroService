package com.yucfeng.topo.exception.resp.base;

public class ResourceBaseError {

    protected String id;
    protected String message;

    public ResourceBaseError() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
