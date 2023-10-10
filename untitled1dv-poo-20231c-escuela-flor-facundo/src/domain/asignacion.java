package domain;

import java.util.ArrayList;
import java.util.List;

public class asignacion {
    private alumno alumno;
    private materia materia;
    private List<nota> notas;

    public asignacion(alumno alumno, materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.notas = new ArrayList<>();
    }

    public alumno getAlumno() {
        return alumno;
    }

    public materia getMateria() {
        return materia;
    }

    public List<nota> getNotas() {
        return notas;
    }

    public void agregarNota(nota nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double sumaNotas = 0;
        for (nota nota : notas) {
            sumaNotas += nota.getPrimerParcial() + nota.getSegundoParcial() + nota.getTrabajoPractico();
        }

        return sumaNotas / (3.0 * notas.size());
    }

    public String obtenerEstado() {
        double promedio = calcularPromedio();
        return (promedio >= 6.0) ? "Aprobado" : "Reprobado";
    }

    public String toString() {
        return "Asignación - Alumno: " + alumno.getNombre() + ", Materia: " + materia.getNombre();
    }
}
