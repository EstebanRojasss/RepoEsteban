package ironman_project.entidades;

public class Armadura {
    protected String colorPrimario;
    protected String colorSecundario;
    protected int bateria;
    protected int resistencia;
    protected int nivelSalud;
    protected Bota bota;
    protected Guante guante;

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, int bateria, int resistencia, int nivelSalud, Bota bota, Guante guante) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.bateria = bateria;
        this.resistencia = resistencia;
        this.nivelSalud = nivelSalud;
        this.bota = bota;
        this.guante = guante;
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

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public Bota getBota() {
        return bota;
    }

    public void setBota(Bota bota) {
        this.bota = bota;
    }

    public Guante getGuante() {
        return guante;
    }

    public void setGuante(Guante guante) {
        this.guante = guante;
    }
}
