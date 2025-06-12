package Clases;

public class Docente {
    private String nombre;
    private String apellido;
    private int edad;
    private String asignatura;

    public Docente(String nombre, String apellido, int edad, String asignatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.asignatura = asignatura;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);

    }
}
