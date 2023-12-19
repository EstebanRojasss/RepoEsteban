package ejercicio2.entidades;

import java.util.Random;

public class RevolverDeAgua {
    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return ""+
                " \nposicionActual: " + posicionActual +
                " \nposicionAgua: " + posicionAgua;
    }
    public void llenarRevolver(){
        Random random = new Random();
        this.posicionActual = random.nextInt(6);
        this.posicionAgua = random.nextInt(6);
    }
    protected boolean mojar(){
        return this.posicionActual == this.posicionAgua;
    }
    protected void siguienteChorro(){
        if(this.posicionActual == 5){
            this.posicionActual = 0;
        }else{
           this.posicionActual = this.posicionActual + 1;
        }
    }
}
