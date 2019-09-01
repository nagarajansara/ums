/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.utility;

import com.sara.engine.exception.UmsException;
import com.sara.engine.response.ReponseCode;
import com.sara.engine.response.Response;

/**
 *
 * @author Nagarajan R
 */
public class Utilities {

    public static void setSuccessMessage(Object responseData,
            ReponseCode reponseCode, Response response) {

        response.setCode(reponseCode.getCode() + "");
        response.setMessage(reponseCode.getMessage());
        response.setData(responseData);

    }

    public static void setErrorMessage(Object ex, Response response) {
        if (ex instanceof UmsException) {
            UmsException umsException = (UmsException) ex;
            response.setCode(umsException.getErrorCode());
            response.setMessage(umsException.getErrorMessage());
        } else {
            Exception exception = (Exception) ex;
            response.setMessage(exception.getMessage());
            response.setCode("-1");
        }

    }

}
