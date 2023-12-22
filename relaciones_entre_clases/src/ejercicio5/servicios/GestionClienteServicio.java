package ejercicio5.servicios;

import ejercicio5.entidades.ClienteGestion;

import java.util.Random;

public class GestionClienteServicio  {
    private static String[] generadorDeDomicilios(){
        return new String[]{"Grupo Horacio s/n. - Kettering, Can / 41300",
                "Terrenos Micaela, 4 - Gilbert, Ast / 55834",
                "Parque Jorge Luis 0 - Hillsboro, Rio / 84597",
                "Sección Antonio Rosado 22 - Kennewick, Ast / 76555",
                "Paseo Jorge Luis, 79 - San Luis Obispo, Rio / 78792",
                "Escalinata Mónica, 53 - Midwest City, Man / 72797"};
    }

    public ClienteGestion generarCliente(){
        ClienteGestion cliente = new ClienteGestion();
        String []nombres = {"Esteban", "Alberto", "Rene", "Petoto", "Lina", "Prenda", "Jullito"};
        String []apellidos = {"Rojas","Chamorro","Messi","Pereira","Ocampo","Aquino","Valiente"};
        Random random = new Random();
        cliente.setNombre(nombres[random.nextInt(nombres.length)]);
        cliente.setApellido(apellidos[random.nextInt(apellidos.length)]);
        cliente.setDocumento(random.nextInt(1000));
        cliente.setMail(nombres[random.nextInt(nombres.length)].concat("@gmail.com"));
        cliente.setDomicilio(generadorDeDomicilios()[random.nextInt(generadorDeDomicilios().length)]);
        cliente.setTelefono(random.nextLong(50000));
        return cliente;
    }
}
