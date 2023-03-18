package com.daniel.domain;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "movie") // 標記這個class對映一個collection，在(Movie)這個collection裡面操作document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data //getter + setter + equals + hashCode + toString 
public class Movie {
	@Id
	private ObjectId id;

	private String imdbId;

	private String title;

	private String releaseDate;

	private String trailerLink;

	private List<String> genres;

	private String poster;

	private List<String> backdrops;

	private List<Review> reviewIds;
}
