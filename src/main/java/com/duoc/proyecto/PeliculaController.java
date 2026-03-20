package com.duoc.proyecto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeliculaController {
  private List<Pelicula> peliculas = new ArrayList<>();

  // Inicializamos la lista con 5 películas
  public PeliculaController() {
    peliculas.add(new Pelicula(1, "Mi Película Favorita", 2020, "Director Ejemplo", "Drama", "Una breve descripción de la película."));
    peliculas.add(new Pelicula(2, "Inception", 2010, "Christopher Nolan", "Ciencia Ficción", "Un ladrón que roba secretos corporativos a través del uso de la tecnología de compartir sueños."));
    peliculas.add(new Pelicula(3, "The Matrix", 1999, "Lana Wachowski, Lilly Wachowski", "Acción", "Un hacker descubre la verdadera naturaleza de su realidad y su papel en la guerra contra sus controladores."));
    peliculas.add(new Pelicula(4, "Interstellar", 2014, "Christopher Nolan", "Ciencia Ficción", "Un equipo de exploradores viaja a través de un agujero de gusano en el espacio."));
    peliculas.add(new Pelicula(5, "Parasite", 2019, "Bong Joon Ho", "Thriller", "La codicia y la discriminación de clases amenazan la recién formada relación simbiótica entre la acaudalada familia Park y el indigente clan Kim."));
  }

  // Ruta para obtener todas las películas
  @GetMapping("/peliculas")
  public List<Pelicula> getPeliculas() {
    return peliculas;
  }

  // Ruta para obtener una película por ID
  @GetMapping("/peliculas/{id}")
  public Pelicula getPeliculaById(@PathVariable int id) {
    for (Pelicula pelicula : peliculas) {
      if (pelicula.getId() == id) {
        return pelicula;
      }
    }
    return null; // Retorna nulo si no encuentra el ID
  }
}
