/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author jhonbarranco
 */
public class ClientObject {
    
    
     private String cedula;
     private String codcli;
     private String nombre1;
     private String nombre2;
     private String apellido1;
     private String apellido2;
     private String telefono1;
     private String telefono2;
     private String celular1;
     private String celular2;
     private String direccion;
     private Character regimen;
     private String email;
     private boolean aplicaRetenciones;
     private boolean aplicaReteIva;
     private boolean aplicaReteIca;
     private boolean aplicaReteFte;
     private boolean registraFecNac;
     private Date fecNac;
     private String nombreCom;
     private String codMcpio;
     private String codDpto;
     private boolean tipCap;
     private String tipId;
     private boolean modificado;
     private String tels;
     private String nombreCal;
     private String nombreBus;
     private String codlist;
     private Date fechaRegistro;
     private String codVen;
     private BigDecimal margenreteica;
     private boolean retanybase;
     private boolean forzarvtaori;
     private String direccionDesp;
     private long potencial;
     private String codZona;
     private int plazoCr;
     private boolean exentoIva;

    public ClientObject() {
    }

    public ClientObject(String cedula, String codcli, String nombre1, String nombre2, String apellido1, String apellido2, String telefono1, String telefono2, String celular1, String celular2, String direccion, Character regimen, String email, boolean aplicaRetenciones, boolean aplicaReteIva, boolean aplicaReteIca, boolean aplicaReteFte, boolean registraFecNac, Date fecNac, String nombreCom, String codMcpio, String codDpto, boolean tipCap, String tipId, boolean modificado, String tels, String nombreCal, String nombreBus, String codlist, Date fechaRegistro, String codVen, BigDecimal margenreteica, boolean retanybase, boolean forzarvtaori, String direccionDesp, long potencial, String codZona, int plazoCr) {
        this.cedula = cedula;
        this.codcli = codcli;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.celular1 = celular1;
        this.celular2 = celular2;
        this.direccion = direccion;
        this.regimen = regimen;
        this.email = email;
        this.aplicaRetenciones = aplicaRetenciones;
        this.aplicaReteIva = aplicaReteIva;
        this.aplicaReteIca = aplicaReteIca;
        this.aplicaReteFte = aplicaReteFte;
        this.registraFecNac = registraFecNac;
        this.fecNac = fecNac;
        this.nombreCom = nombreCom;
        this.codMcpio = codMcpio;
        this.codDpto = codDpto;
        this.tipCap = tipCap;
        this.tipId = tipId;
        this.modificado = modificado;
        this.tels = tels;
        this.nombreCal = nombreCal;
        this.nombreBus = nombreBus;
        this.codlist = codlist;
        this.fechaRegistro = fechaRegistro;
        this.codVen = codVen;
        this.margenreteica = margenreteica;
        this.retanybase = retanybase;
        this.forzarvtaori = forzarvtaori;
        this.direccionDesp = direccionDesp;
        this.potencial = potencial;
        this.codZona = codZona;
        this.plazoCr = plazoCr;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Character getRegimen() {
        return regimen;
    }

    public void setRegimen(Character regimen) {
        this.regimen = regimen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAplicaRetenciones() {
        return aplicaRetenciones;
    }

    public void setAplicaRetenciones(boolean aplicaRetenciones) {
        this.aplicaRetenciones = aplicaRetenciones;
    }

    public boolean isAplicaReteIva() {
        return aplicaReteIva;
    }

    public void setAplicaReteIva(boolean aplicaReteIva) {
        this.aplicaReteIva = aplicaReteIva;
    }

    public boolean isAplicaReteIca() {
        return aplicaReteIca;
    }

    public void setAplicaReteIca(boolean aplicaReteIca) {
        this.aplicaReteIca = aplicaReteIca;
    }

    public boolean isAplicaReteFte() {
        return aplicaReteFte;
    }

    public void setAplicaReteFte(boolean aplicaReteFte) {
        this.aplicaReteFte = aplicaReteFte;
    }

    public boolean isRegistraFecNac() {
        return registraFecNac;
    }

    public void setRegistraFecNac(boolean registraFecNac) {
        this.registraFecNac = registraFecNac;
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public String getNombreCom() {
        return nombreCom;
    }

    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }

    public String getCodMcpio() {
        return codMcpio;
    }

    public void setCodMcpio(String codMcpio) {
        this.codMcpio = codMcpio;
    }

    public String getCodDpto() {
        return codDpto;
    }

    public void setCodDpto(String codDpto) {
        this.codDpto = codDpto;
    }

    public boolean isTipCap() {
        return tipCap;
    }

    public void setTipCap(boolean tipCap) {
        this.tipCap = tipCap;
    }

    public String getTipId() {
        return tipId;
    }

    public void setTipId(String tipId) {
        this.tipId = tipId;
    }

    public boolean isModificado() {
        return modificado;
    }

    public void setModificado(boolean modificado) {
        this.modificado = modificado;
    }

    public String getTels() {
        return tels;
    }

    public void setTels(String tels) {
        this.tels = tels;
    }

    public String getNombreCal() {
        return nombreCal;
    }

    public void setNombreCal(String nombreCal) {
        this.nombreCal = nombreCal;
    }

    public String getNombreBus() {
        return nombreBus;
    }

    public void setNombreBus(String nombreBus) {
        this.nombreBus = nombreBus;
    }

    public String getCodlist() {
        return codlist;
    }

    public void setCodlist(String codlist) {
        this.codlist = codlist;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getCodVen() {
        return codVen;
    }

    public void setCodVen(String codVen) {
        this.codVen = codVen;
    }

    public BigDecimal getMargenreteica() {
        return margenreteica;
    }

    public void setMargenreteica(BigDecimal margenreteica) {
        this.margenreteica = margenreteica;
    }

    public boolean isRetanybase() {
        return retanybase;
    }

    public void setRetanybase(boolean retanybase) {
        this.retanybase = retanybase;
    }

    public boolean isForzarvtaori() {
        return forzarvtaori;
    }

    public void setForzarvtaori(boolean forzarvtaori) {
        this.forzarvtaori = forzarvtaori;
    }

    public String getDireccionDesp() {
        return direccionDesp;
    }

    public void setDireccionDesp(String direccionDesp) {
        this.direccionDesp = direccionDesp;
    }

    public long getPotencial() {
        return potencial;
    }

    public void setPotencial(long potencial) {
        this.potencial = potencial;
    }

    public String getCodZona() {
        return codZona;
    }

    public void setCodZona(String codZona) {
        this.codZona = codZona;
    }

    public int getPlazoCr() {
        return plazoCr;
    }

    public void setPlazoCr(int plazoCr) {
        this.plazoCr = plazoCr;
    }

    public boolean isExentoIva() {
        return exentoIva;
    }

    public void setExentoIva(boolean exentoIva) {
        this.exentoIva = exentoIva;
    }
     
     
}
