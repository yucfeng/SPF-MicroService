package com.yucfeng.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super("Not found.");
    }
}
