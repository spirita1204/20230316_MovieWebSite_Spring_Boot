package com.daniel.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.daniel.domain.Review;
import com.daniel.service.ReviewService;

@Controller
public class ReviewController {
	@Resource
	ReviewService reviewService;

	@PostMapping
	public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
		return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")),
				HttpStatus.CREATED);
	}

}
