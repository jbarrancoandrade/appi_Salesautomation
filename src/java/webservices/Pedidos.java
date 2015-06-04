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
import dto.Deta_pedido;
import dto.alm_pedidos;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.alm_pedModel;

@Path("/Pedidos")
public class Pedidos {

    @GET
    @Path("/GetPed/{codven}/{Estado}")
    @Produces("application/json")
    public String Ped(@PathParam("codven") String codven, @PathParam("Estado") String Estado) {
        String pedidos = null;

        Estado = Estado.replace("\"", "");
        try {

            ArrayList<alm_pedidos> pData = null;
            alm_pedModel pmanager = new alm_pedModel();
            pData = pmanager.GetLisped(codven, Estado);
            Gson gson = new Gson();
            pedidos = gson.toJson(pData);

        } catch (Exception e) {
            System.out.println("Exception Error");
        }

        return pedidos;
    }

    @GET
    @Path("/GetDetPed/{codalm}/{NumPed}")
    @Produces("application/json")
    public String GetDet(@PathParam("codalm") String codalm, @PathParam("NumPed") String NumPed) {
        String dps = null;

        try {

            ArrayList<Deta_pedido> dpData = null;
            alm_pedModel pmanager = new alm_pedModel();
            dpData = pmanager.Getpedta(codalm, NumPed);
            Gson gson = new Gson();
            dps = gson.toJson(dpData);

        } catch (Exception e) {
            System.out.println("Exception Error");
        }

        return dps;
    }

    @POST
    @Path("/addProd")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_JSON)
    public alm_pedidos createPedido(alm_pedidos pedido) {
        System.out.println("pedido numero" + pedido.getNumPed());

        return pedido;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/addOrder")
    public Response addOrder() {

        System.out.println("entre aqui");
        // String id = ped.getNumPed();
        return Response.ok()
                .entity("entra por trasferencias")
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
                .build();
    }

    @POST
    @Path("/addOrder1")
    @Consumes("text/plain")
    public void postClichedMessage(String message) {
    // Store the message
        System.out.println("mensaje"+message);
    }

}
