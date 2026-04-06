package com.duoc.proyecto.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "peliculas")
public class Pelicula {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @NotBlank(message = "El titulo es obligatorio")
  @Column(name = "titulo")
  private String titulo;

  @NotNull(message = "El anio es obligatorio")
  @Min(value = 1800, message = "El anio debe ser mayor a 1800")
  @Column(name = "anio")
  private Integer anio;

  @NotBlank(message = "El director es obligatorio")
  @Column(name = "director")
  private String director;

  @NotBlank(message = "El genero es obligatorio")
  @Column(name = "genero")
  private String genero;

  @NotBlank(message = "La sinopsis es obligatoria")
  @Column(name = "sinopsis")
  private String sinopsis;


  // Getters and setters
  public Long getId() { return id;}
  public String getTitulo() { return titulo; }
  public Integer getAnio() { return anio; }
  public String getDirector() { return director;}
  public String getGenero() { return genero;}
  public String getSinopsis() { return sinopsis;}

  // --- SETTERS (ESTO ES LO QUE FALTA) ---
  public void setId(Long id) { this.id = id; }
  public void setTitulo(String titulo) { this.titulo = titulo; }
  public void setAnio(Integer anio) { this.anio = anio; }
  public void setDirector(String director) { this.director = director; }
  public void setGenero(String genero) { this.genero = genero; }
  public void setSinopsis(String sinopsis) { this.sinopsis = sinopsis; }
}
