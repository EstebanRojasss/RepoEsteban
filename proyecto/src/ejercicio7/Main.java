package ejercicio7;

import java.util.Scanner;

/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();
        Cadena cadena = cs.pedirCadena();

        int menu;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Mostrar vocales");
            System.out.println("2. Invertir frase");
            System.out.println("3. Letras repetidas en la frase");
            System.out.println("4. Comparar longitud");
            System.out.println("5. Unir frases");
            System.out.println("6. Reemplazar");
            System.out.println("7. Contiene una letra");
            System.out.println("8. Salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    cs.mostrarVocales(cadena);
                    break;
                case 2:
                    cs.invertirFrase(cadena);
                    break;
                case 3:
                    System.out.println("Ingrese la letra a buscar: ");
                    char letra = sc.next().charAt(0);
                    cs.vecesRepetido(cadena, letra);
                    break;
                case 4:
                    System.out.println("Ingrese una frase para comparar la longitud con la frase guardada: ");
                    String frase1 = sc.next();
                    cs.compararLongitud(cadena, frase1);
                    break;
                case 5:
                    System.out.println("Ingrese una frase para unir con la frase ya guardada: ");
                    String frase2 = sc.next();
                    cs.unirFrases(cadena, frase2);
                    break;
                case 6:
                    System.out.println("Ingrese una letra para reemplazar la letra (A)");
                    char letra2 = sc.next().charAt(0);
                    cs.reemplazar(cadena, letra2);
                    break;
                case 7:
                    System.out.println("Ingrese una letra para buscar en la frase ");
                    char letra3 = sc.next().charAt(0);
                    cs.fraseContiene(cadena, letra3);
                    break;
                case 8:
                    System.out.println("Hasta luego.");
                default:
                    System.out.println("Ha ocurrido un error");
            }
        } while (menu != 8);


    }
}
