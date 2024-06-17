package io.datajek.spring.basics.movie_recommender_system.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		// Constructor method
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));

		// Setter method
		RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class);
		result = recommender2.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
	}

}
