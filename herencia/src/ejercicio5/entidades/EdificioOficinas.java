package ejercicio5.entidades;
/*
Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
personas por oficina y numero de pisos. Esta clase implementará los dos
métodos abstractos y los atributos del padre.
 */
public class EdificioOficinas extends Edificio{
    private int numeroOficinas;
    private int cantidadDePersonasxOficina;
    private int numeroDePisos;

    public EdificioOficinas() {
    }

    public EdificioOficinas(int numeroOficinas, int cantidadDePersonasxOficina, int numeroDePisos) {
        this.numeroOficinas = numeroOficinas;
        this.cantidadDePersonasxOficina = cantidadDePersonasxOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public EdificioOficinas(int ancho, int alto, int largo, int numeroOficinas, int cantidadDePersonasxOficina, int numeroDePisos) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.cantidadDePersonasxOficina = cantidadDePersonasxOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public int getCantidadDePersonasxOficina() {
        return cantidadDePersonasxOficina;
    }

    public void setCantidadDePersonasxOficina(int cantidadDePersonasxOficina) {
        this.cantidadDePersonasxOficina = cantidadDePersonasxOficina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public int calcularSuperficie() {
        return largo * ancho;
    }

    @Override
    public int calcularVolumen() {
        return largo * alto * ancho;
    }

    public void ingresarMedidas(){
        super.ingresarMedidas();
    }
    /*
    De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
Crear el método cantPersonas(), que muestre cuantas personas entrarían en
un piso y cuantas en todo el edificio.
     */
    public void ingresarDatosEdiOfi(){
        System.out.println("Ingrese la cantidad de oficinas por piso: ");
        setNumeroOficinas(sc.nextInt());
        System.out.println("Ingrese la cantidad de personas en cada oficina: ");
        setCantidadDePersonasxOficina(sc.nextInt());
        System.out.println("Ingrese la cantidad de pisos: ");
        setNumeroDePisos(sc.nextInt());
    }
    public void cantPersonas(){
        int cantidadDePersonasxPiso = getCantidadDePersonasxOficina() * getNumeroOficinas();
        int cantPersonasEdificio = cantidadDePersonasxPiso * getNumeroDePisos();
        System.out.println("La cantidad de personas que entrarian en un piso son: " + cantidadDePersonasxPiso);
        System.out.println("La cantiad de personas que entrarian en el edificio son: "+ cantPersonasEdificio);
    }

}
