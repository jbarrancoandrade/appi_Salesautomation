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
import model.product;
import com.google.gson.Gson;
import javax.ws.rs.PathParam;
import model.ProductManager;

/**
 *
 * @author jhonbarranco
 */
@Path("/Product") 
public class Prodservices {
    
    
    @GET
    @Path("/Getproduct/{tmpCodalm}/{tmpLtsPrecios}/{tmpCodLinea}/{tmpCodsub}/{cant}/{all}")
    @Produces("application/json")
    public String products(@PathParam("tmpCodalm") String tmpCodalm,@PathParam("tmpLtsPrecios") String tmpLtsPrecios,@PathParam("tmpCodLinea") String tmpCodLinea,@PathParam("tmpCodsub") String tmpCodsub,@PathParam("cant") int cant,@PathParam("all") boolean all) {
        String productos = null;
        
        try {
            ArrayList<product> productdata = null;
            ProductManager  proManager = new ProductManager();
            productdata = proManager.GetallProduc(tmpCodalm, tmpLtsPrecios, tmpCodLinea, tmpCodsub, cant, all);
            Gson gson = new Gson();
           
            productos = gson.toJson(productdata);
        } catch (Exception e) {
            System.out.println("Exception Error"); //Console 
        }
       
        return productos;
    }
    
    
    
}
