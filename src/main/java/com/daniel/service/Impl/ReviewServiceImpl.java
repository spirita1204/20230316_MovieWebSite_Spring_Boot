package com.daniel.service.Impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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
	public Review createReview(String reviewBody, String imdbId) {
		//將憑問寫review table
		Review review = reviewRepository.insert(new Review(reviewBody));
		
		//將評論review寫入到movie obj的reviewwId欄位內
		Query query = new Query(Criteria.where("imdbId").is(imdbId));
		
		//透過mongoTrmplate 做複雜的交易 
		mongoTemplate.update(Movie.class)
		.matching(query)
		.apply(new Update().push("reviewIds").value(review))
		.first();
		
		return review;
	}
	
}
