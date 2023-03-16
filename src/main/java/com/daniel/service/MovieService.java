package com.daniel.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;

import com.daniel.domain.Movie;

public interface MovieService {
	/**
	 * 回傳所有movie
	 * @return
	 */
	public List<Movie> allMovies();
	/**
	 * 回傳單一個 movie
	 */
	public Optional<Movie> singleMovies(ObjectId id);
}
