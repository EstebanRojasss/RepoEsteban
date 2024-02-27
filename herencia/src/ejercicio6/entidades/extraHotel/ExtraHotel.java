package ejercicio6.entidades.extraHotel;


import ejercicio6.entidades.Alojamiento;

public class ExtraHotel extends Alojamiento {
    protected boolean privado;
    protected int cantidadMetros2;

    public ExtraHotel() {

    }


    public ExtraHotel(String nombre, String direccion, String localidad, String gerente, boolean privado, int cantidadMetros2) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantidadMetros2 = cantidadMetros2;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getCantidadMetros2() {
        return cantidadMetros2;
    }

    public void setCantidadMetros2(int cantidadMetros2) {
        this.cantidadMetros2 = cantidadMetros2;
    }
}
