/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.query;

/**
 *
 * @author Nagarajan R
 */
public class SQLQuey {

    public static final String ADD_USER = "INSERT INTO user (email, first_name, "
            + "last_name, role_id, mobile_no, gender) VALUES (:email, :first_name, :last_name, :role_id, :mobile_no, :gender)";
    public static final String UPDATE_USER = "UPDATE user set first_name= :first_name, "
            + "last_name = :last_name, role_id = :role_id, mobile_no = :mobile_no, gender = :gender where id = :id";
    public static final String DELETE_USER = "DELETE FROM user where id = :id";

    public static final String GET_USER = "SELECT id, email, first_name, "
            + "last_name, role_id, mobile_no, gender, created_date, updated_date, status from user LIMIT :startIndx, :offset";

}
