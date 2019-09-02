/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.usercontroller;

import com.sara.engine.controller.UserController;
import com.sara.engine.exception.UmsException;
import com.sara.engine.model.User;
import com.sara.engine.response.ReponseCode;
import com.sara.engine.response.Response;
import com.sara.engine.utility.URLLists;
import com.sara.engine.utility.Utilities;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value = URLLists.GTE_USER, method = RequestMethod.GET)
    public String get(@RequestParam(value = "limit", required = false, defaultValue = "0") int limit,
            @RequestParam(value = "offset", required = false, defaultValue = "10") int offset, Model model) {
        Response response = new Response();
        try {
            List<User> user = userController.getUser(limit, offset);
            Utilities.setSuccessMessage(user,
                    ReponseCode.GET_OK, response);
        } catch (UmsException ex) {
            Utilities.setErrorMessage(ex, response, ReponseCode.GET_OK);
        }
        model.addAttribute(response);
        return "view";
    }

    @RequestMapping(value = URLLists.ADD_USER, method = RequestMethod.POST)
    public String add(@RequestBody String requestBody, Model model) {
        Response response = new Response();
        try {
            userController.addUser(requestBody);
            Utilities.setSuccessMessage(ReponseCode.POST_OK.getMessage(),
                    ReponseCode.POST_OK, response);
        } catch (UmsException ex) {
            Utilities.setErrorMessage(ex, response,
                    ReponseCode.GET_OK);
        }
        model.addAttribute(response);
        return "view";
    }

    @RequestMapping(value = URLLists.UPDATE_USER, method = RequestMethod.PUT)
    public String update(@PathVariable int id,
            @RequestBody String requestBody, Model model) {
        Response response = new Response();
        try {
            userController.updateUser(requestBody, id);
            Utilities.setSuccessMessage(ReponseCode.PUT_CREATED.getMessage(),
                    ReponseCode.PUT_CREATED, response);
        } catch (UmsException ex) {
            Utilities.setErrorMessage(ex, response, ReponseCode.PUT_OK);
        }
        model.addAttribute(response);
        return "view";
    }

    @RequestMapping(value = URLLists.DELETE_USER, method = RequestMethod.DELETE)
    public String delete(@PathVariable int id, Model model) {
        Response response = new Response();
        try {
            userController.deleteUser(id);
            Utilities.setSuccessMessage(ReponseCode.DELETE_OK.getMessage(),
                    ReponseCode.DELETE_OK, response);
        } catch (UmsException ex) {
            Utilities.setErrorMessage(ex, response, ReponseCode.DELETE_OK);
        }
        model.addAttribute(response);
        return "view";
    }

}
