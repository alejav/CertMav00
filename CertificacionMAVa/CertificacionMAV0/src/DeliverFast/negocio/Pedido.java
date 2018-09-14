/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeliverFast.negocio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AlejaV
 */
public class Pedido {
    private Usuario Usuario;
    private Direccion Origen;
    private Direccion Destino;
    private Boolean Ida_y_Vuelta;
    private String Detalle;
    private BigDecimal Total_Estimado;
    private BigDecimal Comision;
    private BigDecimal PagaCon;
    private BigDecimal Vuelto;
    private List<Estado> Estado;

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public Direccion getOrigen() {
        return Origen;
    }

    public void setOrigen(Direccion Origen) {
        this.Origen = Origen;
    }

    public Direccion getDestino() {
        return Destino;
    }

    public void setDestino(Direccion Destino) {
        this.Destino = Destino;
    }

    public Boolean getIda_y_Vuelta() {
        return Ida_y_Vuelta;
    }

    public void setIda_y_Vuelta(Boolean Ida_y_Vuelta) {
        this.Ida_y_Vuelta = Ida_y_Vuelta;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public BigDecimal getTotal_Estimado() {
        return Total_Estimado;
    }

    public void setTotal_Estimado(BigDecimal Total_Estimado) {
        this.Total_Estimado = Total_Estimado;
    }

    public BigDecimal getComision() {
        return Comision;
    }

    public void setComision(BigDecimal Comision) {
        this.Comision = Comision;
    }

    public BigDecimal getPagaCon() {
        return PagaCon;
    }

    public void setPagaCon(BigDecimal PagaCon) {
        this.PagaCon = PagaCon;
    }

    public BigDecimal getVuelto() {
        return Vuelto;
    }

    public void setVuelto(BigDecimal Vuelto) {
        this.Vuelto = Vuelto;
    }

    public Estado getEstado() {
        return this.Estado.get(this.Estado.size()-1);
    }

    public void setEstado(Estado Estado) {
        this.Estado.add(Estado);
    }

    
    public Pedido()
    {
        this.Estado = new ArrayList<>();
    }
    public Pedido(Usuario Usuario, Direccion Origen, Direccion Destino, Boolean Ida_y_Vuelta, String Detalle, BigDecimal Total_Estimado, BigDecimal Comision, BigDecimal PagaCon, BigDecimal Vuelto, Estado Estado) {
        this.Usuario = Usuario;
        this.Origen = Origen;
        this.Destino = Destino;
        this.Ida_y_Vuelta = Ida_y_Vuelta;
        this.Detalle = Detalle;
        this.Total_Estimado = Total_Estimado;
        this.Comision = Comision;
        this.PagaCon = PagaCon;
        this.Vuelto = Vuelto;
        this.Estado = new ArrayList<>();
        this.Estado.add(Estado);
    }
    
    
}
