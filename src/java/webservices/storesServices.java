/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import com.google.gson.Gson;
import dto.ClientObject;
import dto.StoresObject;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import model.ClientManager;
import model.StoresManager;

/**
 *
 * @author jhonbarranco
 */
@Path("/Stores")
public class storesServices {
    
    @GET
    @Path("/Getstores/{codalm}")
    @Produces("application/json")
    public String Stores(@PathParam("codalm") String codalm) {
        String stores = null;
        
        try {
            ArrayList<StoresObject> storeData = null;
            StoresManager storesManager = new StoresManager();
            storeData = storesManager.Getall(codalm);
            Gson gson = new Gson();
           
            stores= gson.toJson(storeData);
        } catch (Exception e) {
            System.out.println("Exception Error"); 
        }
       
        return stores;
    }
    
    
}
