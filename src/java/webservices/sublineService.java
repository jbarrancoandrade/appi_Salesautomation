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
import dto.subLine;
import javax.ws.rs.PathParam;
import model.sublineManeger;



@Path("/Sublineas") 
public class sublineService {
    
    @GET
    @Path("/GetSublin/{codlinea}")
    @Produces("application/json")
    public String Subline(@PathParam("codlinea") String codlinea) {
        String Subli = null;
        
        try {
            ArrayList<subLine> SubliData = null;
            sublineManeger smaManeger = new sublineManeger();
            SubliData = smaManeger.GetSubline(codlinea);
            Gson gson = new Gson();
          
           Subli = gson.toJson(SubliData);
        } catch (Exception e) {
            System.out.println("Exception Error"); //Console 
        }
       
        return Subli;
    }
    
    
    
    
}
