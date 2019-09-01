/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sara.engine.controller;

import com.sara.engine.response.ReponseCode;
import com.sara.engine.response.Response;
import com.sara.engine.utility.Utilities;
import org.springframework.stereotype.Service;

/**
 *
 * @author suzuki
 */
@Service
public class MockController {

    public Response getStatus(Response response) {
        Utilities.setSuccessMessage("Pinged", ReponseCode.GET_OK, response);
        return response;
    }

}
