/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dominio.Sistema;
import dominio.trabajador.Trabajador;
import dominio.trabajador.TrabajadorException;
import vista.VistaLogin;

public class ControladorUsuario {

    private VistaLogin vista;
    Sistema sistema = Sistema.getInstancia();

    public ControladorUsuario(VistaLogin v) {
        this.vista = v;
    }

    public void login(String cedula, String pass) throws TrabajadorException {
        Trabajador unT = sistema.loginTrabajador(cedula, pass);
        vista.mostrarProximaInterfaz(unT);
    }
}
