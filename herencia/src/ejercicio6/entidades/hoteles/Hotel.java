package ejercicio6.entidades.hoteles;

import ejercicio6.entidades.Alojamiento;

import java.util.Comparator;

public  class Hotel extends Alojamiento {
    protected int cantidadHabitaciones;
    protected int numeroCamas;
    protected int cantidadPisos;
    protected Integer precioHabitaciones;


    public Hotel() {

    }

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, Integer precioHabitaciones) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public Integer getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Integer precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
    public Comparator<Hotel> compararPrecios = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel o1, Hotel o2) {
            return o1.getPrecioHabitaciones().compareTo(o2.getPrecioHabitaciones());
        }
    };

}
