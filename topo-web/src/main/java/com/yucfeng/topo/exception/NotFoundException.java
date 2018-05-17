package com.yucfeng.topo.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super("Not found.");
    }
}
