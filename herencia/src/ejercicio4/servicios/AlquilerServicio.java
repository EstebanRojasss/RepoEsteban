package ejercicio4.servicios;

import ejercicio4.entidades.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AlquilerServicio {

    public AlquilerAmarre alquilarAmarre(Barco barco) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        AlquilerAmarre alquilerAmarre = new AlquilerAmarre();
        System.out.println("=========INGRESAR DATOS DE ALQUILER=========");
        System.out.println("Ingrese el nombre: ");
        alquilerAmarre.setNombre(sc.next());
        System.out.println("Ingrese el documento de identidad: ");
        alquilerAmarre.setDocumentoCliente(sc.nextInt());
        System.out.println("Ingrese la fecha de alquiler: ");
        alquilerAmarre.setFechaDeAlquiler(LocalDate.of(sc.nextInt(),sc.nextInt() ,sc.nextInt()));
        System.out.println("Ingrese la fecha de devolución: ");
        alquilerAmarre.setFechaDevolucion(LocalDate.of(sc.nextInt(),sc.nextInt() ,sc.nextInt()));
        System.out.println("Ingrese la posicion del amarre: ");
        alquilerAmarre.setPosicion(sc.next());
        alquilerAmarre.setBarco(barco);
        System.out.println(" ");
        System.out.println("==============================================");
        return alquilerAmarre;
    }

    /*
    Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en
CV y en los yates se suma la potencia en CV y el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las
clases y los métodos necesarios que permitan al usuario elegir el barco que
quiera alquilar y mostrarle el precio final de su alquiler.
     */
    public long calcularAlquiler(AlquilerAmarre alquiler) {
        long diasOcupacion = ChronoUnit.DAYS.between(alquiler.getFechaDeAlquiler(), alquiler.getFechaDevolucion());
        if (diasOcupacion < 0) {
            diasOcupacion *= (-1);
        }
        System.out.println("Dias de ocupacion: " + diasOcupacion);
        int valorModulo = alquiler.getBarco().getEslora() * 10;
        if (alquiler.getBarco() instanceof Velero velero) {
            valorModulo +=  velero.getNumeroDeMastiles();
            return diasOcupacion * valorModulo;
        } else if (alquiler.getBarco() instanceof YateDeLujo yate) {
            valorModulo += (yate.getNumeroCamarotes() + yate.getPotenciaCV());
            return diasOcupacion * valorModulo;
        } else if (alquiler.getBarco() instanceof BarcoAMotor barcoAMotor) {
            valorModulo += barcoAMotor.getPotenciaCV();
            return diasOcupacion * valorModulo;
        }
        return diasOcupacion * valorModulo;
    }


    public void mostrarDatos(AlquilerAmarre alquilerAmarre){
        System.out.println("==============================================");
        System.out.println(alquilerAmarre);
        System.out.println("==============================================");
    }


}
