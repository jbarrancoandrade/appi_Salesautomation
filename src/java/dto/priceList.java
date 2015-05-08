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
public class priceList {
   
    private String codlist;
    private String NomList;
    private String Codalm;

    public priceList() {
    }

    public priceList(String codlist, String NomList, String Codalm) {
        this.codlist = codlist;
        this.NomList = NomList;
        this.Codalm = Codalm;
    }

    public String getCodlist() {
        return codlist;
    }

    public void setCodlist(String codlist) {
        this.codlist = codlist;
    }

    public String getNomList() {
        return NomList;
    }

    public void setNomList(String NomList) {
        this.NomList = NomList;
    }

    public String getCodalm() {
        return Codalm;
    }

    public void setCodalm(String Codalm) {
        this.Codalm = Codalm;
    }
    
    
    
    
    
}
