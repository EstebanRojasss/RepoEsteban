package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Perro {
    private String nombre;
    private int edad;
    private String tamanho;
    private Raza raza;

    public Perro() {

    }

    public Perro(String nombre, int edad, String tamanho, Raza raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamanho = tamanho;
        this.raza = raza;
    }

public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        int contador = 0;
        return "Perro: " + contador +
                "nombre: " + nombre + '\'' +
                ", edad: " + edad +
                ", tamanho: " + tamanho + '\'' +
                ", raza: " + raza;
    }
}
