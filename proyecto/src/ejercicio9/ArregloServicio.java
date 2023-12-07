package ejercicio9;

import java.util.Random;
public class ArregloServicio {

    protected Arreglo llenarArregloA() {
        Arreglo arreglo = new Arreglo();
        Random random = new Random();
        for (int i = 0; i < arreglo.getArregloA().length; i++) {
            arreglo.getArregloA()[i] = random.nextInt(50);
            arreglo.setArregloA(arreglo.getArregloA());
        }
        return arreglo;
    }

    protected void imprimirArregloA(Arreglo arreglo) {
        System.out.println("Arreglo A: ");
        for (int i = 0; i < arreglo.getArregloA().length; i++) {
            System.out.print(arreglo.getArregloA()[i] + " ");
        }
    }

    protected void ordenarMenorAMayor(Arreglo arreglo) {
        int contador = 0;
        int[] arregloA = new int[arreglo.arregloA.length];
        for (int i = arreglo.arregloA.length - 1; i >= 0; i--) {
            arregloA[contador] = arreglo.getArregloA()[i];
            contador++;
            if (contador == arreglo.getArregloA().length) {
                break;
            }
        }
        arreglo.setArregloA(arregloA);
    }

    protected void arregloB(Arreglo arreglo) {
        double[] arregloB = new double[arreglo.getArregloB().length];
        int k = 0;
           do{
               arregloB[k] = arreglo.getArregloA()[k];
               k++;
           }while( k != 10);
            int l = 10;
            do{
                arregloB[l] = 0.5;
                l++;
            }while(l != 20);
            arreglo.setArregloB(arregloB);
        }

    protected void imprimirArregloB(Arreglo arreglo) {
        System.out.println("Arreglo B: ");
        for (int i = 0; i < arreglo.getArregloB().length; i++) {
            System.out.print(arreglo.getArregloB()[i] + " ");
        }
    }

}
