/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;


import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import dto.AlmInvent;
import dto.ClientObject;
import dto.priceList;
import javax.ws.rs.PathParam;
import model.InvenManager;
import model.PriceManager;


/**
 *
 * @author jhonbarranco
 */
@Path("/Invent") 
public class InventServices {
    
       
     
    @GET
    @Path("/GetInvent/{codalm}")
    @Produces("application/json")
    public String client(@PathParam("codalm") String codalm) {
        String invents = null;
        
        try {
            ArrayList<AlmInvent> inventDat = null;
            InvenManager manager = new InvenManager();
            inventDat = manager.GetInvents(codalm);
            Gson gson = new Gson();
             invents  = gson.toJson(inventDat);
        } catch (Exception e) {
            System.out.println("Exception Error"); //Console 
        }
       
        return  invents;
    }
    
    
}
