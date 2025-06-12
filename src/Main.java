import Clases.Docente;
import Clases.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellidoEstudiante = sc.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el nombre del docente: ");
        String nombreDocente = sc.nextLine();
        System.out.print("Ingrese el apellido del docente: ");
        String apellidoDocente = sc.nextLine();
        System.out.print("Ingrese la edad del docente: ");
        int edadDocente = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la especialidad del docente: ");
        String especialidad = sc.nextLine();

        System.out.print("Ingrese el nombre del curso regular: ");
        String nombreCurso = sc.nextLine();

        System.out.print("Ingrese el nombre del curso certificado: ");
        String nombreCursoCertificado = sc.nextLine();
        System.out.print("Ingrese el costo del curso certificado: ");
        double costoCursoCertificado = sc.nextDouble();

        // Crear objetos con datos del usuario
        CursoRegular curso1 = new CursoRegular(nombreCurso);
        CursoCertificado curso2 = new CursoCertificado(nombreCursoCertificado, costoCursoCertificado);
        Estudiante estudiante1 = new Estudiante(nombreEstudiante, apellidoEstudiante, edadEstudiante);
        Docente docente1 = new Docente(nombreDocente, apellidoDocente, edadDocente, especialidad);
        Matricula matricula1 = new Matricula(estudiante1, curso1);

        sc.nextLine(); // Limpiar el buffer

        // Asignar docentes a cursos
        curso1.asignarDocente( apellidoDocente); // Asignación automática con apellido
        curso2.asignarDocente(" Pérez");

        // Mostrar detalles
        curso1.mostrarResumen();
        curso2.mostrarResumen();
        estudiante1.mostrarDatos();

        docente1.mostrarDatos();
        matricula1.mostrarDetalle();


        // Evaluación
        System.out.print("Ingrese la nota del estudiante: ");
        double nota = sc.nextDouble();
        Evaluacion eval1 = new Evaluacion(nota);
        System.out.println("Nota obtenida: " + eval1.getResultado());
        int opcion = sc.nextInt();
        eval1.certificar(nota,opcion);

        sc.close(); // Cerrar el scanner

    }
}