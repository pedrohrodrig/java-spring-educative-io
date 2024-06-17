package io.datajek.spring.basics.movie_recommender_system.lesson7;

import io.datajek.spring.basics.movie_recommender_system.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Filter filter;

    @Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
        super();
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }

    public String[] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");

        return filter.getRecommendations("Finding Dory");
    }
}
