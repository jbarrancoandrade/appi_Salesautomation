/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.subLine;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class dao_sublines {

    public ArrayList<subLine> GetSubline(Connection connection, String codlinea) throws Exception {
        ArrayList<subLine> subliData = new ArrayList<subLine>();
        try {
            String consulta = "SELECT CodSub,NomSub\n"
                    + "FROM alm_sublineas\n"
                    + "WHERE Clase!='S' and codLinea='"+codlinea+"'";
            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                subLine slines = new subLine();

                slines.setCodsub(rs.getString("CodSub"));
                slines.setNomSub(rs.getString("NomSub"));

                subliData.add(slines);
            }
            
            return subliData;
        } catch (Exception e) {
            throw e;
        }
    }

}
