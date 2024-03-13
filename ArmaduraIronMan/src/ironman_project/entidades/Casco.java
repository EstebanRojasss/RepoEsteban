package ironman_project.entidades;

public class Casco {
    private String consola;
    private String sintetizador;

    public Casco(String consola, String sintetizador) {
        this.consola = consola;
        this.sintetizador = sintetizador;
    }

    public Casco() {
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(String sintetizador) {
        this.sintetizador = sintetizador;
    }


}
