/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.connection;
import dao.dao_productos;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class ProductManager {
    
    /**
     * 
     * @param tmpCodalm
     * @param tmpLtsPrecios
     * @param tmpCodLinea
     * @param tmpCodsub
     * @param cant
     * @param all
     * @return
     * @throws Exception 
     */
    public ArrayList<product> GetallProduc (String tmpCodalm, String tmpLtsPrecios, String tmpCodLinea, String tmpCodsub,int cant ,boolean all) throws Exception {
        ArrayList<product> prodc = null;
        try {
            connection database = new connection();
            Connection connection = database.GetConnection();
            dao_productos dao_prod = new dao_productos();
           
            prodc = dao_prod.GetallProduc(connection, tmpCodalm, tmpLtsPrecios, tmpCodLinea, tmpCodsub, cant, all);
        } catch (Exception e) {
            throw e;
        }
        return prodc;
    }
    
}
