public class CursoCertificado extends CursoRegular {
    private double precioBase;

    public CursoCertificado(String nombre, double precioBase) {
        super(nombre);
        this.precioBase = precioBase;
    }

    public double calcularPrecioFinal() {
        return precioBase * 1.25;
    }

    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.println("Precio final: $" + calcularPrecioFinal());
    }
}