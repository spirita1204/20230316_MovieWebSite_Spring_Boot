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
	
	@RequestMapping("/movies/{imdbId}")
	//可以将 URL 中占位符参数绑定到控制器处理方法的入参中:URL 中的 {xxx} 占位符可以通过@PathVariable(“xxx”) 绑定到操作方法的入参中。
	public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
		return new ResponseEntity<Optional<Movie>>(movieService.singleMovies(imdbId), HttpStatus.OK);
	}
}
