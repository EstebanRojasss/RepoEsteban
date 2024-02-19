package ejercicio2.enums;

public enum CONSUMO_ENERGETICO {
    A(1000), B(800), C(600), D(500), E(300), F(100);
    final double precios;

    CONSUMO_ENERGETICO(double precios) {
        this.precios = precios;
    }

    public double getPrecios() {
        return precios;
    }

}
