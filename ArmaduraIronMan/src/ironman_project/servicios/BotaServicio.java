package ironman_project.servicios;

import ironman_project.entidades.Armadura;
import ironman_project.entidades.Bota;

import java.util.Scanner;

public class BotaServicio {
    public Bota establecerConsumo() {
        Bota bota = new Bota();
        bota.setConsumoBateria(300);
        return bota;
    }

    public int consumoCaminar(Bota bota) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cantidad de minutos: ");
        int tiempo = sc.nextInt();
        return bota.getConsumoBateria() * tiempo;
    }

    public int consumoCorrer(Bota bota) {
        return consumoCaminar(bota) * 2;
    }

    public int consumoVolar(Bota bota){
        return consumoCaminar(bota) * 3;
    }


}
