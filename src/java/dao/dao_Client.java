/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.ClientObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 */
public class dao_Client {

    /**
     * Obtain complete list of clients by the seller
     *
     * @param connection
     * @param codven
     * @return
     * @throws Exception
     */
    public ArrayList<ClientObject> GetallClient(Connection connection, String codven) throws Exception {
        ArrayList<ClientObject> ClientData = new ArrayList<ClientObject>();
        try {
            String consulta = "select *\n"
                    + "from ven_clientes\n"
                    + "where CodVen='" + codven + "'\n"
                    + "order by NOMBRE_COM";
            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ClientObject clientobject = new ClientObject();

                clientobject.setCedula(rs.getString("Cedula"));
                clientobject.setCodcli(rs.getString("Codcli"));
                clientobject.setNombre1(rs.getString("Nombre_1"));
                clientobject.setNombre2(rs.getString("Nombre_2"));
                clientobject.setApellido1(rs.getString("Apellido_1"));
                clientobject.setApellido2(rs.getString("Apellido_2"));
                clientobject.setTelefono1(rs.getString("Telefono_1"));
                clientobject.setTelefono2(rs.getString("Telefono_2"));
                clientobject.setCelular1(rs.getString("Celular_1"));
                clientobject.setCelular2(rs.getString("Celular_2"));
                clientobject.setDireccion(rs.getString("Direccion"));
                clientobject.setRegimen(rs.getString("Regimen").charAt(0));
                clientobject.setEmail(rs.getString("EMail"));
                clientobject.setAplicaRetenciones(rs.getBoolean("AplicaRetenciones"));
                clientobject.setAplicaReteIva(rs.getBoolean("AplicaReteIva"));
                clientobject.setAplicaReteIca(rs.getBoolean("AplicaReteIca"));
                clientobject.setAplicaReteFte(rs.getBoolean("AplicaReteFte"));
                clientobject.setRegistraFecNac(rs.getBoolean("RegistraFecNac"));
                clientobject.setFecNac(rs.getDate("FecNac"));
                clientobject.setNombreCom(rs.getString("NOMBRE_COM"));
                clientobject.setCodMcpio(rs.getString("CodMcpio"));
                clientobject.setCodDpto(rs.getString("CodDpto"));
                clientobject.setTipCap(rs.getBoolean("TipCap"));
                clientobject.setModificado(rs.getBoolean("TipID"));
                clientobject.setTipId(rs.getString("Modificado"));
                clientobject.setTels(rs.getString("TELS"));
                clientobject.setNombreCal(rs.getString("NOMBRE_CAL"));
                clientobject.setNombreBus(rs.getString("NOMBRE_BUS"));
                clientobject.setCodlist(rs.getString("CODLIST"));
                clientobject.setFechaRegistro(rs.getDate("FechaRegistro"));
                clientobject.setCodVen(rs.getString("CodVen"));
                clientobject.setMargenreteica(rs.getBigDecimal("MARGENRETEICA"));
                clientobject.setRetanybase(rs.getBoolean("RETANYBASE"));
                clientobject.setForzarvtaori(rs.getBoolean("FORZARVTAORI"));
                clientobject.setDireccionDesp(rs.getString("DIRECCION_DESP"));
                clientobject.setPotencial(rs.getLong("Potencial"));
                clientobject.setCodZona(rs.getString("CodZona"));
                clientobject.setPlazoCr(rs.getInt("PlazoCR"));
                clientobject.setExentoIva(rs.getBoolean("ExentoIVA"));

                ClientData.add(clientobject);
            }
            return ClientData;
        } catch (Exception e) {
            throw e;
        }
    }

    
    
    /**
     * obtain client id
     * @param connection
     * @param codven
     * @param cedula
     * @return
     * @throws Exception 
     */
    public ClientObject getclientByID(Connection connection, String codven,String cedula) throws Exception {
        ClientObject clientobject = new ClientObject();
        try {
            String consulta = "select *\n"
                    + "from ven_clientes\n"
                    + "where codven='"+codven+"' and cedula='"+cedula+"'";
            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                clientobject.setCedula(rs.getString("Cedula"));
                clientobject.setCodcli(rs.getString("Codcli"));
                clientobject.setNombre1(rs.getString("Nombre_1"));
                clientobject.setNombre2(rs.getString("Nombre_2"));
                clientobject.setApellido1(rs.getString("Apellido_1"));
                clientobject.setApellido2(rs.getString("Apellido_2"));
                clientobject.setTelefono1(rs.getString("Telefono_1"));
                clientobject.setTelefono2(rs.getString("Telefono_2"));
                clientobject.setCelular1(rs.getString("Celular_1"));
                clientobject.setCelular2(rs.getString("Celular_2"));
                clientobject.setDireccion(rs.getString("Direccion"));
                clientobject.setRegimen(rs.getString("Regimen").charAt(0));
                clientobject.setEmail(rs.getString("EMail"));
                clientobject.setAplicaRetenciones(rs.getBoolean("AplicaRetenciones"));
                clientobject.setAplicaReteIva(rs.getBoolean("AplicaReteIva"));
                clientobject.setAplicaReteIca(rs.getBoolean("AplicaReteIca"));
                clientobject.setAplicaReteFte(rs.getBoolean("AplicaReteFte"));
                clientobject.setRegistraFecNac(rs.getBoolean("RegistraFecNac"));
                clientobject.setFecNac(rs.getDate("FecNac"));
                clientobject.setNombreCom(rs.getString("NOMBRE_COM"));
                clientobject.setCodMcpio(rs.getString("CodMcpio"));
                clientobject.setCodDpto(rs.getString("CodDpto"));
                clientobject.setTipCap(rs.getBoolean("TipCap"));
                clientobject.setModificado(rs.getBoolean("TipID"));
                clientobject.setTipId(rs.getString("Modificado"));
                clientobject.setTels(rs.getString("TELS"));
                clientobject.setNombreCal(rs.getString("NOMBRE_CAL"));
                clientobject.setNombreBus(rs.getString("NOMBRE_BUS"));
                clientobject.setCodlist(rs.getString("CODLIST"));
                clientobject.setFechaRegistro(rs.getDate("FechaRegistro"));
                clientobject.setCodVen(rs.getString("CodVen"));
                clientobject.setMargenreteica(rs.getBigDecimal("MARGENRETEICA"));
                clientobject.setRetanybase(rs.getBoolean("RETANYBASE"));
                clientobject.setForzarvtaori(rs.getBoolean("FORZARVTAORI"));
                clientobject.setDireccionDesp(rs.getString("DIRECCION_DESP"));
                clientobject.setPotencial(rs.getLong("Potencial"));
                clientobject.setCodZona(rs.getString("CodZona"));
                clientobject.setPlazoCr(rs.getInt("PlazoCR"));
                clientobject.setExentoIva(rs.getBoolean("ExentoIVA"));

            }
            return clientobject;
        } catch (Exception e) {
            throw e;
        }
        
    }

}
