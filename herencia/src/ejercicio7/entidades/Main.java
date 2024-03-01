package ejercicio7.entidades;

import ejercicio7.servicios.EstudianteServicio;
import ejercicio7.servicios.PersonaServicio;
import ejercicio7.servicios.PersonalServicio;
import ejercicio7.servicios.ProfesorServicio;

import java.util.ArrayList;
import java.util.Scanner;
/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad
que gestione la información sobre las personas vinculadas con la misma y que se
pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio. A
continuación, se detalla qué tipo de información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número
de identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta
aplicación. A continuación, debe programar las clases definidas en las que,
además de los constructores, hay que desarrollar los métodos correspondientes
a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa
de prueba que instancie objetos de los distintos tipos y pruebe los métodos
desarrollados.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        // IMPORTACION DE SERVICIOS
        EstudianteServicio servicioDeEstudiante = new EstudianteServicio();
        PersonalServicio servicioDePersonal = new PersonalServicio();
        ProfesorServicio servicioDeProfesor = new ProfesorServicio();
        PersonaServicio servicioDePersona = new PersonaServicio();
        // INSTANCIA DE OBJETOS PERSONA
        Estudiante estudiante = servicioDeEstudiante.nuevoEstudiante();
        PersonalDServicio personalDServicio = servicioDePersonal.nuevoPersonalDServicio();
        Profesor profesor = servicioDeProfesor.nuevoProfe();

        //GUARDAR DIFERENTES PERSONAS A LA LISTA
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(estudiante);
        personas.add(personalDServicio);
        personas.add(profesor);
        int opc;
        do {
            System.out.println("=========MENU DE OPCIONES DE APLICACION=========");
            System.out.println("1. Cambiar estado civil.");
            System.out.println("2. Reasignacion de despacho.");
            System.out.println("3. Matricular a nuevo curso.");
            System.out.println("4. Cambiar departamento de profesor.");
            System.out.println("5. Traslado de sección de un empleado del personal de servicio.");
            System.out.println("6. Salir del menu.");
            opc = scaner.nextInt();
            switch (opc) {
                case 1:
                    int opc2;
                    do {
                        System.out.println("Cambiar estado civil de: " +
                                "| 1) Estudiante " +
                                "| 2) Profesor " +
                                "| 3) Personal de servicio");
                        System.out.println("=================================");
                        System.out.print("Ingresar opcion: ");
                        opc2 = scaner.nextInt();
                        switch (opc2) {
                            case 1 -> servicioDePersona.cambiarEstadoCivil(estudiante);
                            case 2 -> servicioDePersona.cambiarEstadoCivil(profesor);
                            case 3 -> servicioDePersona.cambiarEstadoCivil(personalDServicio);
                        }
                    } while (opc2 != 1 && opc2 != 2 && opc2 != 3);
                    break;
                case 2:
                    int opc3;
                    do {
                        System.out.println("Reasignar despacho: " +
                                "| 1) Profesor " +
                                "| 2) Personal de servicio");
                        System.out.print("Ingresar opcion: ");
                        opc3 = scaner.nextInt();
                        switch (opc3) {
                            case 1 -> servicioDeProfesor.reasignacionDespacho(profesor);
                            case 2 -> servicioDePersonal.reasignacionDespacho(profesor);
                        }
                    } while (opc3 != 1 && opc3 != 2);

                    break;
                case 3:
                    servicioDeEstudiante.matricularNuevoCurso(estudiante);
                    break;
                case 4:
                    servicioDeProfesor.cambioDepartamento(profesor);
                    break;
                case 5:
                    servicioDePersonal.trasladoSeccion(personalDServicio);
                    break;
                case 6:break;
            }
        } while (opc != 6);
        for(Persona persona : personas){
            if(persona instanceof Estudiante){
                System.out.println(estudiante);
                System.out.println("=================================");
            }else if(persona instanceof Profesor){
                System.out.println(profesor);
                System.out.println("=================================");
            }else if(persona instanceof PersonalDServicio){
                System.out.println(personalDServicio);
                System.out.println("=================================");
            }
        }
    }
}



