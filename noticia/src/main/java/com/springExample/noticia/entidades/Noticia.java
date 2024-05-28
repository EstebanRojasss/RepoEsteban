package com.springExample.noticia.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Data
public class Noticia {

    @Id
    @UuidGenerator
    private String id;

    private String titulo;
    private String cuerpo;
    private Boolean alta;

}
