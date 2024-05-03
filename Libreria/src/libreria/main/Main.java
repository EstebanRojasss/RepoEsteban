package libreria.main;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.Dao;


public class Main {
  public static void main(String []args){
      Autor autor = new Autor();
      Editorial editorial = new Editorial();
      Libro libro = new Libro();
      
      Dao dao = new Dao();
      dao.create(autor);
      dao.create(editorial);
      dao.create(libro);
  }  
}
