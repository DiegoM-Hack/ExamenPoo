

class Curso {
    protected String nombre;
    protected String docente;

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public void asignarDocente(String docente) {
        this.docente = docente;
    }

    public void mostrarResumen() {
        System.out.println("Curso: " + nombre + ", Docente: " + (docente != null ? docente : "No asignado"));
    }
}
