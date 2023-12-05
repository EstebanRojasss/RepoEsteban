package ejercicio7;

import org.w3c.dom.ls.LSOutput;

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
public class CadenaServicio {

    protected Cadena pedirCadena() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la frase: ");
        String frase = sc.next();
        int longitud = frase.length();
        return new Cadena(frase, longitud);
    }

    protected void mostrarVocales(Cadena cadena) {
        char c;
        int contadorVocales = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            c = cadena.getFrase().charAt(i);
            switch (c) {
                case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u':
                    contadorVocales++;
                    break;
            }
        }
        if (contadorVocales > 0) {
            System.out.println("la cantidad de vocales son: " + contadorVocales);
        } else System.out.println("No contiene vocales");
    }

    protected void invertirFrase(Cadena cadena) {
        System.out.println("Frase invertida: ");
        char c;
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            c = cadena.getFrase().charAt(i);
            System.out.print(c);
        }
        System.out.println(" ");
    }

    protected void vecesRepetido(Cadena cadena, char letra) {
        char c;
        int letrasRepetidas = 0;
        if (Character.isUpperCase(letra)) {
            cadena.setFrase(cadena.getFrase().toUpperCase());
        } else {
            cadena.setFrase(cadena.getFrase().toLowerCase());
        }
        for (int i = 0; i < cadena.getLongitud(); i++) {
            c = cadena.getFrase().charAt(i);
            if (c == letra) {
                letrasRepetidas++;
            }
        }
        if (letrasRepetidas > 1) {
            System.out.println("la letra " + letra + " se repite " + letrasRepetidas + " veces");
        }
    }

    protected void compararLongitud(Cadena cadena, String frase) {
        int longitudFrase = frase.length();
        if (cadena.getLongitud() == longitudFrase) {
            System.out.println("La longitud es igual: ");
        } else System.out.println("La longitud de las frase no son iguales");
    }

    protected void unirFrases(Cadena cadena, String frase) {
        System.out.println(cadena.getFrase().concat(frase));
    }

    public void reemplazar(Cadena cadena, char letra) {
        char c;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            c = cadena.getFrase().charAt(i);
            if (c == 'a' || c == 'A') {
                if (Character.isUpperCase('A')) {
                    cadena.setFrase(cadena.getFrase().toUpperCase());
                } else {
                    cadena.setFrase(cadena.getFrase().toLowerCase());
                }
                cadena.setFrase(cadena.getFrase().replace(c, letra));
            }
        }
        System.out.println("Frase con letras reemplazadas: " + cadena.getFrase());
    }

    public void fraseContiene(Cadena cadena, char letra) {
        char c;
        boolean contieneLetra = false;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            c = cadena.getFrase().charAt(i);
            if(c == letra){
                contieneLetra = true;
            }
        }
        if(contieneLetra){
            System.out.println("Verdadero");
        }else System.out.println("Falso");
    }
}
