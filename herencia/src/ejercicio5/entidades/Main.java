package ejercicio5.entidades;

import ejercicio5.enums.TIPO_INSTALACION;

import java.util.ArrayList;

/*
 Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y
largo. La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser
Techado o Abierto, esta clase implementará los dos métodos abstractos y los
atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
personas por oficina y numero de pisos. Esta clase implementará los dos
métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuantas personas pueden trabajar en todo el
edificio, el usuario dirá cuantas personas entran en cada oficina, cuantas
oficinas y el numero de piso (suponiendo que en cada piso hay una oficina).
Crear el método cantPersonas(), que muestre cuantas personas entrarían en
un piso y cuantas en todo el edificio.
Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuantos
polideportivos son techados y cuantos abiertos. Y para la clase EdificioDeOficinas
deberemos llamar al método cantPersonas() y mostrar los resultados de cada
edificio de oficinas.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Edificio>edificios = new ArrayList<>();
        for(int i = 0 ; i < 2; i++){
        Polideportivo poli1 = new Polideportivo();
        edificios.add(poli1);
        EdificioOficinas oficinasEdi = new EdificioOficinas();
        edificios.add(oficinasEdi);
        }
        int contadorAbierto = 0;
        int contadorTechado = 0;
        for(Edificio edificio : edificios){
            if(edificio instanceof Polideportivo polideportivo){
                polideportivo.ingresarDatosPoli();
                if(polideportivo.getTipoInstalacion().equals(TIPO_INSTALACION.ABIERTO)){
                    contadorAbierto++;
                }else{
                    contadorTechado++;
                }
            }else if( edificio instanceof EdificioOficinas edificioOficinas){
                edificioOficinas.ingresarDatosEdiOfi();
            }
        }
        System.out.println("====================================");
        System.out.println("La cantidad de edificios abiertos son: " + contadorAbierto);
        System.out.println("La cantidad de edificios techados son: " + contadorTechado);


    }
}
