/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author jhonbarranco
 */
public class StoresObject {

    private String codalm;
    private String codcen;
    private String nomalm;
    private String diralm;
    private String tel1;
    private String tel2;
    private String tel3;
    private boolean facturaIva;
    private boolean ivaIncluido;
    private String nombreComercial;
    private String codDpto;
    private String codMcpio;
    private boolean reteicavta;
    private String cel1;
    private String cel2;
    private boolean ivaCosto;
    private boolean ivaIncluidoFac;

    public StoresObject() {
    }

    public StoresObject(String codalm, String codcen, String nomalm, String diralm, String tel1, String tel2, String tel3, boolean facturaIva, boolean ivaIncluido, String nombreComercial, String codDpto, String codMcpio, boolean reteicavta, String cel1, String cel2, boolean ivaCosto, boolean ivaIncluidoFac) {
        this.codalm = codalm;
        this.codcen = codcen;
        this.nomalm = nomalm;
        this.diralm = diralm;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.tel3 = tel3;
        this.facturaIva = facturaIva;
        this.ivaIncluido = ivaIncluido;
        this.nombreComercial = nombreComercial;
        this.codDpto = codDpto;
        this.codMcpio = codMcpio;
        this.reteicavta = reteicavta;
        this.cel1 = cel1;
        this.cel2 = cel2;
        this.ivaCosto = ivaCosto;
        this.ivaIncluidoFac = ivaIncluidoFac;
    }

    public String getCodalm() {
        return codalm;
    }

    public void setCodalm(String codalm) {
        this.codalm = codalm;
    }

    public String getCodcen() {
        return codcen;
    }

    public void setCodcen(String codcen) {
        this.codcen = codcen;
    }

    public String getNomalm() {
        return nomalm;
    }

    public void setNomalm(String nomalm) {
        this.nomalm = nomalm;
    }

    public String getDiralm() {
        return diralm;
    }

    public void setDiralm(String diralm) {
        this.diralm = diralm;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getTel3() {
        return tel3;
    }

    public void setTel3(String tel3) {
        this.tel3 = tel3;
    }

    public boolean isFacturaIva() {
        return facturaIva;
    }

    public void setFacturaIva(boolean facturaIva) {
        this.facturaIva = facturaIva;
    }

    public boolean isIvaIncluido() {
        return ivaIncluido;
    }

    public void setIvaIncluido(boolean ivaIncluido) {
        this.ivaIncluido = ivaIncluido;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getCodDpto() {
        return codDpto;
    }

    public void setCodDpto(String codDpto) {
        this.codDpto = codDpto;
    }

    public String getCodMcpio() {
        return codMcpio;
    }

    public void setCodMcpio(String codMcpio) {
        this.codMcpio = codMcpio;
    }

    public boolean isReteicavta() {
        return reteicavta;
    }

    public void setReteicavta(boolean reteicavta) {
        this.reteicavta = reteicavta;
    }

    public String getCel1() {
        return cel1;
    }

    public void setCel1(String cel1) {
        this.cel1 = cel1;
    }

    public String getCel2() {
        return cel2;
    }

    public void setCel2(String cel2) {
        this.cel2 = cel2;
    }

    public boolean isIvaCosto() {
        return ivaCosto;
    }

    public void setIvaCosto(boolean ivaCosto) {
        this.ivaCosto = ivaCosto;
    }

    public boolean isIvaIncluidoFac() {
        return ivaIncluidoFac;
    }

    public void setIvaIncluidoFac(boolean ivaIncluidoFac) {
        this.ivaIncluidoFac = ivaIncluidoFac;
    }

}
