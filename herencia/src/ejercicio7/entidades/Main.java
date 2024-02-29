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
        EstudianteServicio servicioDeEstudiante = new EstudianteServicio();
        PersonalServicio servicioDePersonal = new PersonalServicio();
        ProfesorServicio servicioDeProfesor = new ProfesorServicio();
        PersonaServicio servicioDePersona = new PersonaServicio();

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(servicioDeEstudiante.nuevoEstudiante());
        personas.add(servicioDePersonal.nuevoPersonalDServicio());
        personas.add(servicioDeProfesor.nuevoProfe());
        int opc;
        do {
            System.out.println("=========MENU DE OPCIONES DE APLICACION=========");
            System.out.println("1. Cambiar estado civil.");
            System.out.println("2. Reasignacion de despacho.");
            System.out.println("3. Matricular a nuevo curso.");
            System.out.println("4. Cambiar departamento de profesor.");
            System.out.println("5. Traslado de sección de un empleado del personal de servicio.");
            opc = scaner.nextInt();
            switch (opc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (opc != 1 && opc != 2 && opc != 3 && opc != 4 && opc != 5);
        for (Persona persona : personas) {
            if ()
        }
    }

    public static void opcionesDeCambio(Scanner scaner){
        int opc2;
        do {
            opc2 = scaner.nextInt();
            System.out.println("Cambiar estado civil de: 1) Estudiante | 2) Profesor | 3) Personal de servicio");
            System.out.print("Ingresar opcion: ");
        } while (opc2 != 1 && opc2 != 2 && opc2 != 3);
    }
}



