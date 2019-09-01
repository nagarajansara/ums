/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.dao.impl;

import com.sara.engine.exception.UmsException;
import com.sara.engine.model.User;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nagarajan R
 */
@Repository
public interface UserDAO {
    
    void addUser(User user) throws UmsException;
}
