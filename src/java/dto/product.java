/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author jhonbarranco
 */
public class product {
     private String Codins;
     private String Nomins;
     private byte[] graficos;
     private String refins;
     private String EANINS;
     private String UndIns;
     private String codbar;
     private BigDecimal Valvta;
     private BigDecimal MargenDcto;
     private BigDecimal VALVTAMIN;
     private BigDecimal Caninv;
     private BigDecimal margenIva;

    public product(String Codins, String Nomins, byte[] graficos, String refins, String EANINS, String UndIns, String codbar, BigDecimal Valvta, BigDecimal MargenDcto, BigDecimal VALVTAMIN, BigDecimal Caninv, BigDecimal margenIva) {
        this.Codins = Codins;
        this.Nomins = Nomins;
        this.graficos = graficos;
        this.refins = refins;
        this.EANINS = EANINS;
        this.UndIns = UndIns;
        this.codbar = codbar;
        this.Valvta = Valvta;
        this.MargenDcto = MargenDcto;
        this.VALVTAMIN = VALVTAMIN;
        this.Caninv = Caninv;
        this.margenIva = margenIva;
    }

    public product() {
    }

    public String getCodins() {
        return Codins;
    }

    public void setCodins(String Codins) {
        this.Codins = Codins;
    }

    public String getNomins() {
        return Nomins;
    }

    public void setNomins(String Nomins) {
        this.Nomins = Nomins;
    }

    public byte[] getGraficos() {
        return graficos;
    }

    public void setGraficos(byte[] graficos) {
        this.graficos = graficos;
    }

    public String getRefins() {
        return refins;
    }

    public void setRefins(String refins) {
        this.refins = refins;
    }

    public String getEANINS() {
        return EANINS;
    }

    public void setEANINS(String EANINS) {
        this.EANINS = EANINS;
    }

    public String getUndIns() {
        return UndIns;
    }

    public void setUndIns(String UndIns) {
        this.UndIns = UndIns;
    }

    public String getCodbar() {
        return codbar;
    }

    public void setCodbar(String codbar) {
        this.codbar = codbar;
    }

    public BigDecimal getValvta() {
        return Valvta;
    }

    public void setValvta(BigDecimal Valvta) {
        this.Valvta = Valvta;
    }

    public BigDecimal getMargenDcto() {
        return MargenDcto;
    }

    public void setMargenDcto(BigDecimal MargenDcto) {
        this.MargenDcto = MargenDcto;
    }

    public BigDecimal getVALVTAMIN() {
        return VALVTAMIN;
    }

    public void setVALVTAMIN(BigDecimal VALVTAMIN) {
        this.VALVTAMIN = VALVTAMIN;
    }

    public BigDecimal getCaninv() {
        return Caninv;
    }

    public void setCaninv(BigDecimal Caninv) {
        this.Caninv = Caninv;
    }

    public BigDecimal getMargenIva() {
        return margenIva;
    }

    public void setMargenIva(BigDecimal margenIva) {
        this.margenIva = margenIva;
    }
    
    
    
}
