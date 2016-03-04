/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botiga;


import java.util.Date;

/**
 *
 * @author alex
 */
public class Compra {
    public char Nom_compra;
    private String Codi_compra;
    public Date Data_compra;
    public Integer Quantitat_compra; 
    public Integer Preu_compra;

    //<editor-fold defaultstate="collapsed" desc="comment">
    public Compra(char Nom_compra, Date Data_compra, int Quantitat_compra, int Preu_compra)
//</editor-fold>
 {
        this.Nom_compra = Nom_compra;
        this.Data_compra = Data_compra;
        this.Quantitat_compra = Quantitat_compra;
    
        
    }

    public char getNom_compra() {
        return Nom_compra;
    }

    public void setNom_compra(char Nom_compra) {
        this.Nom_compra = Nom_compra;
    }

    public Date getData_compra() {
        return Data_compra;
    }

    public void setData_compra(Date Data_compra) {
        this.Data_compra = Data_compra;
    }

    public Integer getQuantitat_compra() {
        return Quantitat_compra;
    }

    public void setQuantitat_compra(Integer Quantitat_compra) {
        this.Quantitat_compra = Quantitat_compra;
    }

    public Integer getPreu_compra() {
        return Preu_compra;
    }

    public void setPreu_compra(Integer Preu_compra) {
        this.Preu_compra = Preu_compra;
    }
}
