class Evaluacion {
    private double nota;

    public Evaluacion(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10.");
        }
    }

    public double getResultado() {
        return nota;
    }
}
