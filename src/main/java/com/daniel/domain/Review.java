package com.daniel.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews") // 標記這個class對映一個collection，在(Review)這個collection裡面操作document
@AllArgsConstructor
@NoArgsConstructor
@Data //getter + setter + equals + hashCode + toString 
public class Review {
	@Id
	private ObjectId id;
	
	private String body;
}
