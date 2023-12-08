package ejercicio10;

import java.awt.color.ProfileDataException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/* Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior
 */
public class PersonaService {
    protected Persona crearPersona(){
        Persona persona = new Persona();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre: ");
        persona.setNombre(sc.next());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("Ingrese su fecha de nacimiento: ");
        String fechaNacimiento = sc.next();
        Calendar calendario = Calendar.getInstance();
        return persona;
    }
}
