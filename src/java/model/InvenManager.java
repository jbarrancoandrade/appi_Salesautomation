/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.connection;
import dao.da_invent;
import dto.AlmInvent;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class InvenManager {
    
    /**
     * 
     * @param codalm
     * @return
     * @throws Exception 
     */
      public ArrayList<AlmInvent> GetInvents(String codalm) throws Exception {
        ArrayList<AlmInvent> invents = null;
        try {
            connection database = new connection();
            Connection connection = database.GetConnection();
            da_invent   da_invent1 = new da_invent();
            invents = da_invent1.GetInvent(connection, codalm);
        } catch (Exception e) {
            throw e;
        }
        return invents;
    }
    
}
