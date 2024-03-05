package ironman_project.servicios;

import ironman_project.entidades.Armadura;
import ironman_project.enums.DurezaDeMateriales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmaduraServicio {

    public static Armadura crearArmadura() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Armadura armadura = new Armadura();
        System.out.println("Ingrese el color primario de la armadura: ");
        armadura.setColorPrimario(sc.next());
        System.out.println("Ingrese el color secundario de la armadura: ");
        armadura.setColorSecundario(sc.next());
        armadura.setBateria(30000);
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
        return armadura;
    }
}
