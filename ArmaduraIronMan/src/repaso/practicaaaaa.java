package repaso;

import java.util.Scanner;

public class practicaaaaa {
    public static void izq(int numFilas){
        int i, j;
        for(i = 1; i < numFilas; i++){
            for(j = 1 ; j < i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de filas: ");
        int filas = sc.nextInt();

        izq(filas);
    }
}
