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
public class Vendes {
    public String Nom_producte;
    public char Pais_producte;
    public int Preu_unitat_producte;
    public char Varietat;
    public Date Data_venda;
    private String Codi_venda;
    
    public Vendes(String Nom_producte, Date Data_venda, int Preu_unitat_producte, char Pais_producte, char Varietat){
        this.Data_venda = Data_venda;
        this.Nom_producte = Nom_producte;
        this.Pais_producte = Pais_producte;
        this.Preu_unitat_producte = Preu_unitat_producte;
        this.Varietat = Varietat;
        
        
    }

    public String getNom_producte() {
        return Nom_producte;
    }

    public void setNom_producte(String Nom_producte) {
        this.Nom_producte = Nom_producte;
    }

    public char getPais_producte() {
        return Pais_producte;
    }

    public void setPais_producte(char Pais_producte) {
        this.Pais_producte = Pais_producte;
    }

    public int getPreu_unitat_producte() {
        return Preu_unitat_producte;
    }

    public void setPreu_unitat_producte(int Preu_unitat_producte) {
        this.Preu_unitat_producte = Preu_unitat_producte;
    }

    public char getVarietat() {
        return Varietat;
    }

    public void setVarietat(char Varietat) {
        this.Varietat = Varietat;
    }

    public Date getData_venda() {
        return Data_venda;
    }

    public void setData_venda(Date Data_venda) {
        this.Data_venda = Data_venda;
    }
    
}
