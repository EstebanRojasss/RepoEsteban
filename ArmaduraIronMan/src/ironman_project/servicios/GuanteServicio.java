package ironman_project.servicios;

import ironman_project.entidades.Guante;

import java.util.Scanner;

public class GuanteServicio {

    public Guante establecerConsumo(){
        Guante guante = new Guante();
        guante.setConsumoBateria(300);
        return guante;
    }

    public int consumoGuantePropulsion(Guante guante){
        return guante.getConsumoBateria() * 2;
    }

    public int consumoDisparo(Guante guante){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cantidad de tiempo: ");
        int tiempo = sc.nextInt();
        return guante.getConsumoBateria() * 3 * tiempo;
    }
}
