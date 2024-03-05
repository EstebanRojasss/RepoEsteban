package ironman_project.enums;

public enum DurezaDeMateriales {
    ALUMINIO(20),
    COBRE(35),
    ACERO_BLANDO(120),
    ACERO_INOXIDABLE(250),
    ACERO_HERRAMIENTAS(500),
    MADERA(7),
    NIQUEL(90),
    VIDRIO(482);

    final int nivelDureza;


    DurezaDeMateriales(int nivelDureza) {
        this.nivelDureza = nivelDureza;
    }

    public int getNivelDureza() {
        return nivelDureza;
    }
}
