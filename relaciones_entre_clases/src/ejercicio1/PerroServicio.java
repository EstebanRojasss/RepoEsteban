package ejercicio1;


import java.util.ArrayList;
import java.util.Random;

public class PerroServicio {

    public ArrayList<Perro> crearPerro(){
        String[] nombres = {"Puppy","Jean","Piter","Pilsen","Ventilador","Termo","Milei","Ubfal"};
        String[]tamanho = {"Pequenho","Mediano","Grande"};
        Raza[]razas = Raza.values();
        ArrayList<Perro>perros = new ArrayList<>();
        for(int i = 0 ; i < nombres.length; i++){
            Random random = new Random();
            Perro perro = new Perro();
            perro.setNombre(nombres[i]);
            perro.setEdad(random.nextInt(1, 15));
            perro.setTamanho(tamanho[random.nextInt(tamanho.length)]);
            perro.setRaza(razas[random.nextInt(razas.length)]);
            perros.add(perro);
        }
        return perros;
    }
}