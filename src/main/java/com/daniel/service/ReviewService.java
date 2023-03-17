package com.daniel.service;

import com.daniel.domain.Review;

public interface ReviewService {
	/**
	 * 
	 * @param reviewBody
	 * @param imbdId
	 * @return
	 */
	public Review createReview(String reviewBody, String imbdId);
}
