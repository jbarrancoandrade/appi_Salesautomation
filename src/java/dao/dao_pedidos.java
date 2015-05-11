/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.alm_pedidos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class dao_pedidos {

    /**
     * get List Ped
     *
     * @param connection
     * @param codven
     * @return
     * @throws Exception
     */
    public ArrayList<alm_pedidos> GetListPed(Connection connection, String codven) throws Exception {
        ArrayList<alm_pedidos> pedData = new ArrayList<alm_pedidos>();
        try {
            String consulta = "SELECT VEN_MaeCart.NumPed,VEN_MaeCart.FecPed,VEN_MaeCart.FecSys,\n"
                    + "       VEN_MaeCart.CodUsu,VEN_MaeCart.PC,VEN_MaeCart.Codter,cnt_terceros.nombre_com,\n"
                    + "       VEN_MaeCart.CodVen,VEN_MaeCart.CodList\n"
                    + "FROM   VEN_MaeCart\n"
                    + "LEFT   JOIN cnt_terceros ON cnt_terceros.Codter = VEN_MaeCart.Codter\n"
                    + "WHERE    VEN_MaeCart.codven='001' and VEN_MaeCart.estado='P'";

            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ahi datos ");
                alm_pedidos ped = new alm_pedidos();

               
                ped.setCodUsu(rs.getString("CodUsu"));
                ped.setCodlist(rs.getString("CodList"));
                ped.setCodter(rs.getString("Codter"));
                ped.setFecPed(rs.getDate("FecPed"));
                ped.setFecSys(rs.getDate("FecSys"));
                ped.setNombre_com(rs.getString("Nombre_com"));
                ped.setNumPed(rs.getString("NumPed"));
                ped.setPC(rs.getString("PC"));

                pedData.add(ped);

            }
            return pedData;
        } catch (Exception e) {
            throw e;
        }
    }

}
