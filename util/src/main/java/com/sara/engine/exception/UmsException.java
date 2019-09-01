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
public class UmsException extends Exception {

    private String errorMessage;
    private String errorCode;

    public UmsException() {

    }

    public UmsException(String message) {
        this.errorMessage = message;
    }

    public UmsException(String message, String errorCode) {
        this.errorMessage = message;
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}
