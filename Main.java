public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Jorge", 1000.0);
        vendedor.cambiarEstrategia(new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}