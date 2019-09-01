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
public enum ReponseCode {

    GET_OK(200, "OK"),
    PUT_CREATED(201, "Creatd"), // Affected
    PUT_OK(200, "OK"), //No afffect
    POST_CREATED(201, "Creatd"),
    POST_OK(200, "OK"), //Success
    DELETE_OK(200, "OK"), //Success
    DELETE_ACCEPTED(202, "Accepted"); //Request Queued//Request Queued

    private final int code;
    private final String message;

    private ReponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
