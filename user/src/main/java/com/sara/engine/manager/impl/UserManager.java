/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.manager.impl;

import com.sara.engine.exception.UmsException;
import com.sara.engine.model.User;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nagarajan R
 */
@Service
public interface UserManager {

    void addUser(User user) throws UmsException;

    void updateUser(User user) throws UmsException;

    void deleteUser(int id) throws UmsException;

    List<User> getUser(int startIndx, int offSet) throws UmsException;
}
