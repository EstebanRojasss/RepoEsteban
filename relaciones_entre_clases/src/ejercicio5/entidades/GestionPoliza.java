package ejercicio5.entidades;

import ejercicio5.enums.FORMAPAGO;
import ejercicio5.enums.TIPOCOBERTURA;

import java.time.LocalDate;


public class GestionPoliza {
    private ClienteGestion cliente;
    private VehiculoGestion vehiculo;
    private int numeroPoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int cantidadCuotas;
    private FORMAPAGO formaPago;
    private double montoTotalAsegurado;
    private boolean contraGranizo;
    private double montoMaximoGranizo;
    private TIPOCOBERTURA tipoCobertura;


    public GestionPoliza() {
    }

    public GestionPoliza(ClienteGestion cliente, VehiculoGestion vehiculo, int numeroPoliza, LocalDate fechaInicio, LocalDate fechaFin, int cantidadCuotas, FORMAPAGO formaPago, double montoTotalAsegurado, boolean contraGranizo, double montoMaximoGranizo, TIPOCOBERTURA tipoCobertura) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidadCuotas = cantidadCuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.contraGranizo = contraGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public ClienteGestion getCliente() {
        return cliente;
    }

    public void setCliente(ClienteGestion cliente) {
        this.cliente = cliente;
    }

    public VehiculoGestion getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoGestion vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public FORMAPAGO getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FORMAPAGO formaPago) {
        this.formaPago = formaPago;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isContraGranizo() {
        return contraGranizo;
    }

    public void setContraGranizo(boolean contraGranizo) {
        this.contraGranizo = contraGranizo;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public TIPOCOBERTURA getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TIPOCOBERTURA tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "La tercera Seguros" +
                "Cliente: " + cliente +
                "\nvehiculo: " + vehiculo +
                "\nnumeroPoliza: " + numeroPoliza +
                "\nfechaInicio: " + fechaInicio +
                "\nfechaFin: " + fechaFin +
                "\ncantidadCuotas: " + cantidadCuotas +
                "\nformaPago: " + formaPago +
                "\nmontoTotalAsegurado: " + montoTotalAsegurado +
                "\ncontraGranizo: " + contraGranizo +
                "\nmontoMaximoGranizo: " + montoMaximoGranizo +
                "\ntipoCobertura: " + tipoCobertura ;
    }
}
