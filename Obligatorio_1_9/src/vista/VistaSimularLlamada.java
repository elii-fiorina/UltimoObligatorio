package vista;

import dominio.Sector.Sector;
import dominio.Sector.SectorException;
import java.util.List;

public interface VistaSimularLlamada {

    public void mostrarTodosLosSectores(List<Sector> sectoresTotal);

    public void iniciarLlamada(Sector sec, String t) throws SectorException;

    public void finalizarLlamada(double costo, double saldo, double duracion);
}
