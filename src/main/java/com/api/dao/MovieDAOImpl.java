package com.api.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.api.model.Movie;

@Repository
public class MovieDAOImpl implements MovieDAO{
	
	@Autowired
	SessionFactory sessionFactory;
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

	@Override
	public List<Movie> list() {
		List<Movie> lista = sessionFactory.getCurrentSession().createQuery("FROM Movie").list();
		return lista;
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
