package com.daniel.controller;

import javax.annotation.Resource;

import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.service.MovieService;
import com.daniel.domain.Movie;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class MovieController {
	@Resource
	private MovieService movieService;

	@RequestMapping("/movies")
	// @ResponseBody //轉換json註解
	public ResponseEntity<List<Movie>> getAllMovie() {
		return new ResponseEntity<>(movieService.allMovies(),HttpStatus.OK);
	}
	
	@RequestMapping("/id")
	public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable ObjectId id){
		return new ResponseEntity<Optional<Movie>>;
	}
}
