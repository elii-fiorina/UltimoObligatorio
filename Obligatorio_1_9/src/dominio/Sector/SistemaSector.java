/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.Sector;

import dominio.EventoSistema;
import dominio.Sistema;
import dominio.cliente.Cliente;
import dominio.trabajador.Trabajador;
import dominio.trabajador.TrabajadorException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sofia
 */
public class SistemaSector{

    private List<PuestoDeTrabajo> puestos = new ArrayList<>();
    private List<Sector> sectores = new ArrayList<>();
    private List<Llamada> llamadas = new ArrayList<>();
    private List<Llamada> llamadasEntrantes = new ArrayList<>();
    private Sistema sistema = new Sistema();
   

    public List<PuestoDeTrabajo> getPuestos() {
        return puestos;
    }

    public List<Sector> getSectores() {
        return sectores;
    }

    public List<Llamada> getLlamadas() {
        return llamadas;
    }

    public PuestoDeTrabajo crearPuestoDeTrabajo(double tiempoPromedio, int llamadasAtendidas) {
        PuestoDeTrabajo pdt = new PuestoDeTrabajo(tiempoPromedio, llamadasAtendidas);
        if (!puestos.contains(pdt)) {
            int aux = puestos.size();
            pdt.setNumero(aux);
            puestos.add(pdt);
        }

        return pdt;
    }

    public Llamada crearLlamada(LocalDateTime fechaInicio, Sector sector, Cliente cliente) {
        Llamada llamada = new Llamada(fechaInicio, sector, cliente);
        if (!llamadasEntrantes.contains(llamada)) {
            llamadasEntrantes.add(llamada);
        }
        return llamada;
    }

    public Sector crearSector(String nombre, int numero, int cantidadPuestos) {
        Sector sector = new Sector(nombre, numero, cantidadPuestos);
        if (!sectores.contains(sector)) {
            sectores.add(sector);
        }
        return sector;
    }

    public void agregarPuestoEnSector(PuestoDeTrabajo p, Sector s) {
        s.agregarPuesto(p);
    }

    public int numeroDePuestoDeTrabajo(PuestoDeTrabajo pdt) {
        return pdt.getNumero();
    }

    public String cantidadLlamadasAtendidas(PuestoDeTrabajo pdt) {
        String llamadass = Integer.toString(pdt.getLlamadasAtendidas());
        return llamadass;
    }

    public String tiempoPromedioLlamada(PuestoDeTrabajo pdt) {
        String promedio = Double.toString(pdt.getTiempoPromedio());
        return promedio;
    }

    public void agregarSectorATrabajador(Trabajador t, Sector sector) throws SectorException {
        t.setSector(sector);
    }

    public PuestoDeTrabajo puestosDisponibles(Trabajador unT) throws TrabajadorException {
        if (!unT.getSector().puestoDisponible()) {
            throw new TrabajadorException("No hay puestos disponibles");
        } else {
            return asignarPuesto(unT);
        }
    }

    public PuestoDeTrabajo asignarPuesto(Trabajador unT) {
        PuestoDeTrabajo p = unT.getSector().asignarPuesto(unT);
        return p;
    }

    public String mostrarSector(Sector sector) {
        return sector.getNombre();
    }

    public void finalizarLlamada(Llamada llamada, String descripcion) {
        llamada.finalizar(descripcion);
        PuestoDeTrabajo pdt = obtenerPuestoDeLlamada(llamada);
     //   sistema.avisar(EventoSistema.FINALIZAR_LLAMADA);
        if (pdt != null) {
            pdt.setLlamadaEnCurso(null);
        }
    }

    
    public double costoLlamada(Llamada llamada) {
        double costo = llamada.calcularCostoLlamada();
        if (costo > 0) {
            return costo;
        } else {
            return 0;
        }
    }

    public List<String> mostrarLlamadasSector(String sectorElegido) throws TrabajadorException {
        if ("Ver las llamadas de todos los sectores".equals(sectorElegido)) {
            return listaTodasLasLlamadas();
        } else {
            Sector sec = null;
            for (Sector s : sectores) {
                if (s.getNombre() == null ? sectorElegido == null : s.getNombre().equals(sectorElegido)) {
                    sec = s;
                }
            }
            if (sec != null) {
                return listaDeLlamadas(sec);
            }
        }
        throw new TrabajadorException("No hay llamadas para el sector");
    }

    private List<String> listaDeLlamadas(Sector sec) {
        List<String> ret = new ArrayList<>();
        ret.add("#llamada | Estado | Inicio | Fin | #puesto | Trabajador | Duracion | Costo | Cliente | Saldo ");
        llamadas.stream().filter((l) -> (l.getSector() == sec)).map((l) -> String.valueOf(l.getNumero() + " | ")
                + l.estadoDeLlamada() + " | "
                + String.valueOf(l.getFechaInicio()) + " | "
                + String.valueOf(l.getFechaFin()) + " | "
                + sec.traerPuesto(l) + " | "
                + l.nombreTrabajador() + " | "
                + String.valueOf(l.getDuracion()) + " | "
                + String.valueOf(l.getCosto()) + " | "
                + l.nombreCliente()).forEachOrdered((aux2) -> {
            ret.add(aux2);
        });
        return ret;
    }

    public void atenderLlamada(Llamada l) throws SectorException {
        Sector s = l.getSector();
        PuestoDeTrabajo pdt = s.buscarPuesto();
        if (pdt != null) {
            llamadasEntrantes.remove(l);
            l.setFechaInicio(LocalDateTime.now());
            l.setTrabajador(pdt.getTrabajador());
            l.setNumero(llamadas.size());
            llamadas.add(l);
            pdt.setLlamadaEnCurso(l);
            
        } else {
            int enEspera = 0;
            enEspera = llamadasEntrantes.stream().filter((llam) -> (llam.getSector() == s)).map((_item) -> 1).reduce(enEspera, Integer::sum);
            throw new SectorException("Aguarde en línea, Ud. se encuentra a " + enEspera + " llamadas de ser atendido, la espera estimada es N de minutos");
        }

    }

   
    private PuestoDeTrabajo obtenerPuestoDeLlamada(Llamada llamada) {
        for (PuestoDeTrabajo p : puestos) {
            if (p.getLlamadaEnCurso() != null) {
                if (p.getLlamadaEnCurso().equals(llamada)) {
                    return p;
                }
            }
        }
        return null;
    }

    private List<String> listaTodasLasLlamadas() {
        List<String> ret = new ArrayList<>();
        ret.add("Sector | #llamada | Estado | Inicio | Fin | #puesto | Trabajador | Duracion | Costo | Cliente | Saldo ");
        for (Llamada l : llamadas) {
            String aux = (l.nombreSector() + " | "
                    + String.valueOf(l.getNumero()) + " | "
                    + l.estadoDeLlamada() + " | "
                    + String.valueOf(l.getFechaInicio()) + " | "
                    + String.valueOf(l.getFechaFin()) + " | "
                    + l.getSector().traerPuesto(l) + " | "
                    + l.nombreTrabajador() + " | "
                    + String.valueOf(l.getDuracion()) + " | "
                    + String.valueOf(l.getCosto()) + " | "
                    + l.nombreCliente());
            ret.add(aux);
        }
        return ret;
    }

    public void calcularDuracion(Llamada llamada) {
         llamada.calcularDuracion();
    }

    public void asignarLlamadaEnEspera() {
        Llamada llamadaEnEspera = llamadasEntrantes.get(0);
        Sector s = llamadaEnEspera.getSector();
        PuestoDeTrabajo pdt = s.buscarPuesto();
        if (pdt != null) {
            llamadasEntrantes.remove(llamadaEnEspera);
            llamadaEnEspera.setFechaInicio(LocalDateTime.now());
            llamadaEnEspera.setTrabajador(pdt.getTrabajador());
            llamadaEnEspera.setNumero(llamadas.size());
            llamadas.add(llamadaEnEspera);
            pdt.setLlamadaEnCurso(llamadaEnEspera);
        }
       }
}
