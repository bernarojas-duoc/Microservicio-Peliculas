package com.duoc.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.duoc.proyecto.model.Pelicula;
import com.duoc.proyecto.repository.PeliculaRepository;

public class PeliculasServiceImpl implements PeliculaService {
  @Autowired
  private PeliculaRepository peliculaRepository;

  @Override
  public List<Pelicula> getAllPeliculas() {
    return peliculaRepository.findAll();
  }

  @Override
  public Optional<Pelicula> getPeliculaById(Long id) {
    return peliculaRepository.findById(id);
  }

  @Override
  public Pelicula createPelicula(Pelicula pelicula) {
    return peliculaRepository.save(pelicula);
  }

  @Override
  public Pelicula updatePelicula(Long id, Pelicula peliculaDetails) {
    if (peliculaRepository.existsById(id)) {
      peliculaDetails.setId(id);
      return peliculaRepository.save(peliculaDetails);
    }
    throw new RuntimeException("Pelicula no encontrada");
  }

  @Override
  public void deletePelicula(Long id) {
    peliculaRepository.deleteById(id);
  }
}
