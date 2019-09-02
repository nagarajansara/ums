/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.dao.impl;

import com.sara.engine.exception.UmsException;
import com.sara.engine.model.User;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nagarajan R
 */
@Repository
public interface UserDAO {

    void addUser(User user) throws UmsException;

    void updateUser(User user) throws UmsException;

    void deleteUser(int id) throws UmsException;

    List<User> getUser(int startIndx, int offSet) throws UmsException;

}
