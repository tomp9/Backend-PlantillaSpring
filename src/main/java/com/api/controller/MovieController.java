package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Movie;
import com.api.services.MovieService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@GetMapping("api/peliculas")
	public ResponseEntity<List<Movie>> getMovies(){
		List<Movie> list = movieService.list();
		return ResponseEntity.ok().body(list);
	}
}
