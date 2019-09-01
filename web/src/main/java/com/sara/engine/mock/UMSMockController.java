package com.sara.engine.mock;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.sara.engine.controller.MockController;
import com.sara.engine.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author suzuki
 */
@Controller
public class UMSMockController {

    MockController mockController;

    @Autowired
    public void setMockController(MockController mockController) {
        this.mockController = mockController;
    }

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String getStatus(Model model) {
        Response response = new Response();
        mockController.getStatus(response);
        model.addAttribute(response);
        return "view";
    }

}
