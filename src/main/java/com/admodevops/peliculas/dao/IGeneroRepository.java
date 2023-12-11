package com.admodevops.peliculas.dao;

import com.admodevops.peliculas.entities.Genero;

public interface IGeneroRepository {
    public void save(Genero genero);
    public Genero findById(Long id);
}
