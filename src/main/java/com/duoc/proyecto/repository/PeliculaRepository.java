package com.duoc.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duoc.proyecto.model.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

}
