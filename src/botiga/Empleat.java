/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botiga;

/**
 *
 * @author alex
 */
public class Empleat {
    public char Nom_emp;
    private String Codi_emp;
    public String DNI;
    public String NSS;
    
    public Empleat(char Nom_emp, String DNI, String NSS){
        this.DNI = DNI;
        this.NSS = NSS;
        this.Nom_emp = Nom_emp;
        
        
    }

    public char getNom_emp() {
        return Nom_emp;
    }

    public void setNom_emp(char Nom_emp) {
        this.Nom_emp = Nom_emp;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }
    
}
