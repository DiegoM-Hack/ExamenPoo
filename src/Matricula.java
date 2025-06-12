import Clases.Estudiante;
import ClasesPadre.Curso;

public class Matricula {
    private Estudiante estudiante;
    private Curso curso;

    public Matricula(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public void mostrarDetalle() {
        estudiante.mostrarDatos();
        curso.mostrarResumen();
    }
}
