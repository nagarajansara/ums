/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.dao.impl;

import com.sara.engine.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Nagarajan R
 */
public class UserRowMapper implements RowMapper {

    @Override
    public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setRole_id(resultSet.getInt("role_id"));
        user.setFirst_name(resultSet.getString("first_name"));
        user.setLast_name(resultSet.getString("last_name"));
        user.setEmail(resultSet.getString("email"));
        user.setGender(resultSet.getString("gender"));
        user.setMobile_no(resultSet.getString("mobile_no"));
        user.setCreated_date(resultSet.getTimestamp("created_date") + "");
        user.setUpdated_date(resultSet.getTimestamp("updated_date") + "");
        user.setStatus(resultSet.getString("status"));
        return user;
    }
}
