/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Line;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class dao_lineas {

    /**
     *
     * @param connection
     * @return
     * @throws Exception
     * 
     */
    public ArrayList<Line> GetLineas(Connection connection) throws Exception {
        ArrayList<Line> LineData = new ArrayList<Line>();
        try {
            String consulta = "SELECT CodLinea,Nomlinea\n"
                    + "FROM alm_lineas\n"
                    + "where clase!='S'";
            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Line lines = new Line();
                lines.setCodLinea(rs.getString("CodLinea"));
                lines.setNomLinea(rs.getString("Nomlinea"));

                LineData.add(lines);
            }
            return LineData;
        } catch (Exception e) {
            throw e;
        }
    }

}
