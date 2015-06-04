/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.AlmInvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class da_invent {

    /**
     * 
     * Get Invent filter for codalm
     * @param connection
     * @param codalm
     * @return
     * @throws Exception 
     * 
     */
    public ArrayList<AlmInvent> GetInvent(Connection connection, String codalm) throws Exception {
        ArrayList<AlmInvent> inventData = new ArrayList<AlmInvent>();
        try {
            String consulta = "SELECT Alm_Insumos.Codins,nomins,refins,Ven_IVAS.MargenIva,Alm_Invent.Caninv,undIns,Alm_Invent.valInv\n"
                    + "FROM Alm_Insumos\n"
                    + "LEFT JOIN Ven_IVAS ON Ven_IVAS.CodIva=Alm_Insumos.CodIva\n"
                    + "LEFT JOIN Alm_Invent ON Alm_Invent.Codins=Alm_Insumos.Codins \n"
                    + "WHERE Alm_Insumos.Activo='1' AND Alm_Invent.codalm='"+codalm+"' AND Alm_Invent.Caninv > 0";
            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
               
                AlmInvent Invent = new AlmInvent();

                Invent.setCodins(resultSet.getString("Codins"));
                Invent.setNomins(resultSet.getString("nomins"));
                Invent.setRefins(resultSet.getString("refins"));
                Invent.setUndIns(resultSet.getString("undIns"));
                Invent.setMargenIva(resultSet.getBigDecimal("MargenIva"));
                Invent.setCaninv(resultSet.getBigDecimal("Caninv"));
                Invent.setValInv(resultSet.getBigDecimal("valInv"));

                inventData.add(Invent);

            }
            return inventData;
        } catch (Exception e) {
            throw e;
        }
    }

}
