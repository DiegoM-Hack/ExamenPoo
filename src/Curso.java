import java.util.List;

public class Curso {
    private String nombre;
    private String profesor;
    protected List<Servicio> serviciosAdicionales;

    public Curso(String nombre, String profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public void mostrarResumen(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Profesor: " + profesor);
    }

    public void asignarDocente(String docente){

    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getProfesor() {
        return profesor;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

}
