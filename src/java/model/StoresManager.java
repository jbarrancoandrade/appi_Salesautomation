/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.connection;
import dao.dao_stores;
import dto.StoresObject;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class StoresManager {

    /**
     * 
     * @param codalm
     * @return
     * @throws Exception 
     */
    public ArrayList<StoresObject> Getall(String codalm) throws Exception {
        ArrayList<StoresObject> stores = null;
        try {
            connection database = new connection();
            Connection connection = database.GetConnection();
            dao_stores dao_stores1 = new dao_stores();
            stores = dao_stores1.GetallStore(connection, codalm);
        } catch (Exception e) {
            throw e;
        }
        return stores;
    }

}
