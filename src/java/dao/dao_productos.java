/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.product;

/**
 *
 * @author jhonbarranco
 */
public class dao_productos {

   
    /**
     * tmpcodalm es el codigo de almacen a consultar
     * tmpLtsPrecios es el codigo de lista precios a usar
     * tmpCodLinea es la linea o categoria que se usa para consultar
     * tmpCodsub es la subcategoria deacuerdo a la linea
     * cant es la cantida de elementos que quiero que traiga la consulta
     * all es un elemento que define si quiero consultar hasta los productos en existencias de 0
     * @param connection
     * @param tmpCodalm
     * @param tmpLtsPrecios
     * @param tmpCodLinea
     * @param tmpCodsub
     * @param cant
     * @param all
     * @return
     * @throws Exception 
     */
    public ArrayList<product> GetallProduc(Connection connection, String tmpCodalm, String tmpLtsPrecios, String tmpCodLinea, String tmpCodsub,int cant ,boolean all) throws Exception {
        ArrayList<product> ProductData = new ArrayList<product>();

        String cantida="";
        if(cant>0){
           cantida="top "+cant+""; 
        }
        
        String nuevoInsertLin ="";
        String nuevoInsertsub ="";
        if (tmpCodLinea.isEmpty()) {
            nuevoInsertLin = "and alm_insumos.codlinea='" + tmpCodLinea + "'";
            if (tmpCodsub.isEmpty()) {
                nuevoInsertsub = "and alm_insumos.codsub='" + tmpCodsub + "'";
            }else{
                nuevoInsertsub = "";
            }
        }else{
            nuevoInsertLin = "";
        }
        
        
        String alls="";
        if(!all){
           alls="and alm_invent.caninv > 0";
        }
        
        

        try {
            String consulta = "SELECT "+cantida+" alm_insumos.Codins,alm_insumos.Nomins,ISNULL(alm_imgInsumos.Graficos,0) AS Graficos,alm_insumos.refins,alm_insumos.EANINS,alm_insumos.UndIns,alm_insumos.codbar\n"
                    + ",ven_Detaprecios.Valvta,ven_Detaprecios.MargenDcto,ven_Detaprecios.VALVTAMIN,alm_invent.Caninv,Ven_Ivas.MargenIva\n"
                    + "FROM  alm_insumos\n"
                    + "LEFT JOIN alm_imgInsumos ON alm_imgInsumos.codins=alm_insumos.Codins\n"
                    + "LEFT JOIN alm_invent     ON alm_invent.Codins=alm_insumos.Codins\n"
                    + "LEFT JOIN Ven_Ivas       ON Ven_Ivas.CodIva=alm_insumos.CodIva\n"
                    + "LEFT JOIN ven_Detaprecios ON ven_Detaprecios.codalm=alm_invent.codalm and ven_Detaprecios.codins=alm_invent.Codins\n"
                    + "WHERE alm_insumos.Activo='1'        and alm_insumos.Clase!='S' \n"
                    + "      and alm_invent.Codalm='"+tmpCodalm+"'   and ven_Detaprecios.codlist='"+tmpLtsPrecios+"'\n"
                    + "      "+nuevoInsertLin+" "+nuevoInsertsub+" \n"
                    + "      "+alls+"";

          
            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                product product = new product();
                
                product.setCodins(rs.getString("Codins"));
                product.setNomins(rs.getString("Nomins"));
                product.setGraficos(rs.getBytes("Graficos"));
                product.setRefins(rs.getString("refins"));
                product.setEANINS(rs.getString("EANINS"));
                product.setUndIns(rs.getString("UndIns"));
                product.setCodbar(rs.getString("Codbar"));
                product.setValvta(rs.getBigDecimal("Valvta"));
                product.setMargenDcto(rs.getBigDecimal("MargenDcto"));
                product.setVALVTAMIN(rs.getBigDecimal("VALVTAMIN"));
                product.setCaninv(rs.getBigDecimal("Caninv"));
                product.setMargenIva(rs.getBigDecimal("MargenIva"));
             
                

                
                
                ProductData.add(product);

            }
            return ProductData;
        } catch (Exception e) {
            throw e;
        }
    }

}
