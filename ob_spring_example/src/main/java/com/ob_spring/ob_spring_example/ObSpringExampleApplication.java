package com.ob_spring.ob_spring_example;

import com.ob_spring.ob_spring_example.entidad.Book;
import com.ob_spring.ob_spring_example.repositorios.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObSpringExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ObSpringExampleApplication.class, args);
        BookRepository repository = context.getBean(BookRepository.class);

        Book book1 = new Book(null, "The Witcher", "Sapwoski", 213, 39.9, LocalDate.of(1999, 5, 27), true);
        Book book2 = new Book(null, "Harry Potter", "JK Rowling", 123, 45.6, LocalDate.of(2000, 10, 14), true);
        System.out.println("Num de libros en la base de datos:  " + repository.findAll().size());
        repository.save(book1);
        repository.save(book2);


        System.out.println("Num de libros en la base de datos:  " + repository.findAll().size());

    }

}
