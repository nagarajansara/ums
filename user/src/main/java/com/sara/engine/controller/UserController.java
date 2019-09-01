/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sara.engine.exception.ErrorCode;
import com.sara.engine.exception.UmsException;
import com.sara.engine.manager.impl.UserManager;
import com.sara.engine.model.User;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author suzuki
 */
@Service
public class UserController {

    UserManager userManager;

    @Autowired
    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public void addUser(String requestBody) throws UmsException {
        try {
            User user = new ObjectMapper().readValue(requestBody, User.class);
            userManager.addUser(user);
        } catch (IOException ex) {
            throw new UmsException(ErrorCode.INVALID_INPUT.getMessage(),
                    ErrorCode.INVALID_INPUT.getErrorCode());
        }
    }

}
