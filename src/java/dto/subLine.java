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
public class subLine {

 private String codsub;
 private String NomSub;

    public subLine() {
    }

    public subLine(String codsub, String NomSub) {
        this.codsub = codsub;
        this.NomSub = NomSub;
    }

    public String getCodsub() {
        return codsub;
    }

    public void setCodsub(String codsub) {
        this.codsub = codsub;
    }

    public String getNomSub() {
        return NomSub;
    }

    public void setNomSub(String NomSub) {
        this.NomSub = NomSub;
    }
 
 
 
    
}
