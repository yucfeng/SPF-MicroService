package com.yucfeng.topo.exception.resp;

import com.yucfeng.topo.exception.resp.base.ResourceBaseError;

public class AlreadyExistedError extends ResourceBaseError {

    public AlreadyExistedError(String id) {
        this.id = id;
        this.message = "Resource has existed.";
    }

    public AlreadyExistedError(String id, String message) {
        this.id = id;
        this.message = message;
    }
}
