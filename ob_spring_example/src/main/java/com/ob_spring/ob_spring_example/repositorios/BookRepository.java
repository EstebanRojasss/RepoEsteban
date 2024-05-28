package com.ob_spring.ob_spring_example.repositorios;

import com.ob_spring.ob_spring_example.entidad.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
