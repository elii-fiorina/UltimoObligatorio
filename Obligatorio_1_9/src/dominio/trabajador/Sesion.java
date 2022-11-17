package dominio.trabajador;

import java.time.LocalDateTime;

public class Sesion {

    private LocalDateTime fechaUltimoIngreso;
    private Trabajador trabajador;

    public Sesion(Trabajador trabajador, LocalDateTime fecha) {
        this.trabajador = trabajador;
    }

    public Trabajador getTrbajador() {
        return trabajador;
    }

    public LocalDateTime getFechaUltimoIngreso() {
        return fechaUltimoIngreso;
    }
}
