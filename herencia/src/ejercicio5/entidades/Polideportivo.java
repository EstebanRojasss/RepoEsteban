package ejercicio5.entidades;

import apracticaejercici0.enums.TIPO_CONSUMO;
import ejercicio5.enums.TIPO_INSTALACION;

/*
• Clase Polideportivo con su nombre y tipo de instalación que puede ser
Techado o Abierto, esta clase implementará los dos métodos abstractos y los
atributos del padre.
 */
public class Polideportivo extends Edificio {
    private String nombre;
    private TIPO_INSTALACION tipoInstalacion;

    public Polideportivo() {
        ingresarDatosPoli();
    }

    public Polideportivo(int ancho, int alto, int largo, String nombre, TIPO_INSTALACION tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TIPO_INSTALACION getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(TIPO_INSTALACION tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public int calcularSuperficie() {
        return largo * ancho;
    }

    @Override
    public int calcularVolumen() {
        return largo * alto * ancho;
    }

    @Override
    public void ingresarMedidas() {
        super.ingresarMedidas();
    }

    public void ingresarDatosPoli() {
        System.out.println("====================================");
        System.out.println("DATOS DE POLIDEPORTIVO");
        System.out.println("Ingrese el nombre del polideportivo: ");
        setNombre(sc.next());
        int menu;
        do {
            System.out.println("Ingrese el tipo de instalacion: ");
            System.out.println("1. Techado.");
            System.out.println("2. Abierto.");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    setTipoInstalacion(TIPO_INSTALACION.TECHADO);
                    break;
                case 2:
                    setTipoInstalacion(TIPO_INSTALACION.ABIERTO);
                    break;
                default:
                    System.out.println("Debe ingresar una de las opciones.");
            }
            ingresarMedidas();
        } while (menu != 1 && menu != 2);

    }
}
