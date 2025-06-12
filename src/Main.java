import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Objetos con valores nulos
        CursoRegular curso1 = new CursoRegular("Matemáticas");
        CursoCertificado curso2 = new CursoCertificado("Programación", 200);
        Estudiante estudiante1 = new Estudiante("Juan","Montaluisa", 15);
        Docente docente1 = new Docente("Diego","Lopez",34,"Matematicas");
        Matricula matricula1 = new Matricula(estudiante1, curso1);

        // Asignar valores con setters o entrada por consola
        curso1.asignarDocente("Profesor López");
        curso2.asignarDocente("Profesor Pérez");

        // Mostrar detalles
        curso1.mostrarResumen();
        curso2.mostrarResumen();
        estudiante1.mostrarDatos();
        docente1.mostrarDatos();
        matricula1.mostrarDetalle();

        // Evaluaciones
        Evaluacion eval1 = new Evaluacion(8.5);
        System.out.println("Nota obtenida: " + eval1.getResultado());



        sc.close();

    }
}