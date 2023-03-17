package com.daniel.service.Impl;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daniel.dao.MovieRepository;
import com.daniel.domain.Movie;
import com.daniel.service.MovieService;

@Service
@Transactional
public class MovieServiceImpl implements MovieService{
	
	@Resource
	private MovieRepository movieRepository;
	
	@Override
	public List<Movie> allMovies() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}

	@Override
	public Optional<Movie> singleMovies(String imdbId) {
		// TODO Auto-generated method stub
		return movieRepository.findMovieByImdbId(imdbId);
	}
	
}
