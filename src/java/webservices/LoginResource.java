/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.sun.jersey.server.impl.ResponseBuilderImpl;
import dto.userObject;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import model.UserManager;

/**
 *
 * @author jhonbarranco
 */
@Path("/login")
public class LoginResource {

    @Context
    HttpServletRequest r;

    @POST
    @Path("/logina")
    //  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response login(@FormParam("username") String username, @FormParam("password") String password) throws Exception {

        Response response = getAllUsersList(username, password);
     //  
        // System.out.println(username+password);
        if (response.getStatus() != Response.Status.NOT_FOUND.getStatusCode()) {
            return response;
        }

        String token = "error";

        return Response.ok(new Gson().toJson(token)).build();
        // return false;
    }
    
 
    /*
     JSONObject json = new JSONObject();
     json.put("success", true);
     json.put("msg", "Success");
     return json.toString();

     /**
     *
     * @param username
     * @param password
     * @return
     */

    public Response getAllUsersList(String username, String password) {
        String userListData = null;
        try {
            ArrayList<userObject> userList = null;
            UserManager securityManager = new UserManager();
            userList = securityManager.Getall();
            for (userObject userVO : userList) {
                if (userVO.getUserName().equalsIgnoreCase(username)) {
                    if (userVO.getPwdweb().equals(password)) {
                        // return "Logged in User:" + username + " - " + userVO.getCodven();
                       
                       return Response.ok(new Gson().toJson(userVO.getCodven())).build();
                        // return Response.status(Response.Status.OK).build();
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("error");
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

}
