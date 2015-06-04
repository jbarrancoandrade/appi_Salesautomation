/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dto.userObject;
import java.util.ArrayList;
import javafx.application.Application;
import javax.security.auth.login.LoginException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.UserManager;

/**
 *
 * @author jhonbarranco
 */
@Path("/Users")
public class userServices {

    @GET
    @Path("/Getusers")
    @Produces("application/json")
    public String user() {
        String user = null;

        try {
            ArrayList<userObject> userData = null;
            UserManager userManager = new UserManager();
            userData = userManager.Getall();
            Gson gson = new Gson();

            
            user = gson.toJson(userData);

        } catch (Exception e) {
            System.out.println("Exception Error"); //Console 
        }

        return user;
    }
    
    
    
    /*
    sqljdc.jar
    asm-3.1.jar
    jersey-client-1.0.3.jar
    jersey-core-1.0.3.jar
    jersey-server-1.0.3.jar
    jsr311-api-1.0.jar
    gson-2.2.2.jar
    */


}
