/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.dao.impl;

import com.sara.engine.exception.ErrorCode;
import com.sara.engine.exception.UmsException;
import com.sara.engine.model.User;
import com.sara.query.SQLQuey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nagarajan R
 */
@Repository
public class UserDAOImpl extends UserRowMapper implements UserDAO {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public void addUser(User user) throws UmsException {
        try {
            Map namedParameters = new HashMap();
            namedParameters.put("email", user.getEmail());
            namedParameters.put("first_name", user.getFirst_name());
            namedParameters.put("last_name", user.getLast_name());
            namedParameters.put("role_id", user.getRole_id());
            namedParameters.put("mobile_no", user.getMobile_no());
            namedParameters.put("gender", user.getGender());

            namedParameterJdbcTemplate.update(SQLQuey.ADD_USER, namedParameters);

        } catch (Exception ex) {
            if (ex instanceof org.springframework.dao.DuplicateKeyException) {
                throw new UmsException(ErrorCode.USERNAME_EXISTS.getMessage(),
                        ErrorCode.USERNAME_EXISTS.getErrorCode());
            }
            throw new UmsException(ex.getMessage());
        }

    }

    @Override
    public void updateUser(User user) throws UmsException {
        try {
            Map namedParameters = new HashMap();
            namedParameters.put("first_name", user.getFirst_name());
            namedParameters.put("last_name", user.getLast_name());
            namedParameters.put("role_id", user.getRole_id());
            namedParameters.put("mobile_no", user.getMobile_no());
            namedParameters.put("gender", user.getGender());
            namedParameters.put("id", user.getId());

            namedParameterJdbcTemplate.update(SQLQuey.UPDATE_USER, namedParameters);

        } catch (Exception ex) {
            throw new UmsException(ex.getMessage());
        }

    }

    @Override
    public void deleteUser(int id) throws UmsException {
        try {
            Map namedParameters = new HashMap();
            namedParameters.put("id", id);

            namedParameterJdbcTemplate.update(SQLQuey.DELETE_USER, namedParameters);

        } catch (Exception ex) {
            throw new UmsException(ex.getMessage());
        }

    }

    @Override
    public List<User> getUser(int startIndx, int offSet) throws UmsException {
        try {
            Map namedParameters = new HashMap();
            namedParameters.put("startIndx", startIndx);
            namedParameters.put("offset", offSet);
            List<User> user = (List<User>) namedParameterJdbcTemplate.query(SQLQuey.GET_USER,
                    namedParameters, new UserRowMapper());
            return user;
        } catch (Exception ex) {
            throw new UmsException(ex.getMessage());
        }

    }
}
