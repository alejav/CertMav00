/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeliverFast.negocio;

/**
 *
 * @author AlejaV
 */
public class Direccion {
    private String Calle;
    private String Numero;
    private String Of_Depto;
    private String Piso;

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getOf_Depto() {
        return Of_Depto;
    }

    public void setOf_Depto(String Of_Depto) {
        this.Of_Depto = Of_Depto;
    }

    public String getPiso() {
        return Piso;
    }

    public void setPiso(String Piso) {
        this.Piso = Piso;
    }

    public Direccion() {
    }

    public Direccion(String Calle, String Numero, String Of_Depto, String Piso) {
        this.Calle = Calle;
        this.Numero = Numero;
        this.Of_Depto = Of_Depto;
        this.Piso = Piso;
    }
    
    
}
