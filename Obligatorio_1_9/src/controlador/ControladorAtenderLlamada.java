/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dominio.EventoSistema;
import dominio.Sector.Llamada;
import dominio.trabajador.Trabajador;
import observer.Observable;
import observer.Observador;
import vista.VistaAtender;
import dominio.Sistema;
import dominio.Sector.PuestoDeTrabajo;
import dominio.Sector.SectorException;
import dominio.trabajador.TrabajadorException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorAtenderLlamada implements Observador {

    private Trabajador trabajador;
    private Llamada llamada;
    private VistaAtender vista;
    private PuestoDeTrabajo pdt;
    Sistema sistema = Sistema.getInstancia();

    public ControladorAtenderLlamada(Trabajador trabajador, VistaAtender vista) throws TrabajadorException {
        this.trabajador = trabajador;
        this.vista = vista;
        this.pdt = sistema.asignarPuestoDeTrabajo(trabajador);
        mostrarNombreTrabajador();
        mostrarSector();
        cantidadLlamadasAtendidas();
        tiempoPromedioLlamada();

    }

    @Override
    public void actualizar(Observable origen, Object evento) {
        switch((EventoSistema) evento) {
            case FINALIZAR_LLAMADA:
            cantidadLlamadasAtendidas();
            tiempoPromedioLlamada();
            costoLlamada();
            asignarLlamadaEnEspera();
                break;
            
            case LOGOUT:
                logOut();
                break;
        }
        
        
    }

    private void mostrarNombreTrabajador() {
        String nombre = this.trabajador.getNombre();
        vista.mostrarNombreTrabajador(nombre);
    }

    private void mostrarSector() {
        String nombreSector = sistema.mostrarSector(trabajador.getSector());
        String sector = "Sector: "
                + nombreSector
                + " | Puesto Nro. #"
                + numeroDePuestoDeTrabajo();
        vista.mostrarSector(sector);
    }

    private int numeroDePuestoDeTrabajo() {
        return sistema.numeroDePuestoDeTrabajo(pdt);
    }

    private void cantidadLlamadasAtendidas() {
        String atendidas = sistema.cantidadLlamadasAtendidas(pdt);
        vista.cantidadLlamadasAtendidas(atendidas);
    }

    private void tiempoPromedioLlamada() {
        String atendidas = sistema.tiempoPromedioLlamada(pdt);
        vista.tiempoPromedioLlamada(atendidas);
    }

    public void finalizarLlamada(String descripcion) {
        sistema.finalizarLlamada(llamada, descripcion);
        vista.finalizarLlamada(descripcion);
    }

    public void costoLlamada() {
        sistema.costoLlamada(this.llamada);
    }

    private void logOut() {
        pdt.setLlamadaEnCurso(null);
        pdt.setTrabajador(null);
        this.llamada = null;
        this.pdt = null;
        this.trabajador = null;
    }

    private void asignarLlamadaEnEspera() {
        sistema.asignarLlamadaEnEspera();
    }

}
