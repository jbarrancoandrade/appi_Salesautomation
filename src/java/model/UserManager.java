/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.connection;
import dao.dao_user;
import dto.userObject;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class UserManager {

    /**
     *
     * @return @throws Exception
     */
    public ArrayList<userObject> Getall() throws Exception {
        ArrayList<userObject> users = null;
        try {
            connection database = new connection();
            Connection connection = database.GetConnection();
            dao_user dao_user1 = new dao_user();
            users = dao_user1.Getalluser(connection);
        } catch (Exception e) {
            throw e;
        }
        return users;
    }

   
}
//----///--:::--///(9)--///
