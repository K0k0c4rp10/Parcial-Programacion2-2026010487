public class ComisionPersonalizada implements EstrategiaComision {
    // "Jorge" = 5 letras -> (5 + 5)% = 10%
    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * 0.10;
    }
}