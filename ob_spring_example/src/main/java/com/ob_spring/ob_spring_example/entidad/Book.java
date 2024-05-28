package com.ob_spring.ob_spring_example.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String autor;
    private Integer pages;
    private Double price;
    private LocalDate releaseDate;
    private Boolean online;

    public Book() {
    }

    public Book(Long id, String title, String autor, Integer pages, Double price, LocalDate releaseDate, Boolean online) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.pages = pages;
        this.price = price;
        this.releaseDate = releaseDate;
        this.online = online;
    }


}
