import Clases.Estudiante;

public class Evaluacion {
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

    public void certificar(double nota, int tipoCurso ){
        System.out.println("Cual fue tu curso: 1) Regular 2)Certificado" );
        if (nota >= 7 && tipoCurso == 2) {
            System.out.println("Aprueba el curso y obtienes una certificacion");
        }else if (nota >= 7 && tipoCurso == 1){
            System.out.println("Apruebas el curso pero no tienes una certificacion");
        }else{
            System.out.println("No aprobaste");
        }
    }
}
