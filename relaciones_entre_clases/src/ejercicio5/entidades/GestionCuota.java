package ejercicio5.entidades;

import ejercicio5.enums.FORMAPAGO;

import java.time.LocalDate;
import java.util.Date;

public class GestionCuota {
 private int numeroCuota;
 private double montoTotalCuota;
 private boolean pagada;
 private LocalDate fechaVencimiento;
 private FORMAPAGO formaPago;

    public GestionCuota() {
    }

    public GestionCuota(int numeroCuota, double montoTotalCuota, boolean pagada, LocalDate fechaVencimiento, FORMAPAGO formaPago) {
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public FORMAPAGO getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FORMAPAGO formaPago) {
        this.formaPago = formaPago;
    }


    @Override
    public String toString() {
        return "Cuota numero: " + numeroCuota +
                "\nmontoTotalCuota: " + montoTotalCuota +
                "\npagada: " + pagada +
                "\nfechaVencimiento: " + fechaVencimiento +
                "\nformaPago: " + formaPago ;
    }
}
