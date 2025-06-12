public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;


    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }

    public boolean validarEdad(int edad){
        if(edad >= 13 && edad <= 60){
            System.out.println("El edad esta en el rango");
            return true;
        }else {
            System.out.println("El edad no es valido");
            return false;
        }
    }

}
