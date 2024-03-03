package ejercicio2;
/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el
código para generar y capturar una excepción ArrayIndexOutOfBoundsException
(índice de arreglo fuera de rango)
 */
public class Main {
    public static void main(String[]args){
        int [] dato = new int[6];

        try{
        for(int i = 0; i < 7; i++){
            dato[i] = i;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Se supero el limite de espacio." + e.fillInStackTrace());
        }
    }
}
