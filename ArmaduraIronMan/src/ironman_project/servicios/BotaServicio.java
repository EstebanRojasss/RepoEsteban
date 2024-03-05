package ironman_project.servicios;

import ironman_project.entidades.Bota;

import java.util.Scanner;

public class BotaServicio {
    public Bota establecerConsumo() {
        Bota bota = new Bota();
        bota.setConsumoBateria(300);
        return bota;
    }

    public int consumoBasico(Bota bota) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cantidad de tiempo: ");
        int tiempo = sc.nextInt();
        return bota.getConsumoBateria() * tiempo;
    }

    public int consumoCorrer(Bota bota) {
        return consumoBasico(bota) * 2;
    }

    public int consumoDePropulsion(Bota bota){
        return consumoBasico(bota) * 3;
    }


}
