package Clases;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;


    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Clases.Estudiante: " + nombre + ", Edad: " + edad );
        if(validarEdad()){
            System.out.println("Clases.Estudiante valido");
        }else{
            System.out.println("Clases.Estudiante invalido");
        };
    }

    public boolean validarEdad() {
        if (edad >= 13 && edad <= 60){
            return true;
        }else {
            return false;
        }
    }


}
