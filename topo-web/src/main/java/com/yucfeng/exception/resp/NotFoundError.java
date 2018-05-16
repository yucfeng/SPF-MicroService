package com.yucfeng.exception.resp;

public class NotFoundError {

    private String id;
    private String message;

    public NotFoundError(String id) {
        this.id = id;
        this.message = "Resource not found.";
    }

    public NotFoundError(String id, String message) {
        this.id = id;
        this.message = message;
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
