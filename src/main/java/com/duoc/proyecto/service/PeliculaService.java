package com.duoc.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.duoc.proyecto.model.Pelicula;

public interface PeliculaService {
  List<Pelicula> getAllPeliculas();
  Optional<Pelicula> getPeliculaById(Long id);
  Pelicula createPelicula(Pelicula pelicula);
  Pelicula updatePelicula(Long id, Pelicula peliculaDetails);
  void deletePelicula(Long id);
}
