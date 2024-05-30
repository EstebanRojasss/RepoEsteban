package com.ob_spring.ob_spring_example.controladores;

import com.ob_spring.ob_spring_example.entidad.Book;
import com.ob_spring.ob_spring_example.repositorios.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    private BookRepository repository;
    private final Logger log = LoggerFactory.getLogger(BookController.class);

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    /** CRUD sobre la entidad Book
     *
     * Buscar todos los libros
     */
    @GetMapping("/api/books")
    public List<Book> findAll() {
        return repository.findAll();
    }

    /** Buscar un solo libro en base de datos segun su id
     * Request: Peticion -- Response: Respuesta
     */
    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book> findOnlyOne(@PathVariable Long id, @RequestHeader HttpHeaders headers) {
        System.out.println(headers.get("User-Agent"));
        Optional<Book> bookOptional = repository.findById(id);
        return bookOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * guardar un nuevo libro
     *
     * @param book
     * @return
     */
    @PostMapping("api/books")
    public ResponseEntity<Book> save(@RequestBody Book book) {
        if (book.getId() != null) {
            log.warn("trying to create a book with id");
            return ResponseEntity.badRequest().build();
        }
        Book result = repository.save(book);
        return ResponseEntity.ok(result);
    }


    /**
     * actualizar un libro existente en base de datos
     */
    @PutMapping("api/books")
    public ResponseEntity <Book> update(@RequestBody Book book) {
        if(book.getId() == null){
            log.warn("trying to update a book that doesn't exists.");
            return ResponseEntity.badRequest().build();
        }
        if(!repository.existsById(book.getId())){
            log.warn("trying to update a book that doesn't exists.");
            return ResponseEntity.notFound().build();
        }
        Book result = repository.save(book);
        return ResponseEntity.ok(result);
    }
    /**
     *  borrar un libro de la base de datos
     */
    @DeleteMapping("api/books/{id}")
    public ResponseEntity<Book> delete(@PathVariable Long id){

        if(!repository.existsById(id)){
            log.warn("trying to delete a book that doesn't exists.");
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
     return ResponseEntity.noContent().build();
    }

    @DeleteMapping("api/books")
    public ResponseEntity<Book> deleteAll(){
        log.info("REST request for deleting all books.");
        repository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}
