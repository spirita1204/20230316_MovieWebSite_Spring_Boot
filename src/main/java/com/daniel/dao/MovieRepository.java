package com.daniel.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.daniel.domain.Movie;
@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {

}
