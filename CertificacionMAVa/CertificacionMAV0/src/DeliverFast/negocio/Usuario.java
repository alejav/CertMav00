/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeliverFast.negocio;

import java.awt.List;

/**
 *
 * @author AlejaV
 */
public class Usuario {
    private String CorreoE;
    private String Apellidos;
    private String Nombres;
    private String Clave;
    private String Ciudad;
    private Boolean Conectado;
    //private List<Pedido> Pedido; Se incorpora cada pedido efectuado por el usuario

    public String getCorreoE() {
        return CorreoE;
    }

    public void setCorreoE(String CorreoE) {
        this.CorreoE = CorreoE;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public Boolean getConectado() {
        return Conectado;
    }

    public void setConectado(Boolean Conectado) {
        this.Conectado = Conectado;
    }

    public Usuario() {
    }

    public Usuario(String CorreoE, String Apellidos, String Nombres, String Clave, String Ciudad, Boolean Conectado) {
        this.CorreoE = CorreoE;
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
        this.Clave = Clave;
        this.Ciudad = Ciudad;
        this.Conectado = Conectado;
    }
    
    public void Conectar(String CorreoE, String Clave)
    {
        //Comprueba los datos y de ser correcto conecta al usuario
    }
    
    public void Pedir()
    {
        //El usuario es quien inicia un pedido, no se implementa por simplificación
    }
}
