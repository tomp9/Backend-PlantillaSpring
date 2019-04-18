package com.api.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dao.MovieDAO;
import com.api.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieDAO movieDAO;
	
	@Override
	public long save(Movie movie) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Movie get(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	@Override
	public List<Movie> list() {
		return movieDAO.list();
	}

	@Override
	public void update(long id, Movie pelicula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
	
}
