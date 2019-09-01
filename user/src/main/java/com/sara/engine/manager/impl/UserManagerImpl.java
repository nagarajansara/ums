/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.manager.impl;

import com.sara.engine.dao.impl.UserDAO;
import com.sara.engine.exception.UmsException;
import com.sara.engine.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nagarajan R
 */
@Service
public class UserManagerImpl implements UserManager {

    UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void addUser(User user) throws UmsException {
        try {
            userDAO.addUser(user);
        } catch (Exception ex) {
            throw new UmsException(ex.getMessage());
        }
    }

}
