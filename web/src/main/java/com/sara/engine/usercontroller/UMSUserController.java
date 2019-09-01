/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.usercontroller;

import com.sara.engine.controller.UserController;
import com.sara.engine.exception.UmsException;
import com.sara.engine.response.ReponseCode;
import com.sara.engine.response.Response;
import com.sara.engine.utility.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Nagarajan R
 */
@Controller
public class UMSUserController {

    UserController userController;

    @Autowired
    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestBody String requestBody, Model model) {
        Response response = new Response();
        try {
            userController.addUser(requestBody);
            Utilities.setSuccessMessage(response, ReponseCode.POST_OK, response);
            model.addAttribute(response);
        } catch (UmsException ex) {

        }
        return "view";
    }

}
