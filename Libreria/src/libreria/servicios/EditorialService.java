
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.repositorios.EditorialRepositorio;
import libreria.entidades.Editorial;
public class EditorialService {
     EditorialRepositorio dao = new EditorialRepositorio();
     private Scanner sc = new Scanner(System.in).useDelimiter("\n");
     public Editorial crearEditorial(String nombre){
         Editorial editorial = new Editorial();
         editorial.setNombre(nombre);
         editorial.setAlta(true);
         dao.createEditorial(editorial);
         return editorial;
     }
     
     public void darBajaorEditar(){
         Long id;
         do{
             try{
                 id = sc.nextLong();
                 break;
             }catch(Exception e){
                 System.out.println("Ha ocurrido un error."); 
                 sc.next();
             }
         }while(true);
         Editorial editorial = dao.buscarPorId(id);
         int opcion;
         do{
             System.out.println("""
                               Ingrese la opcion deseada:
                               1.Editar 
                               2.Dar de alta/baja""");
             try{
                 opcion = sc.nextInt();
                 break;
             }catch(Exception e){
                 System.out.println("Opcion mal ingresada"); 
             }
         }while(true);
         
         switch(opcion){
             case 1 ->{
                 System.out.println("Ingrese el nuevo nombre: ");
                 String nombre = sc.next();
                 editorial.setNombre(nombre);
             }
             case 2 ->{
                 if(editorial.getAlta()){
                     editorial.setAlta(false);
                 }else editorial.setAlta(true);
             }
         }
         dao.update(editorial);
     }
     
     public List<Editorial> buscarEditorialNombre(){
         System.out.println("Ingrese el nombre de la editorial: ");  
         String nombre = sc.next();
         return dao.buscarEditorialPorNombre(nombre);
     } 
     
     public Editorial buscarPorId(Long id){
         return dao.buscarPorId(id);
     }
     public List<Editorial> buscarEditorialNombre(String nombre){
         return dao.buscarEditorialPorNombre(nombre);
     } 
}
