/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeliverFast.controller;

import DeliverFast.negocio.Usuario;
import DeliverFast.ui.PantallaGenerarPedido;

/**
 *
 * @author AlejaV
 */
public class GestorPedido {
        private Usuario miusu;
        public GestorPedido()
        {
            this.miusu = new Usuario("yo@yo.com", "Vizoso", "Maria Alejandra", "xxx", "CABA", true);
        }
        public void run () {
        new PantallaGenerarPedido(miusu).setVisible(true);
    }
}
