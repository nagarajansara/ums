/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.manager.impl;

import com.sara.engine.dao.impl.UserDAO;
import com.sara.engine.exception.ErrorCode;
import com.sara.engine.exception.UmsException;
import com.sara.engine.model.User;
import java.util.List;
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
        } catch (UmsException ex) {
            throw ex;
        }
    }

    @Override
    public void updateUser(User user) throws UmsException {
        try {
            userDAO.updateUser(user);
        } catch (UmsException ex) {
            throw ex;
        }
    }

    @Override
    public void deleteUser(int id) throws UmsException {
        try {
            userDAO.deleteUser(id);
        } catch (UmsException ex) {
            throw ex;
        }
    }

    @Override
    public List<User> getUser(int startIndx, int offSet) throws UmsException {
        try {
            List<User> user = userDAO.getUser(startIndx, offSet);
            if (user == null || user.isEmpty()) {
                throw new UmsException(ErrorCode.NO_RECORD_FOUND.getMessage(),
                        ErrorCode.NO_RECORD_FOUND.getErrorCode());
            }
            return user;
        } catch (UmsException ex) {
            throw ex;
        }
    }

}
