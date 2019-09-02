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
import java.util.List;
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
            User[] user = new ObjectMapper().readValue(requestBody, User[].class);
            userManager.addUser(user[0]);
        } catch (IOException ex) {
            throw new UmsException(ErrorCode.INVALID_INPUT.getMessage(),
                    ErrorCode.INVALID_INPUT.getErrorCode());
        } catch (UmsException umsException) {
            throw umsException;
        }
    }

    public void updateUser(String requestBody, int userId) throws UmsException {
        try {
            User user = new ObjectMapper().readValue(requestBody, User[].class)[0];
            user.setId(userId);
            userManager.updateUser(user);
        } catch (IOException ex) {
            throw new UmsException(ErrorCode.INVALID_INPUT.getMessage(),
                    ErrorCode.INVALID_INPUT.getErrorCode());
        } catch (UmsException umsException) {
            throw umsException;
        }
    }

    public void deleteUser(int userId) throws UmsException {
        try {
            userManager.deleteUser(userId);
        } catch (UmsException umsException) {
            throw umsException;
        }

    }

    public List<User> getUser(int startIndx, int offSet) throws UmsException {
        try {
            List<User> user = userManager.getUser(startIndx, offSet);
            return user;
        } catch (UmsException umsException) {
            throw umsException;
        }

    }
}
