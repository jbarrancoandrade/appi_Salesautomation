/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.userObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author jhonbarranco
 * 
 */
public class dao_user {

   
    
    /**
     * get all user list
     *
     * @param connection
     * @return
     * @throws Exception
     */
    public ArrayList<userObject> Getalluser(Connection connection) throws Exception {
        ArrayList<userObject> userData = new ArrayList<userObject>();
        try {
            String consulta = "select cfg_usuarios.username,cfg_usuarios.nombre_1,cfg_usuarios.nombre_2,\n"
                    + "     cfg_usuarios.apellido_1,cfg_usuarios.apellido_2,cfg_usuarios.cedula,\n"
                    + "     cfg_usuarios.cargo,cfg_usuarios.nombre_com,cfg_usuarios.visualizaCostos,cfg_usuarios.pwdweb,\n"
                    + "     ven_vendedor.codven,ven_vendedor.telefono_1,ven_vendedor.Telefono_2,\n"
                    + "     ven_vendedor.Direccion,ven_vendedor.celular_1,\n"
                    + "     ven_vendedor.celular_2,ven_vendedor.codalm,ven_vendedor.fecNac,ven_vendedor.codcaja,ven_vendedor.codzona\n"
                    + "     from cfg_usuarios\n"
                    + "     left join ven_vendedor\n"
                    + "     on ven_vendedor.cedula=cfg_usuarios.cedula\n"
                    + "     where cfg_usuarios.activo='1' and ven_vendedor.activo='1'";
            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                userObject userobjecto = new userObject();

                userobjecto.setUserName(rs.getString("username"));
                userobjecto.setNombre1(rs.getString("nombre_1"));
                userobjecto.setNombre2(rs.getString("nombre_2"));
                userobjecto.setApellido1(rs.getString("apellido_1"));
                userobjecto.setApellido2(rs.getString("apellido_2"));
                userobjecto.setCedula(rs.getString("Cedula"));
                userobjecto.setCargo(rs.getString("cargo"));
                userobjecto.setNombreCom(rs.getString("nombre_com"));
                userobjecto.setVisualizaCostos(rs.getBoolean("visualizaCostos"));
                userobjecto.setPwdweb(rs.getString("pwdweb"));
                userobjecto.setCodven(rs.getString("codven"));
                userobjecto.setTelefono1(rs.getString("telefono_1"));
                userobjecto.setTelefono2(rs.getString("telefono_2"));
                userobjecto.setDireccion(rs.getString("Direccion"));
                userobjecto.setCelular1(rs.getString("celular_1"));
                userobjecto.setCelular2(rs.getString("celular_2"));
                userobjecto.setCodalm(rs.getString("codalm"));
                userobjecto.setFecNac(rs.getDate("fecNac"));
                userobjecto.setCodCaja(rs.getString("codcaja"));
                userobjecto.setCodzona(rs.getString("codzona"));

                userData.add(userobjecto);
            }

            return userData;
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
    

  
 
}
