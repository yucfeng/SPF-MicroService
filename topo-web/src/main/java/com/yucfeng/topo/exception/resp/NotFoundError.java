package com.yucfeng.topo.exception.resp;

import com.yucfeng.topo.exception.resp.base.ResourceBaseError;

public class NotFoundError extends ResourceBaseError {

    public NotFoundError(String id) {
        this.id = id;
        this.message = "Resource not found.";
    }

    public NotFoundError(String id, String message) {
        this.id = id;
        this.message = message;
    }

}
