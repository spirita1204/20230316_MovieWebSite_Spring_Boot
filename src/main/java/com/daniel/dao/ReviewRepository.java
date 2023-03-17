package com.daniel.dao;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.daniel.domain.Review;
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
	
}
