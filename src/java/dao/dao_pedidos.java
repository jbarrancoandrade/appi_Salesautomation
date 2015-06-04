/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.alm_pedidos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import dto.Deta_pedido;

/**
 *
 * @author jhonbarranco
 */
public class dao_pedidos {

    /**
     * get List Ped
     *
     * @param connection
     * @param codven
     * @param Estado
     * @return
     * @throws Exception
     */
    public ArrayList<alm_pedidos> GetListPed(Connection connection, String codven, String Estado) throws Exception {
        ArrayList<alm_pedidos> pedData = new ArrayList<alm_pedidos>();

        String consul = "";

        if (Estado.isEmpty()) {
            consul = "AND VEN_MaeCart.estado=''";
        } else {
            consul = "AND VEN_MaeCart.estado='" + Estado + "'";
        }

        try {
            String consulta = "SELECT VEN_MaeCart.NumPed,VEN_MaeCart.FecPed,VEN_MaeCart.FecSys,\n"
                    + "       VEN_MaeCart.CodUsu,VEN_MaeCart.PC,VEN_MaeCart.Codter,cnt_terceros.nombre_com,\n"
                    + "       VEN_MaeCart.CodVen,VEN_MaeCart.CodList\n"
                    + "FROM   VEN_MaeCart\n"
                    + "LEFT   JOIN cnt_terceros ON cnt_terceros.Codter = VEN_MaeCart.Codter\n"
                    + "WHERE  VEN_MaeCart.codven='" + codven + "' " + consul + "";

            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                alm_pedidos ped = new alm_pedidos();

                ped.setCodUsu(rs.getString("CodUsu"));
                ped.setCodlist(rs.getString("CodList"));
                ped.setCodter(rs.getString("Codter"));
                ped.setFecPed(rs.getDate("FecPed"));
                ped.setFecSys(rs.getDate("FecSys"));
                ped.setNombre_com(rs.getString("Nombre_com"));
                ped.setNumPed(rs.getString("NumPed"));
                ped.setPC(rs.getString("PC"));

                pedData.add(ped);

            }
            return pedData;
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     *
     * @param connection
     * @param codalm
     * @param NumPed
     * @return
     * @throws Exception
     */
    public ArrayList<Deta_pedido> GetDetaPed(Connection connection, String codalm, String NumPed) throws Exception {
        ArrayList<Deta_pedido> detaPedData = new ArrayList<Deta_pedido>();

        try {
            String consulta = "SELECT NumPed,Ven_detaCart.CodIns,Alm_Insumos.Nomins,Alm_Insumos.UndIns,ValIVa,ValDcto,MargenDcto,MargenIva\n"
                    + "       ,valUnitario\n"
                    + "from Ven_detaCart\n"
                    + "LEFT JOIN Alm_Insumos ON Alm_Insumos.CodIns=Ven_detaCart.CodIns\n"
                    + "WHERE codalm='"+codalm+"' AND NumPed='"+NumPed+"'";

            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Deta_pedido dtp = new Deta_pedido();

                dtp.setNumPed(rs.getString("NumPed"));
                dtp.setCodIns(rs.getString("CodIns"));
                dtp.setNomIns(rs.getString("NomIns"));
                dtp.setMargenIva(rs.getBigDecimal("MargenIva"));
                dtp.setUndIns(rs.getString("UndIns"));
                dtp.setValDcto(rs.getBigDecimal("ValDcto"));
                dtp.setValIVa(rs.getBigDecimal("ValIVa"));
                dtp.setValUnitario(rs.getBigDecimal("valUnitario"));
                dtp.setMargenDcto(rs.getBigDecimal("MargenDcto"));

                detaPedData.add(dtp);

            }
            return detaPedData;
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
    public String addProduct(Connection connection,String name) throws Exception{
        System.out.println(name);
        return "";
    }

}
