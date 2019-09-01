/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.response;

/**
 *
 * @author Nagarajan R
 */
public class Response {

    private String message;
    private String code;
    private Object data;

    public Response(String responseMessage, String code, Object responseData) {
        this.message = responseMessage;
        this.code = code;
        this.data = responseData;
    }

    public Response() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
