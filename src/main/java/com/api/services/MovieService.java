package com.api.services;

import java.util.List;

import com.api.model.Movie;

public interface MovieService {
	long save(Movie movie);

	Movie get(long id);
	//Obtener lista de peliculas
	List<Movie> list();
	
	void update(long id, Movie pelicula);
	
	void delete(long id);
}
