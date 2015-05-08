/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import dto.ClientObject;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import model.ClientManager;
import com.google.gson.Gson;
import javax.ws.rs.PathParam;

/**
 *
 * @author jhonbarranco
 */
@Path("/Customers") 
public class clientSercives {

    
    @GET
    @Path("/Getcustomers/{codven}")
    @Produces("application/json")
    public String client(@PathParam("codven") String codven) {
        String customers = null;
        
        try {
            ArrayList<ClientObject> clientData = null;
            ClientManager clientManager = new ClientManager();
            clientData = clientManager.Getall(codven);
            Gson gson = new Gson();
            System.out.println(gson.toJson(clientData));
            customers = gson.toJson(clientData);
        } catch (Exception e) {
            System.out.println("Exception Error"); //Console 
        }
       
        return customers;
    }
    
    @GET
    @Path("/Getcustomers/{codven}/{cedula}")
    @Produces("application/json")
    public String clientbyid(@PathParam("codven") String codven, @PathParam("cedula") String cedula) {
        String customers = null;
        
        try {
            ClientObject clientData = null;
            ClientManager clientManager = new ClientManager();
            clientData = clientManager.GetbyId(codven, cedula);
            Gson gson = new Gson();
            System.out.println(gson.toJson(clientData));
            customers = gson.toJson(clientData);
        } catch (Exception e) {
            System.out.println("Exception Error"); //Console 
        }
       
        return customers;
    }
    
    

}
