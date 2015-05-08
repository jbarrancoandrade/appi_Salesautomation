/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.priceList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class dao_priceList {

    /**
     *
     * @param connection
     * @param codven
     * @return
     * @throws Exception
     */
    public ArrayList<priceList> GetListprice(Connection connection, String tmpCodalm) throws Exception {
        ArrayList<priceList> priceData = new ArrayList<priceList>();
        try {
            String consulta = "select Codlist,NomList,Codalm\n"
                    + "from ven_listaprecios\n"
                    + "where  codalm='"+tmpCodalm+"' and activa='1' and publica='1'";
            System.out.println(consulta );
            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                priceList price = new priceList();

                price.setCodalm(rs.getString("Codalm"));
                price.setCodlist(rs.getString("Codlist"));
                price.setNomList(rs.getString("NomList"));

                priceData.add(price);
            }
            return priceData;
        } catch (Exception e) {
            throw e;
        }
    }

}
