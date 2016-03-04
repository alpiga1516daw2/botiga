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
public class Empresa {
    public String Nom_empr;
    private String Codi_empr;
    public String Comanda_empr;
    
    public Empresa(String Nom_empr, String Comanda_empr){
        this.Nom_empr = Nom_empr;
        this.Comanda_empr = Comanda_empr;
        
        
    }

    public String getNom_empr() {
        return Nom_empr;
    }

    public void setNom_empr(String Nom_empr) {
        this.Nom_empr = Nom_empr;
    }

    public String getComanda_empr() {
        return Comanda_empr;
    }

    public void setComanda_empr(String Comanda_empr) {
        this.Comanda_empr = Comanda_empr;
    }
       
  
}
