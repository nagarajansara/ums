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

}
