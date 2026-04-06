package com.duoc.proyecto.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.proyecto.model.Pelicula;
import com.duoc.proyecto.service.PeliculaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/peliculas")
@CrossOrigin(origins = "*")
public class PeliculaController {
  @Autowired
  private PeliculaService peliculaService;

  // Ruta para obtener todas las películas
  @GetMapping
  public List<Pelicula> getPeliculas() {
    return peliculaService.getAllPeliculas();
  }

  // Endpoint para obtener detalles de una película por ID
  @GetMapping("/{id}")
  public Optional<Pelicula> getPeliculaById(@PathVariable Long id) {
    return peliculaService.getPeliculaById(id);
  }

  // Crear película
  @PostMapping
  public Pelicula crearPelicula(@Valid @RequestBody Pelicula pelicula) {
    return peliculaService.createPelicula(pelicula);
  }
  
}
