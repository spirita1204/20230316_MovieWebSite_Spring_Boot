package com.daniel.service.Impl;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.daniel.dao.ReviewRepository;
import com.daniel.domain.Movie;
import com.daniel.domain.Review;
import com.daniel.service.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService{
	
	@Resource
	private ReviewRepository reviewRepository;
	
	@Resource
	private MongoTemplate mongoTemplate;
	
	@Override
	public Review createReview(String reviewBody, String imbdId) {
		Review review = reviewRepository.insert(new Review(reviewBody));
		
		mongoTemplate.update(Movie.class)
						.matching(Criteria.where("imdbId").is(imbdId))
						.apply(new Update().push("reviewIds").value(review))
						.first();
		return null;
	}
	
}
