package ironman_project.entidades;

public class Armadura {
    protected String colorPrimario;
    protected String colorSecundario;
    protected int bateria;
    protected int resistencia; // 0 - 100

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, int bateria, int resistencia) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.bateria = bateria;
        this.resistencia = resistencia;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
}
