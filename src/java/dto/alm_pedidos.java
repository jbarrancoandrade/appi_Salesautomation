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
public class alm_pedidos {
    
    
    private String NumPed;
    private Date FecPed;
    private Date FecSys;
    private String CodUsu;
    private String PC;
    private String Codter;
    private String nombre_com;
    private String Codven;
    private String codlist;

    public alm_pedidos() {
    }

    public alm_pedidos(String NumPed, Date FecPed, Date FecSys, String CodUsu, String PC, String Codter, String nombre_com, String Codven, String codlist) {
       
        this.NumPed = NumPed;
        this.FecPed = FecPed;
        this.FecSys = FecSys;
        this.CodUsu = CodUsu;
        this.PC = PC;
        this.Codter = Codter;
        this.nombre_com = nombre_com;
        this.Codven = Codven;
        this.codlist = codlist;
    }

  
    public String getNumPed() {
        return NumPed;
    }

    public void setNumPed(String NumPed) {
        this.NumPed = NumPed;
    }

    public Date getFecPed() {
        return FecPed;
    }

    public void setFecPed(Date FecPed) {
        this.FecPed = FecPed;
    }

    public Date getFecSys() {
        return FecSys;
    }

    public void setFecSys(Date FecSys) {
        this.FecSys = FecSys;
    }

    public String getCodUsu() {
        return CodUsu;
    }

    public void setCodUsu(String CodUsu) {
        this.CodUsu = CodUsu;
    }

    public String getPC() {
        return PC;
    }

    public void setPC(String PC) {
        this.PC = PC;
    }

    public String getCodter() {
        return Codter;
    }

    public void setCodter(String Codter) {
        this.Codter = Codter;
    }

    public String getNombre_com() {
        return nombre_com;
    }

    public void setNombre_com(String nombre_com) {
        this.nombre_com = nombre_com;
    }

    public String getCodven() {
        return Codven;
    }

    public void setCodven(String Codven) {
        this.Codven = Codven;
    }

    public String getCodlist() {
        return codlist;
    }

    public void setCodlist(String codlist) {
        this.codlist = codlist;
    }
    
    
    
    
    
    
    
}
