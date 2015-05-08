/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.connection;
import dao.dao_Client;
import dto.ClientObject;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class ClientManager {
    
    /**
     * previously document dao
     * @param codven
     * @return
     * @throws Exception 
     */
    public ArrayList<ClientObject> Getall(String codven) throws Exception {
        ArrayList<ClientObject> feeds = null;
        try {
            connection database = new connection();
            Connection connection = database.GetConnection();
            dao_Client dao_Client1 = new dao_Client();
            feeds = dao_Client1.GetallClient(connection,codven);
        } catch (Exception e) {
            throw e;
        }
        return feeds;
    }
    
     public ClientObject GetbyId(String codven,String cedula) throws Exception {
        ClientObject client = null;
        try {
            connection database = new connection();
            Connection connection = database.GetConnection();
            dao_Client dao_Client1 = new dao_Client();
            client = dao_Client1.getclientByID(connection, codven, cedula);
        } catch (Exception e) {
            throw e;
        }
        return client;
    }

}
