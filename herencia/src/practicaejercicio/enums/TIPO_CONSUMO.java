package practicaejercicio.enums;

public enum TIPO_CONSUMO {
    A(1000),B(800),C(600),D(500),E(300),F(100);

    final double precioConusmo;

    TIPO_CONSUMO(double precioConusmo) {
        this.precioConusmo = precioConusmo;
    }

    public double getPrecioConusmo() {
        return precioConusmo;
    }
}
