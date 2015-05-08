/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Dependencias.sentencias;
import dto.ClientObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class dao_consecutivos {

    /**
     * **********************************************************************************************
     * Función que administra los consecutivos en el Sistema
     * *********************************************************************************************
     * Parametros : tmpCodalm : Código del almacén (001,002,003) tmpCodcon :
     * Código del Consecutivo (EALM,SALM ...) tmpAño : Año del Consecutivo (2008
     * ...), solo aplica para Anuales y Mensuales tmpMes : Mes del Consecutivo
     * (1,2,3..12) solo aplica para Anuales y Mensuales tmpIncrementar : Indica
     * si la Función debe INcrementar el Consecutivo despues de Retornarlo
     * tmpConectarse	: Indica si la Función debe conectarse a la Base de Datos o
     * usar una conexión preestablecida tmpHandle	: Conexión preestablecida en
     * caso de que exista
     * *********************************************************************************************
     * @param connection
     * @param tmpCodalm
     * @param tmpIDProces
     * @param tmpAño
     * @param tmpMes
     * @param tmpIncrementar
     * @return
     * @throws Exception
     */
    public String Consecutivo_General(Connection connection, String tmpCodalm, String tmpIDProces, String tmpAño, String tmpMes, boolean tmpIncrementar) throws Exception {

        String tmpCodCon = "";
        int tmpConsecutivo = 0;
        String tmpConsec = "";

        if (tmpIDProces.length() == 3) {
            //Cuando lo que se envía es una fuente contable creada por un usuario o un consecutivo que se maneja directamente

            tmpCodCon = tmpIDProces;
        } else {
            //Cuando lo que se envía es la llave de una transacción

            try {
                String consulta1 = "SELECT CODCON FROM CFG_CONSECXTRANS WHERE LTRIM(RTRIM(ID_PROCESS))='" + tmpIDProces + "'";

                PreparedStatement ps = connection.prepareStatement(consulta1);
                ResultSet Cur_ConfigConsec = ps.executeQuery();

                if (!Cur_ConfigConsec.next()) {
                    System.err.println("No se ha encontrado el id de proceso  " + tmpIDProces + " no puede realizar esta transacción hasta que realice esta configuración !");
                } else {
                    System.out.println("SUCCESS");
                    if (Cur_ConfigConsec.getString("Codcon").isEmpty() || Cur_ConfigConsec.getString("Codcon") == null) {
                        System.err.println("No se ha definido el consecutivo para el proceso  " + tmpIDProces + ", no puede realizar esta transacción hasta que realice esta configuración !");
                    } else {
                        tmpCodCon = Cur_ConfigConsec.getString("Codcon");
                        System.out.println("codcon" + tmpCodCon);
                    }
                }
            } catch (Exception e) {
                System.out.print("ERROR SELECCIONANDO CODCON" + e.getCause() + "-" + e.getMessage() + "\n");
            }

        }

        try {

            String consulta2 = "SELECT TIPCON FROM Gen_Consecutivos WHERE CODCON='" + tmpCodCon + "'";

            PreparedStatement ps2 = connection.prepareStatement(consulta2);
            ResultSet Cur_ParConsec = ps2.executeQuery();
            sentencias s = new sentencias();

            if (!Cur_ParConsec.next()) {
                return "";
            } else {
                String consulta3 = "";

                PreparedStatement ps3 = null;

                ResultSet Cur_Consec = null;
                if (null != Cur_ParConsec.getString("TipCon").toUpperCase()) {

                    switch (Cur_ParConsec.getString("TipCon").toUpperCase()) {
                        case "A":
                            consulta3 = "SELECT ISNULL(CONSECUTIVO,0) AS CONSECUTIVO \n"
                                    + "  FROM Gen_ConsecA \n"
                                    + "  WHERE CODALM='" + tmpCodalm + "' AND CODCON='" + tmpCodCon + "' AND AÑO='" + tmpAño + "'";
                            ps3 = connection.prepareStatement(consulta3);
                            Cur_Consec = ps3.executeQuery();

                            break;
                        case "M":
                            consulta3 = "SELECT ISNULL(CONSECUTIVO,0) AS CONSECUTIVO \n"
                                    + "  FROM Gen_ConsecM \n"
                                    + "  WHERE CODALM='" + tmpCodalm + "' AND CODCON='" + tmpCodCon + "' AND AÑO='" + tmpAño + "' AND MES='" + tmpMes + "'";
                            ps3 = connection.prepareStatement(consulta3);
                            Cur_Consec = ps3.executeQuery();

                            break;
                        case "S":
                            consulta3 = "SELECT ISNULL(CONSECUTIVO,0) AS CONSECUTIVO \n"
                                    + "  FROM Gen_ConsecS \n"
                                    + "  WHERE CODALM='" + tmpCodalm + "' AND CODCON='" + tmpCodCon + "' ";
                            ps3 = connection.prepareStatement(consulta3);
                            Cur_Consec = ps3.executeQuery();

                            break;
                    }

                    if (!Cur_Consec.next()) {

                        tmpConsecutivo = 1;
                    } else {
                        tmpConsecutivo = Cur_Consec.getInt("Consecutivo") + 1;

                    }

                }

                if (null != Cur_ParConsec.getString("TipCon").toUpperCase()) {

                    switch (Cur_ParConsec.getString("TipCon").toUpperCase()) {
                        case "A":

                            tmpConsec = (tmpAño + "").replace("0", "");
                            tmpConsec = tmpConsec + s.npadl((tmpConsecutivo + 1), 5, '0');

                            break;
                        case "M":

                            tmpConsec = tmpAño.substring(tmpAño.length() - 2) + s.npadl(Integer.parseInt(tmpMes), 2, '0') + s.npadl(tmpConsecutivo, 4, '0');

                            break;
                        case "S":

                            tmpConsec = s.npadl(tmpConsecutivo, 8, '0');

                            break;
                        default:
                            tmpConsec = "";
                            break;

                    }

                }

                if (tmpIncrementar) {

                    if (null != Cur_ParConsec.getString("TipCon").toUpperCase()) {

                        String consulta4 = "";
                        PreparedStatement ps4 = null;
                        ResultSet x = null;

                        switch (Cur_ParConsec.getString("TipCon").toUpperCase()) {
                            case "A":

                                consulta4 = "UPDATE Gen_ConsecA \n"
                                        + "SET Consecutivo=Consecutivo+1\n"
                                        + "WHERE CODALM='" + tmpCodalm + "' AND CODCON='" + tmpCodCon + "' AND AÑO='" + tmpAño + "'";
                                ps4 = connection.prepareStatement(consulta4);
                                x = ps4.executeQuery();

                                break;
                            case "M":

                                consulta4 = "UPDATE Gen_ConsecM \n"
                                        + "SET Consecutivo=Consecutivo+1\n"
                                        + "WHERE CODALM='" + tmpCodalm + "' AND CODCON='" + tmpCodCon + "' AND AÑO='" + tmpAño + "' AND MES='" + tmpMes + "'";
                                ps4 = connection.prepareStatement(consulta4);
                                x = ps4.executeQuery();

                                break;
                            case "S":

                                consulta4 = "UPDATE Gen_ConsecS \n"
                                        + "SET Consecutivo=Consecutivo+1\n"
                                        + "WHERE CODALM='" + tmpCodalm + "' AND CODCON='" + tmpCodCon + "' ";
                                ps4 = connection.prepareStatement(consulta4);
                                x = ps4.executeQuery();

                                break;

                        }

                    }

                }
            }

        } catch (Exception e) {

            System.out.print("Error Incrementado El Consecutivo" + e.getCause() + "-" + e.getMessage() + "\n");
        }

        return tmpConsec;
    }

}
