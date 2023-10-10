package domain;

import java.util.ArrayList;
import java.util.List;

public class alumno {
    private String nombre;
    private int edad;
    private List<asignacion> asignaciones;

    public alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void agregarAsignacion(asignacion asignacion) {
        asignaciones.add(asignacion);
    }

    public String toString() {
        return "Alumno - Nombre: " + nombre + ", Edad: " + edad;
    }
}
