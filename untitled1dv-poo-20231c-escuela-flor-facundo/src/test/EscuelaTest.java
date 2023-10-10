package test;

import domain.alumno;
import domain.asignacion;
import domain.materia;
import domain.nota;

import java.util.ArrayList;
import java.util.List;

public class EscuelaTest {
    public static void main(String[] args) {
        // Crear al menos 3 materias
        materia matematicas = new materia("Matemáticas");
        materia historia = new materia("Historia");
        materia literatura = new materia("Literatura");

        // Crear al menos 3 alumnos
        alumno alumno1 = new alumno("Juan", 20);
        alumno alumno2 = new alumno("Maria", 22);
        alumno alumno3 = new alumno("Pedro", 21);

        // Agregar a la lista de asignaciones de la escuela al menos 6 asignaciones de materias con alumnos
        asignacion asignacion1 = new asignacion(alumno1, matematicas);
        asignacion asignacion2 = new asignacion(alumno1, historia);
        asignacion asignacion3 = new asignacion(alumno2, historia);
        asignacion asignacion4 = new asignacion(alumno2, literatura);
        asignacion asignacion5 = new asignacion(alumno3, matematicas);
        asignacion asignacion6 = new asignacion(alumno3, literatura);

        // Configurar el conjunto de notas para cada asignación (ahora son enteros en el rango de 1-10)
        asignacion1.agregarNota(new nota(1, 4, 9));
        asignacion2.agregarNota(new nota(4, 4, 10));
        asignacion3.agregarNota(new nota(8, 2, 8));
        asignacion4.agregarNota(new nota(5, 9, 8));
        asignacion5.agregarNota(new nota(9, 8, 9));
        asignacion6.agregarNota(new nota(6, 3, 1));

        // Mostrar el resultado del estado de las asignaciones de materias y alumnos de la escuela
        System.out.println("Estado de las asignaciones:");

        // Recorremos las asignaciones creadas previamente
        List<asignacion> asignaciones = new ArrayList<>();
        asignaciones.add(asignacion1);
        asignaciones.add(asignacion2);
        asignaciones.add(asignacion3);
        asignaciones.add(asignacion4);
        asignaciones.add(asignacion5);
        asignaciones.add(asignacion6);

        for (asignacion asignacion : asignaciones) {
            System.out.println("\nNombre: " + asignacion.getAlumno().getNombre());
            System.out.println("Materia: " + asignacion.getMateria().getNombre());

            // Recorremos las notas de cada asignación
            List<nota> notas = asignacion.getNotas();
            int notaNum = 1;
            for (nota nota : notas) {
                System.out.println("Notas " + notaNum + ": " + nota.getPrimerParcial() + ", " +
                        nota.getSegundoParcial() + ", " + nota.getTrabajoPractico());
                notaNum++;
            }

            double promedio = asignacion.calcularPromedio();
            System.out.println("Promedio: " + promedio);
            System.out.println("Aprobado o no: " + asignacion.obtenerEstado());
        }
    }
}
