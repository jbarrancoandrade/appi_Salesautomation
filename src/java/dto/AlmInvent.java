/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.math.BigDecimal;

/**
 *
 * @author jhonbarranco
 */
public class AlmInvent {

    private String codins;
    private String nomins;
    private String refins;
    private String undIns;
    private BigDecimal margenIva;
    private BigDecimal caninv;
    private BigDecimal valInv;

    public AlmInvent() {
    }

    public AlmInvent(String codins, String nomins, String refins, String undIns, BigDecimal margenIva, BigDecimal caninv, BigDecimal valInv) {
        this.codins = codins;
        this.nomins = nomins;
        this.refins = refins;
        this.undIns = undIns;
        this.margenIva = margenIva;
        this.caninv = caninv;
        this.valInv = valInv;
    }

    public String getCodins() {
        return codins;
    }

    public void setCodins(String codins) {
        this.codins = codins;
    }

    public String getNomins() {
        return nomins;
    }

    public void setNomins(String nomins) {
        this.nomins = nomins;
    }

    public String getRefins() {
        return refins;
    }

    public void setRefins(String refins) {
        this.refins = refins;
    }

    public String getUndIns() {
        return undIns;
    }

    public void setUndIns(String undIns) {
        this.undIns = undIns;
    }

    public BigDecimal getMargenIva() {
        return margenIva;
    }

    public void setMargenIva(BigDecimal margenIva) {
        this.margenIva = margenIva;
    }

    public BigDecimal getCaninv() {
        return caninv;
    }

    public void setCaninv(BigDecimal caninv) {
        this.caninv = caninv;
    }

    public BigDecimal getValInv() {
        return valInv;
    }

    public void setValInv(BigDecimal valInv) {
        this.valInv = valInv;
    }

    
}
