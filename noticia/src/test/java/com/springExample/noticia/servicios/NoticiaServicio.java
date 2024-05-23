package com.springExample.noticia.servicios;

import com.springExample.noticia.entidades.Noticia;
import com.springExample.noticia.errores.MyExceptions;
import com.springExample.noticia.repositorios.NoticiaRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class NoticiaServicio {

    @Autowired
    private NoticiaRepositorio noticiaRepositorio;
    @Transactional
    public void generarNoticia(String titulo, String cuerpo) throws MyExceptions{
        validar(titulo, cuerpo);
        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setAlta(true);
        noticiaRepositorio.save(noticia);
    }

    public void modificar(String id, String titulo, String cuerpo) throws MyExceptions{
        validar(titulo, cuerpo);
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        if(respuesta.isPresent()){
            Noticia noticia  = respuesta.get();
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            noticiaRepositorio.save(noticia);
        }
    }

    public void darBaja(String id){
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        if(respuesta.isPresent()){
            Noticia noticia  = respuesta.get();
            noticia.setAlta(false);
        }
    }
    public void validar(String titulo, String cuerpo) throws MyExceptions {
        if(titulo == null || titulo.isEmpty()){
            throw new MyExceptions("Debe ingresar un titulo, el campo no debe quedar vacio.");
        }
        if(cuerpo == null || cuerpo.isEmpty()){
            throw new MyExceptions("Debe ingresar un cuerpo, el campo no debe quedar vacio.");
        }
    }
}
