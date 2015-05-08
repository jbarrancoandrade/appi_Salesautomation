/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Date;

/**
 *
 * @author jhonbarranco
 */
public class userObject {
    private String userName;
    private String nombre1;
    private String pwdweb;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String cedula;
    private String cargo;
    private String nombreCom;
    private boolean visualizaCostos;
    private String codven;
    private String telefono1;
    private String telefono2;
    private String direccion;
    private String celular1;
    private String celular2;
    private String codalm;
    private Date fecNac;
    private boolean modificado;
    private String codzona;
    private String codCaja;

    public userObject() {
    }

    public userObject(String userName, String nombre1, String pwdweb, String nombre2, String apellido1, String apellido2, String cedula, String cargo, String nombreCom, boolean visualizaCostos, String codven, String telefono1, String telefono2, String direccion, String celular1, String celular2, String codalm, Date fecNac, boolean modificado, String codzona, String codCaja) {
        this.userName = userName;
        this.nombre1 = nombre1;
        this.pwdweb = pwdweb;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.cargo = cargo;
        this.nombreCom = nombreCom;
        this.visualizaCostos = visualizaCostos;
        this.codven = codven;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.direccion = direccion;
        this.celular1 = celular1;
        this.celular2 = celular2;
        this.codalm = codalm;
        this.fecNac = fecNac;
        this.modificado = modificado;
        this.codzona = codzona;
        this.codCaja = codCaja;
    }

    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getPwdweb() {
        return pwdweb;
    }

    public void setPwdweb(String pwdweb) {
        this.pwdweb = pwdweb;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombreCom() {
        return nombreCom;
    }

    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }

    public boolean isVisualizaCostos() {
        return visualizaCostos;
    }

    public void setVisualizaCostos(boolean visualizaCostos) {
        this.visualizaCostos = visualizaCostos;
    }

    public String getCodven() {
        return codven;
    }

    public void setCodven(String codven) {
        this.codven = codven;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    public String getCodalm() {
        return codalm;
    }

    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public boolean isModificado() {
        return modificado;
    }

    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }

    public String getCodzona() {
        return codzona;
    }

    public void setCodzona(String codzona) {
        this.codzona = codzona;
    }

    public String getCodCaja() {
        return codCaja;
    }

    public void setCodCaja(String codCaja) {
        this.codCaja = codCaja;
    }
    
    

}
