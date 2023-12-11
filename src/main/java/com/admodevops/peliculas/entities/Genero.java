package com.admodevops.peliculas.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="generos")
public class Genero implements Serializable {
    private static final Long serialVersionUID = -7891964475965679385L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
