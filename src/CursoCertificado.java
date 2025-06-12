public class CursoCertificado extends CursoRegular {
    private double nota;


    public CursoCertificado(  double nota, double precio) {
        super(precio);
        this.nota = nota;

    }

    public double calcularPrecioFinal(){
        double total = getPrecio() *1.25;
        return total;
    }

    public void mostrarResumen(){}
}
