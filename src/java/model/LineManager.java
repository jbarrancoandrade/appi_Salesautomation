/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.connection;
import dao.dao_lineas;
import dto.Line;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class LineManager {
    
    
       public ArrayList<Line> getLine() throws Exception {
        ArrayList<Line> lines= null;
        try {
            connection database = new connection();
            Connection connection = database.GetConnection();
            dao_lineas dao_lineas1 = new dao_lineas();
           
            lines= dao_lineas1.GetLineas(connection);
        } catch (Exception e) {
            throw e;
        }
        return lines;
    }
    
}
