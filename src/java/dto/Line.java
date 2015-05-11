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
public class Line {
 
    private String CodLinea;
    private String NomLinea;

    public Line() {
    }

    public Line(String CodLinea, String NomLinea) {
        this.CodLinea = CodLinea;
        this.NomLinea = NomLinea;
    }

    public String getCodLinea() {
        return CodLinea;
    }

    public void setCodLinea(String CodLinea) {
        this.CodLinea = CodLinea;
    }

    public String getNomLinea() {
        return NomLinea;
    }

    public void setNomLinea(String NomLinea) {
        this.NomLinea = NomLinea;
    }
    
    
    
}
