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
public class Deta_pedido {
    
    private String NumPed;
    private String CodIns;
    private String NomIns;
    private String UndIns;
    private BigDecimal ValIVa;
    private BigDecimal valDcto;
    private BigDecimal MargenIva;
    private BigDecimal MargenDcto;
    private BigDecimal ValUnitario;

    public Deta_pedido() {
    }

    public Deta_pedido(String NumPed, String CodIns, String NomIns,  String UndIns, BigDecimal ValIVa, BigDecimal valDcto, BigDecimal MargenIva, BigDecimal MargenDcto, BigDecimal ValUnitario) {
        this.NumPed = NumPed;
        this.CodIns = CodIns;
        this.NomIns = NomIns;
        this.UndIns = UndIns;
        this.ValIVa = ValIVa;
        this.valDcto = valDcto;
        this.MargenIva = MargenIva;
        this.MargenDcto = MargenDcto;
        this.ValUnitario = ValUnitario;
    }
    
    

    public String getNumPed() {
        return NumPed;
    }

    public void setNumPed(String NumPed) {
        this.NumPed = NumPed;
    }

    public String getCodIns() {
        return CodIns;
    }

    public void setCodIns(String CodIns) {
        this.CodIns = CodIns;
    }

    public String getNomIns() {
        return NomIns;
    }

    public void setNomIns(String NomIns) {
        this.NomIns = NomIns;
    }


    public String getUndIns() {
        return UndIns;
    }

    public void setUndIns(String UndIns) {
        this.UndIns = UndIns;
    }

    public BigDecimal getValIVa() {
        return ValIVa;
    }

    public void setValIVa(BigDecimal ValIVa) {
        this.ValIVa = ValIVa;
    }

    public BigDecimal getValDcto() {
        return valDcto;
    }

    public void setValDcto(BigDecimal valDcto) {
        this.valDcto = valDcto;
    }

    public BigDecimal getMargenIva() {
        return MargenIva;
    }

    public void setMargenIva(BigDecimal MargenIva) {
        this.MargenIva = MargenIva;
    }

    public BigDecimal getMargenDcto() {
        return MargenDcto;
    }

    public void setMargenDcto(BigDecimal MargenDcto) {
        this.MargenDcto = MargenDcto;
    }

    public BigDecimal getValUnitario() {
        return ValUnitario;
    }

    public void setValUnitario(BigDecimal ValUnitario) {
        this.ValUnitario = ValUnitario;
    }

   
    
    }
