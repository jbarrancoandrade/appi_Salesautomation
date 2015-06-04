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
import dto.ClientObject;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import model.modelConsecutivos;
import com.google.gson.Gson;
import javax.ws.rs.PathParam;

@Path("/Consecutivos")
public class Consucutivo { 

    @GET
    @Path("/GetConsecutivo/{tmpCodalm}/{tmpIDProces}/{tmpAño}/{tmpMes}/{tmpIncrementar}")
    @Produces("application/json")
    public String consecutiv(@PathParam("tmpCodalm") String tmpCodalm, @PathParam("tmpIDProces") String tmpIDProces, @PathParam("tmpAño") String tmpAño, @PathParam("tmpMes") String tmpMes, @PathParam("tmpIncrementar") boolean tmpIncrementar) {
        String consec = null;

        try {

            Gson gson = new Gson();
            modelConsecutivos mc = new modelConsecutivos();
            consec = gson.toJson(mc.Gen_consecutivos(tmpCodalm, tmpIDProces, tmpAño, tmpMes, tmpIncrementar));

        } catch (Exception e) {
            System.out.println("Exception Error"); //Console 
        }

        return consec;
    }

}
