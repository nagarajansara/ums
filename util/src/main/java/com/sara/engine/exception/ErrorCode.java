/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.exception;

/**
 *
 * @author Nagarajan R
 */
public enum ErrorCode {

    INVALID_INPUT("UMS101", "Invalid input"),
    USERNAME_EXISTS("UMS102", "Provided email id already exists"),
    NO_RECORD_FOUND("UMS103", "No records found");

    private String message;
    private String errorCode;

    private ErrorCode(String errorCode, String message) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}
