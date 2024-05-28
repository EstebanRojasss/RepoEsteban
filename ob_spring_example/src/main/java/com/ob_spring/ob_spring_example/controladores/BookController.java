package com.ob_spring.ob_spring_example.controladores;

import com.ob_spring.ob_spring_example.entidad.Book;
import com.ob_spring.ob_spring_example.repositorios.BookRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    private BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    // CRUD sobre la entidad Book
    // Buscar todos los libros
    @GetMapping("/api/books")
    public List<Book> findAll() {
        return repository.findAll();
    }

    // Buscar un solo libro en base de datos segun su id
    // Request: Peticion -- Response: Respuesta
    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book> findOnlyOne(@PathVariable Long id, @RequestHeader HttpHeaders headers) {
        System.out.println(headers.get("User-Agent"));
        Optional<Book> bookOptional = repository.findById(id);
        return bookOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // crear un libro en base de datos
    @PostMapping("api/books")
    public Book saveBook(@RequestBody Book book){
        return repository.save(book);
    }

    // actualizar un libro existente en base de datos

    // borrar un libro en base de datos
}
