class Matricula {
    private Estudiante.Estudiante estudiante;
    private Curso curso;

    public Matricula(Estudiante.Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public void mostrarDetalle() {
        estudiante.mostrarDatos();
        curso.mostrarResumen();
    }
}
