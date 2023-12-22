package ejercicio5.entidades;

import ejercicio5.enums.TIPODEAUTOMOVIL;

public class VehiculoGestion {
    private String marca;
    private String modelo;
    private int anho;
    private int numeroMotor;
    private String chasis;
    private String color;
    private TIPODEAUTOMOVIL tipoDeAuto;

    public VehiculoGestion() {
    }

    public VehiculoGestion(String marca, String modelo, int anho, int numeroMotor, String chasis, String color, TIPODEAUTOMOVIL tipoDeAuto) {
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipoDeAuto = tipoDeAuto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TIPODEAUTOMOVIL getTipoDeAuto() {
        return tipoDeAuto;
    }

    public void setTipoDeAuto(TIPODEAUTOMOVIL tipoDeAuto) {
        this.tipoDeAuto = tipoDeAuto;
    }

    @Override
    public String toString() {
        return "Vehiculo " +
                "\nmarca: " + marca +
                ", modelo: " + modelo +
                ", anho: " + anho +
                ", chasis: " + chasis  +
                ", color: " + color ;
    }
}
