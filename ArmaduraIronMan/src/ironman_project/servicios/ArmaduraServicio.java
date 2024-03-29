package ironman_project.servicios;

import ironman_project.entidades.Armadura;
import ironman_project.entidades.Bota;
import ironman_project.entidades.Guante;
import ironman_project.enums.DurezaDeMateriales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmaduraServicio {

    public static Armadura crearArmadura() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        BotaServicio bota = new BotaServicio();
        GuanteServicio guante = new GuanteServicio();
        Armadura armadura = new Armadura();
        System.out.println("Ingrese el color primario de la armadura: ");
        armadura.setColorPrimario(sc.next());
        System.out.println("Ingrese el color secundario de la armadura: ");
        armadura.setColorSecundario(sc.next());
        armadura.setBateria(90000);
        int opcion;
        boolean bandera = false;
        do {
            try {
                System.out.println("Ingrese un material del menu para su utilizacion en la armadura: ");
                System.out.println("MENU DE MATERIALES");
                for(int i = 0; i < DurezaDeMateriales.values().length; i++){
                    System.out.println((i+1) +" "+DurezaDeMateriales.values()[i]);
                }
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        armadura.setResistencia(DurezaDeMateriales.ALUMINIO.getNivelDureza());
                        break;
                    case 2:
                        armadura.setResistencia(DurezaDeMateriales.COBRE.getNivelDureza());
                        break;
                    case 3:
                        armadura.setResistencia(DurezaDeMateriales.ACERO_BLANDO.getNivelDureza());
                        break;
                    case 4:
                        armadura.setResistencia(DurezaDeMateriales.ACERO_INOXIDABLE.getNivelDureza());
                        break;
                    case 5:
                        armadura.setResistencia(DurezaDeMateriales.ACERO_HERRAMIENTAS.getNivelDureza());
                        break;
                    case 6:
                        armadura.setResistencia(DurezaDeMateriales.MADERA.getNivelDureza());
                        break;
                    case 7:
                        armadura.setResistencia(DurezaDeMateriales.NIQUEL.getNivelDureza());
                        break;
                    case 8:
                        armadura.setResistencia(DurezaDeMateriales.VIDRIO.getNivelDureza());
                        break;
                    default:
                        System.out.println("Debe ingresar un numero dentro de las opciones.");
                        continue;
                }
                bandera = true;
            } catch (InputMismatchException excepcion) {
                System.out.println("Debe ingresar un numero.");
                sc.nextLine();
            }
        } while (!bandera);
        armadura.setNivelSalud(100);
        armadura.setBota(bota.establecerConsumo());
        armadura.setGuante(guante.establecerConsumo());
        return armadura;
    }

    public int consumoVuelo(BotaServicio botaS, GuanteServicio guanteS, Bota bota, Guante guante){
       return botaS.consumoDePropulsion(bota) + guanteS.consumoGuantePropulsion(guante);
    }
}
