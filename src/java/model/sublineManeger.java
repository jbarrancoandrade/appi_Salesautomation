/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.connection;
import dao.dao_Client;
import dao.dao_sublines;
import dto.ClientObject;
import dto.subLine;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class sublineManeger {
    
    
    

    public ArrayList<subLine> GetSubline(String codLine) throws Exception {
        ArrayList<subLine> subline = null;
        try {
            connection database = new connection();
            Connection connection = database.GetConnection();
            dao_sublines dao_sublines1  = new dao_sublines();
            subline = dao_sublines1.GetSubline(connection, codLine);
        } catch (Exception e) {
            throw e;
        }
        return subline;
    }

}
