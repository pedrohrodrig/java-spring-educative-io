package io.datajek.spring.basics.movie_recommender_system.lesson6;

import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    @Qualifier("CF")
    private Filter contentBasedFilter;

    public String[] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + contentBasedFilter + "\n");

        return contentBasedFilter.getRecommendations("Finding Dory");
    }
}
