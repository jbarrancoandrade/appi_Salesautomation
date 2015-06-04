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
import dto.priceList;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.google.gson.Gson;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import model.PriceManager;

/**
 *
 * @author jhonbarranco
 */
@Path("/Prices") 
public class PriceServices {
    
     
    @GET
    @Path("/GetPrices/{codalm}")
    @Produces("application/json")
    public String price(@PathParam("codalm") String codalm) {
        String prices = null;
        
        try {
            
            ArrayList<priceList> priceData = null;
            PriceManager priceManager = new PriceManager();
            priceData = priceManager.getPrices(codalm);
            Gson gson = new Gson();
          
            prices  = gson.toJson(priceData);
        } catch (Exception e) {
            System.out.println("Exception Error"); //Console 
        }
       
        return prices;
    }
    
    
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String ing(){
        return "salido";
    }
    
  
    
}
