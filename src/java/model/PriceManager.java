/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.connection;
import dao.dao_priceList;
import dto.priceList;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class PriceManager {
    
    /**
     * 
     * @param Codalm
     * @return
     * @throws Exception 
     */
     public ArrayList<priceList> getPrices(String Codalm) throws Exception {
        ArrayList<priceList> prices= null;
        try {
            connection database = new connection();
            Connection connection = database.GetConnection();
            dao_priceList dao_priceList1 = new dao_priceList();
            prices= dao_priceList1.GetListprice(connection, Codalm);
        } catch (Exception e) {
            throw e;
        }
        return prices;
    }
    
}
