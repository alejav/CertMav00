/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeliverFast.negocio;

import java.time.LocalDateTime;

/**
 *
 * @author AlejaV
 */
public class Estado {
    private Pedido Pedido;
    private Estado_Nombre Nombre;
    private LocalDateTime Entrada;

    public Pedido getPedido() {
        return Pedido;
    }

    public void setPedido(Pedido Pedido) {
        this.Pedido = Pedido;
    }

    public Estado_Nombre getNombre() {
        return Nombre;
    }

    public void setNombre(Estado_Nombre Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDateTime getEntrada() {
        return Entrada;
    }

    public void setEntrada(LocalDateTime Entrada) {
        this.Entrada = Entrada;
    }

    public Estado() {
    }

    public Estado(Pedido Pedido, Estado_Nombre Nombre, LocalDateTime Entrada) {
        this.Pedido = Pedido;
        this.Nombre = Nombre;
        this.Entrada = Entrada;
    }
}
