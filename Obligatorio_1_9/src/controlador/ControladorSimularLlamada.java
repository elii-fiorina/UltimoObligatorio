/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dominio.Sector.Llamada;
import dominio.Sector.Sector;
import dominio.Sector.SectorException;
import dominio.Sistema;
import dominio.cliente.Cliente;
import dominio.cliente.ClienteException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import observer.Observable;
import observer.Observador;
import vista.VistaSimularLlamada;

public class ControladorSimularLlamada implements Observador {

    private VistaSimularLlamada vista;
    private Sistema sistema = Sistema.getInstancia();
    private List<Sector> sectores = new ArrayList<>();
    private Cliente cli;
    private Llamada llamada;

    public ControladorSimularLlamada(VistaSimularLlamada vista) {
        this.cli = null;
        this.sectores = sistema.getSectores();
        this.vista = vista;
        this.cli = null;
    }

    public void seleccionarCliente(String cedula) throws ClienteException {
        Cliente cliente = sistema.seleccionarCliente(cedula);
        this.cli = cliente;
        mostrarSectores();
    }

    @Override
    public void actualizar(Observable origen, Object evento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mostrarSectores() {
        vista.mostrarTodosLosSectores(sectores);
    }

    public Sector traerSector(int sectorElegido) throws SectorException {
        if (sectorElegido <= sectores.size()) {
            return sectores.get(sectorElegido - 1);
        } else {
            throw new SectorException("El numero elegido no corresponde a un sector");
        }
    }

    public void iniciarLlamada(Sector s) throws SectorException {
        Llamada l = sistema.crearLlamada(LocalDateTime.now(), s, cli);
        sistema.atenderLlamada(l);
        this.llamada = l;
        vista.iniciarLlamada(s, l.nombreTrabajador());
    }

    public void finalizarLlamada() {
        sistema.finalizarLlamada(llamada, "");
        Cliente c = llamada.getCliente();
        double costo = llamada.getCosto();
        double saldo = c.getSaldo();
        double duracion = llamada.getDuracion();
        vista.finalizarLlamada(costo, saldo, duracion);
        
    }

}
