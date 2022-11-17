package dominio.trabajador;

import dominio.EventoSistema;
import dominio.Sector.Sector;
import dominio.Sistema;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SistemaTrabajador {

    private List<Trabajador> trabajadores = new ArrayList<>();
    private List<Sesion> logueados = new ArrayList<>();

    public Trabajador loginTrabajador(String cedula, String password) throws TrabajadorException {
        Trabajador unT = null;
        for (Trabajador t : trabajadores) {
            if (t.getCedula().equals(cedula) && t.getPassword().equals(password)) {
                unT = t;
                if (!usuarioYaLogeado(unT)) {
                    Sesion sesion = new Sesion(unT, LocalDateTime.now());
                    logueados.add(sesion);
                    unT.getSector().setCantidadConectados();
                    //ESTO ESTA BIEN ?????????????????????????????????????????????????
                    Sistema.getInstancia().avisar(EventoSistema.LOGIN);
                }
            }
        }

        if (unT != null) {
            return unT;
        } else {
            throw new TrabajadorException("Acceso denegado");
        }
    }

    public List<Sesion> getLogueados() {
        return logueados;
    }

    public Trabajador crearTrabajador(String cedula, String password, String nombreCompleto, Sector sector) throws TrabajadorException {
        Trabajador t = new Trabajador(cedula, nombreCompleto, password);
        if (!trabajadores.contains(t)) {
            trabajadores.add(t);
            t.setSector(sector);
        } else {
            throw new TrabajadorException("El trabajador ya existe");
        }

        return t;
    }

    private boolean usuarioYaLogeado(Trabajador t) {
        for (Sesion s : logueados) {
            Trabajador unT = s.getTrbajador();
            if (unT.getCedula().equals(t.getCedula())) {
                return true;
            }
        }
        return false;
    }

}
