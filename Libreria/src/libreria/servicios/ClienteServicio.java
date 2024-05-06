package libreria.servicios;

import java.util.Scanner;
import libreria.repositorios.ClienteRepositorio;
import libreria.entidades.Cliente;

public class ClienteServicio {

    ClienteRepositorio dao;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public ClienteServicio() {
        dao = new ClienteRepositorio();
    }

    public void crearCliente() {
        Cliente cliente = new Cliente();
        String respuesta;
        do {
            System.out.println("Ingrese el DNI del cliente: ");
            Long dni;
            try {
                dni = sc.nextLong();
                if (buscarClientePorDni(dni)) {
                    System.out.println("El DNI no se encuentra registrado. Desea hacerlo? S/N");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        cliente.setDocumento(dni);
                        break;
                    }
                } else {
                    System.out.println("EL DNI ya se encuentra registrado.");
                }
            } catch (Exception e) {
                System.out.println("Ocurrio un error.");
                sc.next();
            }
        } while (true);
        do {
            try {
                String nombre, apellido;
                System.out.println("Ingrese el nombre del cliente: ");
                nombre = sc.next();
                cliente.setNombre(nombre);
                System.out.println("Ingrese el apellido del cliente: ");
                apellido = sc.next();
                cliente.setApellido(apellido);
                break;
            } catch (Exception e) {
                System.out.println("Ocurrio un error.");
            }
        } while (true);
        do {
            System.out.println("Ingrese el telefono del cliente: ");
            Long telefono;
            try {
                telefono = sc.nextLong();
                if (buscarClientePorTel(telefono)) {
                    System.out.println("El telefono no se encuentra registrado. Desea hacerlo? S/N");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        cliente.setTelefono(telefono);
                        break;
                    }
                } else {
                    System.out.println("El telefono ya se encuentra registrado.");
                }
            } catch (Exception e) {
                System.out.println("Ocurrio un error");
                sc.next();
            }
        } while (true);
        dao.create(cliente);
    }

    public void editarCliente() {
        Long DNI;
        do {
            System.out.println("Ingrese el DNI del cliente: ");
            try {
                DNI = sc.nextLong();
                if (buscarClientePorDni(DNI)) {
                    break;
                } else {
                    System.out.println("No se encuentra el DNI ingresado.");
                }
            } catch (Exception e) {
                System.out.println("Ocurrio un error.");
                sc.next();
            }
        } while (true);
        Cliente cliente = buscarClientPorDNI(DNI);
        int opcion;
        String nombre, apellido, respuesta;
        do {
            System.out.println("""
                                   1. Cambiar nombre.
                                   2. Cambiar apellido.
                                   3. Cambiar DNI.
                                   4. Cambiar telefono.""");
            try {
                opcion = sc.nextInt();
                if ((opcion > 0 && opcion < 5)) {
                       break; 
                }else {
                    System.out.println("Debe ingresar una de las opciones disponibles.");
                } 
            } catch (Exception e) {
                System.out.println("Ocurrio un error. Ingrese un numero");
            }
        } while (true);

        switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese el nombre: ");
                nombre = sc.next();
                cliente.setNombre(nombre);
                break;
            }
            case 2 -> {
                System.out.println("Ingrese el apellido: ");
                apellido = sc.next();
                cliente.setApellido(apellido);
                break;
            }
            case 3 -> {
                do {
                    System.out.println("Ingrese el DNI del cliente: ");
                    Long dni;
                    try {
                        dni = sc.nextLong();
                        if (buscarClientePorDni(dni)) {
                            System.out.println("El DNI no se encuentra registrado. Desea hacerlo? S/N");
                            respuesta = sc.next();
                            if (respuesta.equalsIgnoreCase("S")) {
                                cliente.setDocumento(dni);
                                break;
                            }
                        } else {
                            System.out.println("EL DNI ya se encuentra registrado.");
                        }
                    } catch (Exception e) {
                        System.out.println("Ocurrio un error.");
                        sc.next();
                    }
                } while (true);
                break;
            }
            case 4 -> {
                do {
                    System.out.println("Ingrese el telefono del cliente: ");
                    Long telefono;
                    try {
                        telefono = sc.nextLong();
                        if (buscarClientePorTel(telefono)) {
                            System.out.println("El telefono no se encuentra registrado. Desea hacerlo? S/N");
                            respuesta = sc.next();
                            if (respuesta.equalsIgnoreCase("S")) {
                                cliente.setTelefono(telefono);
                                break;
                            }
                        } else {
                            System.out.println("El telefono ya se encuentra registrado.");
                        }
                    } catch (Exception e) {
                        System.out.println("Ocurrio un error");
                        sc.next();
                    }
                } while (true);
                break;
            }
        }
        dao.update(cliente);
    }

    public boolean buscarClientePorDni(Long DNI) {
        do {
            try {
                if (dao.buscarClientePorDNI(DNI) == null) {
                    return true;
                }
            } catch (Exception e) {
            }
            return false;
        } while (true);
    }

    public boolean buscarClientePorTel(Long tel) {
        do {
            try {
                if (dao.buscarClientePorTel(tel) == null) {
                    return true;
                }
            } catch (Exception e) {
            }
            return false;
        } while (true);
    }

    public Cliente buscarClientPorDNI(Long dni) {
        return dao.buscarClientePorDNI(dni);
    }

}
