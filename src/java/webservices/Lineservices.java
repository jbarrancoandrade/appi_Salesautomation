/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

/**
 *
 * @author jhonbarranco
 */

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import dto.Line;
import javax.ws.rs.PathParam;
import model.LineManager;


@Path("/Lines")
public class Lineservices {
    @GET
    @Path("/GetLines")
    @Produces("application/json")
    public String Lines() {
        String line = null;
        
        try {
            ArrayList<Line> LineDat = null;
            LineManager a = new LineManager();
            LineDat = a.getLine();
            Gson gson = new Gson();
           
            line   = gson.toJson(LineDat);
        } catch (Exception e) {
            System.out.println("Exception Error"); //Console 
        }
       
        return line;
    }
    
}
