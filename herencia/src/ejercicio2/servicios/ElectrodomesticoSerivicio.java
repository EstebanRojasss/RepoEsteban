package ejercicio2.servicios;

import ejercicio2.entidades.Electrodomestico;
import ejercicio2.enums.COLOR_ELECTRODOMESTICO;
import ejercicio2.enums.CONSUMO_ENERGETICO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ElectrodomesticoSerivicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private CONSUMO_ENERGETICO comprobarConsumoEnergetico(char letra) {
        CONSUMO_ENERGETICO[] nivelesDeCon = CONSUMO_ENERGETICO.values();
        int contador = 0;
        while (contador < nivelesDeCon.length) {
            char c = nivelesDeCon[contador].toString().charAt(0);
            if (c == Character.toUpperCase(letra)) {
                return nivelesDeCon[contador];
            }
            contador++;
        }
        return CONSUMO_ENERGETICO.F;
    }

    private COLOR_ELECTRODOMESTICO comprobarColor(String colorIngresado) {
        COLOR_ELECTRODOMESTICO[] colores = COLOR_ELECTRODOMESTICO.values();
        int contador = 0;
        while (contador < colores.length) {
            String colorr = colores[contador].toString();
            if (colorr.equalsIgnoreCase(colorIngresado)) {
                return colores[contador];
            }
            contador++;
        }
        return COLOR_ELECTRODOMESTICO.BLANCO;
    }

    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el
    consumo. Al precio se le da un valor base de $1000.
     */
    public Electrodomestico crearElectrodomestico() {
        Electrodomestico electrodomestico = new Electrodomestico();
        electrodomestico.setPrecio(1000);
        System.out.println("Ingrese el color del electrodomestico: ");
        System.out.println("COLORES DISPONIBLES: " +
                "\n" + Arrays.toString(COLOR_ELECTRODOMESTICO.values()));
        System.out.print("Ingresar color: ");
        String color = sc.next();
        electrodomestico.setColor(comprobarColor(color));
        System.out.println("Ingrese el tipo de consumo energetico: ");
        System.out.println("TIPOS: " +
                "\n" + Arrays.toString(CONSUMO_ENERGETICO.values()));
        System.out.print("Ingresar tipo: ");
        char tipoConsumoo = sc.next().charAt(0);
        electrodomestico.setConsumoEnergetico(comprobarConsumoEnergetico(tipoConsumoo));
        System.out.println("Ingrese el peso del electrodomestico: ");
        double pesoElectrodomestico = sc.nextDouble();
        electrodomestico.setPeso(pesoElectrodomestico);

        return electrodomestico;
    }

    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará
    el valor del precio. Esta es la lista de precios
     */
    public void precioFinal(Electrodomestico electroD) {
        char letra = electroD.getConsumoEnergetico().name().charAt(0);
        switch (letra) {
            case 'A':
                electroD.setPrecio(electroD.getPrecio() + CONSUMO_ENERGETICO.A.getPrecios());
                break;
            case 'B':
                electroD.setPrecio(electroD.getPrecio() + CONSUMO_ENERGETICO.B.getPrecios());
                break;
            case 'C':
                electroD.setPrecio(electroD.getPrecio() + CONSUMO_ENERGETICO.C.getPrecios());
                break;
            case 'D':
                electroD.setPrecio(electroD.getPrecio() + CONSUMO_ENERGETICO.D.getPrecios());
                break;
            case 'E':
                electroD.setPrecio(electroD.getPrecio() + CONSUMO_ENERGETICO.E.getPrecios());
                break;
            case 'F':
                electroD.setPrecio(electroD.getPrecio() + CONSUMO_ENERGETICO.F.getPrecios());
                break;
        }
        if(electroD.getPeso()>0 && electroD.getPeso()<20){
            electroD.setPrecio(electroD.getPrecio() + 100);
        }else if(electroD.getPeso()>19 && electroD.getPeso() < 50){
            electroD.setPrecio(electroD.getPrecio() + 500);
        }else if(electroD.getPeso() > 49 && electroD.getPeso() < 80){
            electroD.setPrecio(electroD.getPrecio() + 800);
        }else if(electroD.getPeso() > 79){
            electroD.setPrecio(electroD.getPrecio() + 1000);
        }
    }
    public void listaElectrods(ArrayList<Electrodomestico>electro){
        System.out.println("---------------------------------------------------------");
        for(Electrodomestico electrodomestico : electro){
            System.out.println(electrodomestico +" "+electrodomestico.getPrecio());
        }
        System.out.println("La suma de los precios es: " + sumaDePrecios(electro));
    }

    public double sumaDePrecios(ArrayList<Electrodomestico>electroD){
        double sumaPrecios = 0;
        for(Electrodomestico electrodomestico : electroD){
            sumaPrecios += electrodomestico.getPrecio();
        }
        return sumaPrecios;
    }


}

