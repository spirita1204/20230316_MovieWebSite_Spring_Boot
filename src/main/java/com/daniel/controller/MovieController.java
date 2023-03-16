package com.daniel.controller;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.service.MovieService;
import com.daniel.domain.Movie;
import java.util.List;

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
}
