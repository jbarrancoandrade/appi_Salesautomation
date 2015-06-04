/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.StoresObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class dao_stores { 
    /**
     * get all stores by codalm
     * @param connection
     * @param codalm
     * @return
     * @throws Exception 
     */
    public ArrayList<StoresObject> GetallStore(Connection connection, String codalm) throws Exception {
        ArrayList<StoresObject> StoresData = new ArrayList<StoresObject>();
        try {
            String consulta = "SELECT *\n"
                    + "  FROM Gen_Almacenes\n"
                    + "where codalm='"+codalm+"'";
            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                StoresObject storesObject = new StoresObject();

                storesObject.setCodalm(rs.getString("codalm"));
                storesObject.setCodcen(rs.getString("Codcen"));
                storesObject.setNomalm(rs.getString("Nomalm"));
                storesObject.setDiralm(rs.getString("Diralm"));
                storesObject.setTel1(rs.getString("Tel_1"));
                storesObject.setTel2(rs.getString("Tel_2"));
                storesObject.setTel3(rs.getString("Tel_3"));
                storesObject.setFacturaIva(rs.getBoolean("FacturaIVA"));
                storesObject.setIvaIncluido(rs.getBoolean("IvaIncluido"));
                storesObject.setNombreComercial(rs.getString("NombreComercial"));
                storesObject.setCodDpto(rs.getString("CodDpto"));
                storesObject.setCodMcpio(rs.getString("CodMcpio"));
                storesObject.setReteicavta(rs.getBoolean("RETEICAVTA"));
                storesObject.setCel1(rs.getString("CEL_1"));
                storesObject.setCel2(rs.getString("CEL_2"));
                storesObject.setIvaCosto(rs.getBoolean("IvaCosto"));
                storesObject.setIvaIncluidoFac(rs.getBoolean("IvaIncluidoFac"));
                StoresData.add(storesObject);
            }
            return StoresData;
        } catch (Exception e) {
            throw e;
        }
    }

}
