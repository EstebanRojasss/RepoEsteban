package ejercicio4;

public class CuentaBancaria {
    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    public CuentaBancaria() {

    }

    public CuentaBancaria(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria:  \n" +
                "NumeroCuenta: " + numeroCuenta +
                "  Dni: " + dni +
                "  SaldoActual: " + saldoActual ;
    }
}
