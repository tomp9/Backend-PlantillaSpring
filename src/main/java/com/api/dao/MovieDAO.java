package com.api.dao;

import java.util.List;

import com.api.model.Movie;

public interface MovieDAO {
	
	long save(Movie pelicula);

	Movie get(long id);
	//Obtener lista de peliculas
	List<Movie> list();
	
	void update(long id, Movie movie);
	
	void delete(long id);
}
