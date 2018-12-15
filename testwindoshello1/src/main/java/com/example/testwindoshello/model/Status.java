package com.example.testwindoshello.model;

import java.io.Serializable;

public class Status implements Serializable {
   private Integer code;
   private  String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
