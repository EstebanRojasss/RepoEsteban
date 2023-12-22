package ejercicio5.servicios;

import ejercicio5.entidades.VehiculoGestion;
import ejercicio5.enums.TIPODEAUTOMOVIL;

import java.util.Random;

public class GestionVehiculoServicio {
    public VehiculoGestion generarVehiculo(){
        Random random = new Random();
        VehiculoGestion vehiculoGestion = new VehiculoGestion();
        String[] marcas = {"BMW","Mercedes Benz","Audi","Porsche","Volkswagen","Subaru","Honda","Toyota"};
        String[]modelos = {"X6","SLG","R8","Cayene","Tiguan","WRX","Civic","Tundra"};
        String[]chasis = {"AF123","CT645","HK485","ZX432","MJER2","FSG56"};
        String[]colores = {"Rojo","Azul","Negro","Blanco","Gris"};
        TIPODEAUTOMOVIL[]tipos = TIPODEAUTOMOVIL.values();
        vehiculoGestion.setMarca(marcas[random.nextInt(marcas.length)]);
        vehiculoGestion.setModelo(modelos[random.nextInt(modelos.length)]);
        vehiculoGestion.setAnho(random.nextInt(2000, 2023));
        vehiculoGestion.setNumeroMotor(random.nextInt(10));
        vehiculoGestion.setChasis(chasis[random.nextInt(chasis.length)]);
        vehiculoGestion.setColor(colores[random.nextInt(colores.length)]);
        vehiculoGestion.setTipoDeAuto(tipos[random.nextInt(tipos.length)]);
        return vehiculoGestion;
    }
}
