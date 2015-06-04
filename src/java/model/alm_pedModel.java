/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.connection;
import dao.dao_pedidos;
import dto.alm_pedidos;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class alm_pedModel {
    
    /**
     * lista ped
     * @param codven
     * @param estado
     * @return
     * @throws Exception 
     */
      public ArrayList<alm_pedidos> GetLisped(String codven,String estado) throws Exception {
        ArrayList<alm_pedidos> peds = null;
        try {
            connection database = new connection();
            Connection connection = database.GetConnection();
            dao_pedidos  dao_ped1 = new dao_pedidos();
           
                System.out.println(estado);
            
            peds = dao_ped1.GetListPed(connection, codven,estado);
        } catch (Exception e) {
            throw e;
        }
        return peds;
    }
    
}
