/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.connection;
import dao.dao_consecutivos;
import java.sql.Connection;

/**
 *
 * @author jhonbarranco
 */
public class modelConsecutivos {

    /**
     * Medodo intermedio para el consecutivo general
     * @param tmpCodalm
     * @param tmpIDProces
     * @param tmpAño
     * @param tmpMes
     * @param tmpIncrementar
     * @return
     * @throws Exception 
     */
    public String Gen_consecutivos(String tmpCodalm, String tmpIDProces, String tmpAño, String tmpMes, boolean tmpIncrementar) throws Exception {
       String consecutivo ="";
        try {
            connection database = new connection();
            Connection connection = database.GetConnection();
            
            dao_consecutivos  dao_consecutivos1 = new dao_consecutivos();
            consecutivo =dao_consecutivos1.Consecutivo_General(connection, tmpCodalm, tmpIDProces, tmpAño, tmpMes, tmpIncrementar);
        } catch (Exception e) {
            throw e;
        }
        return consecutivo;
    }
}
