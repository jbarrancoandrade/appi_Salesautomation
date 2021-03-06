/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

/**
 *
 * @author jhonbarranco
 * 
 * 
 */

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import model.modelConsecutivos;
import com.google.gson.Gson;
import dto.alm_pedidos;
import javax.ws.rs.PathParam;
import model.alm_pedModel;

@Path("/Pedidos")
public class Pedidos {
    
    @GET
    @Path("/GetPed/{codven}/{Estado}")
    @Produces("application/json")
    public String Ped(@PathParam("codven") String codven,@PathParam("Estado") String Estado) {
        String pedidos = null;
        
       
        try {
            
            ArrayList<alm_pedidos> pData = null;
            alm_pedModel pmanager = new alm_pedModel();
            pData = pmanager.GetLisped(codven,Estado);
            Gson gson = new Gson();
            pedidos  = gson.toJson(pData);
            
        } catch (Exception e) {
            System.out.println("Exception Error"); 
        }
       
        return pedidos;
    }
    
    
    
    
}
