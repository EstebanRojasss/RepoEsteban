package ejercicio7.servicios;

import ejercicio7.entidades.Estudiante;

public class EstudianteServicio extends PersonaServicio{
    public Estudiante nuevoEstudiante() {
        Estudiante estudiante = new Estudiante();
        System.out.println("=========DATOS DE ESTUDIANTE=========");
        System.out.print("Ingrese el nombre del estudiante: ");
        estudiante.setNombre(scanner.next());
        System.out.print("Ingrese el apellido del estudiante: ");
        estudiante.setApellido(scanner.next());
        System.out.print("Ingrese el Id: ");
        estudiante.setNumId(scanner.nextInt());
        System.out.print("Ingrese el estado civil: ");
        do {
            estudiante.setEstadoCivil(estadoCivil(scanner.next()));
        } while (estudiante.getEstadoCivil() != null);
        do {
            System.out.print("Ingrese el curso al que va el estudiante: ");
            estudiante.setCurso(curso(scanner.nextInt()));
        } while (estudiante.getCurso() != null);
        return estudiante;
    }

    public void matricularNuevoCurso(Estudiante estudiante){
        System.out.println("=========MATRICULA DE NUEVO CURSO=========");
        do{
            curso(scanner.nextInt());
        }while(estudiante.getCurso() != null);
    }
}
