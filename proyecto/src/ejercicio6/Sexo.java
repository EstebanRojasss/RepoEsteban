package ejercicio6;

public enum Sexo {
    H('H'),
    M('M'),
    O('O');

    final char sexo;

  Sexo(char sexo) {
    this.sexo = sexo;
  }

  @Override
  public String toString() {
    return ""+
            "Sexo: " + sexo ;
  }
}
