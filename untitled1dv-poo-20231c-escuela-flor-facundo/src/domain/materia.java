package domain;

import java.util.ArrayList;
import java.util.List;

public class materia {
    private String nombre;
    private List<asignacion> asignaciones;

    public materia(String nombre) {
        this.nombre = nombre;
        this.asignaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void agregarAsignacion(asignacion asignacion) {
        asignaciones.add(asignacion);
    }


    public String toString() {
        return "Materia - Nombre: " + nombre;
    }
}
